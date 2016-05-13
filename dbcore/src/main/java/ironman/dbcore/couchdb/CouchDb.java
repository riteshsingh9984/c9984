package ironman.dbcore.couchdb;

import java.util.List;
import java.util.Set;

import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * This Class Use to Perform All Activity on CouchDB
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 24 March 2016
 */
public class CouchDb {

	/**
	 * CouchDB connection Protocol
	 */
	protected static final String PROTOCOL="http";
	
	/**
	 * When try to get connection for unknown bucket
	 * Which is not in DB then it automatic create that bucket
	 */
	protected static final Boolean AUTO_CREATE_BUCKET = true;
	/**
	 * IP of that machine where couchDB installed
	 */
	protected static final String DB_MACHINE_IP = "127.0.0.1";
	/**
	 * CouchDB PortNo
	 */
	protected static final Integer DB_PORT = 5984;
	/**
	 * COuchDB USER
	 */
	protected static final String USER = "shiv";
	/**
	 * This use for CouchDB user Password
	 */
	protected static final String PASSWORD = "ShivPassword";
	
	
	/**
	 * This method used to get the bucket name and return the CouchDBCLient
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param bucket
	 * @return CouchDbClient
	 */
	protected CouchDbClient getCouchDbClient(String bucket){
		CouchDbClient dbClient = null;
		try{
			dbClient = new CouchDbClient(bucket, AUTO_CREATE_BUCKET, PROTOCOL, DB_MACHINE_IP, DB_PORT, USER, PASSWORD);
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return dbClient;
	}
	
	/**
	 * This method used for save data into CouchDB bucket
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param object ,too be store
	 * @param bucket name where you want to store 
	 * @return Response 
	 */
	@SuppressWarnings("unused")
	protected Response create(Object object, String bucket){
		CouchDbClient dbClient = null;
		Response response = null;
		
		try{
			/*getting CouchDBClient for bucket*/
			dbClient = getCouchDbClient(bucket);
			
			Gson gson = new Gson();
			
			/*convert object into Json*/
			JsonObject jsonobj = dbClient.getGson().fromJson(gson.toJson(object), JsonObject.class);
			
			/*Now stored into CouchDb*/
			response = dbClient.save(jsonobj);
			
			dbClient.shutdown();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return response;
	}
	
	/**
	 * This method used for get Docks from CouchDB bucket,
	 * On the basis of given bucketName and Docs's Id ,Known as key
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param bucket , For finding your Docks
	 * @param key , Docks id in bucket
	 * @return JsonObject
	 */
	@SuppressWarnings("unused")
	protected JsonObject getDocsOnKey(String bucket,String key){
		CouchDbClient dbClient = null;
		JsonObject json = null;
		
		try{
			/*Getting CouchDBClient for bucket*/
			dbClient = getCouchDbClient(bucket);
			
			/*Trigger CouchDB for data*/
			json = dbClient.find(JsonObject.class, key);
			
			dbClient.shutdown();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return json;
	}
	
	/**
	 * This Method used for getAll Docks from Bucket
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param bucket, Bucket Name of CouchDB
	 * @return Set<JsonObject>, All Docs of given bucket
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	protected List<JsonObject> getAllDocksOfBucket(String bucket){
		CouchDbClient dbClient = null;
		List<JsonObject> allDocs = null;
		try{
			/*Getting CouchDBClient for bucket*/
			dbClient = getCouchDbClient(bucket);
			
			/*Getting allDocs of Bucket*/
			allDocs =  dbClient.view("_all_docs").query(JsonObject.class);
			
			dbClient.shutdown();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return allDocs;
	}
	
	/**
	 * This is always used inside of bean class
	 * Before it call this method, needs to set the _rev and pass the object 
	 * and couchDbClient which change the _rev 
	 * 
	 * @author RITESH SINGH
	 * @since version 1.0.0, 24 March 2016
	 * 
	 * @param dbClient, This client is set the _rev value of Docks
	 * @param object, Set _rev Docs to going update
	 * @param bucket, update docs in this bucket
	 * @return Response, update response
	 */
	protected Response update(CouchDbClient dbClient,Object object, String bucket){
		Response response = null;
		
		try{
			Gson gson = new Gson();
			
			/*convert object into Json*/
			JsonObject jsonobj = dbClient.getGson().fromJson(gson.toJson(object), JsonObject.class);
			 
			/*update Object*/
			response = dbClient.update(jsonobj);
		
			dbClient.shutdown();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return response;
	}	
}