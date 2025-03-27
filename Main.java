package lab4_ex1;

public class Main {
	public static void main(String[] args) {
		Complex a = new Complex(3.0,4.0);
		Complex b = new Complex(1.0,2.0);
		Complex c = a.add(b);
		System.out.println(c.real+" + "+c.imag + "i");
		
		
}
}