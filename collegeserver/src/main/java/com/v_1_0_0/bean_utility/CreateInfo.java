package com.v_1_0_0.bean_utility;

/**
 * This Class Use to Save the date and Time and user
 * Who create your Data
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class CreateInfo {

	/**
	 * This stores the create date only
	 */
	private String createAt;
	/**
	 * This stores create time only
	 */
	private long time;
	/**
	 * This stores creater Name
	 */
	private String createBy;
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @return the createAt
	 */
	public String getCreateAt() {
		return createAt;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @return the time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
