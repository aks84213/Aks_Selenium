package FreshPractise;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNo(15);
	}
public static void OddNo(int Sqr){
	int i = 1;
	while (i <Sqr){
		if (i % 3 == 0){
			int res = printFrmMethod(i);
			System.out.println("the number is '"+i+ "' & Square is "+res);
		}
			i++;
	}
}
public static int printFrmMethod(int num){
	int result = num*num;
	return (result);
		
}
}
