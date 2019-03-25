package com.rain.dao;

import static com.rain.util.common.Constants.EMPLOYEETABLE;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.rain.dao.provider.EmployeeDynaSqlProvider;
import com.rain.domain.Employee;
import org.apache.ibatis.mapping.FetchType;

public interface EmployeeDao {

	@Select("select * from "+EMPLOYEETABLE+" where status = 1")
	@Results({
			@Result(id=true, column="id", property="id"),
			@Result(column="dept_id", property="dept",
					one=@One(
							select="com.rain.dao.DeptDao.get_Info",
							fetchType= FetchType.EAGER
					)),
			@Result(column="job_id", property="job",
					one=@One(
							select="com.rain.dao.JobDao.get_Info",
							fetchType=FetchType.EAGER))
	})
	List<Employee> get_List();

	@Select("select * from "+EMPLOYEETABLE+"  where name like CONCAT('%',#{content},'%') and status=1")
	@Results({
			@Result(id=true, column="id", property="id"),
			@Result(column="dept_id", property="dept",
					one=@One(
							select="com.rain.dao.DeptDao.get_Info",
							fetchType= FetchType.EAGER
					)),
			@Result(column="job_id", property="job",
					one=@One(
							select="com.rain.dao.JobDao.get_Info",
							fetchType=FetchType.EAGER))
	})
	List<Employee> get_LikeList(String content);

	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="insert_Employee")
	void insert_Info(Employee employee);

	@Select("select * from "+EMPLOYEETABLE+" where id = #{id}")
	@Results({
			@Result(id=true, column="id", property="id"),
			@Result(column="dept_id", property="dept",
					one=@One(
							select="com.rain.dao.DeptDao.get_Info",
							fetchType= FetchType.EAGER
					)),
			@Result(column="job_id", property="job",
					one=@One(
							select="com.rain.dao.JobDao.get_Info",
							fetchType=FetchType.EAGER))
	})
	Employee get_Info(Integer id);

	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="update_Employee")
	void update_Info(Employee employee);

	// 根据id删除部门
	@Delete("delete from "+EMPLOYEETABLE+" where id = #{id} ")
	void delete_Info(Integer id);

	@Select("select * from "+EMPLOYEETABLE+" where dept_id = #{id}")
	@Results({
			@Result(id=true, column="id", property="id"),
			@Result(column="dept_id", property="dept",
					one=@One(
							select="com.rain.dao.DeptDao.get_Info",
							fetchType= FetchType.EAGER
					)),
			@Result(column="job_id", property="job",
					one=@One(
							select="com.rain.dao.JobDao.get_Info",
							fetchType=FetchType.EAGER))
	})
	List<Employee> findEmployeeByDeptId(Integer id);

	@Update("update "+EMPLOYEETABLE+" set status = 0 where id = #{id}")
	void resign(Integer id);
}
