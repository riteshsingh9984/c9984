package curiosity.college.ccbean;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

import curiosity.bean_utility.CreateInfo;
import curiosity.bean_utility.UpdateInfo;
import ironman.dbcore.mongodb.MongoDb;

public class College extends MongoDb {

	private static final String DB_NAME = "test";
	private static final String COLLECTION_NAME = "college";
	/**
	 * This is needed for couchDB
	 */
	private String _id;
	private String _rev;
	
	private String id;
	private String name;
	private String code;
	/*type may should be college or university*/
	private String type;
	private String approvedTo;
	private String registrationDate;
	private long registrationDateMills;
	private String registrationNo;
	private String founderName;
	private String longitude;
	private String latitude;
	private String isActive;
	private String isDelete;
	private String tag;
	private String version;
	private CreateInfo createInfo;
	private ArrayList<UpdateInfo> updateInfo;
	private String imageBase64;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the approvedTo
	 */
	public String getApprovedTo() {
		return approvedTo;
	}
	/**
	 * @param approvedTo the approvedTo to set
	 */
	public void setApprovedTo(String approvedTo) {
		this.approvedTo = approvedTo;
	}
	/**
	 * @return the registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the registrationDateMills
	 */
	public long getRegistrationDateMills() {
		return registrationDateMills;
	}
	/**
	 * @param registrationDateMills the registrationDateMills to set
	 */
	public void setRegistrationDateMills(long registrationDateMills) {
		this.registrationDateMills = registrationDateMills;
	}
	/**
	 * @return the registrationNo
	 */
	public String getRegistrationNo() {
		return registrationNo;
	}
	/**
	 * @param registrationNo the registrationNo to set
	 */
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	/**
	 * @return the founderName
	 */
	public String getFounderName() {
		return founderName;
	}
	/**
	 * @param founderName the founderName to set
	 */
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the isDelete
	 */
	public String getIsDelete() {
		return isDelete;
	}
	/**
	 * @param isDelete the isDelete to set
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the createInfo
	 */
	public CreateInfo getCreateInfo() {
		return createInfo;
	}
	/**
	 * @param createInfo the createInfo to set
	 */
	public void setCreateInfo(CreateInfo createInfo) {
		this.createInfo = createInfo;
	}
	/**
	 * @return the updateInfo
	 */
	public ArrayList<UpdateInfo> getUpdateInfo() {
		return updateInfo;
	}
	/**
	 * @param updateInfo the updateInfo to set
	 */
	public void setUpdateInfo(ArrayList<UpdateInfo> updateInfo) {
		this.updateInfo = updateInfo;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the _rev
	 */
	public String get_rev() {
		return _rev;
	}
	/**
	 * @param _rev the _rev to set
	 */
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	
	/*Empty Constructor*/
	public College(){}
	
	public College(String collegeId){
		this.id = collegeId;
		this._id = collegeId;
	}
	
	/**
	 * This method use to update object
	 * 
	 * @update RITESH SINGH at 24 March 2016
	 * @param key
	 * @return String
	 */
	/*public String update(String key, Project updateProject){
		
		CouchDbClient dbClient = null;
		try{
			dbClient = this.getCouchDbClient(BUCKET_NAME);
			JsonObject json = dbClient.find(JsonObject.class, key);
			
			Gson gson = new Gson();
			Project project = gson.fromJson(json, Project.class);
			
			 This is must to set for update 
			updateProject.set_rev(project.get_rev());
			
			this.update(dbClient, updateProject, BUCKET_NAME);
			return "200";
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return "000";
	}*/
	
	/**
	 * This method use to create object in CouchDB
	 * 
	 * @update RITESH SINGH at 3 May 2016
	 * @param object
	 * @param bucket
	 * @return Response
	 * @throws UnknownHostException 
	 */
	public WriteResult createCollege() throws UnknownHostException{
		return this.create(this, COLLECTION_NAME, DB_NAME);
	}
	
	/**
	 * This method use to getAll Colleges
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @param object
	 * @param bucket
	 * @return List<JsonObject>
	 * @throws UnknownHostException 
	 */
	public List<College> getCollegeList() throws UnknownHostException{
		
		Gson gson = new Gson();
		List<College> collegeList = new ArrayList<College>();
		for(DBObject data : this.getAllDocs(COLLECTION_NAME, DB_NAME)){
			collegeList.add(gson.fromJson(gson.toJson(data), College.class));
		}
		return collegeList;
	}
	
	/**
	 * This method use to get Colleges from CouchDB on the basis of given key
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @param object
	 * @param bucket
	 * @return Project
	 * @throws UnknownHostException 
	 */
	/*public Project getProject(String key){
		Gson gson = new Gson();	
		Project project = gson.fromJson(this.getDocsOnKey(BUCKET_NAME, key), Project.class);
		return project;
	}*/
	
	public College getCollegeById() throws UnknownHostException{
		try{
			DBObject data = findById(this.getId().trim(), COLLECTION_NAME,DB_NAME);
			Gson gson = new Gson();

			College college = gson.fromJson(gson.toJson(data), College.class);
			return college;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method use to get Colleges from MongoDB on the basis of given attribute
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @param object
	 * @param bucket
	 * @return Project
	 * @throws UnknownHostException 
	 */
	public Set<College> getWhereQuery(String attribute, Object value) throws UnknownHostException{
		Set<College> list = new HashSet<College>();
		try{
			Set<DBObject> datalist = makeWhereQuery(attribute, value, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), College.class));
				}
			}catch(Exception ee){
				ee.printStackTrace();
			}
			return list;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method use to get Colleges from MongoDB on the basis of given attribute on ADN
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @param object
	 * @param bucket
	 * @return Project
	 * @throws UnknownHostException 
	 */
	public Set<College> getAndQuery(Map<String, Object> map) throws UnknownHostException{
		Set<College> list = new HashSet<College>();
		try{
			Set<DBObject> datalist = makeAndQuery(map, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), College.class));
				}
			}catch(Exception ee){
				ee.printStackTrace();
			}
			return list;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method use to update College from MongoDB
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @param object
	 * @param bucket
	 * @return Project
	 * @throws UnknownHostException 
	 */
	public void updateCollege() throws UnknownHostException{
		updateDocs("id",this.getId().trim(), this, COLLECTION_NAME, DB_NAME);
	}
	/**
	 * @return the imageBase64
	 */
	public String getImageBase64() {
		return imageBase64;
	}
	/**
	 * @param imageBase64 the imageBase64 to set
	 */
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}
}