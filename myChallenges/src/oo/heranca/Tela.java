package oo.heranca;

public class Tela {

	int tamanho =8;
	
boolean Tabuleiro (int x,int y,int vida) {
	System.out.println("Vida : "+vida);
		for (int linha  = 0; linha < tamanho ; linha ++ ) {
			for(int coluna=0; coluna < tamanho; coluna++) {
				if (linha == x && coluna==y) {
					System.out.print("[ A ]");
				}else if ((linha+coluna)%2==0) {
					System.out.print("[  ]");
				}else {
					 System.out.print("[ x ]");
				}
			}
			  System.out.println();	
			}
			
		return true;
		
	}
}
