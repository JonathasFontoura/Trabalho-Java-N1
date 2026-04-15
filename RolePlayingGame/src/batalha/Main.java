package batalha;

import java.util.Scanner;
import batalha.Combate;

import personagem.Personagem;
import personagem.Arqueiro;
import personagem.Guerreiro;
import personagem.Mago;
import inimigo.Inimigo;
import inimigo.Esqueleto;
import inimigo.ZumbiMago;
import inimigo.Goblin;

public class Main {
	
	public static String nome;
	public static int pontosDeVida;
	public static int defesa;
	public static int defesaMagica;
	
	public static int precisao;
	public static int forca;
	public static int poderMagico;
	public static boolean personagemSetado;
	public static Personagem personagem;
	
	public static int resistenciaOssea;
	public static int magiaSombria;
	public static int agilidade;
	public static boolean inimigoSetado;
	public static Inimigo inimigo;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Definição de personagens...");
		
		System.out.print("Digite o nome do personagem: ");
		nome = scanner.next();
		
		System.out.print("Informe o valor dos pontos de vida: ");
		pontosDeVida = scanner.nextInt();
		
		System.out.print("Informe o valor dos pontos de defesa: ");
		defesa = scanner.nextInt();
		
		System.out.print("Informe o valor dos pontos de defesa magica: ");
		defesaMagica = scanner.nextInt();
		
		
		System.out.println("Defina a classe do seu personagem.");
		System.out.println("Digite 1 para Arquerio.");
		System.out.println("Digite 2 para Guerreiro.");
		System.out.println("Digite 3 para Mago");
		
		System.out.print("Classe do personagem: ");
		int seletor = scanner.nextInt();
		
		switch(seletor) {
		
			case 1:
			
				System.out.println("Classe Arqueiro selecionada.");
				System.out.print("Informe o nível de precisão do arqueiro: ");
				precisao = scanner.nextInt();
			
				personagem = new Arqueiro(nome, pontosDeVida, defesa, defesaMagica, precisao);
				personagem.mostrarStatus();
				personagemSetado = true;
			
				break;
			
			case 2:
			
				System.out.println("Classe Guerreiro selecionada.");
				System.out.print("Informe o nível de forca do guerreiro: ");
				forca = scanner.nextInt();
			
				personagem = new Guerreiro(nome, pontosDeVida, defesa, defesaMagica, forca);
				personagem.mostrarStatus();
				personagemSetado = true;
				
				break;
			
			case 3:
			
				System.out.println("Classe Mago selecionada.");
				System.out.print("Informe o nivel de poder magico do mago: ");
				poderMagico = scanner.nextInt();
			
				personagem = new Mago(nome, pontosDeVida, defesa, defesaMagica, poderMagico);
				personagem.mostrarStatus();
				personagemSetado = true;
			
				break;
			
			default:
				System.out.println("Classe não selecionda.");
				personagemSetado = false;
		
		}
		
		if(personagemSetado) {
			
			
			System.out.println("Definição de Inimigo..");
			
			System.out.print("Informe o valor dos pontos de vida: ");
			pontosDeVida = scanner.nextInt();
			
			System.out.print("Informe o valor dos pontos de defesa: ");
			defesa = scanner.nextInt();
			
			System.out.print("Informe o valor dos pontos de defesa magica: ");
			defesaMagica = scanner.nextInt();

			System.out.println("Defina a classe do inimigo.");
			System.out.println("Digite 1 para Esqueleto.");
			System.out.println("Digite 2 para Zumbi Mago.");
			System.out.println("Digite 3 para Goblin");
			
			System.out.print("Classe do inimigo: ");
			seletor = scanner.nextInt();
			
			switch(seletor) {
			
				case 1:
				
					System.out.println("Classe Esqueleto selecionada.");
					System.out.print("Informe o nível de resistencia óssea: ");
					resistenciaOssea = scanner.nextInt();
				
					inimigo = new Esqueleto(pontosDeVida, defesa, defesaMagica, resistenciaOssea);
					inimigo.mostrarStatus();
					inimigoSetado = true;
				
					break;
				
				case 2:
				
					System.out.println("Classe Zumbi Mago selecionada.");
					System.out.print("Informe o nível de magia sombria: ");
					magiaSombria = scanner.nextInt();
				
					inimigo = new ZumbiMago(pontosDeVida, defesa, defesaMagica, magiaSombria);
					inimigo.mostrarStatus();
					inimigoSetado = true;
				
					break;
				
				case 3:
				
					System.out.println("Classe Goblin selecionada.");
					System.out.print("Informe o nivel de agilidade: ");
					agilidade = scanner.nextInt();
				
					inimigo = new Goblin(pontosDeVida, defesa, defesaMagica, agilidade);
					inimigo.mostrarStatus();
					inimigoSetado = true;
					
					break;
				
				default:
					System.out.println("Classe não selecionda.");
					inimigoSetado = false;
			
			}
			
		}
		
		if(personagemSetado && inimigoSetado) {
			
			Combate combate = new Combate(personagem,inimigo);
			
		}
	
		scanner.close();
		
	}
	


}

