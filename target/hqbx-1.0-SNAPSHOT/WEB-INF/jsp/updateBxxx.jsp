<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改报修信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改报修信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/hqbx/updateBxxx" method="post">
        <input type="hidden" name="dh" value="${bxxx.getDh()}"/>
        <div class="form-group">
            <label for="bxsj" style="font-size:20px;">报修时间</label>
            <input id="bxsj" class="form-control" type="text" name="bxsj" value="${bxxx.getBxsj()}">
        </div>
        <div class="form-group">
            <label for="qs" style="font-size:20px;">寝室</label>
            <input id="qs" class="form-control" type="text" name="qs" value="${bxxx.getQs()}">
        </div>
        <div class="form-group">
            <label for="bxr" style="font-size:20px;">报修人</label>
            <input id="bxr" class="form-control" type="text" name="bxr" value="${bxxx.getBxr() }">
        </div>
        <div class="form-group">
            <label for="bxnr" style="font-size:20px;">报修内容</label>
            <input id="bxnr" class="form-control" type="text" name="bxnr" value="${bxxx.getLxfs() }">
        </div>
        <div class="form-group">
            <label for="lxfs" style="font-size:20px;">联系方式</label>
            <input id="lxfs" class="form-control" type="text" name="lxfs" value="${bxxx.getBxnr() }">
        </div>
        <input type="hidden" name="sjwxhycqk" value="${bxxx.getSjwxhycqk()}"/>
        <input type="hidden" name="zt" value="${bxxx.getZt()}"/>
        <input type="hidden" name="thyy" value="${bxxx.getThyy()}"/>
        <input type="hidden" name="wxry" value="${bxxx.getWxry()}"/>
        <input type="hidden" name="bz" value="${bxxx.getBz()}"/>
        <input type="submit" value="提交"/>
    </form>
</div>

