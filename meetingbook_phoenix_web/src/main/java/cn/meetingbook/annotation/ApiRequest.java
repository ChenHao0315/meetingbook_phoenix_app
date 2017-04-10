package cn.meetingbook.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: ApiRequest
 * @Description: 统一定义 api 接口的注�?
 * @version V1.0
 * @author: chuang
 * @date: 2016�?�?�?下午5:28:32
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiRequest {

}
