package batalha;

import java.util.Scanner;

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
	public static boolean batalha;
	
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
		
		System.out.println("Definição de personagens...\n===================================\n");
		
		System.out.print("Digite o nome do personagem: ");
		nome = scanner.next();
		
		System.out.print("Informe o valor dos pontos de vida: ");
		pontosDeVida = scanner.nextInt();
		
		System.out.print("Informe o valor dos pontos de defesa: ");
		defesa = scanner.nextInt();
		
		System.out.print("Informe o valor dos pontos de defesa magica: ");
		defesaMagica = scanner.nextInt();
		
		
		System.out.println("\n\nDefina a classe do seu personagem.\n");
		System.out.println("Digite 1 para Arquerio.");
		System.out.println("Digite 2 para Guerreiro.");
		System.out.println("Digite 3 para Mago");
		
		System.out.print("Classe do personagem: ");
		int seletor = scanner.nextInt();
		
		switch(seletor) {
		
			case 1:
			
				System.out.println("\n===================================\nClasse Arqueiro selecionada.");
				System.out.print("\nInforme o nível de precisão do arqueiro: ");
				precisao = scanner.nextInt();
			
				personagem = new Arqueiro(nome, pontosDeVida, defesa, defesaMagica, precisao);
				personagem.mostrarStatus();
				personagemSetado = true;
			
				break;
			
			case 2:
			
				System.out.println("\n===================================\nClasse Guerreiro selecionada.");
				System.out.print("\nInforme o nível de forca do guerreiro: ");
				forca = scanner.nextInt();
			
				personagem = new Guerreiro(nome, pontosDeVida, defesa, defesaMagica, forca);
				personagem.mostrarStatus();
				personagemSetado = true;
				
				break;
			
			case 3:
			
				System.out.println("\n===================================\nClasse Mago selecionada.");
				System.out.print("\nInforme o nivel de poder magico do mago: ");
				poderMagico = scanner.nextInt();
			
				personagem = new Mago(nome, pontosDeVida, defesa, defesaMagica, poderMagico);
				personagem.mostrarStatus();
				personagemSetado = true;
			
				break;
			
			default:
				System.out.println("\n===================================\nClasse não selecionda.");
				personagemSetado = false;
		
		}
		
		if(personagemSetado) {
			
			
			System.out.println("\n===================================\nDefinição de Inimigo...\n===================================\n");
			
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
				
					System.out.println("\n===================================\nClasse Esqueleto selecionada.");
					System.out.print("\nInforme o nível de resistencia óssea: ");
					resistenciaOssea = scanner.nextInt();
				
					inimigo = new Esqueleto(pontosDeVida, defesa, defesaMagica, resistenciaOssea);
					inimigo.mostrarStatus();
					inimigoSetado = true;
					batalha = true;
				
					break;
				
				case 2:
				
					System.out.println("\n===================================\nClasse Zumbi Mago selecionada.");
					System.out.print("\nInforme o nível de magia sombria: ");
					magiaSombria = scanner.nextInt();
				
					inimigo = new ZumbiMago(pontosDeVida, defesa, defesaMagica, magiaSombria);
					inimigo.mostrarStatus();
					inimigoSetado = true;
					batalha = true;
				
					break;
				
				case 3:
				
					System.out.println("\n===================================\nClasse Goblin selecionada.");
					System.out.print("\nInforme o nivel de agilidade: ");
					agilidade = scanner.nextInt();
				
					inimigo = new Goblin(pontosDeVida, defesa, defesaMagica, agilidade);
					inimigo.mostrarStatus();
					inimigoSetado = true;
					batalha = true;
					
					break;
				
				default:
					System.out.println("\n===================================\nClasse não selecionda.");
					inimigoSetado = false;
			
			}
			
		}
		
		if(personagemSetado && inimigoSetado) {
			
			Combate combate = new Combate(personagem,inimigo);
			
			do{
			
				if(personagem.getPontosDeVida() > 0) {
				
					System.out.println("\nRolagem de ataque de " + personagem.getNome() + ".");
					combate.rolagemDeAtaque();
			
					if(combate.getAtaque() >= combate.getDefesa()) {
				
						System.out.println("\nO ataque foi bem sucedido.");
						combate.rolagemDanoAtaque();
				
						System.out.println("\nStatus do Inimigo:");
						inimigo.mostrarStatus();
				
					}
					else {
				
						System.out.println("\nO ataque falhou.");
				
					}
					
				}	
				
				if(inimigo.getPontosDeVida() > 0) {
			
					System.out.println("\nRolagem de contra-ataque.");
					combate.rolagemContraAtaque();
			
					if(combate.getAtaque() >= combate.getDefesa()) {
				
						System.out.println("\nO contra-ataque inimigo foi bem sucedido.");
						combate.rolagemDanoContraAtaque();
				
						System.out.println("\nStatus de " + personagem.getNome());
						personagem.mostrarStatus();
				
					}
					else {
				
						System.out.println("\n" + personagem.getNome() + " defendeu o contra-ataque.");
				
					}
				
				}	
					
				if(personagem.getPontosDeVida() == 0 || inimigo.getPontosDeVida() == 0) {
					
					if(personagem.getPontosDeVida() == 0) {
						
						System.out.println("\n\n" + personagem.getNome() + " foi derrotado.");
						
						
					}
					
					if(inimigo.getPontosDeVida() == 0) {
						
						System.out.println("\n\n" + personagem.getNome() + " venceu a batalha.");
						
					}
					
					batalha = false;
					
				}				
					
			}while(batalha);
		
			scanner.close();
		
		}
	
	}

}

