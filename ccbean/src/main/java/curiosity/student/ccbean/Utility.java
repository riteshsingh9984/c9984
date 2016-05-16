package curiosity.student.ccbean;

import java.util.ArrayList;

import curiosity.bean_utility.CreateInfo;
import curiosity.bean_utility.UpdateInfo;

public class Utility {

/*****************************STUDENT-SIGNUP BEAN ACTION-START*******************************************/
	
	/**
	 * This method is use to extract the data from mapper to bean, for saving into DB
	 * 
	 * @param mapper
	 * @param bean
	 */
	public static void studentSignupInboundBean(StudentSignupMapper mapper, StudentSignup bean){
		
		try{
			if(mapper != null){
				
				if(mapper.getId()!= null){
					bean.setId(mapper.getId().trim());
					bean.set_id(mapper.getId().trim());
				}else{
					bean.setId("Not-Set");
				}
				if(mapper.getContactNo()!= null){
					bean.setContactNo(mapper.getContactNo());
				}else{
					bean.setContactNo("Not-Set");
				}
				if(mapper.getGender()!= null){
					bean.setGender(mapper.getGender());
				}else{
					bean.setGender("Not-Set");
				}
				if(mapper.getAddress()!= null){
					bean.setAddress(mapper.getAddress());
				}else{
					bean.setAddress("Not-Set");
				}
				if(mapper.getEmail() != null)
					bean.setEmail(mapper.getEmail().trim());
				else
					bean.setEmail("Not-Set");
				if(mapper.getImageBase64() != null)
					bean.setImageBase64(mapper.getImageBase64());
				else
					bean.setImageBase64("Not-Set");
				/*SetUp createdInfo*/
				CreateInfo data = new CreateInfo();
				if(mapper.getCreatedBy() != null)
					if(mapper.getCreatedBy() != null)
						data.setCreateBy(mapper.getCreatedBy().trim());
					else
						data.setCreateBy("Unknown");
				bean.setCreateInfo(data);
				/*Done Created Info*/
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
				if(mapper.getName()!=null)
					bean.setName(mapper.getName().trim());
				else
					bean.setName("Not-Set");
				if(mapper.getPassword()!=null)
					bean.setPassword(mapper.getPassword());
				else
					bean.setPassword("Not-Set");
				if(mapper.getTag()!=null)
					bean.setTag(mapper.getTag().trim());
				else
					bean.setTag("Not-Set");
				
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
	
	/**
	 * This method is use to extract the data from bean to mapper for show on jsp pages
	 * 
	 * @param bean
	 * @param mapper
	 */
	public static void studentSignupOutboundBean(StudentSignup bean, StudentSignupMapper mapper){
			
			try{
				if(bean != null){
					if(bean.getId()!= null){
						mapper.setId(bean.getId().trim());
					}
					if(bean.getContactNo()!= null){
						mapper.setContactNo(bean.getContactNo());
					}else{
						mapper.setContactNo("Not-Set");
					}
					if(bean.getGender()!= null){
						mapper.setGender(bean.getGender());
					}else{
						mapper.setGender("Not-Set");
					}
					if(bean.getAddress() != null)
						mapper.setAddress(bean.getAddress().trim());
					else
						mapper.setAddress("Not-Set");
					if(bean.getEmail() != null)
						mapper.setEmail(bean.getEmail().trim());
					else
						mapper.setEmail("Not-Set");
					if(bean.getImageBase64() != null)
						mapper.setImageBase64(bean.getImageBase64());
					else
						mapper.setImageBase64("Not-Set");
					if(bean.getLatitude()!=null)
						mapper.setLatitude(bean.getLatitude().trim());
					else
						mapper.setLatitude("Not-Set");
					if(bean.getLongitude()!=null)
						mapper.setLongitude(bean.getLongitude().trim());
					else
						mapper.setLongitude("Not-Set");
					if(bean.getName()!=null)
						mapper.setName(bean.getName().trim());
					else
						mapper.setName("Not-Set");
					if(bean.getPassword()!=null)
						mapper.setPassword(bean.getPassword());
					else
						mapper.setPassword("Not-Set");
					if(bean.getTag()!=null)
						mapper.setTag(bean.getTag().trim());
					else
						mapper.setTag("Not-Set");
					
					if(bean.getCreateInfo() != null){
						if(bean.getCreateInfo().getCreateBy() != null)
							mapper.setCreatedBy(bean.getCreateInfo().getCreateBy().trim());
						else
							mapper.setCreatedBy("Not-Set");
					}
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

/*****************************STUDENT-SIGNUP BEAN ACTION-DONE*******************************************/
}
