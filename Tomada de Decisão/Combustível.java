import java.util.Scanner;
public class Combust�vel {
	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		double km, litro, gasto;
		System.out.println("Coloque a dist�ncia percorrida:");
		km=leia.nextDouble();
		System.out.println("Coloque a capacidade do tanque de gasolina:");
		litro=leia.nextDouble();
		gasto=km/litro;
		System.out.println("O seu gasto m�dio � " +gasto+ " km/l");
		if (gasto>=10) {
			System.out.println("Seu carro � econ�mico");
		}else {
			System.out.println("Seu carro n�o � econ�mico");
		}leia.close();
	}
}
