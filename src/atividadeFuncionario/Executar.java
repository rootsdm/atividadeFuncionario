package atividadeFuncionario;

import java.text.ParseException;
import java.util.Scanner;

public class Executar {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Funcionario f = new Funcionario();
		int opcao;

		do {
			f.menuPrincipal();
			opcao = input.nextInt();

			switch (opcao) {
			// cadastro funcionario
			case 1:
				f.cadastroFuncionario();
				break;

			// pesquisa por cracha
			case 2:
				f.pesquisaFuncionario(null);
				break;

			// lista funcionarios
			case 3:
				f.listarFuncionario();
				break;

			// sair
			case 0:
				System.out.println("Saindo.... ;) ");
				break;
			
			
			default:
				System.out.println("### ERRO: Opção inválida, Tente novamente! ###");
				break;
			}

		} while (opcao != 0);

	}

}
