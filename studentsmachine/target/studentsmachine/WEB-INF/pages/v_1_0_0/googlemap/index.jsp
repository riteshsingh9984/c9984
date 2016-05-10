<!-- /* ************************************
 *
 * @update:  RITESH SINGH, 29 March 2016
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
		<title>StudentMachine+</title>
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
		
		#myMap {
		   height: 350px;
		   width: 680px;
		}
	</style>
	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
	    
	<!-- body of page --><!-- #D5DBDB -->
	<body style="background-color:#7B7D7D;"> 
		<div class="demo-layout-waterfall mdl-layout mdl-js-layout">
<!-- =============================My Page Header & Left-drawer======================================================= -->		
		
		<jsp:include page="../../../helpers/header.jsp" />
		
<!-- =============================My Page Header & Left-drawer Done====================================================== -->
		
			<main class="mdl-layout__content" >
 <!-- =============================My Page Body============================================================ -->			
		    	<div class="page-content" >
		    		
	    			<div class="container" style="margin-top:2%; width:100%;"  >
	    				<div class="row">
	    					<div class="col-sm-12">
<!-- =============================My Page Card============================================================ -->						      
								<div class="demo-card-square mdl-card mdl-shadow--8dp" style="width:100%; height:100%;background-color:#EAECEE;"  >
									<!-- <div class="mdl-card__title mdl-card--expand" style="height:100px;">
								    	<h2 class="mdl-card__title-text">Update</h2>
								  	</div> -->	
<!-- =============================My Page Card Body============================================================ -->								  	
								  	<div class="mdl-card__supporting-text" >
								  		<div id="dvMap" style="width: 500px; height: 500px"></div>
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

<script>
var longicurrent;
var laticurrent;	
	$(document).ready(function() {
		
		var markers = new Array();
	    var myLatLng;
	 
	    //Find the current location of the user.
	    if (navigator.geolocation) {
	        navigator.geolocation.getCurrentPosition(function (p) {
	            var myLatLng = new google.maps.LatLng(p.coords.latitude, p.coords.longitude);
	            var m = {};
	            m.title = "Current location";
	            m.lat = p.coords.latitude;
	            m.lng = p.coords.longitude;
	            m.description = "<a href='collegeList'>college list</a> your current location";
	            markers.push(m);
	            alert("clat="+m.lat);
	            alert("clng="+m.lng);
	            //Find specified address location.
	            var address = '${ data.address}';
	            var geocoder = new google.maps.Geocoder();
	            geocoder.geocode({ 'address': address }, function (results, status) {
	                if (status == google.maps.GeocoderStatus.OK) {
	                    m = {};
	                    m.title = address;
	                    /* m.lat = results[0].geometry.location.lat();
	                    m.lng = results[0].geometry.location.lng(); */
	                    m.description = "hiii";
	                    m.lat = '${ data.latitude}';
	                    m.lng = '${ data.longitude}';
	                    alert("dlat="+m.lat);
	    	            alert("dlng="+m.lng);
	                    markers.push(m);
	                    var mapOptions = {
	                        center: myLatLng,
	                        zoom: 4,
	                        mapTypeId: google.maps.MapTypeId.ROADMAP
	                    };
	                    var map = new google.maps.Map(document.getElementById("dvMap"), mapOptions);
	                    var infoWindow = new google.maps.InfoWindow();
	                    var lat_lng = new Array();
	                    var latlngbounds = new google.maps.LatLngBounds();
	 
	                    for (i = 0; i < markers.length; i++) {
	                        var data = markers[i];
	                        var myLatlng = new google.maps.LatLng(data.lat, data.lng);
	                        lat_lng.push(myLatlng);
	                        var marker = new google.maps.Marker({
	                            position: myLatlng,
	                            map: map,
	                            title: data.title
	                        });
	                        latlngbounds.extend(marker.position);
	                        (function (marker, data) {
	                            google.maps.event.addListener(marker, "click", function (e) {
	                                infoWindow.setContent(data.title);
	                                infoWindow.setContent(data.description);
	                                infoWindow.open(map, marker);
	                            });
	                        })(marker, data);
	                    }
	                    map.setCenter(latlngbounds.getCenter());
	                    map.fitBounds(latlngbounds);
	 
	                    //***********ROUTING****************//
	 
	                    //Initialize the Path Array.
	                    var path = new google.maps.MVCArray();
	 
	                    //Initialize the Direction Service.
	                    var service = new google.maps.DirectionsService();
	 
	                    //Set the Path Stroke Color.
	                    var poly = new google.maps.Polyline({ map: map, strokeColor: '#4986E7' });
	 
	                    //Loop and Draw Path Route between the Points on MAP.
	                    for (var i = 0; i < lat_lng.length; i++) {
	                        if ((i + 1) < lat_lng.length) {
	                            var src = lat_lng[i];
	                            var des = lat_lng[i + 1];
	                            path.push(src);
	                            poly.setPath(path);
	                            service.route({
	                                origin: src,
	                                destination: des,
	                                travelMode: google.maps.DirectionsTravelMode.DRIVING
	                            }, function (result, status) {
	                                if (status == google.maps.DirectionsStatus.OK) {
	                                    for (var i = 0, len = result.routes[0].overview_path.length; i < len; i++) {
	                                        path.push(result.routes[0].overview_path[i]);
	                                    }
	                                } else {
	                                    //If the location specified is invalid, show error.
	                                    alert("Invalid location for plotting route.");
	                                    window.location.href = window.location.href;
	                                }
	                            });
	                        }
	                    }
	                } else {
	                    alert("Request failed.")
	                }
	            });
	 
	        });
	    }
	    else {
	        alert('Geo Location feature is not supported in this browser.');
	        return;
	    }
		
	    } );
</script>

<script type="text/javascript"> 
/* var map;
var marker;
var myLatlng = new google.maps.LatLng("${ data.latitude }","${ data.longitude }");
var geocoder = new google.maps.Geocoder();
var infowindow = new google.maps.InfoWindow();
function initialize(){
var mapOptions = {
zoom: 10,
center: myLatlng,
mapTypeId: google.maps.MapTypeId.ROADMAP
};

map = new google.maps.Map(document.getElementById("myMap"), mapOptions);

marker = new google.maps.Marker({
map: map,
position: myLatlng,
draggable: true 
}); 

geocoder.geocode({'latLng': myLatlng }, function(results, status) {
if (status == google.maps.GeocoderStatus.OK) {
if (results[0]) {
$('#latitude,#longitude').show();
$('#address').val(results[0].formatted_address);
$('#latitude').val(marker.getPosition().lat());
$('#longitude').val(marker.getPosition().lng());
infowindow.setContent("<a href='collegeList'>college list</a> "+results[0].formatted_address);
infowindow.open(map, marker);
}
}
});

google.maps.event.addListener(marker, 'dragend', function() {

geocoder.geocode({'latLng': marker.getPosition()}, function(results, status) {
if (status == google.maps.GeocoderStatus.OK) {
if (results[0]) {
$('#address').val(results[0].formatted_address);
$('#latitude').val(marker.getPosition().lat());
$('#longitude').val(marker.getPosition().lng());
infowindow.setContent(results[0].formatted_address);
infowindow.open(map, marker);
}
}
});
});

}
google.maps.event.addDomListener(window, 'load', initialize); */
</script>
<script>
       window.onload = function () {
    	
    	   
       }
</script>