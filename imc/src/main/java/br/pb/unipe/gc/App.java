package br.pb.unipe.gc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CalcIMC imc = new CalcIMC(); 

		float peso = 98; 
		float altura = 174; 
		float resultado = imc.Calcula(peso, altura); 
		System.out.println(resultado); 
    }
}
