package inimigo;

public class Goblin extends Inimigo{
	
private int agilidade;
	
	public Goblin(int pontosDeVida, int defesa, int defesaMagica, int agilidade) {
		
		super(pontosDeVida, defesa, defesaMagica);
		this.agilidade = agilidade;
		
	}
	
	public int getAgilidade() {
		
		return this.agilidade;
		
	}
	
	public void setAgilidade(int agilidade) {
		
		this.agilidade = agilidade;
		
	}
	
	@Override
	
	public void mostrarStatus() {
		
		System.out.println("Classe: " + this.getClass().getSimpleName());
		System.out.println("Pontos de Vida: " + getPontosDeVida());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Defesa Magica: " + getDefesaMagica());
		System.out.println("Poder Magico: " + getAgilidade());
		
	}
	

}
