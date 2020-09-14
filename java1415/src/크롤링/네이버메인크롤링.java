package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {
	public static void main(String[] args) {
		// 크롤링 :웹사이트에서 정보를 가지고 오는 것
		// 단순:스크랩핑
		// 단순+@:크롤링
		// 크콜링 순서
		// 1.사이트연결
		// 2.해당페이지다운로드(html)
		// 3.원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");

		try {
			Document doc = con.get();
			System.out.println("3.원하는 위치의 정보를 추출 성공");
			Elements list = doc.select(".info_spec"); // 돔 트리 구조 
			Elements list2 =list.select("dd > p > a");
			System.out.println(list.size());
			System.out.println(list2.size());
			System.out.println(list2);
			System.out.println(list2.get(0).text());
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(tag);
//				String text = tag.text();
//				System.out.println(text);
//			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // index.html

	}
}
