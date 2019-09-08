package com.bibiboy.annotation;//package com.bibiboy.annotation;
//
//import java.lang.reflect.Method;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.ui.Model;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import com.alibaba.fastjson.JSON;
//
//@Aspect
//@Component
//public class LogAspect {
//
//    @Autowired
////    private SysLogMapper logMapper;
//
//    @Pointcut("@annotation(com.bibiboy.annotation.LogAnno)")
//    private void pointcut() {
//
//    }
//
//    @After("pointcut()")
//    public void insertLogSuccess(JoinPoint jp) {
//        addLog(jp, getDesc(jp));
//    }
//
//    private void addLog(JoinPoint jp, String vcDesc) {
//    	LogAnno.LOG_TYPE type = getType(jp);//日志类型
//   // 	SysLog log = new SysLog();
//        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//        //一些系统监控
//        if (requestAttributes != null) {
//        	//保存ip
//            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//   //         String ip = WebUtil.getIp(request);
//   //         log.setVcIp(ip);
//            //保存管理员信息
//            Object object = requestAttributes.getAttribute("smoperator",RequestAttributes.SCOPE_SESSION);
//            
//            if(object == null){
//            	return;
//            }
//   //         Smoperator operator = (Smoperator)object;
//  //          log.setVcUserName(operator.getVcOperatorNo()+"/"+operator.getVcOperatorName());
//        }
//  //      log.setDtCreateTime(new Date());
//  //      log.setVcType(type.toString());
//  //      log.setVcDesc(vcDesc);
//        //保存方法名
//        String className = jp.getTarget().getClass().getName();
//        String methodName = getMethodName(jp);
// //       log.setVcMethodName(className+"/"+methodName);
//
//        Object[] obj = jp.getArgs();
//        StringBuffer buffer = new StringBuffer();
//        if (obj != null) {
//            for (int i = 0; i < obj.length; i++) {
//                buffer.append("[参数" + (i + 1) + ":");
//                Object o = obj[i];
//                if(o instanceof Model){
//                    continue;
//                }
//                String parameter=null;
//                try {
//                    parameter=JSON.toJSONString(o);
//                }catch (Exception e){
//                    continue;
//                }
//                buffer.append(parameter);
//                buffer.append("]");
//            }
//        }
//  //      log.settParam(buffer.toString());
//  //      logMapper.insert(log);
//    }
//
//    /**
//     * 记录异常
//     *
//     * @param joinPoint
//     * @param e
//     */
//    @AfterThrowing(value = "pointcut()", throwing = "e")
//    public void afterException(JoinPoint joinPoint, Exception e) {
//        System.out.print("-----------afterException:" + e.getMessage());
//        addLog(joinPoint, getDesc(joinPoint) + e.getMessage());
//    }
//
//	/**
//	 * 获取日志描述
//	 * @param joinPoint
//	 * @return
//	 */
//    private String getDesc(JoinPoint joinPoint) {
//        MethodSignature methodName = (MethodSignature) joinPoint.getSignature();
//        Method method = methodName.getMethod();
//        return method.getAnnotation(LogAnno.class).desc();
//    }
//
//    private LogAnno.LOG_TYPE getType(JoinPoint joinPoint) {
//        MethodSignature methodName = (MethodSignature) joinPoint.getSignature();
//        Method method = methodName.getMethod();
//        return method.getAnnotation(LogAnno.class).type();
//    }
//    private String getMethodName(JoinPoint joinPoint) {
//        MethodSignature methodName = (MethodSignature) joinPoint.getSignature();
//        return methodName.getName();
//    }
//}