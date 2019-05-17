<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>增加Bug</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-1.8.3.min.js"></script>
    <script>
        var result = "${resultRe}";
        if(result!=null && result!=''){
            alert(result);
        }
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/bug/ins" method="post">
        <table border="1" style="margin: 0 auto;">
            <tr>
                <th colspan="2"><h1>增加BUG</h1></th>
            </tr>
            <tr>
                <td>所属项目</td>
                <td>
                    <select name="projectId">
                        <c:forEach items="${pro}" var="pro">
                            <option value="${pro.id}">${pro.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>严重性</td>
                <td>
                    <select name="serverity">
                        <option value="10">文字错误</option>
                        <option value="20">次要错误</option>
                        <option value="30">严重错误</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>BUG标题(*)</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>报告人</td>
                <td><input type="text" name="reportUser"></td>
            </tr>
            <tr>
                <td style="align-content: center" colspan="2">
                    <input type="submit" value="提交">
                    <input onclick="window.history.back()" value="返回">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
