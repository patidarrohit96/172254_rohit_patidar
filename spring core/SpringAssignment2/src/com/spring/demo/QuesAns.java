package com.spring.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuesAns {
	
	private String questionId;
	private String question;
	List<String> answer;
	Set<String> ans;
	Map<Integer,String> a;
	
	
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
	
	
}
