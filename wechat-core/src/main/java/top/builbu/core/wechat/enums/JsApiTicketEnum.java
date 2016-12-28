package top.builbu.core.wechat.enums;

public enum JsApiTicketEnum {

	ID("限定id",1),
	TIME("限定时间",7000);
	
	private String key;
	
	private long value;
	
	JsApiTicketEnum(String key,long value){
		this.key=key;
		this.value=value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
}
