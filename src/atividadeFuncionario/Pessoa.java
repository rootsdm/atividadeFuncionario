package atividadeFuncionario;

import java.util.Date;

public class Pessoa {
	// atributos
	private String nome;
	private Date dataNascimento;
	private int idade;
	private String cargoExercido;
	
	// construtor vazio
	public Pessoa() {
		
	}
	// construtor com argumentos
	public Pessoa(String nome, Date dataNascimento, int idade, String cargoExercido) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.cargoExercido = cargoExercido;
		
	}
	// metodos da classe
	// Menu principal
		public void menuPrincipal() {
			System.out.println("+----------------------------+");
			System.out.println("|    Cadastro Funcionários   |");
			System.out.println("+----------------------------+");
			System.out.println("| 1 - Cadastrar Funcionário  |");
			System.out.println("| 2 - Buscar por Crachá      |");
			System.out.println("| 3 - Listar Funcionários    |");
			System.out.println("| 0 - Sair                   |");
			System.out.println("+----------------------------+");
			System.out.print("Digite uma opção: ");

		}

	
	
	// geter e seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargoExercido() {
		return cargoExercido;
	}
	public void setCargoExercido(String cargoExercido) {
		this.cargoExercido = cargoExercido;
	}
	
	

}
