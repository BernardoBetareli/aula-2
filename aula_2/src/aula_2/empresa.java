package aula_2;

public class empresa {
		public String nome;
		public String tipo;
		public int idade;
		public String cidade;
		
		
		public void lucrou() {
			System.out.println("A empresa: " + nome + " lucrou 100 mil nessa venda");
		}
		
		public void GetEmpresa() {
			System.out.println (
					"nome: " + nome +
					"\ntipo: " + tipo +
					"\nIdade: " + idade +
					"\nCidade: " + cidade
					);
		}
	}
