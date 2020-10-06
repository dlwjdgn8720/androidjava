<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kakao 맵 시작</title>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services,clusterer,drawing"></script>
</head>
<body>
<div id="map" style="width:100%;height:700px;"></div>
<p>
<button onclick="setOverlayMapTypeId('traffic')">교통정보 보기</button> 
<button onclick="setOverlayMapTypeId('roadview')">로드뷰 도로정보 보기</button> 
<button onclick="setOverlayMapTypeId('terrain')">지형정보 보기</button>
<button onclick="setOverlayMapTypeId('use_district')">지적편집도 보기</button>
</p> 

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a2ff1ab1a55e7a38ee453b21b822f913"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표
        level: 5 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 지도에 추가된 지도타입정보를 가지고 있을 변수입니다
var currentTypeId;

// 버튼이 클릭되면 호출되는 함수입니다
function setOverlayMapTypeId(maptype) {
    var changeMaptype;
    
    // maptype에 따라 지도에 추가할 지도타입을 결정합니다
    if (maptype === 'traffic') {            
        
        // 교통정보 지도타입
        changeMaptype = kakao.maps.MapTypeId.TRAFFIC;     
        
    } else if (maptype === 'roadview') {        
        
        // 로드뷰 도로정보 지도타입
        changeMaptype = kakao.maps.MapTypeId.ROADVIEW;    

    } else if (maptype === 'terrain') {
        
        // 지형정보 지도타입
        changeMaptype = kakao.maps.MapTypeId.TERRAIN;    

    } else if (maptype === 'use_district') {
        
        // 지적편집도 지도타입
        changeMaptype = kakao.maps.MapTypeId.USE_DISTRICT;           
    }
    
    // 이미 등록된 지도 타입이 있으면 제거합니다
    if (currentTypeId) {
        map.removeOverlayMapTypeId(currentTypeId);    
    }
    
    // maptype에 해당하는 지도타입을 지도에 추가합니다
    map.addOverlayMapTypeId(changeMaptype);
    
    // 지도에 추가된 타입정보를 갱신합니다
    currentTypeId = changeMaptype;   
    
    
    
 // 지도를 클릭한 위치에 표출할 마커입니다
    var marker = new kakao.maps.Marker({ 
        // 지도 중심좌표에 마커를 생성합니다 
        position: map.getCenter() 
    }); 
    // 지도에 마커를 표시합니다
    marker.setMap(map);

    // 지도에 클릭 이벤트를 등록합니다
    // 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
    kakao.maps.event.addListener(map, 'click', function(mouseEvent) {        
        
        // 클릭한 위도, 경도 정보를 가져옵니다 
        var latlng = mouseEvent.latLng; 
        
        // 마커 위치를 클릭한 위치로 옮깁니다
        marker.setPosition(latlng);
        
        var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
        message += '경도는 ' + latlng.getLng() + ' 입니다';
        
        var resultDiv = document.getElementById('clickLatlng'); 
        resultDiv.innerHTML = message;
        
    });
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
</script>
</body>
</html>