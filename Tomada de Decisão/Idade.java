import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int nasc, anoAtu, idade;
		System.out.println("Digite seu ano de nascimento");
		nasc= leia.nextInt();
		System.out.println("Digite o ano atual");
		anoAtu= leia.nextInt();
		idade=anoAtu-nasc;
		if(idade<10) {
			System.out.println("Voc� � uma crian�a");
		}else if(idade<18) {
			System.out.println("Voc� � um adolescente");
		}else if(idade<60) {
			System.out.println("Voc� � um adulto");
		}else {
			System.out.println("Voc� � um idoso");
		}leia.close();
	}

}
