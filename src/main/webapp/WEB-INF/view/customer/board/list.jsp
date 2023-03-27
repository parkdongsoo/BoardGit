<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


	
		<form class="form" action="/customer/board/list" method="GET">
			<select class="select" name="f">
				<option ${(param.f == "title")?"selected":""} value="title">제목</option>
				<option ${(param.f == "memberName")?"selected":""} value="memberName">작성자</option>
			</select> <input class="search" type="text" name="q" value="${param.q}"
				placeholder="Search" /> <input class="search-btn" type="submit"
				value="검색" />
		</form>
	
		<div class="board_list_wrap">
			<div class="board_list">
				<div class="top">
					<div class="num">번호</div>
					<div class="title">제목</div>
					<div class="writer">글쓴이</div>
					<div class="date">작성일</div>
					<div class="count">조회</div>
				</div>
				<c:forEach var="b" items="${list}">
					<div>
						<div class="num">${b.id }</div>
						<div class="title">
							<a href="detail?id=${b.id}">${b.title}</a>
						</div>
						<div class="writer">${b.memberName}</div>
						<div class="date">
							<fmt:formatDate value="${b.regdate}" pattern="yyyy-MM-dd" />
						</div>
						<div class="count">${b.hit}</div>
					</div>
				</c:forEach>
			</div>
			<div class="board_page">
				<c:set var="page" value="${(param.p == null)?1:param.p}" />
				<c:set var="startNum" value="${page-(page-1)%5}" />
				<c:set var="lastNum"
					value="${fn:substringBefore(Math.ceil(count/10), '.')}" />
	
				<a href="?p=1&f=${param.f}&q=${param.q}" class="bt first"><<</a>
	
				<c:if test="${startNum>1}">
					<a class="bt prev" href="?p=${startNum}&f=${param.f}&q=${param.q}"><</a>
				</c:if>
				<c:if test="${startNum<=1}">
					<a class="bt prev" href="?p=1&f=${param.f}&q=${param.q}"><</a>
				</c:if>
	
				<c:forEach var="i" begin="0" end="4">
					<c:if test="${i+startNum <= lastNum}">
						<a href="?p=${i+startNum}&f=${param.f}&q=${param.q}" class="num on">${startNum+i}</a>
					</c:if>
				</c:forEach>
	
				<c:if test="${startNum+5 <= lastNum}">
					<a class="bt next" href="?p=${startNum+5}&f=${param.f}&q=${param.q}">></a>
				</c:if>
				<c:if test="${startNum+5 > lastNum}">
					<a class="bt next" href="?p=${lastNum}&f=${param.f}&q=${param.q}"
						onclick="alert('다음 페이지가 없습니다.');">></a>
				</c:if>
				<a class="bt last" href="?p=${lastNum}&f=${param.f}&q=${param.q}">>></a>
	
			</div>
			<div class="bt_wrap">
				<a href="/customer/board/insertForm" class="on">등록</a>
				<!--<a href="#">수정</a>-->
			</div>
		</div>
	