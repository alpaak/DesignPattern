package com.designpattern.Observer.jdk_realize;

import java.util.Observable;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象，
 * 并在自己状态发生改变时，通知各个观察者
 * 这里模拟 -- 文章类
 * @author Json<<json1990@foxmail.com>>
 */
public class ConcreteWechatSubject extends Observable {
	/**
	 * 文章信息
	 */
	private String article;
	
	public String getArticle() {
	   return article;
	}
	
	public void setArticle(String article) {
	   this.article = article;
	   System.out.println("发布文章:"+article+"");
	   //状态为状态改变，通知各个观察者
       this.setChanged();
	   //通知所有粉丝查看文章
	   this.notifyObservers(article);
	}
}
