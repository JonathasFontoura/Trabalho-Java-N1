package personagem;

public class Guerreiro extends Personagem {
	
	private int forca;
	
	public Guerreiro(String nome, int pontosDeVida, int defesa, int defesaMagica, int forca) {
		
		super(nome, pontosDeVida, defesa, defesaMagica);
		this.forca = forca;
		
	}
	
	public int getForca() {
		
		return this.forca;
		
	}
	
	public void setForca(int forca) {
		
		this.forca = forca;
		
	}
	
	@Override
	
	public void mostrarStatus() {
		
		System.out.println("\nNome: " + getNome());
		System.out.println("Classe: " + this.getClass().getSimpleName());
		System.out.println("Pontos de Vida: " + getPontosDeVida());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Defesa Magica: " + getDefesaMagica());
		System.out.println("Forca: " + getForca());
		
	}

}
