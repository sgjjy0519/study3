import java.util.Scanner;

//for문을 이용하여 제곱승을 구하시오
//x의 값을 입력하시오 : 3
//y의 값을 입력하시오 : 3
//3의 3승은 27

public class ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y;
		int result = 1;
		System.out.print("x의 값을 입력하시오 : ");
		x=s.nextInt();
		System.out.print("y의 값을 입력하시오 : ");
		y=s.nextInt();
		
		for(int i=0;i<y;i++) {
			result *= x;
		}
		System.out.println("x의 y제곱은 : "+ result);
	}

}
