//년도를 입력받아 윤년/평년 구하기
//①,② 두조건을 다 만족해야 윤년임
//①년도를 4로 나누어 떨어져야 함
//②년도를 100으로나누어 떨어지지 않거나
//년도를 400으로 나누어 떨어져야 함
//4(윤년), 100(평년), 400(윤년)임 

import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year;
		System.out.println("년도 입력 : ");
		year = s.nextInt();
		
		if((year%4==0)&&(year%100!=0 || year%400==0)) {
			System.out.print("윤년");
		}else {
			System.out.println("평년");
		}
		s.close();
	}
}
