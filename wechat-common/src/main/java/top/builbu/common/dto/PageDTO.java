package top.builbu.common.dto;

import java.io.Serializable;
import java.util.List;



/**
 * @ClassName: PageDTO
 * @Description: TODO 分页 DTO
 * @date 2016年3月25日 下午3:36:46
 * 
 * @param <T>
 */
public class PageDTO<T> implements Serializable {

	private static final long serialVersionUID = 5780766505173762684L;
	private Integer total;
	private List<T> rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	
}
