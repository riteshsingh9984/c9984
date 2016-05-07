package com.v_1_0_0.models.project_model.model.version;

import com.v_1_0_0.bean_utility.CreateInfo;
import com.v_1_0_0.models.project_model.model.version.status.Status;

/**
 * This Class Use to Versioning the project-modal
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Version {

	private String versionNo;
	private CreateInfo createInfo;
	private Status status;
	
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
	 * @return the versionNo
	 */
	public String getVersionNo() {
		return versionNo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param versionNo the versionNo to set
	 */
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	/**
	 * @update RITESH SINGH at 25 March 2016
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
}
