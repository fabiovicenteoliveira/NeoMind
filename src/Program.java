import java.util.Date;
import java.util.GregorianCalendar;

public class Program {

	public static void main(String[] args) {
		
		//Foi instanciado um GregorianCalendar para o parâmetro
		
		GregorianCalendar ca = new GregorianCalendar();
		//variável para o valor calculado do ângulo, sendo que um float pode receber long
		//usei float para formatar mais fácil
		
		float angulo;
		//chamada do método com parâmetro GregorianCalendar
		angulo = retornaAnguloRelogio(ca);
		
		System.out.printf(" possui um ângulo de %.2f", angulo);
	}
	
	public static long retornaAnguloRelogio(GregorianCalendar horario) {
		
		//String que recebe a data convertida para string
		
		String dt = horario.getTime().toString();
		
		//coleta dos valores de horas e minutos da String feita acima por recorte
		
		int h = Integer.parseInt(dt.substring(11, 13));
		int m = Integer.parseInt(dt.substring(14, 16));
		System.out.print(h+":"+m);
		
		//Cálculo do ângulo abaixo
		//angm é o ângulo dos minutos
		//angh é o ângulo das horas
		
		long angm = 360*m/60;
		
		if (h>12) {
			h = h - 12;
		}
		
		long angh = 360*h/12;
		
		//ang é o ângulo entre os ponteiros minutos - horas
		
		long ang = (angm-angh);
		
		//caso o ângulo seja negativo
		
		ang = Math.abs(ang);
		
		//para que o valor mostrado do ângulo seja o menor entre os ponteiros
		
		if (ang>180) {
			ang = 360-ang;
		}
		return ang;
	}
}
/* Dúvida: Foi adicionado ao construtor do método o termo static*/
