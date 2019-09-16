package com.h2kinfosys.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("entry")
public class Entry {
	
	public Entry(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	private String title;
	private String description;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
