package Inicial;


public class Principal {
	
	public static void main(String[] args){
		
		Carro car1 = new Carro();
		car1.nome = "mustang";
		car1.cor = "vermelho";
		car1.ano = 2017;
		car1.potencia = 200;
		car1.velocidade = 20;
		
		car1.acelerar();
		car1.acelerar();
		car1.frear();
		car1.frear();
		
		Carro car2 = new Carro();
		car2.nome = "Fusca";
		car2.potencia = 50;
		car2.velocidade = 100;
		
		

		car1.imprimir();
		car2.imprimir();
		
	}
	

}
