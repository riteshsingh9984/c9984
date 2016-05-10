/**
 * 
 */
package curiosity.tool_utility;

import java.util.ArrayList;

import curiosity.bean_utility.CreateInfo;
import curiosity.bean_utility.UpdateInfo;
import curiosity.college.ccbean.College;
import curiosity.college.ccbean.CollegeMapper;

/**
 * @author shiv
 *
 */
public class MapperBeanUtility {

	public static void collegeInboundBean(CollegeMapper mapper, College bean){
		
		try{
			if(mapper != null){
				if(mapper.getAddress()!= null){
					bean.setAddress(mapper.getAddress());
				}else{
					bean.setAddress("Not-Set");
				}
				if(mapper.getFileData()!= null){
					bean.setImageBase64(mapper.getImageBase64());
				}else{
					bean.setImageBase64("Not-Set");
				}
				if(mapper.getId()!= null){
					bean.setId(mapper.getId().trim());
					bean.set_id(mapper.getId().trim());
				}
				if(mapper.getApprovedTo() != null)
					bean.setApprovedTo(mapper.getApprovedTo().trim());
				else
					bean.setApprovedTo("Not-Set");
				if(mapper.getCode() != null)
					bean.setCode(mapper.getCode().trim());
				else
					bean.setCode("Not-Set");
				/*SetUp createdInfo*/
				CreateInfo data = new CreateInfo();
				if(mapper.getCreatedBy() != null)
					if(mapper.getCreatedBy() != null)
						data.setCreateBy(mapper.getCreatedBy().trim());
					else
						data.setCreateBy("Unknown");
				bean.setCreateInfo(data);
				/*Done Created Info*/
				if(mapper.getFounderName() != null)
					bean.setFounderName(mapper.getFounderName().trim());
				else
					bean.setFounderName("Not-Set");
				if(mapper.getIsActive()!=null)
					bean.setIsActive(mapper.getIsActive().trim());
				else
					bean.setIsActive("0");
				if(mapper.getIsDelete()!=null)
					bean.setIsDelete(mapper.getIsDelete().trim());
				else
					bean.setIsDelete("0");
				if(mapper.getLatitude()!=null)
					bean.setLatitude(mapper.getLatitude().trim());
				else
					bean.setLatitude("Not-Set");
				if(mapper.getLongitude()!=null)
					bean.setLongitude(mapper.getLongitude().trim());
				else
					bean.setLongitude("Not-Set");
				if(mapper.getName()!=null)
					bean.setName(mapper.getName().trim());
				else
					bean.setName("Not-Set");
				if(mapper.getRegistrationDate()!=null)
					bean.setRegistrationDate(mapper.getRegistrationDate().trim());
				else
					bean.setRegistrationDate("Not-Set");
				if(mapper.getRegistrationNo()!=null)
					bean.setRegistrationNo(mapper.getRegistrationNo());
				else
					bean.setRegistrationNo("Not-Set");
				if(mapper.getType()!=null)
					bean.setType(mapper.getType().trim());
				else
					bean.setType("Not-Set");
				
				/*Update Info*/
				ArrayList<UpdateInfo> updateInfo = new ArrayList<UpdateInfo>();
				UpdateInfo uI = new UpdateInfo();
				if(mapper.getUpdatedBy() != null)
					uI.setUpdateBy(mapper.getUpdatedBy());
				else
					uI.setUpdateBy("Not-Set");
				if(bean.getUpdateInfo()!=null)
					updateInfo = bean.getUpdateInfo();
				updateInfo.add(uI);
				bean.setUpdateInfo(updateInfo);
				/*Updation Info Done*/
				
				if(mapper.getVersion()!=null)
					bean.setVersion(mapper.getVersion().trim());
				else
					bean.setVersion("Not-Set");
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
	
public static void collegeOutboundBean(College bean, CollegeMapper mapper){
		
		try{
			if(bean != null){
				if(bean.getId()!= null){
					mapper.setId(bean.getId().trim());
				}
				if(bean.getApprovedTo() != null)
					mapper.setApprovedTo(bean.getApprovedTo().trim());
				else
					mapper.setApprovedTo("Not-Set");
				if(bean.getCode() != null)
					mapper.setCode(bean.getCode().trim());
				else
					mapper.setCode("Not-Set");
				if(bean.getCreateInfo() != null){
					if(bean.getCreateInfo().getCreateBy() != null)
						mapper.setCreatedBy(bean.getCreateInfo().getCreateBy().trim());
					else
						mapper.setCreatedBy("Not-Set");
				}
				if(bean.getFounderName() != null)
					mapper.setFounderName(bean.getFounderName().trim());
				else
					mapper.setFounderName("Not-Set");
				if(bean.getIsActive()!=null)
					mapper.setIsActive(bean.getIsActive().trim());
				else
					mapper.setIsActive("0");
				if(bean.getIsDelete()!=null)
					mapper.setIsDelete(bean.getIsDelete().trim());
				else
					mapper.setIsDelete("0");
				if(mapper.getLatitude()!=null)
					bean.setLatitude(mapper.getLatitude().trim());
				else
					bean.setLatitude("Not-Set");
				if(mapper.getLongitude()!=null)
					bean.setLongitude(mapper.getLongitude().trim());
				else
					bean.setLongitude("Not-Set");
				if(mapper.getName()!=null)
					bean.setName(mapper.getName().trim());
				else
					bean.setName("Not-Set");
				if(mapper.getRegistrationDate()!=null)
					bean.setRegistrationDate(mapper.getRegistrationDate().trim());
				else
					bean.setRegistrationDate("Not-Set");
				if(mapper.getRegistrationNo()!=null)
					bean.setRegistrationNo(mapper.getRegistrationNo());
				else
					bean.setRegistrationNo("Not-Set");
				if(mapper.getType()!=null)
					bean.setType(mapper.getType().trim());
				else
					bean.setType("Not-Set");
				
				/*Update Info*/
				ArrayList<UpdateInfo> updateInfo = new ArrayList<UpdateInfo>();
				UpdateInfo uI = new UpdateInfo();
				if(mapper.getUpdatedBy() != null)
					uI.setUpdateBy(mapper.getUpdatedBy());
				else
					uI.setUpdateBy("Not-Set");
				if(bean.getUpdateInfo()!=null)
					updateInfo = bean.getUpdateInfo();
				updateInfo.add(uI);
				/*Updation Info Done*/
				
				if(mapper.getVersion()!=null)
					bean.setVersion(mapper.getVersion().trim());
				else
					bean.setVersion("Not-Set");
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}