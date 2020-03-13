<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" href="css/right.css">
    <script src="js/register.js"></script>
</head>
<body>
<div class="right">
    <div class = "content">
	<form action="RegisterServlet" method="get" onsubmit="return submitCheck()">
    <table id="NumThree" class="TableBlack">
    <tbody id="content_show"> <tr>
    <td id="actionName" style="font-size:18pt;" colspan="2">注册</td></tr><tr>
    <td>姓名</td>
    <td><input id="userName" name="userName" type="text"></td></tr><tr>
    <td>学号</td>
    <td><input id="studentId" name="studentId" type="text"></td></tr><tr>
    <td>性别</td>
    <td><input checked id ="sex"type="radio" style="width: 10px" name="sex" value='男'>男
        <input type="radio" style="width: 10px; margin-left: 50px;" name="sex" value='女'>女
    </td></tr><tr>
    <td>学院</td>
    <td><input id="college" name="college" list="select_college">
        <datalist id="select_college">
            <option value="计算机科学与技术"></option>
            <option value="艺术学院"></option>
        </datalist></td></tr><tr>
    <td>专业</td>
    <td><input id="major" name="major" list="select_major">
         <datalist id="select_major">
             <option value="计算机科学与技术"></option>
             <option value="软件工程"></option>
         </datalist></td></tr><tr>
    <td>爱好</td>
    <td><label><input id="hobby" name="hobby" style="width: 10px; margin-left: 40px;" type="checkbox" value="唱歌" />唱歌</label>
        <label><input id="hobby" name="hobby" style="width: 10px; margin-left: 40px;" type="checkbox" value="跳舞" />跳舞</label>
        <label><input id="hobby" name="hobby" style="width: 10px; margin-left: 40px;" type="checkbox" value="Rap" />Rap</label>
        <label><input id="hobby" name="hobby" style="width: 10px; margin-left: 40px;" type="checkbox" value="打篮球" />打篮球</label>  </td></tr><tr>
    <td>个人简介</td>
    <td><textarea id = "introduce"name="introduce" style="overflow:scroll;overflow-x: hidden;width: 350px; height:200px;"></textarea></td></tr><tr>
    <td bgcolor="#FFFFFF" style="text-align: center;" colspan="2">
    <input type="submit"   value="确认提交" class = "btn" style="border:none;float:left;
	margin: auto auto;margin-left:70px;height:26px;width:100px;display:block;background-color: dodgerblue;color: white;">
    <input type="reset"  value="重置"  class="btn" style="height:26px;width:100px;display:block;
    background-color: dodgerblue;border:none;
	margin: auto auto;color: white;">
    &nbsp;</td></tr>
            </tbody>
</table>
</form>
</div>
</div>
</body>
</html>