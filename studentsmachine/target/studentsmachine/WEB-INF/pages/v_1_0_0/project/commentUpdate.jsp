<!-- /* ************************************
 *
 * @update:  RITESH SINGH, 29 March 2016
 * @Section: Global
 * @auth0r:  RITESH SINGH
 * @version: v.1.0.0, 29 March 2016
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
		
		.right-border {
		    border-right: 1px solid #ccc;
		}
		
		.left-border {
		    border-left: 1px solid #ccc;
		}
		
		.bottom-border {
		    border-bottom: 1px solid #ccc;
		}
		
		.top-border {
		    border-top: 1px solid #ccc;
		}
		 
		.test {
		    width: 40em; 
		    
		    word-wrap: break-word;
		}
		
		
	</style>
	 
	<!-- body of page -->
	<body style="background-color:#7B7D7D;">
		<div class="demo-layout-waterfall mdl-layout mdl-js-layout">
<!-- =============================My Page Header & Left-drawer======================================================= -->		
		
		<jsp:include page="../../../helpers/header.jsp" />
		
<!-- =============================My Page Header & Left-drawer Done====================================================== -->
		
			<main class="mdl-layout__content">
 <!-- =============================My Page Body============================================================ -->			
		    	<div class="page-content">
		    		
	    			<div class="container" style="margin-top:2%; width:100%;" >
	    				<span style="color:white"><small>PROJECT ID :<i> ${ data.projectId } </i></small></span>
	    				<div class="row">
	    					<div class="col-sm-12">
<!-- =============================My Page Card============================================================ -->						      
								<div class="demo-card-square mdl-card mdl-shadow--8dp" style="width:100%; height:100%;background-color:#EAECEE;" >
<!-- =============================My Page Card Body============================================================ -->								  	
								  	<div class="mdl-card__supporting-text">
								    	<form:form modelAttribute="projectInfo" action="projectInfoCommentUpdate" method="post" enctype="multipart/form-data">
								    		<div class="row hidden">
								    			<div class="col-sm-6">
								    				<input name="commentId" value="${ data.commentId }" />
								    			</div>
								    			<div class="col-sm-6">
								    				<input name="refId" value="${ data.projectId }" />
								    			</div>
								    		</div>
								    		<div class="row">
								    			<div class="col-sm-12">
								    				<div class="mdl-textfield mdl-js-textfield" style="width:100%;">
													    <textarea name="comments" class="mdl-textfield__input" type="text" rows= "10" id="content" style="background-color:#EAEDED;color:black;" >${ data.comments }</textarea>
													    <label class="mdl-textfield__label" for="content"><smal >Description...</smal></label>
													 </div>
								    			</div>
								    		</div>
								    		<div class="" style="margin-left:10%;">
								    			<input type="submit" value="Create"
													class=" btn btn-success btn-sm " />
													&nbsp;&nbsp;&nbsp;&nbsp;
												<input type="reset" value="Reset"
													class=" btn btn-danger btn-sm " />
								    		</div>
								    	</form:form>
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