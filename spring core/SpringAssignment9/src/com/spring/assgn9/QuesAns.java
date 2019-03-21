package com.spring.assgn9;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class QuesAns {
	
	private String questionId;
	private String question;
	List<String> answer;
	Set<String> ans;
	Map<Integer,String> a;
	private ApplicationContext ac=null;
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public Set<String> getAns() {
		return ans;
	}
	public void setAns(Set<String> ans) {
		this.ans = ans;
	}
	public Map<Integer, String> getA() {
		return a;
	}
	public void setA(Map<Integer, String> a) {
		this.a = a;
	}
	
	public String toString() {
		return "QuesAns [questionId=" + questionId + ", question=" + question + ", List answer=" + answer + ", Set ans=" + ans
				+ ", a=" + a + "]";
	}
	
	
	
	public void myInit()
	{
		System.out.println("Init method called for question bean");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method called for question bean");
	}
	
	
	
}
