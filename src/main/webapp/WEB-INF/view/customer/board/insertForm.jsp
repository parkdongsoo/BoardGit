<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	

		<div class="board_write_wrap">
			<form action="/customer/board/insert" method="post">
				<div class="board_write">
					<div class="title">
						<dl>
							<dt>제목</dt>
							<dd>
								<input type="text" name="title" placeholder="제목 입력" re>
							</dd>
						</dl>
					</div>
					<div class="info">
						<dl>
							<dt>글쓴이</dt>
							<dd>
								<input type="text" placeholder="글쓴이 입력">
							</dd>
						</dl>
						<dl>
							<dt>비밀번호</dt>
							<dd>
								<input type="password" placeholder="비밀번호 입력">
							</dd>
						</dl>
					</div>
					<div class="cont">
						<textarea name="content" placeholder="내용 입력"></textarea>
					</div>
				</div>
				<div class="bt_wrap">
					<button type="submit" class="on">등록</button>
					<a href="list">취소</a>
				</div>
			</form>
		</div>
