package com.javabase.demo.config.excepiton;

/**
 * @Author: 孤狼
 * @desc: 自己的错误定义.
 */
public class OwerException extends RuntimeException {
	
	public OwerException(){
	
	}
	
	public OwerException(String msg){
		this.message = msg ;
	}
	
	/**
	 * 异常信息
	 */
	private String message ;
	
	/**
	 * 具体异常码,根据实际情况填写
	 */
	private int code = 0;
	
	@Override
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
}
