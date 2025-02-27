package assignment2;

public class VariableScope {

	public static void main(String[] args) {
		int a =20;
		if(true) {
			int b = 10;
			System.out.println(a);
			System.out.println(b);
		}
			System.out.println(a);
			//System.out.println(b);//b cannot be resolved to a variable.since it is accessible within the scope.
		
	}

}
