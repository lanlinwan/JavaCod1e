<%--
  Created by IntelliJ IDEA.
  User: 蓝
  Date: 9/11/2022
  Time: 下午7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form id="regForm" action="/Filter/loginServlet" method="post">
  <table>
    <tr>
      <td>用户名</td>
      <td class="inputs">
        <input name="loginName" type="text" id="loginName">
        <br>
      </td>
    </tr>
    <tr>
      <td>密码</td>
      <td class="inputs">
        <input name="loginPwd" type="loginPwd" id="loginPwd">
        <br>
      </td>
    </tr>
    <tr>
      <div id="errorMsg">${login-msg}</div>
    </tr>
    <p>记住我<input id="remember" name="remember" value="1" type="checkbox"></p>
  </table>

  <div class="buttons">
    <input value="登录" type="submit" id="regBtu">
  </div>
  <br class="clear">
</form>
</body>
</html>