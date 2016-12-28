package top.builbu.common.util.page;

import java.io.Serializable;

/**
 * @ClassName: Pagination
 * @Description: TODO 分页
 * @date 2016年3月7日 下午1:00:18
 * 
 */
public class Pagination implements Serializable {
	private static final long serialVersionUID = 1052319221780926400L;

	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_CURRENT_SKIP = 1;

	private int rows = DEFAULT_PAGE_SIZE; // 每页显示记录数
	private int total; // 总条目数
	private int totalPage; // 总页数
	private int page = DEFAULT_CURRENT_SKIP; // 当前页

	private int currentResult; // 当前记录起始索引

	private String orderBy;

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Pagination() {

	}

	public Pagination(int rows) {
		this(rows, DEFAULT_CURRENT_SKIP);
	}

	public Pagination(int rows, int page) {
		this.rows = rows;
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		totalPage = total % rows == 0 ? total / rows : (total / rows + 1);

		this.currentResult = (this.getPage() - 1) * this.getRows();
	}

	public int getCurrentResult() {
		this.currentResult = (this.getPage() - 1) * this.getRows();
		return currentResult;
	}

	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}

	public int getPage() {
		if (page <= 1) {
			return 1;
		}
		return page;
	}

	public void setPage(int page) {
		this.page = page;
		this.currentResult = (this.getPage() - 1) * this.getRows();
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "Pagination [rows=" + this.rows + ", total=" + this.total + ", totalPage=" + this.totalPage + ", page="
				+ this.page + ", currentResult=" + this.currentResult + ", orderBy=" + this.orderBy + "]";
	}

}
