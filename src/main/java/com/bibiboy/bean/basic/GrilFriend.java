package com.bibiboy.bean.basic;

public class GrilFriend {
	private String name;
	private Integer age;	
	private String sex;	
	
	public static void main(String[] args) {
		GrilFriend grilFriend = new GrilFriend();
		grilFriend.setAge(22);
		grilFriend.setName("玲玲");
		grilFriend.setSex("女");
		grilFriend.say("我是哔哔小子女朋友，我叫"+grilFriend.getName()+"，今年"+grilFriend.getAge()+"岁啦");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void say(String s) {
		System.out.println(s);
	}
}
