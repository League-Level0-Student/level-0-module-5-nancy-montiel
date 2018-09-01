
public class ForLoops {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i <0; i++) {
		System.out.println(i);
	}
	for (int i = 2; i < 101; i+=2) {
		System.out.println();
	}
	for (int i = 1; i < 99; i+=2) {
		System.out.println();
	}
	for (int i = 1; i < 501; i++) {
		if(i%2==0){
		System.out.println(i+" is eveeeennn");
	}else{
		System.out.println(i+" is oddddd");
	}
	for (int j = 0; j < 784; j+=7) {
			System.out.println(j);
		}
	int age=0;
	for (int j = 2003; j < 2019; j++) {
		System.out.println(j+ " I was "+age);
		age++;
	}
	}
}
}