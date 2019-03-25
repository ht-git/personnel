<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>员工详情</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-body">
        <input type="hidden" name="id" id="id" value="${employee.id }" >
          <div class="layui-form-item" >
              <label class="layui-form-label">
                  姓名
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.name }</div>
              </div>
             
          </div>
          <div class="layui-form-item" >
              <label class="layui-form-label">
                  身份证号码
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.card_id }</div>
              </div>
          </div>
           <div class="layui-form-item">
              <label class="layui-form-label">
                  性别
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">
                      <c:choose>
                      <c:when test="${employee.sex == 0}">
                          女
                      </c:when>
                      <c:when test="${employee.sex == 1}">
                          男
                      </c:when>
                    </c:choose>
                  </div>
              </div>
          </div>
           <div class="layui-form-item">
              <label class="layui-form-label">
                  学历
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.education }</div>
              </div>
          </div>
           <div class="layui-form-item">
              <label class="layui-form-label">
                  邮箱
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.email }</div>
              </div>
          </div>
           <div class="layui-form-item">
              <label class="layui-form-label">
                  手机
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.phone }</div>
              </div>
          </div>
          <div class="layui-form-item">
              <label class="layui-form-label">
                  联系地址
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">${employee.address }</div>
              </div>
          </div>
  			<div class="layui-form-item">
              <label class="layui-form-label">
                  职位
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">
                      ${employee.job.name }
                      </div>
              </div>
          </div>
            <div class="layui-form-item">
              <label class="layui-form-label">
                  部门
              </label>
              <div class="layui-input-inline">
                  <div class="layui-form-mid layui-word-aux">
                      ${employee.dept.name }
                  </div>
              </div>
          </div>


        <div class="layui-form-item">
            <label class="layui-form-label">
            </label>
        <a href="${ctx}/employee/editInfo?id=${employee.id }">
            <input type="button" value="修改基本信息" class="layui-btn"/>
        </a>
        <a href="${ctx}/employee/editDept?id=${employee.id }">
            <input type="button" value="职位部门调动" class="layui-btn"/>
        </a>
        <a href="${ctx}/employee/resign?id=${employee.id }">
            <input type="button" value="离职" class="layui-btn"/>
        </a>
        </div>

    </div>

  </body>

</html>