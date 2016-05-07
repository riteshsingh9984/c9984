package com.v_1_0_0.bean_utility.comments;

import com.v_1_0_0.bean_utility.CreateInfo;
import com.v_1_0_0.bean_utility.UpdateInfo;

/**
 * This Class Use to Comment
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Comment {

	private String commentId;
	private String refId;
	private String comments;
	private String attachments;
	private CreateInfo createInfo;
	private UpdateInfo updateInfo;
	
	
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @return the attachments
	 */
	public String getAttachments() {
		return attachments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @param attachments the attachments to set
	 */
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @return the createInfo
	 */
	public CreateInfo getCreateInfo() {
		return createInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @param createInfo the createInfo to set
	 */
	public void setCreateInfo(CreateInfo createInfo) {
		this.createInfo = createInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @return the updateInfo
	 */
	public UpdateInfo getUpdateInfo() {
		return updateInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @param updateInfo the updateInfo to set
	 */
	public void setUpdateInfo(UpdateInfo updateInfo) {
		this.updateInfo = updateInfo;
	}
	/**
	 * @return the commentId
	 */
	public String getCommentId() {
		return commentId;
	}
	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	/**
	 * @return the refId
	 */
	public String getRefId() {
		return refId;
	}
	/**
	 * @param refId the refId to set
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
}
