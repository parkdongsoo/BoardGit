<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<div class="board_view_wrap">
		<div class="board_view">
			<div class="title">${detail.title}</div>
			<div class="info">
				<dl>
					<dt>번호</dt>
					<dd>${detail.id}</dd>
				</dl>
				<dl>
					<dt>글쓴이</dt>
					<dd>${detail.memberName}</dd>
				</dl>
				<dl>
					<dt>작성일</dt>
					<dd>
						<fmt:formatDate value="${detail.regdate}"
							pattern="yyyy-MM-dd HH:mm:ss" />
					</dd>
				</dl>
				<dl>
					<dt>조회</dt>
					<dd>${detail.hit}</dd>
				</dl>
			</div>
			<div class="cont">${detail.content}</div>
		</div>
		<div class="bt_wrap">
			<a href="list" class="on">목록</a> <a href="updateForm/${detail.id}">수정</a>
			<a href="delete/${detail.id}">삭제</a>
		</div>
	</div>