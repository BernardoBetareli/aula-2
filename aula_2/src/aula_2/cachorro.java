package aula_2;

public class cachorro {
		public String nome;
		public String raça;
		public int idade;
		public String cor;
		
		
		public void latir() {
			System.out.println("O cachorro:" + nome + "latiu");
		}
		
		public void GetCachorro() {
			System.out.println (
					"nome: " + nome +
					"\nRaça: " + raça +
					"\nIdade: " + idade +
					"\nCor: " + cor
					);
		}
	}

