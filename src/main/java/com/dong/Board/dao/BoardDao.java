package com.dong.Board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dong.Board.entity.Board;
import com.dong.Board.entity.BoardView;

@Mapper
public interface BoardDao {

	public List<BoardView> getViewlist(int offset, int size, String field, String query);

	public BoardView getView(int id);
	
	int getCount(String field, String query);
	
	Board getNext(int id);
	Board getPrev(int id);

	void update(BoardView boardTemp);
	int delete(int id);
	void insert(Board board);

	int deleteAll(int[] ids);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
}
