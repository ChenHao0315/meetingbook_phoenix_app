package cn.meetingbook.enums;


public enum ResposeCodeMsg {

	// 0 �?��表示基本成功失败状�?
	SUCCESS("0000", "处理成功"), //
	FAIL("0001", "服务异常"), //
	GEN_ID_ERR("0002", "ID生成失败"), //
	IP_CODE_ERR("0003", "获取ipCode失败"), //
	PARAM_ERR("0004", "请求参数有误"), //
	DATA_CHANGE("0005", "数据发生变化，请重新刷新操作"), //
	NULL("0006", "结果为null"), //
	REQUEST_PARAM_EMPTY("0008", "请求参数不能为空");
	
	private String code;
	private String msg;
	private ResposeCodeMsg(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}