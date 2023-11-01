<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<htmL lang="en">

<head>
    <meta charset="UTF-8">
    <titLe>TitLe</title>
</head>
<body>
<input type="button" value=”新增"><br>
<hr>
<tabLe border="1" cellspacing="0" width= "800">
<tr>
    <th>序号</th>
    <th>标题</th>
    <th>身份</th>

</tr>


<c:forEach items="${todos}" var="todo" varStatus="status">
    <tr align="center">
            <%--<td>${brand. id}</td>--%>
        <td>${status.id}</td>
        <td>${todo.title}</td>
        <td>${todo.atatus}</td>
        <c:if test="${todo. status == 1}">
            <td>启用</td>
        </c:if>
        <c:if test="${todo.status != 1}">
            <td>禁用</td>
        </c:if>
        <td><a href="#">修改</a> <a href="#">删除</a></td>
    </tr>

</c:forEach>

</table>

</body>
</htmL>