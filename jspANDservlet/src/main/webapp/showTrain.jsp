<%@ page import="entity.TrainInfo" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/22
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% TrainInfo t1= (TrainInfo) request.getAttribute("train");%>
    <table border="soild 1px">
        <tr><th colspan="2"><h1>火车车次详情</h1></th></tr>
        <tr><td>车次</td><td><%=t1.getTrainNo()%></td></tr>
        <tr><td>发车--到达</td><td><%=t1.getStartStation()+"-"+t1.getArrivalStation()%></td></tr>
        <tr><td>发时--到时</td><td><%=t1.getStartTime()+"-"+t1.getArrivalTime()%></td></tr>
        <tr><td>车型</td><td><%=t1.getType()%></td></tr>
        <tr><td>运行时间（小时）</td><td><%=t1.getRunTime()%></td></tr>
        <tr><td>里程（公里）</td><td><%=t1.getMile()%></td></tr>
    </table>

<a href="/train">返回</a>
</body>
</html>
