package com.dong.Board.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.Board.dao.BoardDao;
import com.dong.Board.entity.Board;
import com.dong.Board.entity.BoardView;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public List<BoardView> getViewList() {

		return getViewList(1, "title", "");

	}

	@Override
	public List<BoardView> getViewList(String field, String query) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query);
	}

	@Override
	public List<BoardView> getViewList(int page, String field, String query) {

		int size = 10;
		int offset = 0 + (page - 1) * size;

		List<BoardView> list = boardDao.getViewlist(offset, size, field, query);

		return list;
	}

	@Override
	public BoardView getView(int id) {
		BoardView detail = boardDao.getView(id);
		return detail;
	}

	@Override
	public int getCount() {

		return getCount("title", "");
	}

	@Override
	public int getCount(String field, String query) {

		return boardDao.getCount(field, query);
	}

	@Override
	public void update(BoardView boardTemp) {
		boardDao.update(boardTemp);
	}

	@Override
	public void delete(int id) {
		boardDao.delete(id);
	}

	@Override
	public void insert(Board board) {
		boardDao.insert(board);
	}

}
