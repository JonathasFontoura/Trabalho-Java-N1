package personagem;

public class Arqueiro extends Personagem {
	
	private int precisao;

	public Arqueiro(String nome, int pontosDeVida, int defesa, int defesaMagica, int precisao) {
		
		super(nome, pontosDeVida, defesa, defesaMagica);
		this.precisao = precisao;
		
	}
	
	public int getPrecisao() {
		
		return this.precisao;
		
	}

	public void setPrecisao(int precisao) {
		
		this.precisao = precisao;
		
	}
	
	@Override

	public void mostrarStatus() {
	
	System.out.println("\nNome: " + getNome());
	System.out.println("Classe: " + this.getClass().getSimpleName());
	System.out.println("Pontos de Vida: " + getPontosDeVida());
	System.out.println("Defesa: " + getDefesa());
	System.out.println("Defesa Magica: " + getDefesaMagica());
	System.out.println("Precisão: " + this.getPrecisao());
	
	}
}
