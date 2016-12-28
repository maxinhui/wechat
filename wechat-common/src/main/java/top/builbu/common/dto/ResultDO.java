package top.builbu.common.dto;

/**
 * @ClassName: ResultDO
 * @Description: TODO 返回参数对象
 * @date 2016年3月7日 上午9:49:24
 * 
 * @param <T>
 */
public class ResultDO<T> extends BaseResultDO {

	private static final long serialVersionUID = -3434272908589805662L;

	private T data;

	public ResultDO() {}

	public ResultDO(String key, boolean result) {
		setResultCode(key);
		setErrorMessage(BaseResultCode.getValueWithKey(key));
		setSuccess(result);
	}

	public ResultDO(T data) {
		this.data = data;
	}

	public static <T> ResultDO<T> getResult() {
		return new ResultDO<T>();
	}

	public T getModule() {
		return data;
	}

	public void setModule(T data) {
		this.data = data;
	}
}
