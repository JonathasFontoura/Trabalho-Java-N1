package inimigo;

public class Esqueleto extends Inimigo{

	private int resistenciaOssea;
	
	public Esqueleto(int pontosDeVida, int defesa, int defesaMagica, int resistenciaOssea) {
		
		super(pontosDeVida, defesa, defesaMagica);
		this.resistenciaOssea = resistenciaOssea;
		
	}
	
	public int getResistenciaOssea() {
		
		return this.resistenciaOssea;
		
	}
	
	public void setResistenciaOssea(int resistenciaOssea) {
		
		this.resistenciaOssea = resistenciaOssea;
		
	}
	
	@Override
	
	public void mostrarStatus() {
		
		System.out.println("Classe: " + this.getClass().getSimpleName());
		System.out.println("Pontos de Vida: " + getPontosDeVida());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Defesa Magica: " + getDefesaMagica());
		System.out.println("Poder Magico: " + getResistenciaOssea());
		
	}
	
}
