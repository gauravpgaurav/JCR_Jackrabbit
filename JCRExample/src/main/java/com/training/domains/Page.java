package com.training.domains;

public class Page {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Page(String content) {
		super();
		this.content = content;
	}

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Page [content=" + content + "]";
	}

}
