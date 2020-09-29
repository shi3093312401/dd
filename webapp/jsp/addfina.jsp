<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-09-26
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="border: 1px solid black;width: 300px">
    <p style="text-align: center">新增理财管理</p>
    <form action="/toadd" method="post">
        <p>产品代码:<input type="text" name="id"></p>
        <p>风险评级:<select name="risk">
            <option value="0">请选择</option>
            <option value="1">R1</option>
            <option value="2">R2</option>
            <option value="3">R3</option>
        </select>
        </p>
        <p>预期收益:<input type="text" name="income"></p>
        <p>发售起始日:<input type="text" name="salestarting"></p>
        <p>发售截止日:<input type="text" name="saleend"></p>
        <p>产品到期日;<input type="text" name="end"></p>
        <p>
            <input type="submit" value="保存">
            <input type="reset" value="重置">
                <button window.history.go(-1)>返回</button>
        </p>
    </form>
</div>

</body>
</html>
