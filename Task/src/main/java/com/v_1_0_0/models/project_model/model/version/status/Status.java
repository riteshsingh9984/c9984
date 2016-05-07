package com.v_1_0_0.models.project_model.model.version.status;

import com.v_1_0_0.bean_utility.CreateInfo;

/**
 * This Class Use for Version-status
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Status {

	/**
	 * This store the value which are listed in versionstatuslist class
	 */
	private String status;
	private CreateInfo createInfo;
	
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
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
