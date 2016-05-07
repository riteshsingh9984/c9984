package com.v_1_0_0.models.project_model.model.task;

import com.v_1_0_0.bean_utility.CreateInfo;


/**
 * This Class Use to Project-Model's task
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Task {

	
	/**
	 * This is the task ID which created in project
	 */
	private String taskId;
	/**
	 * This is the Task status
	 */
	private String taskStatus;
	/**
	 * Total comments counter of task
	 */
	private Integer totalComments;
	/**
	 * Task created person name
	 */
	private CreateInfo createInfo;
	private String tag;
	
	
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the taskId
	 */
	public String getTaskId() {
		return taskId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the taskStatus
	 */
	public String getTaskStatus() {
		return taskStatus;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the totalComments
	 */
	public Integer getTotalComments() {
		return totalComments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param totalComments the totalComments to set
	 */
	public void setTotalComments(Integer totalComments) {
		this.totalComments = totalComments;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the createInfo
	 */
	public CreateInfo getCreateInfo() {
		return createInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param createInfo the createInfo to set
	 */
	public void setCreateInfo(CreateInfo createInfo) {
		this.createInfo = createInfo;
	}
}
