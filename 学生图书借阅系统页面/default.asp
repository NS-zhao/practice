<%@LANGUAGE="VBSCRIPT" CODEPAGE="65001"%>
<!--#include file="Connections/student_book.asp" -->
<%
Dim Recordset1
Dim Recordset1_cmd
Dim Recordset1_numRows

Set Recordset1_cmd = Server.CreateObject ("ADODB.Command")
Recordset1_cmd.ActiveConnection = MM_student_book_STRING
Recordset1_cmd.CommandText = "SELECT * FROM dbo.读者 ORDER BY [学号] ASC" 
Recordset1_cmd.Prepared = true

Set Recordset1 = Recordset1_cmd.Execute
Recordset1_numRows = 0
%>
<%
Dim Repeat1__numRows
Dim Repeat1__index

Repeat1__numRows = -1
Repeat1__index = 0
Recordset1_numRows = Recordset1_numRows + Repeat1__numRows
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<div align="center">
  <table width="1126" border="1">
    <tr>
      <th width="84" scope="col">学号</th>
      <th width="85" scope="col">账号</th>
      <th width="85" scope="col">密码</th>
      <th width="84" scope="col">姓名</th>
      <th width="84" scope="col">性别</th>
      <th width="85" scope="col">年龄</th>
      <th width="85" scope="col">专业</th>
      <th width="87" scope="col">班级</th>
      <th width="158" scope="col">邮箱</th>
      <th width="225" scope="col">电话</th>
    </tr>
    <% 
While ((Repeat1__numRows <> 0) AND (NOT Recordset1.EOF)) 
%>
      <tr>
        <td><div align="center"><%=(Recordset1.Fields.Item("学号").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("账号").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("密码").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("姓名").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("性别").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("年龄").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("专业").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("班级").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("邮箱").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("电话").Value)%></div></td>
      </tr>
      <% 
  Repeat1__index=Repeat1__index+1
  Repeat1__numRows=Repeat1__numRows-1
  Recordset1.MoveNext()
Wend
%>
  </table>
</div>
</body>
</html>
<%
Recordset1.Close()
Set Recordset1 = Nothing
%>
