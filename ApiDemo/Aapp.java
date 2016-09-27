package com.scb.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
@RequestMapping("/movie")
public class Aapp {

	@RequestMapping(value = "/{name}", method = RequestMethod.POST)
	public @ResponseBody String getMovie(@PathVariable String name, ModelMap model,HttpServletRequest request,HttpServletResponse response) {

		
		
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-cache");
		
		model.addAttribute("movie", name);
		return "list";

	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getMovieName(@PathVariable String name, ModelMap model,HttpServletRequest request,HttpServletResponse response) {

		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-cache");
		Test test = new Test();
		test.setName("MyName");
		test.setAddress("XCZ");
		test.setStatus("OK");
		String url="http://192.168.1.96:8989/SCBSherlock/movie/";
		String method="POST";
		
		System.out.println("=================="+postData(url,method,new Gson().toJson(test)));
		model.addAttribute("movie", name);
		return "list";

	}

	/*@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Test> getDefaultMovie(ModelMap model,
			@RequestHeader(value="Accept") String accept,
			@RequestHeader(value="Accept-Language") String acceptLanguage,
			@RequestHeader(value="User-Data", defaultValue="foo") String userAgent,
			@RequestBody Test jsonString) {
		
		System.out.println(userAgent);
		System.out.println(acceptLanguage);
		System.out.println(accept);
		
		model.addAttribute("movie", "this is default movie");
		return new ResponseEntity<Test>(jsonString, HttpStatus.OK);
	}*/
	
	@CrossOrigin   /* this annotation works with <spring.version>4.2.2.RELEASE</spring.version> spring version */
	@RequestMapping(value = "/", method = RequestMethod.POST,   produces="application/json")
	public  @ResponseBody String getDefaultMovie(ModelMap model,
			@RequestBody Test jsonString,
			@RequestHeader(value="User-Data", defaultValue="foo") String userAgent,
			HttpServletResponse response) {
			
			System.out.println(">>>>>>>>>>>>>>"+new Gson().toJson(jsonString));
			System.out.println(userAgent);
			jsonString.setStatus("OK");
			model.addAttribute("movie", "this is default movie");
		return new Gson().toJson(jsonString);
	}
	
	
	
	/*Hitting the API from spring Controller Using HttpURLConnection*/
	public	String  postData(String urlString , String method, String jsonString){
		String outputString = "";
		Map<String ,String > resultMap = new HashMap<String ,String>();
		Gson gson = new Gson();
		String resultString = "";
		try {
			int responseCode = 401;
			
			URL url = new URL(urlString);
	
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(method);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			OutputStream os = conn.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				responseCode = conn.getResponseCode();
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	
			String output;
			
			if(responseCode ==200){
			while ((output = br.readLine()) != null) {
				resultString = output;
			}
			
			resultMap.put("responsecode", "200");
			resultMap.put("responseMassage",resultString);
			}else{
				resultMap.put("status", "401");
				resultMap.put("message", "error");
				resultString = gson.toJson(resultMap);
				
			}
			
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
			resultMap.put("status", "401");
			resultMap.put("message", "error");
			resultString = gson.toJson(resultMap);
			
		} catch (IOException e) {
			e.printStackTrace();
			
			resultMap.put("status", "401");
			resultMap.put("message", "error");
			resultString = gson.toJson(resultMap);
		}
		return resultString;
		
	}
	
}

class Test{
	private String name;
	private String address;
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
