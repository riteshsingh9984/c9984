<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>PM</title>
	<jsp:include page="../../../helpers/material-lite-loader.jsp" />
</head>
<body >
	<form:form modelAttribute="projectCreate" action="projectSave" method="post" enctype="multipart/form-data"> 
      <!-- menu bar -->
		<jsp:include page="../../../helpers/header.jsp" />
		<div class="container" style="margin:0px; width:100%;" >
		<div class="row">
			<div class="col-sm-3">
			</div>
			<div class="col-sm-9">
			<div class="row">
			<div class="col-sm-12 text-center">
			  <h3>Basic Details</h3>
			  </div>
			  </div>
				 <div class="jumbotron hero-space list_header_color1  panel_AWB_bg" style="padding-top: 2px;padding-right: 16px;padding-left: 16px;"> 
				       <hr/>
				      <!-- Basic info -->
				    	<div class="row">
				    	<!-- Left item of client -->
				    		<div class="col-sm-6">
				    			
				    			<div class="row">
			    					<div class="col-sm-4">
			    						<strong><small>Project Number</small></strong>
			    					</div>
			    					<div class="col-sm-8">
			    						<input type="text" class="form-control input-sm" 
												placeholder="login name must be unique" name="id" />
			    					</div>
			    				</div>
			    				<br/>
			    				<div class="row ">
			    					<div class="col-sm-4">
			    						<strong><small>Project Name</small></strong>
			    					</div>
			    					<div class="col-sm-8">
			    						<input type="text" class="form-control input-sm"
												placeholder="login name must be unique" name="projectName" />
												
			    					</div>
			    				</div>
			    				<br/>
				    		</div>
				    	<!-- Right item of client -->	
				    		<div class="col-sm-6">
				    		</div>
				    	</div>
				    	
				      <!-- End Basic -->  
				      
				  </div> <br/> 
				    <div class="row">
						<div class="col-sm-3"></div>	
						<div class="col-sm-9">
							<input type="submit" value="Create"
								class=" btn btn-success btn-sm " />
								&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="Reset"
								class=" btn btn-danger btn-sm " />
						</div>
					
					</div> 
				  
			</div>
		</div>
		</div>	
	
	
	</form:form>                                    
</body>
</html>




<div class="row">
														    	<!-- Left Content -->
														    		<div class="col-sm-6">
														    			<div class="row">
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?" id="sample4">
																				    <label class="mdl-textfield__label" for="sample4"><smal style="font-weight: normal;">Project ID</smal></label>
																				    <span class="mdl-textfield__error">Input is not a number!</span>
																				  </div>
														    				</div>
														    				
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input class="mdl-textfield__input" type="text" id="sample3">
																				    <label class="mdl-textfield__label" for="sample3"><smal style="font-weight: normal;">Project Name</smal></label>
																				  </div>
														    				</div>
														    			</div>
														    			<br/>
														    		</div>
														    		<!-- Right Content -->
														    		<div class="col-sm-6">
														    			<div class="row" style="margin-left:4%">
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input class="mdl-textfield__input" type="text" id="sample3">
																				    <label class="mdl-textfield__label" for="sample3"><smal style="font-weight: normal;">Project Name</smal></label>
																				  </div>
														    				</div>
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input class="mdl-textfield__input" type="text" id="sample3">
																				    <label class="mdl-textfield__label" for="sample3"><smal style="font-weight: normal;">Project Name</smal></label>
																				  </div>
														    				</div>
														    				
														    			</div>
														    			<br/>
														    		</div>
														    	</div>