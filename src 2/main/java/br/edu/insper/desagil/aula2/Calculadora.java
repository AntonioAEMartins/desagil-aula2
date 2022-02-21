package br.edu.insper.desagil.aula2;

public class Calculadora {

	public double executa(int a, int b, char op) {
		double aa = a;
		double bb = b;

		if (op == '+') {
			double c = aa + bb;
			return c;
		} else if (op == '-') {
			double c = aa - bb;
			return c;
		} else if (op == '*') {
			double c = aa * bb;
			return c;
		} else if (op == '/') { 
			if (aa/bb == 0.0) {
				return 0.0;
			}
			double c = aa / bb;
			return c;
		}
		return 0.0;
	}
}