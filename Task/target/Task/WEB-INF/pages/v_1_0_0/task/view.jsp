<!-- /* ************************************
 *
 * @update:  RITESH SINGH, 26 March 2016
 * @Section: Global
 * @auth0r:  RITESH SINGH
 * @version: v.1.0.0, 26 March 2016
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
		    		
	    			<div class="container" style="margin-top:2%; width:100%;" >
	    				<div class="row">
	    					<div class="col-sm-12">
<!-- =============================My Page Card============================================================ -->						      
								<div class="demo-card-square mdl-card mdl-shadow--8dp" style="width:100%; height:100%;background-color:#EAECEE;" >
									<div class="mdl-card__title mdl-card--expand" style="height:100px;">
								    	<h2 class="mdl-card__title-text">Update</h2>
								  	</div>
								  	
<!-- =============================My Page Card Body============================================================ -->								  	
								  	<div class="mdl-card__supporting-text">
								    	
								    	<div class="row">
									    	<div class="col-sm-12">
									    		<div class="row" style="margin-left:20%;">
									    			<div class="col-sm-3">
									    			PROJECT ID : <span style="">${ project.id }</span>
									    			</div>
									    			<div class="col-sm-3">
									    			ProjectName ${ project.projectName }
									    			</div>
									    			<div class="col-sm-3">
									    			ProjectID ${ project.id }
									    			</div>
									    			<div class="col-sm-3">
									    			ProjectID ${ project.id }
									    			</div>
									    		</div>
									    		<br/>
									    		
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
	    		</div>
<!-- =============================My Page Body Done============================================================ -->			    	
		  	</main>
		</div>
	</body>
</html>
