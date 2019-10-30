import java.util.Date;
import java.util.GregorianCalendar;

public class Program {

	public static void main(String[] args) {
		
		//Foi instanciado um GregorianCalendar para o par�metro
		
		GregorianCalendar ca = new GregorianCalendar();
		//vari�vel para o valor calculado do �ngulo, sendo que um float pode receber long
		//usei float para formatar mais f�cil
		
		float angulo;
		//chamada do m�todo com par�metro GregorianCalendar
		angulo = retornaAnguloRelogio(ca);
		
		System.out.printf(" possui um �ngulo de %.2f", angulo);
	}
	
	public static long retornaAnguloRelogio(GregorianCalendar horario) {
		
		//String que recebe a data convertida para string
		
		String dt = horario.getTime().toString();
		
		//coleta dos valores de horas e minutos da String feita acima por recorte
		
		int h = Integer.parseInt(dt.substring(11, 13));
		int m = Integer.parseInt(dt.substring(14, 16));
		System.out.print(h+":"+m);
		
		//C�lculo do �ngulo abaixo
		//angm � o �ngulo dos minutos
		//angh � o �ngulo das horas
		
		long angm = 360*m/60;
		
		if (h>12) {
			h = h - 12;
		}
		
		long angh = 360*h/12;
		
		//ang � o �ngulo entre os ponteiros minutos - horas
		
		long ang = (angm-angh);
		
		//caso o �ngulo seja negativo
		
		ang = Math.abs(ang);
		
		//para que o valor mostrado do �ngulo seja o menor entre os ponteiros
		
		if (ang>180) {
			ang = 360-ang;
		}
		return ang;
	}
}
/* D�vida: Foi adicionado ao construtor do m�todo o termo static*/
