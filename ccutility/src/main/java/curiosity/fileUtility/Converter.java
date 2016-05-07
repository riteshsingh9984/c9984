package curiosity.fileUtility;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Converter {

	public static String encodeImageIntoBase64(CommonsMultipartFile fileData){
		
		if (!fileData.isEmpty()) {
            try {
                byte[] bytes = fileData.getBytes();
 
                byte[] encoded = Base64.encodeBase64(bytes);
        		String encodedString = new String(encoded);
                
                System.out.println("==========================================");
                System.out.println(encodedString);
                System.out.println("==========================================");
                return encodedString;
            } catch (Exception e) {
            	return "failed";
            }
        }
		
        return "empty";
	}
}
