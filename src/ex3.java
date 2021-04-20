import java.util.Scanner;

//2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
//난수발생) 
//1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
// 2. ① import java.util.Random;
//③ int 변수2 = 변수1.nextInt(최대값); ==>  0 ~ (최대값 - 1)사이의 임의의 수
public class ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = (int)(Math.random()*100);
		int num, cnt = 0; 
		System.out.println("***난수가 발생하였습니다, 맞춰보세요!***");
		
		while(true) {
			System.out.print("숫자입력 : ");
			num = s.nextInt();
			cnt++;
			if(num > a)
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			else if(num < a)
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			else
				break;
		}
		System.out.println("정답입니다. "+cnt+"번 만에 맞추셨습니다.");
		
	}

}
