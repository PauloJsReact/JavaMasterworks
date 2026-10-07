package oo.heranca;


public class Jogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.mover(Movimento.FRENTE);
		j1.mover(Movimento.CIMA);
		
		
		
	Tela tela = new Tela();
	
	tela.Tabuleiro(j1.x, j1.y,j1.vida);	
		
		
		
		
	}
	
}
