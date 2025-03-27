package lab4_ex1;

class Complex {
	public double real, imag;

public Complex(double real, double imag) {
	this.real = real;
	this.imag = imag;
}
public Complex add(Complex x) {
	double rezReal = this.real + x.real;
	double rezImag = this.imag + x.imag;
	return new Complex(rezReal, rezImag);
}
}