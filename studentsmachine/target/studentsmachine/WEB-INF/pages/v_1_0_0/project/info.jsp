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
								    	
								    	<div class="row" style="margin-left:10%;">
								    		<div class="col-sm-10 top-border left-border right-border bottom-border">
								    			<div class="row " style="margin-top:2%;">
									    			<div class="col-sm-12" >
									    			<button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal">comment</button>
									    			</div>
									    		</div>
									    		<br/>
									    		<table border="1" style="width:100%; background-color:white">
										    		<tr style="height:50px;">
										    			<th class="text-center">
															Description
														</th>
														<th class="text-center">
															Action
														</th>
										    		</tr>
										    		<c:forEach items="${data.comments}" var="comment">
													<tr style="height:50px;">
										    			<td >
										    				<p class="test" style="margin-left:5%; width:500px;">
															${comment.comments}
															</p><br></br>
															<span style="margin-left:70%; color:#000000;">
															CreatedAt:
															<span style="color:#e61919;">
															${comment.createInfo.createAt}
															</span>
															</span>
														</td>
														<td class="text-center">
															<a href="projectInfoComment?projectId=${ data.projectId }&commentId=${comment.commentId}" >update</a>
														</td>
										    		</tr>
													</c:forEach>
												</table><br/>
								    		</div>
								    		<div class="col-sm-2 top-border  right-border bottom-border">
								    		helloQ
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
	
  <form:form modelAttribute="projectInfo" action="projectInfoSave" method="post" enctype="multipart/form-data">
	<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">PROJECT ID: ${ data.projectId } </h4>
        </div>
        <div class="modal-body">
        	<div class="row hidden">
        		<div class="col-sm-6">Project ID</div>
        		<div class="col-sm-6"><input name="refId" value="${ data.projectId }" /></div>
        	</div>
        	<div class="row">
        		<div class="col-sm-12">
        			<div class="mdl-textfield mdl-js-textfield" style="width:100%;">
					    <textarea name="comments" class="mdl-textfield__input" type="text" rows= "10" id="content" style="background-color:#EAEDED;color:black;" ></textarea>
					    <label class="mdl-textfield__label" for="content"><smal >Comments...</smal></label>
					 </div>
        		</div>
        	</div>
        	<br/>
        	<div class="" style="margin-left:10%;">
    			<input type="submit" value="Create"
					class=" btn btn-success btn-sm " />
					&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="Reset"
					class=" btn btn-danger btn-sm " />
    		</div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  </form:form>
</html>