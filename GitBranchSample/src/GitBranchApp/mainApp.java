package GitBranchApp;

public class mainApp {
	public static void main(String[] args) {
		System.out.println("MB");
		Math cMath =new Math();
		System.out.println();
		System.out.println(cMath.add(10, 5));
	}
}
class Math{
	int add(int a,int b) {
		return a+b;
	}
}