package oo.heranca;

public class Tela {

	int tamanho =8;
	
boolean Tabuleiro (int jogador1x,int jogador1y,int jogador1vida, int jogador2x,int jogador2y,int jogador2vida ) {
	System.out.println("Vida jogador A : "+jogador1vida+"\nVida jogador B :"+jogador2vida);
		for (int linha  = 0; linha < tamanho ; linha ++ ) {
			for(int coluna=0; coluna < tamanho; coluna++) {
				if (linha == jogador1x && coluna==jogador1y) {
					System.out.print("[ A ]");
				}else if (linha == jogador2x && coluna==jogador2y) {
					System.out.print("[ b ]");
				}else if ((linha+coluna)%2==0) {
					System.out.print("[  ]");
				}else {
					 System.out.print("[ 0 ]");
				}
			}
			  System.out.println();	
			}
			
		return true;
		
	}
}
