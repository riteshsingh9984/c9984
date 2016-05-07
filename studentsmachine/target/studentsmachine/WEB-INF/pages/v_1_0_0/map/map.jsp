<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>
    <script	src="http://maps.googleapis.com/maps/api/js">
	</script>
	
    <script>
		function initialize() {
	  		var mapProp = {
	    	center:new google.maps.LatLng(51.508742,-0.120850),
	    	zoom:5,
	    	mapTypeId:google.maps.MapTypeId.ROADMAP
	  	};
	  		var map=new google.maps.Map(document.getElementById("googleMap"), mapProp);
	  		var marker = new google.maps.Marker({map: map,position: new google.maps.LatLng(20,77)});
	  		var infowindow = new google.maps.InfoWindow({content:'<strong></strong><br><br> <br>'});
	  		google.maps.event.addListener(marker, 'click', function(){infowindow.open(map,marker);});
	  		infowindow.open(map,marker);
		}
		google.maps.event.addDomListener(window, 'load', initialize); 
	</script>
  </head>
  <body>
    <center>
        <div id="googleMap" style="width:500px;height:380px;"></div>
    </center>
    
    <div>
    	${ data }
    </div>
  </body>
  
</html>