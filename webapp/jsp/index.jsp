<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-09-26
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="/list" method="post">
    产品代码<input type="text" name="id">
    风险评级<select name="risk">
    <option value="0">请选择</option>
    <option value="1">R1</option>
    <option value="2">R2</option>
    <option value="3">R3</option>
</select>
    <input type="submit" value="查询">
</form>
<a href="/jsp/addfina.jsp">新增理财信息</a>
<table border="1px">
    <tr style="font-weight:bold ">
        <td>产品代码</td>
        <td>风险评级</td>
        <td>预期收益</td>
        <td>发售起日期</td>
        <td>发售截止日</td>
        <td>产品到期日</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>
                <c:if test="${item.risk==1}">
                    R1
                </c:if>
                <c:if test="${item.risk==2}">
                    R2
                </c:if>
                <c:if test="${item.risk==3}">
                    R3
                </c:if>
            </td>
            <td>预期收益</td>
            <td><fmt:formatDate value="${item.salestarting}" pattern="yyy-MM-dd"></fmt:formatDate></td>
            <td><fmt:formatDate value="${item.saleend}" pattern="yyy-MM-dd"></fmt:formatDate></td>
            <td><fmt:formatDate value="${item.end}" pattern="yyy-MM-dd"></fmt:formatDate></td>

        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    $(function () {
        $("tr:even").css('backgroundColor','skyblue');
    })
</script>
</body>
</html>
