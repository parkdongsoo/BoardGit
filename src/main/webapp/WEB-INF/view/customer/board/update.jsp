<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="ko">

	
		<form action="/customer/board/update/${board.id}" method="POST">
			<div class="board_write_wrap">
				<div class="board_write">
					<div class="title">
						<dl>
							<dt>제목</dt>
							<dd>
								<input type="text" name="title" placeholder="제목 입력"
									value="${board.title}">
							</dd>
						</dl>
					</div>
					<div class="info">
						<dl>
							<dt>글쓴이</dt>
							<dd>
								<input type="text" name="memberName" placeholder="글쓴이 입력"
									value="${board.memberName}">
							</dd>
						</dl>
						<dl>
							<dt>비밀번호</dt>
							<dd>
								<input type="password" placeholder="비밀번호 입력" value="1234">
							</dd>
						</dl>
					</div>
					<div class="cont">
						<textarea name="content" placeholder="내용 입력">${board.content}</textarea>
					</div>
				</div>
				<div class="bt_wrap">
					<button type="submit" class="on">수정완료</button>
					<a href="/customer/board/detail?id=${board.id}">취소</a>
				</div>
			</div>
		</form>
	