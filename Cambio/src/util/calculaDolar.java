package util;


public class calculaDolar {
	
	public static final double IOF = 0.06;
	public double dolar;
	public int quantidade;
	
	
	public double calculaValor() {
		double resultado;
		resultado = (dolar * quantidade) + ((dolar*quantidade)*IOF);
		return resultado;
	}


	@Override
	public String toString() {
		return "calculaDolar [dolar=" + dolar + ", quantidade=" + calculaValor();
	}
	
	
}
