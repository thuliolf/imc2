package br.pb.unipe.gc;

public class CalcIMC {
	public float Calcula(float peso, float altura)
	{		
		float Resultado = (peso)/(altura*altura);
		return Resultado;
	} 
}
