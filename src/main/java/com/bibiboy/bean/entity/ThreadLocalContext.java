package com.bibiboy.bean.entity;

public class ThreadLocalContext {
	
	private static ThreadLocal<Object> loginEntityThreadLocal=new ThreadLocal<>();
	 
    public static Object getInfomation() {
        return loginEntityThreadLocal.get();
    }
 
    public static void setInfomation(Object obj) {
        loginEntityThreadLocal.set(obj);
    }
 
    public static void removeInfomation() {
        loginEntityThreadLocal.remove();
    }
	
}
