package cn.meetingbook.aspect;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.WebAsyncTask;

import cn.meetingbook.enums.ResposeCodeMsg;
import cn.meetingbook.result.ResponseData;


@Aspect
@Order(100)
@Component
public class ApiRequestAspect {

	
	@Pointcut("@annotation(cn.meetingbook.annotation.ApiRequest)")
	public void apiReqAspect() {
	}

	
	@Around("apiReqAspect()")
	public Object doApiReqAspect(final ProceedingJoinPoint pjp) {
		
	
				Object result = null;
				try {
					result = doReqAspect(pjp);
				} catch (Throwable e) {
					result = ResposeCodeMsg.FAIL;
				}

				ResponseData resp = null;
				if (result == null) {
					resp = new ResponseData(ResposeCodeMsg.NULL);
				} else if (result instanceof ResposeCodeMsg) {
					resp = new ResponseData((ResposeCodeMsg) result);
				} else if (result instanceof ResponseData) {
					resp = (ResponseData) result;
				} else {
					resp = new ResponseData(ResposeCodeMsg.SUCCESS, result);
				}

				return resp;
			}

	
	public Object doReqAspect(ProceedingJoinPoint pjp) throws Throwable {

		try {
			// 调用 Controller 具体逻辑
			return pjp.proceed(pjp.getArgs());
		
		}catch (Exception e) {
			return ResposeCodeMsg.FAIL;
		}
	}
}
