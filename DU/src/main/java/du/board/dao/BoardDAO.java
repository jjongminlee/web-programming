package du.board.dao;

import java.util.HashMap;
import java.util.List;

import du.board.domain.BoardVO;
import du.common.Pagination;

public interface BoardDAO {
	public List<BoardVO> selectBoardList(HashMap<String, Object> map);
	
	public int selectBoardListCnt(String title);
	
	public void insertBoard(BoardVO board);
}