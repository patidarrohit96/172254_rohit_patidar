package com.news;

public class News {
	private String postedByUser;
	private int newsId;
	private String comment;
	private String commentByUser;
	public News( int newsId, String postedByUser, String commentByUser,String comment) {
		super();
		this.postedByUser = postedByUser;
		this.newsId = newsId;
		this.comment = comment;
		this.commentByUser = commentByUser;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getComment() {
		return comment;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
}
