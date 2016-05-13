/**
 * 
 */
package curiosity.college.cchelpermapper;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author shiv
 *
 */
public class FileUpload {

	private CommonsMultipartFile fileData;

	/**
	 * @return the fileData
	 */
	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	/**
	 * @param fileData the fileData to set
	 */
	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
}
