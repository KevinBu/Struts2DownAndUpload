<%--
  Created by IntelliJ IDEA.
  User: OnionMac
  Date: 17/3/25
  Time: 下午1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传多张图片</title>
</head>
<body>
<s:actionerror/>
<s:form action="uploadMore.action" enctype="multipart/form-data">
    <s:textfield name="userName"  label="用户名:"/>
    <s:file name="file" label="选择图片:"></s:file>
    <s:file name="file" label="选择图片:"></s:file>
    <s:submit value="提交" />
</s:form>
</body>
</html>
