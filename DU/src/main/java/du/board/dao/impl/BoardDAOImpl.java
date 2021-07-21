package du.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import du.board.dao.BoardDAO;
import du.board.domain.BoardAttFileVO;
import du.board.domain.BoardVO;
import du.common.Pagination;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class BoardDAOImpl extends EgovAbstractMapper implements BoardDAO{

	@Override
	public List<BoardVO> selectBoardList(HashMap<String, Object> map) {
		
		return selectList("Board.selectBoardList", map);
	}

	@Override
	public int selectBoardListCnt(String title) {
		
		return selectOne("Board.selectBoardListCnt", title);
	}

	@Override
	public void insertBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
		insert("Board.insertBoard", board);		
	}

	@Override
	public BoardVO selectBoard(long idx) {
		// TODO Auto-generated method stub
		
		
		return selectOne("Board.selectBoard", idx);
	}

	@Override
	public void deleteBoard(long idx) {
		// TODO Auto-generated method stub
		delete("Board.deleteBoard", idx);
	}

	@Override
	public void updateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
		update("Board.updateBoard", board);
		
	}

	@Override
	public void insertBoardAttFile(BoardAttFileVO attFileVO) {
		// TODO Auto-generated method stub
		insert("Board.insertBoardAttFile", attFileVO);
	}

	@Override
	public BoardAttFileVO selectBoardAttFile(BoardAttFileVO criteria) {
		// TODO Auto-generated method stub
		return selectOne("Board.selectBoardAttFile", criteria);
	}

	@Override
	public void deleteBoardAttFile(BoardAttFileVO criteria) {
		// TODO Auto-generated method stub
		delete("Board.deleteBoardAttFile", criteria);
	}

	
	
}
