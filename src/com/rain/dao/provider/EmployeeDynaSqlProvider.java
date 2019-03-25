package com.rain.dao.provider;

import static com.rain.util.common.Constants.EMPLOYEETABLE;

import org.apache.ibatis.jdbc.SQL;

import com.rain.domain.Employee;

public class EmployeeDynaSqlProvider {
			// 动态插入
			public String insert_Employee(Employee employee){
				
				return new SQL(){
					{
						INSERT_INTO(EMPLOYEETABLE);
						if(employee.getCard_id()!=null){
							VALUES("card_id","#{card_id}");
						}
						if(employee.getName() != null ){
							VALUES("name", "#{name}");
						}
						if(employee.getSex()!=null){
							VALUES("sex","#{sex}");
						}
						if(employee.getBirthday()!=null){
							VALUES("birthday","#{birthday}");
						}
						if(employee.getBirthplace()!=null){
							VALUES("birthplace","#{birthplace}");
						}
						if(employee.getAddress()!=null){
							VALUES("address","#{address}");
						}
						if(employee.getEmail()!=null){
							VALUES("email","#{email}");
						}
						if(employee.getEducation()!=null){
							VALUES("education","#{education}");
						}
						if(employee.getSpeciality()!=null){
							VALUES("speciality","#{speciality}");
						}
						if(employee.getGraduation_date()!=null){
							VALUES("graduation_date","#{graduation_date}");
						}
						if(employee.getSchool()!=null){
							VALUES("school","#{school}");
						}
						if(employee.getCreate_date()!=null){
							VALUES("create_date","#{create_date}");
						}
						if(employee.getPhone()!=null){
							VALUES("phone","#{phone}");
						}
						if(employee.getRemark()!=null){
							VALUES("remark","#{remark}");
						}
						if(employee.getStatus()!=null){
							VALUES("status","#{status}");
						}
						if(employee.getDept_id()!=null){
							VALUES("dept_id","#{dept_id}");
						}
						if(employee.getJob_id()!=null){
							VALUES("job_id","#{job_id}");
						}
						if(employee.getSalary()!=null){						//添加salary字段
							VALUES("salary","#{salary}");
						}
						VALUES("status", "1");
					}
				}.toString();
			}	
			// 动态更新
			public String update_Employee(Employee employee){
				
				return new SQL(){
					{
						UPDATE(EMPLOYEETABLE);
						if(employee.getCard_id()!=null){
							SET("card_id = #{card_id}");
						}
						if(employee.getName() != null ){
							SET("name = #{name}");
						}
						if(employee.getSex()!=null){
							SET("sex = #{sex}");
						}
						if(employee.getBirthday()!=null){
							SET("birthday = #{birthday}");
						}
						if(employee.getBirthplace()!=null){
							SET("birthplace = #{birthplace}");
						}
						if(employee.getAddress()!=null){
							SET("address = #{address}");
						}
						if(employee.getEmail()!=null){
							SET("email = #{email}");
						}
						if(employee.getEducation()!=null){
							SET("education = #{education}");
						}
						if(employee.getSpeciality()!=null){
							SET("speciality = #{speciality}");
						}
						if(employee.getGraduation_date()!=null){
							SET("graduation_date = #{graduation_date}");
						}
						if(employee.getSchool()!=null){
							SET("school = #{school}");
						}
						if(employee.getCreate_date()!=null){
							SET("create_date = #{create_date}");
						}
						if(employee.getPhone()!=null){
							SET("phone = #{phone}");
						}
						if(employee.getRemark()!=null){
							SET("remark = #{remark}");
						}
						if(employee.getStatus()!=null){
							SET("status = #{status}");
						}
						if(employee.getDept_id()!=null){			//更新时用实体类的
							SET("dept_id = #{dept_id}");		//dept_id和job_id属性
						}
						if(employee.getJob_id()!=null){
							SET("job_id = #{job_id}");
						}
						if(employee.getSalary()!=null){			//添加salary属性
							SET("salary = #{salary}");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
