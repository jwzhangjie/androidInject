package com.wangjie.androidinject.annotation.annotations.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: wangjie  email: tiantian.china.2@gmail.com
 * Date: 13-11-30
 * Time: 下午8:03
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AIGet {
    String value() default "";

    /**
     * connectionTimeout, 连接一个url的连接等待时间（默认20秒）
     * @return
     */
    int connTimeout() default 20000;

    /**
     * SocketTimeout, 连接上一个url，获取response的返回等待时间（默认20秒）
     * @return
     */
    int soTimeout() default 20000;
}
