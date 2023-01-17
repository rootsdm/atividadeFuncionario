package atividadeFuncionario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	// atributos
	private String numeroCracha;
	private ArrayList<Funcionario> pessoaFuncionario = new ArrayList<Funcionario>();
	private double salarioMensal;
	private int feriasMensais;

	// construtor vazio
	public Funcionario() {

	}

	// construtor com argumentos
	public Funcionario(String numeroCracha, ArrayList<Funcionario> pessoaFuncionario, double salarioMensal,
			int feriasMensais) {
		super();
		this.numeroCracha = numeroCracha;
		this.pessoaFuncionario = pessoaFuncionario;
		this.salarioMensal = salarioMensal;
		this.feriasMensais = feriasMensais;
	}

	// metodos da classe
	public void cadastroFuncionario() throws ParseException {
		Scanner input = new Scanner(System.in);
		Funcionario f = new Funcionario();

		System.out.println("+----------------------------+");
		System.out.println("|    Cadastrar Funcionário   |");
		System.out.println("+----------------------------+");
		System.out.print("Nome: ");
		f.setNome(input.nextLine());

		System.out.print("Data Nascimento(dd/mm/aaa): ");
		String dataRecebida = input.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dataRecebida);
		f.setDataNascimento(date);

		System.out.print("Idade: ");
		f.setIdade(input.nextInt());
		System.out.print("Cargo: ");
		f.setCargoExercido(input.next());
		System.out.print("Número Cracha: ");
		f.setNumeroCracha(input.next());
		System.out.print("Salário Mensal: ");
		f.setSalarioMensal(input.nextDouble());
		System.out.print("Férias Mensais: ");
		f.setFeriasMensais(input.nextInt());

		pessoaFuncionario.add(f);
		System.out.println("Funcionário Cadastrado com Sucesso!");
	}

	public Funcionario pesquisaFuncionario(String cracha) {
		Scanner input = new Scanner(System.in);
		System.out.println("+-----------------------------+");
		System.out.println("|      Busca por Cracha       |");
		System.out.println("+-----------------------------+");
		System.out.print("Digite o Cracha: ");
		cracha = input.next();

		for (int i = 0; i < pessoaFuncionario.size(); i++) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = dateFormat.format(pessoaFuncionario.get(i).getDataNascimento());
			
			if (getPessoaFuncionario().get(i).getNumeroCracha().equals(cracha)) {
				System.out.println("Num.Cracha: " + pessoaFuncionario.get(i).getNumeroCracha());
				System.out.println("Nome: " + pessoaFuncionario.get(i).getNome());
				System.out.println("Data Nascimento: " + dataFormatada);
				System.out.println("Idade: " + pessoaFuncionario.get(i).getIdade());
				System.out.println("Cargo: " + pessoaFuncionario.get(i).getCargoExercido());
				System.out.println("Salário Mensal: " + pessoaFuncionario.get(i).getSalarioMensal());
				System.out.println("Férias Mensais: " + pessoaFuncionario.get(i).getFeriasMensais());
				return pessoaFuncionario.get(i);

			}

		}
		System.out.println("Cracha NÃO Localizado!");
		return null;

	}

	public void listarFuncionario() {
		for (Funcionario func : pessoaFuncionario) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = dateFormat.format(func.getDataNascimento());

			if (pessoaFuncionario.size() > 0) {
				System.out.println("Num.Cracha: " + func.getNumeroCracha());
				System.out.println("Nome: " + func.getNome());
				System.out.println("Data Nascimento: " + dataFormatada);
				System.out.println("Idade: " + func.getIdade());
				System.out.println("Cargo: " + func.getCargoExercido());
				System.out.println("Salário Mensal: " + func.getSalarioMensal());
				System.out.println("Férias Mensais: " + func.getFeriasMensais());

			} else {
				System.out.print("### ERRO: Voçê NÃO TEM Funcionarios Cadastrados ###");

			}

		}

	}

	// geters e seters
	public String getNumeroCracha() {
		return numeroCracha;
	}

	public void setNumeroCracha(String numeroCracha) {
		this.numeroCracha = numeroCracha;
	}

	public ArrayList<Funcionario> getPessoaFuncionario() {
		return pessoaFuncionario;
	}

	public void setPessoaFuncionario(ArrayList<Funcionario> pessoaFuncionario) {
		this.pessoaFuncionario = pessoaFuncionario;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getFeriasMensais() {
		return feriasMensais;
	}

	public void setFeriasMensais(int feriasMensais) {
		this.feriasMensais = feriasMensais;
	}

}
