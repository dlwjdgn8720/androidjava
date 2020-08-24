package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int[] vote = new int[5]; // {0,0,0,0,0}
		
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력: 0)블랙핑크,1)유재석,2)아이유,3)이효리,4)비");
			int choice2 = Integer.parseInt(choice);
			if(choice2 < 0 || choice2 > 4) {
			    i--;
			}
			else {
				vote[choice2]++;
				//System.out.println(i);
				
			}
			
			
			}
		for (int i = 0; i < vote.length; i++) {
			System.out.println(i+"번은 "+vote[i]+"표");
			
		}
		int max = vote[0];
		for (int i = 1; i < vote.length; i++) {
			if(max < vote[i]) {
				max = vote[i];
			}
		}
		for (int i = 0; i < vote.length; i++) {
		      if(vote[i] == max) {
		    	  System.out.println(i+"는 "+names[i]);
		      }
		}
		
		}

	}


