package du.common;

public class Pagination {
	
	// 한 페이지당 보여질 목록의 개수
	private int listSize = 3;
	// 한 페이지 범위에 보여질 페이지 개수
	private int rangeSize = 3;
	// 현재 목록의 페이지 번호
	private int page;
	// 각 페이지 범위 시작 번호
	private int range;
	// 총 게시물의 개수
	private int listCnt;
	//총 페이지 범위의 개수
	private int pageCnt;
	//시작번호
	private int startPage;
	//끝번호
	private int endPage;
	
	private int startList;
	//이전 페이지
	private boolean prev;
	//다음 페이지
	private boolean next;
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getRangeSize() {
		return rangeSize;
	}
	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getListCnt() {
		return listCnt;
	}
	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartList() {
		return startList;
	}
	public void setStartList(int startList) {
		this.startList = startList;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	public void pageInfo(int page, int range, int listCnt) {
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		
		//총 페이지 범위의 갯수
		this.pageCnt = (int)Math.ceil((float)listCnt/listSize);
		
		//시작 번호
		this.startPage = (range - 1) * rangeSize + 1;
		
		//끝 번호
		this.endPage = range * rangeSize;
		//Mapper에 사용할 Limit 시작 번호
		this.startList = (page - 1) * listSize;
		//이전 버튼
		this.prev = range == 1 ? false : true;
		//다음 버튼
		this.next = endPage > pageCnt ? false : true;
		if(endPage >= pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false;
		}
		
	}

}
