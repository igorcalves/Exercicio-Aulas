package MeusTestes.oqsei;

public class Operador {

private double resultado;



	public double  getResultado() {
	return resultado;
}



public void setResultado(double resultado) {
	this.resultado = resultado;
}



	public double EscolerOperador(int operador, double numero1, double numero2){
		switch (operador) {
		case 1: // SOMA
			resultado = numero1 + numero2;
			return	resultado;
			
		case 2: // SUBTRAÇÃO
			resultado = numero1 - numero2;
			return	resultado;
			
			
		case 3: // DIVISÃO 
			resultado = numero1 / numero2;
			return	resultado;
			
			
		case 4: // MULTIPLICAÇÃO
			resultado = numero1 * numero2;
			return	resultado;
			
			
		}
		return 0;
	}
	
}
