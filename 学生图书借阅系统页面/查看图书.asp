<%@LANGUAGE="VBSCRIPT" CODEPAGE="65001"%>
<!--#include file="Connections/student_book.asp" -->
<%
Dim Recordset1
Dim Recordset1_cmd
Dim Recordset1_numRows

Set Recordset1_cmd = Server.CreateObject ("ADODB.Command")
Recordset1_cmd.ActiveConnection = MM_student_book_STRING
Recordset1_cmd.CommandText = "SELECT * FROM dbo.图书 ORDER BY [书号] ASC" 
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
  <table width="900" border="1">
    <tr>
      <th scope="col">书号</th>
      <th scope="col">书名</th>
      <th scope="col">类别</th>
      <th scope="col">作者</th>
      <th scope="col">价格</th>
      <th scope="col">出版社</th>
      <th scope="col">总数</th>
      <th scope="col">剩余</th>
    </tr>
    <% 
While ((Repeat1__numRows <> 0) AND (NOT Recordset1.EOF)) 
%>
      <tr>
        <td><div align="center"><%=(Recordset1.Fields.Item("书号").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("书名").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("类别").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("作者").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("价格").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("出版社").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("总数").Value)%></div></td>
        <td><div align="center"><%=(Recordset1.Fields.Item("剩余").Value)%></div></td>
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
