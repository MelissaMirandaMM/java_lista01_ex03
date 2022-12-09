package pacQuestao03;



public class Main {
	public static void main (String args[]) {
		int resultado = f(5);
		System.out.println(resultado);
		
	}
	
	public static int f(int param) {
		if(param==1 || param==2)
			return param;
		
		int result = 2 * f(param - 1) + 3 * f(param - 2);
		System.out.println("F(" + param + ") = 2 * F(" + (param-1)+") + 3 * F(" +(param-2)+")");
		return result;
	}
}
	
