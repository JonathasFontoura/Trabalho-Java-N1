package batalha;

import java.util.Random;

import personagem.Personagem;
import personagem.Arqueiro;
import personagem.Guerreiro;
import personagem.Mago;
import inimigo.Inimigo;
import inimigo.Esqueleto;
import inimigo.ZumbiMago;
import inimigo.Goblin;

public class Combate {
	
	private final String classePersonagem;
	private final String classeInimigo;
	private Personagem personagem;
	private Inimigo inimigo;
	private int ataque;
	private int defesa;

	private Random doisD6 = new Random();
	
	public Combate(Personagem personagem, Inimigo inimigo) {
		
		this.personagem = personagem;
		this.inimigo = inimigo;
	
		this.classePersonagem = personagem.getClass().getSimpleName();
		this.classeInimigo = inimigo.getClass().getSimpleName();
		
	}
	
	public int getAtaque() {
		
		return this.ataque;
		
	}
	
	public int getDefesa() {
		
		return this.defesa;
		
	}
	
	public void rolagemDeAtaque() {
		
		int roll;
		int defesaOuDefesaMagica;
		String textoDefesa;
		
		switch(classePersonagem) {
			
		case "Arqueiro":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((Arqueiro)personagem).getPrecisao() + " (precisao) = ");
			this.ataque = roll + ((Arqueiro)personagem).getPrecisao();
			System.out.println(this.ataque);
			
			break;
			
		case "Guerreiro":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((Guerreiro)personagem).getForca() + " (força) = ");
			this.ataque = roll + ((Guerreiro)personagem).getForca();
			System.out.println(this.ataque);
			
			break;
			
		case "Mago":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((Mago)personagem).getPoderMagico() + " (poder mágico) = ");
			this.ataque = roll + ((Mago)personagem).getPoderMagico();
			System.out.println(this.ataque);
			
			break;
			
		}

			
		roll = doisD6.nextInt(2, 12);
		defesaOuDefesaMagica = (classePersonagem.equals("Mago")) ? inimigo.getDefesaMagica() : inimigo.getDefesa();
		textoDefesa = (classePersonagem.equals("Mago")) ? inimigo.getDefesaMagica() + " (defesa mágica) = " : inimigo.getDefesa() + " (defesa) = ";
			
		System.out.print(">>> DEFESA:" + roll + " (2d6) + " + textoDefesa);
		this.defesa = roll + defesaOuDefesaMagica;
		System.out.println(this.defesa);
		
	}
	
	public void rolagemDanoAtaque() {
		
		System.out.println("Rolagem de dano de ataque");
		
		int roll = doisD6.nextInt(1, 6);
		int dano = roll + this.ataque - this.defesa;
		int pontosDeVida = inimigo.getPontosDeVida();
		
		if(pontosDeVida - dano < 0) {
			
			inimigo.setPontosDeVida(0);
			
		}else {
			
			inimigo.setPontosDeVida(pontosDeVida - dano);
			
		}
		
		System.out.println("\n>>> DANO: " + roll + " (2d6) + " + this.ataque + " (ataque) - " + this.defesa + " (defesa) = " + dano + " (dano)");
		System.out.println(">>> PONTOS DE VIDA: " + pontosDeVida + " (vida anterior) - " + dano + " (dano) = " + inimigo.getPontosDeVida() + " (vida atual)");
		
		
	}
	
	public void rolagemContraAtaque() {
		
		int roll;
		int defesaOuDefesaMagica;
		String textoDefesa;
		
		switch(classeInimigo) {
			
		case "Esqueleto":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((Esqueleto)inimigo).getResistenciaOssea() + " (resistência óssea) = ");
			this.ataque = roll + ((Esqueleto)inimigo).getResistenciaOssea();
			System.out.println(this.ataque);
			
			break;
			
		case "ZumbiMago":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((ZumbiMago)inimigo).getMagiaSombria() + " (magia sombria) = ");
			this.ataque = roll + ((ZumbiMago)inimigo).getMagiaSombria();
			System.out.println(this.ataque);
			
			break;
			
		case "Goblin":
			
			roll = doisD6.nextInt(2, 12);
			System.out.print("\n>>> ATAQUE:" + roll + " (2d6) + " + ((Goblin)inimigo).getAgilidade() + " (agilidade) = ");
			this.ataque = roll + ((Goblin)inimigo).getAgilidade();
			System.out.println(this.ataque);
			
			break;
			
		}
			
		roll = doisD6.nextInt(2, 12);
		defesaOuDefesaMagica = (classeInimigo.equals("ZumbiMago")) ? personagem.getDefesaMagica() : personagem.getDefesa();
		textoDefesa = (classePersonagem.equals("ZumbiMago")) ? personagem.getDefesaMagica() + " (defesa mágica) = " : personagem.getDefesa() + " (defesa) = ";
			
		System.out.print(">>> DEFESA:" + roll + " (2d6) + " + textoDefesa);
		this.defesa = roll + defesaOuDefesaMagica;
		System.out.println(this.defesa);
		
	}
	
	public void rolagemDanoContraAtaque() {
		
		System.out.println("Rolagem de dano de contra-ataque");
		
		int roll = doisD6.nextInt(1, 6);
		int dano = roll + this.ataque - this.defesa;
		int pontosDeVida = personagem.getPontosDeVida();
		
		if(pontosDeVida - dano < 0) {
			
			personagem.setPontosDeVida(0);
			
		}else {
			
			personagem.setPontosDeVida(pontosDeVida - dano);
			
		}
		
		
		System.out.println("\n>>> DANO: " + roll + " (2d6) + " + this.ataque + " (ataque) - " + this.defesa + " (defesa) = " + dano + " (dano)");
		System.out.println(">>> PONTOS DE VIDA: " + pontosDeVida + " (vida anterior) - " + dano + " (dano) = " + personagem.getPontosDeVida() + " (vida atual)");
		
		
	}
	

}
