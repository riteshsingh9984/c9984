<!-- /* ************************************
 *
 * @update:  RITESH SINGH, 4 May 2016
 * @Section: Global
 * @auth0r:  RITESH SINGH
 * @version: v.1.0.0, 4 May 2016
************************************* */
 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
	
	<!-- Head of page -->
	<head>
		<title>College Server</title>
		<%-- <jsp:include page="../../../helpers/materialize-loader.jsp" /> --%>
		<jsp:include page="../../../helpers/material-lite-loader.jsp" />
	</head>
	 
	<!-- body of page -->
	<body style="background-color:#7B7D7D;background-image: url(resources/m-lite-image/body.gif);" >
		<div class="demo-layout-waterfall mdl-layout mdl-js-layout">
<!-- =============================My Page Header & Left-drawer======================================================= -->		
		
		<jsp:include page="../../../helpers/header.jsp" />
		
<!-- =============================My Page Header & Left-drawer Done====================================================== -->
		
			<main class="mdl-layout__content">
 <!-- =============================My Page Body============================================================ -->			
		    	<div class="page-content">
		    		<div class="row" style="margin-top:7%;">
		    			<div class="col-sm-6">
		    				<div style="background-image: url(resources/m-lite-image/cur.jpg);height: 384px; width: 512px;margin-left:25%;" class=" mdl-shadow--8dp">
							    <a href="collegemachine"><h2 class="mdl-card__title-text">Click Me!</h2></a>
							</div>		    			
		    			</div>
		    			<div class="col-sm-6">
		    				<div style="background-image: url(resources/m-lite-image/col.jpg);height: 384px; width: 512px;" class=" mdl-shadow--8dp">
							    <a href="studentsmachine"><h2 class="mdl-card__title-text">Click Me!</h2></a>
							</div>
		    			</div>
		    		</div>
	    		</div>
<!-- =============================My Page Body Done============================================================ -->			    	
		  	</main>
		</div>
	</body>
</html>