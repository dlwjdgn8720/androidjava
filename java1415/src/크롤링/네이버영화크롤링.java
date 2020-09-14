package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버영화크롤링 {
	public static void main(String[] args) {
		// 크롤링 :웹사이트에서 정보를 가지고 오는 것
		// 단순:스크랩핑
		// 단순+@:크롤링
		// 크콜링 순서
		// 1.사이트연결
		// 2.해당페이지다운로드(html)
		// 3.원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://www.naver.com");
		System.out.println("1.사이트연결성공!!");
		try {
			Document doc = con.get();
			System.out.println("2.해당 페이지 다운로드 성공!!"); // index.html
			System.out.println("--------------------------");
			// System.out.println(doc);
			// System.out.println(doc.select("a.nav"));

			System.out.println("3.원하는 위치의 정보를 추출 성공");
			Elements list = doc.select("a.nav");
			// Elements == ArrayList + @@
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag);
				String text = tag.text();
				System.out.println(text);
			}

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // index.html

	}
}
