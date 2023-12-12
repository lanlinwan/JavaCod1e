<%@ page import="java.util.List" %>
<%@ page import="entity.TrainInfo" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/22
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      table tr:nth-child(even){
        background: lightseagreen;
      }
      table tr:nth-child(odd){
          background: red;
      }
    </style>
  </head>
  <body>
  <%
    List<TrainInfo> list= (List<TrainInfo>) request.getAttribute("list");
  %>
  <table border="soild 1px" >
    <form action="delete" method="get" id="mainForm">
      <tr><th><input type="submit" value="删除"></th><th>车次</th><th>发车--到达</th><th>发时--到时</th><th>车型</th><th>运行小时</th></tr>
  <%
    for (TrainInfo info : list) {
      out.write("<tr><td><input type=\"checkbox\" name=\"id\" value=\""+info.getTrainNo()+"\"></td><td><a href=\"showtrain?id="+info.getTrainNo()+"\">"+info.getTrainNo()+"</td><td>"+info.getStartStation()+"-"+info.getArrivalStation()+"</td><td>"+info.getStartTime()+"-"+info.getArrivalTime()+"</td><td>"+info.getType()+"</td><td>"+info.getRunTime()+"</td>");
    }
  %>
  </table>
  </form>
  </body>
</html>
