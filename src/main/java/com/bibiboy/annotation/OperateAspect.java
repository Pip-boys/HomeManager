package com.bibiboy.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.bibiboy.bean.entity.PageResult;

@Aspect
@Component
public class OperateAspect{
	
	//连接点为cut，关联注解，定义执行的级别，解析形式等，切面为当前类OperateAspect
	@Pointcut("@annotation(com.bibiboy.annotation.MyLog)")
	private void cut() {
		
	}
	
	//ProceedingJoinPoint is only supported for around advice，说明ProceedingJoinPoint只允许出现在Around
	
	//环绕如果没有返回值会导致切面之前的方法的返回值为空，而且一定先执行
	@Around("cut()")
	public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("开始Around");
		PageResult pageResult=null;
		try{
			Object proceed = joinPoint.proceed();	//注意在joinPoint.proceed()的前后代码顺序！
			pageResult=(PageResult) proceed;
			//Object result = joinPoint.getArgs()[0];	这是获取被切函数的 参数！
		}catch (Exception e)
		{
		e.printStackTrace();
		}
		return pageResult;
		
	}
	
	//这里的rev是一层层嵌套迭代过来的，首先是被切方法返回，然后到Around的后半部分，然后到AfterReturning，再到After，如果有一层返回为null都会影响最终结果
	@AfterReturning(returning="rvt", pointcut="@annotation(com.bibiboy.annotation.MyLog)")
	public Object AfterExec(JoinPoint joinPoint,Object rvt){	
		Object object[] = joinPoint.getArgs(); // 获取被切函数 的参数
	    System.out.println("AfterReturning增强：获取目标方法的返回值：" + object);
	    return rvt;
	}
	
	//在被增强方法前执行
	@Before("cut()")
	public void before(){
		System.out.println("Before");
	}
	
	//after在切面最后执行，不执行被增强方法也会执行
	/*@After("cut()")
	public void after(){
		System.out.println("after");
	}*/
	
	
	@AfterThrowing(value = "cut()", throwing = "e")
    public void afterException(Throwable e) {
		System.out.print("-----------afterException:" + e.getMessage());
    }
}
