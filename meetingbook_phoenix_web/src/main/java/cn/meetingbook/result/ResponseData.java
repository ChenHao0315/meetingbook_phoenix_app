package cn.meetingbook.result;

import cn.meetingbook.enums.ResposeCodeMsg;

/**
 * @ClassName: ResponseData
 * @Description: 返回数据
 * @version V1.0
 * @author: xfyang
 * @date: 2016�?2�?3�?上午9:31:21
 */
public class ResponseData {

	// 返回结果�?
	private String code;
	// 返回结果说明
	private String msg;
	// 返回结果数据
	private Object data;

	public ResponseData(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResponseData(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public ResponseData(ResposeCodeMsg resposeCodeMsg, Object data) {
		this.code = resposeCodeMsg.getCode();
		this.msg = resposeCodeMsg.getMsg();
		this.data = data;
	}
	
	public ResponseData(ResposeCodeMsg resposeCodeMsg) {
		this.code = resposeCodeMsg.getCode();
		this.msg = resposeCodeMsg.getMsg();
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}