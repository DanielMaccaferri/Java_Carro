package Inicial;

public class Carro {

	double potencia;
	String nome;
	double velocidade;
	String cor;
    int ano;
	

	void acelerar() {
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade / 2;
		}
	
	double getVelocidade(){
		return velocidade;
	}
	
	void imprimir(){
		System.out.println("O carro " +nome+ " com a cor " +cor+ " do ano " +ano+ " de potencia de " +potencia+ " esta a " +getVelocidade()+"KM/h");
	}

}
