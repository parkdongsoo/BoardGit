<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항</title>
    <link rel="stylesheet" href="/css/css.css">
    
</head>
<body>

	<!-- --------------------- header 부분 ------- -->
		<tiles:insertAttribute name="header" />
		
		
    <div class="board_wrap">
        <div class="board_title">
            <strong>공지사항</strong>
        </div>
		
		<!-- --------------------- main 부분 ------- -->
		<tiles:insertAttribute name="main" />
		
	</div>
	
	<!-- --------------------- footer 부분 ------- -->
		<tiles:insertAttribute name="footer" />
</body>
</html> 