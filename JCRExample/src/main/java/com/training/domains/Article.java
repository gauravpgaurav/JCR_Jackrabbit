package com.training.domains;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private String id;
	private String title;
	private String author;
	private String description;
	private String keywords;
	private List<Page> pages = new ArrayList<Page>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", keywords=" + keywords + ", pages=" + pages + "]";
	}

}
