package ironman.dbcore.riakdb;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;
import org.json.simple.parser.ParseException;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.DeleteValue;
import com.basho.riak.client.api.commands.kv.FetchValue;
import com.basho.riak.client.api.commands.kv.ListKeys;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.api.commands.kv.UpdateValue;
import com.basho.riak.client.api.commands.kv.UpdateValue.Update;
import com.basho.riak.client.core.RiakCluster;
import com.basho.riak.client.core.RiakNode;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.core.query.RiakObject;
import com.basho.riak.client.core.util.BinaryValue;
import com.google.gson.Gson;

public class RiakDb {

	private static RiakCluster cluster = null;
	private static final String riakServersDetails = "192.168.1.14:10037";//,192.168.1.227:10057";//,192.168.1.14:10037,192.168.1.14:10047,192.168.1.14:10057";

	public RiakCluster setUpCluster() throws UnknownHostException {

		
		if (cluster == null) {
			
			String[] riakServerArray = riakServersDetails.split(",");
			List<RiakNode> riakNodeList = new ArrayList<RiakNode>();

			for (final String riakServer : riakServerArray) {

				RiakNode node = new RiakNode.Builder().withRemoteAddress(riakServer.split(":")[0])
						.withRemotePort(Integer.parseInt(riakServer.split(":")[1])).build();
				riakNodeList.add(node);
			}

			cluster = new RiakCluster.Builder(riakNodeList).build();

			cluster.start();
		}
		return cluster;
	}

	public void insert(Object obj, String buckets, String keys,String bucketstypes) {

		RiakCluster cluster = null;
		try {
			cluster = setUpCluster();
			RiakClient client = new RiakClient(cluster);
			Namespace booksBucket = new Namespace(bucketstypes,buckets);
			
			Location mobyDickLocation = new Location(booksBucket, keys);
			
			StoreValue storeBookOp = new StoreValue.Builder(obj).withLocation(mobyDickLocation).build();
			
			client.execute(storeBookOp);
			
			
		} catch (UnknownHostException ee) {
			 StringWriter errors = new StringWriter();
   			 ee.printStackTrace(new PrintWriter(errors));
   			
   			 ee.printStackTrace();
		} catch (ExecutionException ee) {
			 StringWriter errors = new StringWriter();
   			 ee.printStackTrace(new PrintWriter(errors));
   			
   			 ee.printStackTrace();
			// TODO Auto-generated catch block
		} catch (InterruptedException ee) {
			 StringWriter errors = new StringWriter();
   			 ee.printStackTrace(new PrintWriter(errors));
   			 ee.printStackTrace();
		}
		
	}
/*
	public String getAllRecords(String buckets, String keys,String bucketstypes)
			throws UnknownHostException, ExecutionException, InterruptedException, ParseException {
		RiakCluster cluster = setUpCluster();
		RiakClient client = new RiakClient(cluster);
		Namespace booksBucket = new Namespace(bucketstypes,buckets);
		Location mobyDickLocation = new Location(booksBucket, keys);
		FetchValue fetchMobyDickOp = new FetchValue.Builder(mobyDickLocation).build();
		FetchValue.Response response = client.execute(fetchMobyDickOp);
		String value = response.getValue(String.class);
		return value;

	}

	public void deleteBuckets(String buckets, String key,String bucketstypes)
			throws ExecutionException, InterruptedException, UnknownHostException {
		RiakCluster cluster = setUpCluster();
		RiakClient client = new RiakClient(cluster);
		Namespace booksBucket = new Namespace(bucketstypes,buckets);
		Location mobyDickLocation = new Location(booksBucket, key);
		DeleteValue deleteOp = new DeleteValue.Builder(mobyDickLocation).build();
		client.execute(deleteOp);
	}

	public void update(Object obj, String keys, String buckets,String bucketstypes)
			throws UnknownHostException, ExecutionException, InterruptedException {
		RiakCluster cluster = setUpCluster();
		RiakClient client = new RiakClient(cluster);
		Namespace booksBucket = new Namespace(bucketstypes,buckets);
		Location mobyDickLocation = new Location(booksBucket, keys);
		StoreValue storeBookOp = new StoreValue.Builder(obj).withLocation(mobyDickLocation).build();
		client.execute(storeBookOp);
	}
	
	public  int updateEntity(Object data, String bucketName, String key,String bucketstypes)
	        throws Exception {
		RiakCluster cluster = setUpCluster();
	    RiakClient riakClient = new RiakClient(cluster);
	    Gson gson = new Gson();
	    try {
	        Location location = new Location(new Namespace(bucketstypes,bucketName),key);
	        String json = gson.toJson(data);
	        
	        RiakObject obj = new RiakObject().setContentType("application/json") .setValue(BinaryValue.create(json));
	        StoreValue store = new StoreValue.Builder(obj).withLocation(location).build();
	        final RiakObject finalEntity = obj;	
	        UpdateValue updateOp = new UpdateValue.Builder(location)
	                // As before, we set this option to true
	                .withFetchOption(FetchValue.Option.DELETED_VCLOCK, true)
	                .withUpdate(Update.clobberUpdate(store))
	                .withUpdate(new UpdateValue.Update<RiakObject>() {
	                    @Override
	                    public RiakObject apply(final RiakObject original) {
	                        return finalEntity;
	                    }
	                }).build();
	        riakClient.execute(updateOp).getValue(RiakObject.class);
	    } catch (ExecutionException e) {
	        throw new Exception("DAO", e);
	    } catch (InterruptedException e) {
	        throw new Exception("DAO", e);
	    }
	    return 200;
	}
	
	
	public  Set<String> getAll(String bucketName, String bucketstypes) throws UnknownHostException, ExecutionException, InterruptedException{
		RiakCluster cluster = setUpCluster();
	    RiakClient client = new RiakClient(cluster);
		Namespace ns = new Namespace(bucketstypes, bucketName);
		ListKeys lk = new ListKeys.Builder(ns).build();
		ListKeys.Response response = client.execute(lk);
		Set<String> lkeys = new HashSet<String>();
		for (Location l : response)
		{
			System.out.println(l.getKeyAsString());
			lkeys.add(l.getKeyAsString());
		}
		return lkeys;
	}*/
	
}
