package du.board.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import du.board.dao.BoardDAO;
import du.board.domain.BoardVO;
import du.board.service.BoardService;
import du.common.Pagination;
import du.user.domain.UserVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	
	@Override
	public List<BoardVO> selectBoardList(Pagination pagination, String title) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("startList", pagination.getStartList());
		map.put("listSize", pagination.getListSize());
		map.put("title", title);
		
		
		return boardDAO.selectBoardList(map);
	}


	@Override
	public int selectBoardListCnt(String title) {
		// TODO Auto-generated method stub
	
		return boardDAO.selectBoardListCnt(title);
	}


	@Override
	public void insertBoard(BoardVO board, HttpSession session) {
		// TODO Auto-generated method stub
		
		UserVO user = (UserVO) session.getAttribute("USER");
		if(user != null) {
			board.setWriterId(user.getUserId());
			
			boardDAO.insertBoard(board);
		}
		
	}


	@Override
	public BoardVO selectBoard(long idx) {
		// TODO Auto-generated method stub
		
		return boardDAO.selectBoard(idx);
	}


	@Override
	public void deleteBoard(long idx) {
		// TODO Auto-generated method stub
		
		boardDAO.deleteBoard(idx);
	}


	@Override
	public void updateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
		boardDAO.updateBoard(board);
	}

	
}
