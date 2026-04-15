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

//((Arqueiro) personagem).getPrecisao()
public class Combate {
	
	private final String classePersonagem;
	private final String classeInimigo;
	
	Random doisD6 = new Random();
	
	public Combate(Personagem personagem, Inimigo inimigo) {
		
		classePersonagem = personagem.getClass().getSimpleName();
		classeInimigo = inimigo.getClass().getSimpleName();
	
		System.out.println(((Arqueiro) personagem).getPrecisao());
	}
	
	

}
