<%@LANGUAGE="VBSCRIPT" CODEPAGE="65001"%>
<!--#include file="Connections/student_book.asp" -->
<%
Dim Recordset1
Dim Recordset1_cmd
Dim Recordset1_numRows

Set Recordset1_cmd = Server.CreateObject ("ADODB.Command")
Recordset1_cmd.ActiveConnection = MM_student_book_STRING
Recordset1_cmd.CommandText = "SELECT * FROM dbo.管理员" 
Recordset1_cmd.Prepared = true

Set Recordset1 = Recordset1_cmd.Execute
Recordset1_numRows = 0
%>
<%
'  *** Recordset Stats, Move To Record, and Go To Record: declare stats variables

Dim Recordset1_total
Dim Recordset1_first
Dim Recordset1_last

' set the record count
Recordset1_total = Recordset1.RecordCount

' set the number of rows displayed on this page
If (Recordset1_numRows < 0) Then
  Recordset1_numRows = Recordset1_total
Elseif (Recordset1_numRows = 0) Then
  Recordset1_numRows = 1
End If

' set the first and last displayed record
Recordset1_first = 1
Recordset1_last  = Recordset1_first + Recordset1_numRows - 1

' if we have the correct record count, check the other stats
If (Recordset1_total <> -1) Then
  If (Recordset1_first > Recordset1_total) Then
    Recordset1_first = Recordset1_total
  End If
  If (Recordset1_last > Recordset1_total) Then
    Recordset1_last = Recordset1_total
  End If
  If (Recordset1_numRows > Recordset1_total) Then
    Recordset1_numRows = Recordset1_total
  End If
End If
%>

<%
' *** Recordset Stats: if we don't know the record count, manually count them

If (Recordset1_total = -1) Then

  ' count the total records by iterating through the recordset
  Recordset1_total=0
  While (Not Recordset1.EOF)
    Recordset1_total = Recordset1_total + 1
    Recordset1.MoveNext
  Wend

  ' reset the cursor to the beginning
  If (Recordset1.CursorType > 0) Then
    Recordset1.MoveFirst
  Else
    Recordset1.Requery
  End If

  ' set the number of rows displayed on this page
  If (Recordset1_numRows < 0 Or Recordset1_numRows > Recordset1_total) Then
    Recordset1_numRows = Recordset1_total
  End If

  ' set the first and last displayed record
  Recordset1_first = 1
  Recordset1_last = Recordset1_first + Recordset1_numRows - 1
  
  If (Recordset1_first > Recordset1_total) Then
    Recordset1_first = Recordset1_total
  End If
  If (Recordset1_last > Recordset1_total) Then
    Recordset1_last = Recordset1_total
  End If

End If
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<div align="center">
  <table width="1157" border="1">
    <tr>
      <th width="157" scope="col">管理员编号</th>
      <th width="157" scope="col">管理员姓名</th>
      <th width="157" scope="col">管理员账号</th>
      <th width="157" scope="col">管理员密码</th>
      <th width="157" scope="col">管理员性别</th>
      <th width="169" scope="col">管理员电话</th>
      <th width="169" scope="col">修改</th>
    </tr>
    <tr>
      <td><div align="center"><%=(Recordset1.Fields.Item("管理员编号").Value)%></div></td>
      <td><div align="center"><%=(Recordset1.Fields.Item("管理员姓名").Value)%></div></td>
      <td><div align="center"><%=(Recordset1.Fields.Item("管理员账号").Value)%></div></td>
      <td><div align="center"><%=(Recordset1.Fields.Item("管理员密码").Value)%></div></td>
      <td><div align="center"><%=(Recordset1.Fields.Item("管理员性别").Value)%></div></td>
      <td><div align="center">
        <div align="center"><%=(Recordset1.Fields.Item("管理员电话").Value)%></div>
      </div></td>
      <td><div align="center" id="编辑"><a href="更新.asp" target="_blank">编辑</a></div></td>
    </tr>
  </table>
</div>
</body>
</html>
<%
Recordset1.Close()
Set Recordset1 = Nothing
%>
