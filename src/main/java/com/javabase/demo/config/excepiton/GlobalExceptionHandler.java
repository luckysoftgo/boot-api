package com.javabase.demo.config.excepiton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author: 孤狼
 * @desc: 全局的错误异常处理.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ResponseBody
	@ExceptionHandler(value = BindException.class)
	public Map<String,Object> bindExceptionErrorHandler(BindException ex) throws Exception {
		logger.error("bindExceptionErrorHandler info:{}",ex.getMessage());
		Map<String,Object> result = new HashMap<>(16);
		StringBuilder sb = new StringBuilder();
		FieldError fieldError = ex.getFieldError();
		sb.append(fieldError.getDefaultMessage());
		result.put("message","绑定失效");
		result.put("code","500");
		return result;
	}
	
	
	@ResponseBody
	@ExceptionHandler(value = OwerException.class)
	public Map<String,Object> owerExceptionErrorHandler(OwerException ex) throws Exception {
		logger.error("owerExceptionErrorHandler info:{}",ex.getMessage());
		Map<String,Object> result = new HashMap<>(16);
		result.put("message",ex.getMessage());
		result.put("code","500");
		return result;
	}
	
}
