package 배열의응용;

import java.util.Random;

public class 지역별남녀구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); // 주민번호 랜덤하게 설정
		int[] people = new int[100]; // 사람 100명 배열로 지정
		int city_seoul = 0; // 서울 사람 카운트
		int city_busan = 0; // 부산 사람 카운트
		int city_jeju = 0; // 제주 사람 카운트
		int city_etc = 0;  // 기타 지역 사람 카운트
		
		int s_m =0; // 서울 남자 카운트
		int s_w =0; // 서울 여자 카운트
		int b_m =0; // 부산 남자 카운트
		int b_w =0; // 부산 여자 카운트
		int j_m =0; // 제주 남자 카운트
		int j_w =0; // 제주 여자 카운트
		int e_m =0; // 기타 지역 남자 카운트
		int e_w =0; // 기타지역 여자 카운트
		
		for (int i = 0; i < people.length; i++) {
             people[i] = r.nextInt(4000000)+1000000; // 주민번호 자리수 설정 ( 0~3999999) + 1000000
		}
		
		for (int i = 0; i < people.length; i++) {
			String str_people  =Integer.toString(people[i]); // 생성된 랜덤 값 int -> String으로 형변환
		    char gender = str_people.charAt(0); // 첫번째 자리 추출 - 성별
		    char city = str_people.charAt(1);   // 두번째 자리 추출 - 도시
		    if(city == '1') {  // 서울 지역
		    	city_seoul++;
		    	if(gender == '1' || gender =='3') { // 남
		    		s_m++;
		    	}
		    	else if(gender == '2' || gender =='4') { // 여
		    		s_w++;
		    	}
		    }
		    else if(city == '2') { // 부산지역
		    	city_busan++;
		    	if(gender == '1' || gender =='3') { // 남
		    		b_m++;
		    	}
		    	else if(gender == '2' || gender =='4') { // 여
		    		b_w++;
		    	}
		    }
		    else if(city == '3') { // 제주 지역
		    	city_jeju++;
		    	if(gender == '1' || gender =='3') { // 남
		    		j_m++;
		    	}
		    	else if(gender == '2' || gender == '4') { //여
		    		j_w++;
		    	}
		    }
		    else{ // 기타
		    	city_etc++;
		    	if(gender == '1' || gender == '3') { // 남
		    		e_m++;
		    	}
		    	else if(gender == '2' || gender =='4') { // 여
		    		e_w++;
		    	}
		    }
		    
	   }
		System.out.println("서울지역: "+city_seoul+"명 중 남자는"+s_m+"명,"+"여자는"+s_w+"명입니다.");
	    System.out.println("부산지역: "+city_busan+"명 중 남자는"+b_m+"명,"+"여자는"+b_w+"명입니다.");
	    System.out.println("제주지역: "+city_jeju+"명 중 남자는"+j_m+"명,"+"여자는"+j_w+"명입니다.");
	    System.out.println("기타지역: "+city_etc+"명 중 남자는"+e_m+"명,"+"여자는"+e_w+"명입니다.");
		
		
		

	}

}
