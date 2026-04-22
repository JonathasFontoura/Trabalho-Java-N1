package personagem;

public class Mago extends Personagem{
	
	private int poderMagico;
	
	public Mago(String nome, int pontosDeVida, int defesa, int defesaMagica, int poderMagico) {
		
		super(nome, pontosDeVida, defesa, defesaMagica);
		this.poderMagico = poderMagico;
		
	}
	
	public int getPoderMagico() {
		
		return this.poderMagico;
		
	}
	
	public void setPoderMagico(int poderMagico) {
		
		this.poderMagico = poderMagico;
		
	}
	
	@Override
	
	public void mostrarStatus() {
		
		System.out.println("\nNome: " + getNome());
		System.out.println("Classe: " + this.getClass().getSimpleName());
		System.out.println("Pontos de Vida: " + getPontosDeVida());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Defesa Magica: " + getDefesaMagica());
		System.out.println("Poder Magico: " + getPoderMagico());
		
	}

}
