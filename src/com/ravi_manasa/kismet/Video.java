package com.ravi_manasa.kismet;

import java.io.Serializable;

/**
 * This is a representation of a users video off YouTube
 * @author ravi_manasa
 */
public class Video implements Serializable {
	// The title of the video
	private String title;
	// A link to the video on youtube
	private String url;
	// A link to a still image of the youtube video
	private String thumbUrl;
	private String id;
	
	public Video(String title, String url, String thumbUrl, String id) {
		super();
		this.title = title;
		this.url = url;
		this.thumbUrl = thumbUrl;
		this.id = id;
	}

	/**
	 * @return the title of the video
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * @return the url to this video on youtube
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the thumbUrl of a still image representation of this video
	 */
	public String getThumbUrl() {
		return thumbUrl;
	}
	public String getid(){
		return id;
	}
}