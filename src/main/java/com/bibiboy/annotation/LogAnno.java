package com.bibiboy.annotation;//package com.bibiboy.annotation;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Inherited;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
///**
// * 日志注解
// * @author 王飞鱼
// * @date 2018年12月7日
// * <description>
// */
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
//@Documented
//@Inherited
//public @interface LogAnno {
//    public enum LOG_TYPE {ADD, UPDATE, DEL, SELECT, OTHOR};
//
//    /**
//     * 内容
//     */
//    String desc();
//
//    /**
//     * 类型 curd
//     */
//    LOG_TYPE type() default LOG_TYPE.OTHOR;
//}