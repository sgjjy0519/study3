//1~100사이의수 중에서  3의 배수이면서 7의 배수 구하기 
//조건) for문과 && 연산자를 반드시 이용

public class ex4 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if((i % 7 == 0)&&(i % 3 == 0)) {
				System.out.print(i+"\t");
			}
		}

	}

}
