
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Index</title>
      <script type="text/javascript" src="js/index.js"></script>
      <link rel="stylesheet" href="/css/styleIndex.css">
  </head>
  <body>

  <div class="block">
  <form action="action" method="POST" name="data">
      Start date: <input type="text" name="startDate" id="startDate"  value="" ></br>
      End date:   <input type="text" name="endDate" id = "endDate" value="" ></br>
      Performer:  <select name="Performer">

      <option value="All performers" selected>All performers</option>
      <jsp:useBean id="ob" scope="request" class="logic.ManagementSystem"></jsp:useBean>
      <p> <jsp:getProperty  name="ob" property="performs"></jsp:getProperty></p>
  </select></br>

      Time period:  <select name="TimePeriod" id="timePeriod" onchange="selectData()">
      <option value="Last Month" >Last Month
      <option value="Last Calendar Year">Last Calendar Year
      <option value="Current Year to Date">Current Year to Date

  </select></br>

      <p><input type="submit" value="Отправить"></p>

  </form>
</div>
  </body>
</html>
