import java.util.*;
public class futebol {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do aluno");
		idade=leia.nextInt();
		switch (idade) {
			case 6:
				System.out.println("Este aluno ser� do grupo Dente de Leite");
				break;
			case 7:
				System.out.println("Este aluno ser� do grupo j�nior");
				break;
			case 8:
				System.out.println("Este aluno ser� do grupo J�nior Max");
				break;
			case 9: 
				System.out.println("Este aluno ser� do grupo J�nior Master");
				break;
			case 10:
				System.out.println("Este aluno ser� do grupo Master");
				break;
				default:
					System.out.println("A escola n�o admite alunos essa idade ");
					
		}leia.close();			
	}
}
