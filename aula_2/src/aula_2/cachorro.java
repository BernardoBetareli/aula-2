package aula_2;

public class cachorro {
		private String nome;
		private  String raça;
		private  int idade;
		private  String cor;
		
		public String getnome() {
			return nome;
		}
		
		public String getraça() {
			return raça;
		}
		
		public String getcor() {
			return cor;
		}
		
		public int getidade() {
			return idade;
		}
		
		
		
		
		public void setnome (String nome) {
			this.nome = nome;
		}
		
		public void setraça (String raça) {
			this.raça = raça;
		}
		
		public void setidade (int idade) {
			this.idade = idade;
		}
		
		public void setcor (String cor) {
			this.cor = cor;
		}
		
	
		
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

