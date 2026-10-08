package oo.heranca;

public class Estrada {

	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari();
		Uno c2 = new Uno();
		
		c1.controleVelocidade(Acelerador.ACELERAR);
		c1.controleVelocidade(Acelerador.ACELERAR);
		c2.controleVelocidade(Acelerador.ACELERAR);
		
		System.out.println(c1.distancia+","+c1.velocidadeContador);
		System.out.println(c2.distancia+","+c2.velocidadeContador);
			int diferencaDistancia = c1.distancia-c2.distancia;
			
		System.out.println(diferencaDistancia);
	}
}
