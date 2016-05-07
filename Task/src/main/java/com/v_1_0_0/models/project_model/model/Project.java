/**
 * 
 */
package com.v_1_0_0.models.project_model.model;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

import com.connection.CouchDb;
import com.connection.MongoDb;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.v_1_0_0.bean_utility.CreateInfo;
import com.v_1_0_0.bean_utility.UpdateInfo;
import com.v_1_0_0.indexes.ProjectIndex;
import com.v_1_0_0.models.project_model.model.project_info.Info;
import com.v_1_0_0.models.project_model.model.task.Task;
import com.v_1_0_0.models.project_model.model.version.Version;

/**
 * This Class Use to Project-Model
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class Project extends MongoDb {
	
	private static final String DB_NAME = "workbench";
	private static final String COLLECTION_NAME = "project";
	/**
	 * This is needed for couchDB
	 */
	private String _id;
	private String _rev;
	
	private String id;
	private String projectName;
	/**
	 * Id of that member who lead this project
	 */
	private String projectLeaderId;
	/**
	 * Id of that member who lead this project if leader not present
	 */
	private String projectVoiceLeaderId;
	/**
	 * description about project
	 */
	private String content;
	private Version version;
	private CreateInfo createInfo;
	private ArrayList<UpdateInfo> updateInfo;
	private ArrayList<Task> taskList;
	private Info projectInfo;
	private String tag;
	
	public Project(){
		
	}
	
	public Project(String projectId){
		this.id = projectId;
		this._id = projectId;
	}
	
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the _rev
	 */
	public String get_rev() {
		return _rev;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param _rev the _rev to set
	 */
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the projectLeaderId
	 */
	public String getProjectLeaderId() {
		return projectLeaderId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param projectLeaderId the projectLeaderId to set
	 */
	public void setProjectLeaderId(String projectLeaderId) {
		this.projectLeaderId = projectLeaderId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the projectVoiceLeaderId
	 */
	public String getProjectVoiceLeaderId() {
		return projectVoiceLeaderId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param projectVoiceLeaderId the projectVoiceLeaderId to set
	 */
	public void setProjectVoiceLeaderId(String projectVoiceLeaderId) {
		this.projectVoiceLeaderId = projectVoiceLeaderId;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the version
	 */
	public Version getVersion() {
		return version;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param version the version to set
	 */
	public void setVersion(Version version) {
		this.version = version;
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
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the updateInfo
	 */
	public ArrayList<UpdateInfo> getUpdateInfo() {
		return updateInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param updateInfo the updateInfo to set
	 */
	public void setUpdateInfo(ArrayList<UpdateInfo> updateInfo) {
		this.updateInfo = updateInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the taskList
	 */
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param taskList the taskList to set
	 */
	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @return the projectInfo
	 */
	public Info getProjectInfo() {
		return projectInfo;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param projectInfo the projectInfo to set
	 */
	public void setProjectInfo(Info projectInfo) {
		this.projectInfo = projectInfo;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @update RITESH SINGH at 24 March 2016
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @update RITESH SINGH at 24 March 2016
	 * @param object
	 * @param bucket
	 * @return Response
	 * @throws UnknownHostException 
	 */
	public WriteResult createProject(Project project) throws UnknownHostException{
		return this.create(project, COLLECTION_NAME, DB_NAME);
	}
	
	
	/**
	 * This method use to getAll Projects
	 * 
	 * @param object
	 * @param bucket
	 * @return List<JsonObject>
	 * @throws UnknownHostException 
	 */
	public List<Project> getProjectList() throws UnknownHostException{
		
		Gson gson = new Gson();
		List<Project> projectList = new ArrayList<Project>();
		for(DBObject data : this.getAllDocs(COLLECTION_NAME, DB_NAME)){
			projectList.add(gson.fromJson(gson.toJson(data), Project.class));
		}
		return projectList;
	}
	
	/**
	 * This method use to get Projects from CouchDB on the basis of given key
	 * 
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
	
	public Project getProjectById() throws UnknownHostException{
		try{
			DBObject data = findById(this.getId().trim(), COLLECTION_NAME,DB_NAME);
			Gson gson = new Gson();

			Project project = gson.fromJson(gson.toJson(data), Project.class);
			return project;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return null;
	}
	
	public Set<Project> getWhereQuery(String attribute, Object value) throws UnknownHostException{
		Set<Project> list = new HashSet<Project>();
		try{
			Set<DBObject> datalist = makeWhereQuery(attribute, value, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), Project.class));
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
	
	public Set<Project> getAndQuery(Map<String, Object> map) throws UnknownHostException{
		Set<Project> list = new HashSet<Project>();
		try{
			Set<DBObject> datalist = makeAndQuery(map, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), Project.class));
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
	
	public void updateProject() throws UnknownHostException{
		updateDocs("id",this.getId().trim(), this, COLLECTION_NAME, DB_NAME);
	}
}