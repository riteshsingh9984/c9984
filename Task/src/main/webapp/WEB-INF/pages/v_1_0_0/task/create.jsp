<!-- /* ************************************
 *
 * @update:  RITESH SINGH, 23 April 2016
 * @Section: Global
 * @auth0r:  RITESH SINGH
 * @version: v.1.0.0, 23 April 2016
************************************* */
 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
	
	<!-- Head of page -->
	<head>
		<title>PM</title>
		<%-- <jsp:include page="../../../helpers/materialize-loader.jsp" /> --%>
		<jsp:include page="../../../helpers/material-lite-loader.jsp" />
	</head>
	
	<style>
	<!-- Square card -->
		.demo-card-square.mdl-card {
		  width: 320px;
		  height: 320px;
		}
		.demo-card-square > .mdl-card__title {
		  color: #fff;
		  background:
		    url('resources/m-lite-image/lion1.jpg') bottom right 0% no-repeat #46B6AC;
		}
	</style>
	 
	<!-- body of page -->
	<body style="background-color:#7B7D7D;" >
		<div class="demo-layout-waterfall mdl-layout mdl-js-layout">
<!-- =============================My Page Header & Left-drawer======================================================= -->		
		
		<jsp:include page="../../../helpers/header.jsp" />
		
<!-- =============================My Page Header & Left-drawer Done====================================================== -->
		
			<main class="mdl-layout__content">
 <!-- =============================My Page Body============================================================ -->			
		    	<div class="page-content">
		    		<form:form modelAttribute="taskCreate" action="taskSave" method="post" enctype="multipart/form-data"> 
		    			<div class="container" style="margin-top:2%; width:100%;" >hello/
		    				<div class="row">
		    					<div class="col-sm-12">
	<!-- =============================My Page Card============================================================ -->						      
									<div class="demo-card-square mdl-card mdl-shadow--8dp" style="width:100%; height:100%;background-color:#EAECEE;" >
										<!-- <div class="mdl-card__title mdl-card--expand" style="height:100px;">
									    	<h2 class="mdl-card__title-text">PROJECT-CREATE</h2>
									  	</div> -->
									  	
	<!-- =============================My Page Card Body============================================================ -->								  	
									  	<div class="mdl-card__supporting-text">
									    	
									    	<div class="row">
									    		<div class="col-sm-12">
							<!-- Collapse Data -->		    			
									    			
						    					<div class="panel-group" id="accordion" style="margin-left:10%;">
												    <div class="panel panel-default panel-border">
												      <div class="panel-heading panel_AWB_bg " >
												       <h4 class="panel-title">
													      <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
													          Basic Details<span style="color:red">*</span>
													      </a> 
													      </h4> 
												      </div>
												      <div id="collapse1" class="panel-collapse collapse in ">
												        <div class="panel-body  list-group-item " style="background-color:#F8F9F9;">
												        
												        	<div>
												        		<div class="row">
														    	<!-- Left Content -->
														    		<div class="col-sm-6">
														    			<div class="row">
														    				<div class="col-sm-6">
														    					<input name="projectId" class="mdl-textfield__input hidden" type="text" value="${ data.projectId }" id="projectId">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="id" class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?" id="id">
																				    <label class="mdl-textfield__label" for="id"><smal >Task ID</smal></label>
																				    <span class="mdl-textfield__error">Input is not a number!</span>
																				  </div>
														    				</div>
														    				
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="taskName" class="mdl-textfield__input" type="text" id="taskName">
																				    <label class="mdl-textfield__label" for="projectName"><smal >Task Name</smal></label>
																				  </div>
														    				</div>
														    			</div>
														    			<br/>
														    		</div>
														    		<!-- Right Content -->
														    		<div class="col-sm-6 hidden">
														    			<div class="row" style="margin-left:4%">
														    				<div class="col-sm-6">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="projectLeaderId" class="mdl-textfield__input" type="text" id="projectLeaderId">
																				    <label class="mdl-textfield__label" for="projectLeaderId"><smal >Project Leader ID</smal></label>
																				  </div>
														    				</div>
														    				<div class="col-sm-6 hidden">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="projectVoiceLeaderId" class="mdl-textfield__input" type="text" id="projectVoiceLeaderId">
																				    <label class="mdl-textfield__label" for="projectVoiceLeaderId"><smal >Voice Project Leader ID</smal></label>
																				  </div>
														    				</div>
														    				
														    			</div>
														    			<br/>
														    		</div>
														    	</div>
														    	<br/>
														    	<div class="row">
														    		<div class="col-sm-12">
														    			<div class="mdl-textfield mdl-js-textfield" style="width:100%;">
																		    <textarea name="description" class="mdl-textfield__input" type="text" rows= "10" id="content" style="background-color:#EAEDED;color:black;" ></textarea>
																		    <label class="mdl-textfield__label" for="content"><smal >Description...</smal></label>
																		 </div>
														    		</div>
														    	</div>
												        	</div>
												        
												        </div>
												      </div>
												     </div>
												     
												     
												     <div class="panel panel-default panel-border">
													      <div class="panel-heading panel_AWB_bg ">
													       <h4 class="panel-title">	<a data-toggle="collapse" data-parent="#accordion" href="#collapse2">
														      
														         Status<span style="color:red">*</span>
														        
														      </a>
														      </h4>
													      </div>
													      <div id="collapse2" class="panel-collapse collapse" >
													        <div class="panel-body list-group-item " style="background-color:#F8F9F9;">
													        
													        	<div>
												        		<div class="row">
														    	<!-- Left Content -->
														    		<div class="col-sm-6">
														    			<div class="row">
														    				<div class="col-sm-12">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="completedHrs" class="mdl-textfield__input" type="text" id="completedHrs">
																				    <label class="mdl-textfield__label" for="versionNo"><smal >Should Complete within hrs ?</smal></label>
																				  </div>
														    				</div>
														    			</div>
														    			<br/>
														    		</div>
														    		<!-- Right Content -->
														    		<div class="col-sm-6">
														    			<div class="row" style="margin-left:4%">
														    				<div class="col-sm-12">
														    					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
																				    <input name="taskStatus" class="mdl-textfield__input" type="text" id="taskStatus">
																				    <label class="mdl-textfield__label" for="status"><smal >Task Status</smal></label>
																				  </div>
														    				</div>
														    				
														    			</div>
														    			<br/>
														    		</div>
														    	</div>
												        	</div>
													        
													        </div>
													      </div>
												      </div>
												     
												 </div><br/>
									    		<div class="" style="margin-left:10%;">
									    			<input type="submit" value="Create"
														class=" btn btn-success btn-sm " />
														&nbsp;&nbsp;&nbsp;&nbsp;
													<input type="reset" value="Reset"
														class=" btn btn-danger btn-sm " />
									    		</div>		
									   <!-- Done Collapse --> 			
									    		</div>
									    	</div>	
									  	</div>
	<!-- =============================My Page Card Body Done============================================================ -->
									  	
	<!-- =============================My Page Card Footer============================================================ -->								  	
									  	
									  	<div class="mdl-card__actions mdl-card--border">
									    	<a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
									      		View Updates
									    	</a>
									  	</div>
									
	<!-- =============================My Page Card Footer Done============================================================ -->								  	
									  	
									</div>
									
	<!-- =============================My Page Card Done============================================================ -->								
									
							    </div>
		    				</div>
		    			</div>
		    		</form:form>
	    		</div>
<!-- =============================My Page Body Done============================================================ -->			    	
		  	</main>
		</div>
	</body>
</html>
