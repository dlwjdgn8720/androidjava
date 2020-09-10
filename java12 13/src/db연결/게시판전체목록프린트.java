package db연결;

import java.util.ArrayList;

public class 게시판전체목록프린트 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        BbsDAO dao = new BbsDAO();
        ArrayList<BbsVO> list= dao.all();
        System.out.println("게시판의개수:"+list.size()+"개");
        for(int i=0; i<list.size(); i++) {
        	BbsVO bag=list.get(i);
        	System.out.println("NO: " +bag.getNo());
        	System.out.println("Title: " +bag.getTitle());
        	System.out.println("Content: " +bag.getContent());
        	System.out.println("Writter: " +bag.getWritter());
        	System.out.println();
        }
	}

}
