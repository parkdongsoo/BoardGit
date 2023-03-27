package com.dong.Board.Service;

import java.util.List;

import com.dong.Board.entity.Board;
import com.dong.Board.entity.BoardView;

public interface BoardService {
	
		// -페이지를 요청할 때
		List<BoardView> getViewList();

		// -검색을 요청할 때
		List<BoardView> getViewList(String field, String query);

		// -페이지를 요청할 때
		List<BoardView> getViewList(int page, String field, String query);

		int getCount();

		int getCount(String field, String query);

		// -자세한 페이지 요청할 때
		BoardView getView(int id);

		// -수정 페이지를 요청할 때
		void update(BoardView boardTemp);

		void delete(int id);

		void insert(Board board);

}
