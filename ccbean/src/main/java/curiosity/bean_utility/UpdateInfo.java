package curiosity.bean_utility;

import curiosity.tool_utility.DateUtility;

/**
 * This Class Use to Save the date and Time and user
 * Who update your Data
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class UpdateInfo {

	/**
	 * This stores the update date only
	 */
	private String updateAt;
	/**
	 * This stores update time only
	 */
	private long time;
	/**
	 * This stores updater Name
	 */
	private String updateBy;
	private String tag;
	
	
	public UpdateInfo(){
		
		this.updateAt = DateUtility.getCurrentDate();
		this.time = DateUtility.getCurrentDateLong();
	}
	
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @return the updateAt
	 */
	public String getUpdateAt() {
		return updateAt;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param updateAt the updateAt to set
	 */
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
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
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * 
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
}
