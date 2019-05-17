<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>Bug列表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-1.8.3.min.js"></script>
    <script>
        var result = "${resultSu}";
        if(result!=null&&result!=''){
            alert(result);
        }
    </script>
</head>
<body>
    <c:if test="${empty buglist}">
        <c:redirect url="/bug/list"/>
    </c:if>
    <form method="post" action="${pageContext.request.contextPath}/bug/list" style="text-align: center">
        所属项目<select name="bugpro" id="bugproId">
                    <option value="">全部</option>
                    <c:forEach items="${pro}" var="pro">
                        <option value="${pro.id}">${pro.name}</option>
                    </c:forEach>
                </select><input type="submit" value="查询">
        <input type="button" onclick="window.location.href='${pageContext.request.contextPath}/bug/toins'" value="增加Bug">
        <table border="1" style="margin: 0 auto;">
            <tr>
                <th colspan="5"><h1>BUG列表</h1></th>
            </tr>
            <tr>
                <td>BUG编号</td>
                <td>严重性</td>
                <td>标题</td>
                <td>报告人</td>
                <td>报告时间</td>
            </tr>
            <c:forEach items="${buglist}" var="buglist">
                <tr>
                    <td>${buglist.id}</td>
                    <c:choose>
                        <c:when test="${buglist.serverity == 10}">
                            <c:set var="serverity" value="文字错误"/>
                        </c:when>
                        <c:when test="${buglist.serverity == 20}">
                            <c:set var="serverity" value="次要错误"/>
                        </c:when>
                        <c:when test="${buglist.serverity == 30}">
                            <c:set var="serverity" value="严重错误"/>
                        </c:when>
                    </c:choose>
                    <td><c:out value="${serverity}"/></td>
                    <td>${buglist.title}</td>
                    <td>${buglist.reportUser}</td>
                    <td><fmt:formatDate value="${buglist.caeateDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                </tr>
            </c:forEach>
        </table>
    </form>
    <script>
        var projectId = ${projectId};
        if (projectId!=null && projectId!=''){
            document.getElementById("bugproId").value = projectId;
        }
    </script>
</body>
</html>
