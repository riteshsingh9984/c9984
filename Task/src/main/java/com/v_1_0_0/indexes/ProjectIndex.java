package com.v_1_0_0.indexes;

import java.util.HashSet;
import java.util.Set;

import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

import com.connection.CouchDb;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.v_1_0_0.models.project_model.model.Project;

/**
 * This Class Use to Set and Get the keys of Project Model
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class ProjectIndex extends CouchDb  {
	
	private static final String BUCKET_NAME = "project_index";
	private static final String BUCKET_KEY = "keys";	

	/**
	 * This is needed for couchDB
	 */
	private String _id;
	private String _rev;
	
	private Set<String> keys;

	/**
	 * @return the keys
	 */
	public Set<String> getKeys() {
		return keys;
	}

	/**
	 * @param keys the keys to set
	 */
	public void setKeys(Set<String> keys) {
		this.keys = keys;
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
	 * This method use to create object in CouchDB
	 * 
	 * @update RITESH SINGH at 24 March 2016
	 * @param object
	 * @param bucket
	 * @return Response
	 */
	private Response createProjectIndex(ProjectIndex object){
		object.set_id(BUCKET_KEY);
		return this.create(object, BUCKET_NAME);
	}
	
	/**
	 * This method use to get Projects from CouchDB on the basis of given key
	 * 
	 * @param object
	 * @param bucket
	 * @return ProjectIndex
	 */
	public ProjectIndex getProjectList(){
			
		Gson gson = new Gson();	
		ProjectIndex projectIndex = gson.fromJson(this.getDocsOnKey(BUCKET_NAME, BUCKET_KEY), ProjectIndex.class);
		return projectIndex;
	}
	
	/**
	 * This method use to update object
	 * 
	 * @update RITESH SINGH at 24 March 2016
	 * @param bucket
	 * @param key
	 * @return String
	 */
	private String update(ProjectIndex updateProject){
		
		CouchDbClient dbClient = null;
		try{
			dbClient = this.getCouchDbClient(BUCKET_NAME);
			JsonObject json = dbClient.find(JsonObject.class, BUCKET_KEY);
			
			Gson gson = new Gson();
			Project project = gson.fromJson(json, Project.class);
			
			/* This is must to set for update */
			updateProject.set_rev(project.get_rev());
			
			this.update(dbClient, updateProject, BUCKET_NAME);
			return "200";
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return "000";
	}
	
	/**
	 * This is empty Constructor
	 * 
	 * @update RITESH SINGH at 24 March 2016
	 */
	public ProjectIndex(){}
	
	/**
	 * This is parameterized  constructor
	 * 
	 * @update RITESH SINGH at 24 March 2016
	 * @param key
	 */
	public ProjectIndex(String key){
		
		System.out.println("Request ID=== "+key);
		ProjectIndex pI;
		Set<String> keys;
		try{
			pI = this.getProjectList();
			try{
				keys = pI.getKeys();
				if(keys!=null){
					try{
						keys.add(key);
						pI.setKeys(keys);
						update(pI);
					}catch(Exception ee){
						keys = new HashSet<String>();
						keys.add(key);
						pI= new ProjectIndex();
						pI.setKeys(keys);
						pI.createProjectIndex(pI);
					}
				}else{
					keys = new HashSet<String>();
					keys.add(key);
					pI= new ProjectIndex();
					pI.setKeys(keys);
					pI.createProjectIndex(pI);
				}
			}catch(Exception ee){
				keys = new HashSet<String>();
				keys.add(key);
				pI= new ProjectIndex();
				pI.setKeys(keys);
				pI.createProjectIndex(pI);
			}
			
		}catch(Exception ee){
			keys = new HashSet<String>();
			keys.add(key);
			pI= new ProjectIndex();
			pI.setKeys(keys);
			pI.createProjectIndex(pI);
		}
	}
}
