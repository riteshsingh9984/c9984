package com.v_1_0_0.models.task_model.model;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.connection.MongoDb;
import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.v_1_0_0.bean_utility.CreateInfo;
import com.v_1_0_0.bean_utility.UpdateInfo;
import com.v_1_0_0.bean_utility.comments.Comment;
import com.v_1_0_0.models.project_model.model.Project;
import com.v_1_0_0.models.task_model.model.Task;

/**
 * This Class Use to Task-Model
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 23 April 2016
 */
public class Task extends MongoDb {

	private static final String DB_NAME = "workbench";
	private static final String COLLECTION_NAME = "task";
	/**
	 * This is needed for mongoDB
	 */
	private String _id;
	private String _rev;
	
	private String id;
	private String taskName;
	private String projectId;
	private String description;
	private CreateInfo createInfo;
	private ArrayList<UpdateInfo> updateInfo;
	private ArrayList<Comment> comments;
	private int taskProgress;
	private int takenHrs;
	private int completedHrs;
	private String taskStatus;
	private String tag;
	
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

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the taskProgress
	 */
	public int getTaskProgress() {
		return taskProgress;
	}

	/**
	 * @param taskProgress the taskProgress to set
	 */
	public void setTaskProgress(int taskProgress) {
		this.taskProgress = taskProgress;
	}

	/**
	 * @return the takenHrs
	 */
	public int getTakenHrs() {
		return takenHrs;
	}

	/**
	 * @param takenHrs the takenHrs to set
	 */
	public void setTakenHrs(int takenHrs) {
		this.takenHrs = takenHrs;
	}

	/**
	 * @return the completedHrs
	 */
	public int getCompletedHrs() {
		return completedHrs;
	}

	/**
	 * @param completedHrs the completedHrs to set
	 */
	public void setCompletedHrs(int completedHrs) {
		this.completedHrs = completedHrs;
	}

	/**
	 * @return the taskStatus
	 */
	public String getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
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
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Task(){
		
	}
	
	public Task(String taskId){
		this.id = taskId;
		this._id = taskId;
	}
	
	/**
	 * This method use to update object
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @param key
	 * @return String
	 */
	/*public String update(String key, Task updateTask){
		
		CouchDbClient dbClient = null;
		try{
			dbClient = this.getCouchDbClient(BUCKET_NAME);
			JsonObject json = dbClient.find(JsonObject.class, key);
			
			Gson gson = new Gson();
			Task task = gson.fromJson(json, Task.class);
			
			 This is must to set for update 
			updateTask.set_rev(task.get_rev());
			
			this.update(dbClient, updateTask, BUCKET_NAME);
			return "200";
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return "000";
	}*/
	
	/**
	 * This method use to create object in MongoDB
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @param object
	 * @param bucket
	 * @return Response
	 * @throws UnknownHostException 
	 */
	public WriteResult createTask(Task task) throws UnknownHostException{
		
		ArrayList<com.v_1_0_0.models.project_model.model.task.Task> tasks;
		com.v_1_0_0.models.project_model.model.task.Task projectTask = new com.v_1_0_0.models.project_model.model.task.Task();
		projectTask.setTaskId(task.getId());
		projectTask.setTaskStatus("NEW");
		projectTask.setCreateInfo(createInfo);
		projectTask.setTotalComments(0);
		Project project = new Project(task.getProjectId().trim());
		try{
			project = project.getProjectById();
			try{
				tasks = project.getTaskList();
				if(tasks != null ){
					tasks.add(projectTask);
				}else{
					tasks = new ArrayList<com.v_1_0_0.models.project_model.model.task.Task>();
					tasks.add(projectTask);
				}
			}catch(Exception ee){
				tasks = new ArrayList<com.v_1_0_0.models.project_model.model.task.Task>();
				tasks.add(projectTask);
			}
			
			project.setTaskList(tasks);
			/*project task updated*/
			project.updateProject();
			
			/*task created*/
			return this.create(task, COLLECTION_NAME, DB_NAME);
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return null;
	}
	
	
	/**
	 * This method use to getAll Tasks
	 * 
	 * @param object
	 * @param bucket
	 * @return List<JsonObject>
	 * @throws UnknownHostException 
	 */
	public List<Task> getTaskList() throws UnknownHostException{
		
		Gson gson = new Gson();
		List<Task> taskList = new ArrayList<Task>();
		for(DBObject data : this.getAllDocs(COLLECTION_NAME, DB_NAME)){
			taskList.add(gson.fromJson(gson.toJson(data), Task.class));
		}
		return taskList;
	}
	
	/**
	 * This method use to get Tasks from MongoDB on the basis of given key
	 * 
	 * @param object
	 * @param bucket
	 * @return Task
	 * @throws UnknownHostException 
	 */
	/*public Task getTask(String key){
		Gson gson = new Gson();	
		Task task = gson.fromJson(this.getDocsOnKey(BUCKET_NAME, key), Task.class);
		return task;
	}*/
	
	public Task getTaskById() throws UnknownHostException{
		try{
			DBObject data = findById(this.getId().trim(), COLLECTION_NAME,DB_NAME);
			Gson gson = new Gson();

			Task task = gson.fromJson(gson.toJson(data), Task.class);
			return task;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return null;
	}
	
	public Set<Task> getWhereQuery(String attribute, Object value) throws UnknownHostException{
		Set<Task> list = new HashSet<Task>();
		try{
			Set<DBObject> datalist = makeWhereQuery(attribute, value, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), Task.class));
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
	
	public Set<Task> getAndQuery(Map<String, Object> map) throws UnknownHostException{
		Set<Task> list = new HashSet<Task>();
		try{
			Set<DBObject> datalist = makeAndQuery(map, COLLECTION_NAME, DB_NAME);
			Gson gson = new Gson();
			try{
				for(DBObject data : datalist){
					list.add(gson.fromJson(gson.toJson(data), Task.class));
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
	
	public void updateTask() throws UnknownHostException{
		updateDocs("id",this.getId().trim(), this, COLLECTION_NAME, DB_NAME);
	}
}
