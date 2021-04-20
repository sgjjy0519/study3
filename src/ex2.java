import java.util.Random;

//50개의 난수를 만들어서 다음과 같이 출력하시오
//조건1) 0 - 100 사이의 수 일것
//조건2) 1줄에 6개씩 표시하시오 
public class ex2 {

	public static void main(String[] args) {
//		int numArr[] = new int[50];
//		int sum=0;
//		
//		for(int i=1;i<numArr.length;i++) {
//			int num = (int)(Math.random()*100+1);
//			numArr[i] = num;
//			System.out.println(numArr[i]);
//			sum += numArr[i];
//			
//		}
//		System.out.println(sum);
		
		int num;
		int sum = 0; // 50개 난수의 총합
		
		for(int i=1;i<=50;i++) {
			num = new Random().nextInt(101); //0~100 사이의 난수
			System.out.print(num + "\t");
			sum += num;
			if(i % 6 == 0)
				System.out.println();
		}
		System.out.println("\n총합 = "+ sum);
	}

}
