
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报修信息列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            var msg="${requestScope.get('msg')}";
            if (msg != null&& msg!=""&&msg!= undefined){
                alert(msg);
                location.href="${pageContext.request.contextPath}/hqbx/allBxxx";
            }
        })
    </script>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>报修信息列表 —— 显示所有信息</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/hqbx/toAdd">新增信息</a>
        </div>
        <div class="col-md-4 column">

        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>单号</th>
                    <th>报修时间</th>
                    <th>寝室</th>
                    <th>报修人</th>
                    <th>联系方式</th>
                    <th>报修内容</th>
                    <th>实际维修及用材情况</th>
                    <th>状态</th>
                    <th>退回原因</th>
                    <th>维修人员</th>
                    <th>备注</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="bxxx" items="${requestScope.get('bxxxes')}">
                    <tr>
                        <td>${bxxx.getDh()}</td>
                        <td>${bxxx.getBxsj()}</td>
                        <td>${bxxx.getQs()}</td>
                        <td>${bxxx.getBxr()}</td>
                        <td>${bxxx.getLxfs()}</td>
                        <td>${bxxx.getBxnr()}</td>
                        <td>${bxxx.getSjwxhycqk()}</td>
                        <td>${bxxx.getZt()}</td>
                        <td>${bxxx.getThyy()}</td>
                        <td>${bxxx.getWxry()}</td>
                        <td>${bxxx.getBz()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/hqbx/toUpdateBxxx?id=${bxxx.getDh()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/hqbx/del/${bxxx.getDh()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
