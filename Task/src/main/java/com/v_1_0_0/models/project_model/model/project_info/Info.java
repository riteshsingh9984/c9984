package com.v_1_0_0.models.project_model.model.project_info;

import java.util.ArrayList;

import com.v_1_0_0.bean_utility.comments.Comment;

/**
 * This Class Use to Project-Model's Info
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Info {

	private ArrayList<Comment> comments;
	

	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
}
