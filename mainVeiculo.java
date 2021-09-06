
public class mainVeiculo {

	public static void main(String[] args) {
		//Carro 1
		Carro carro1 = new Carro();
		carro1.setModelo("Chevrolet Corvette");
		carro1.setValorTabela(850000);
		carro1.setCor("Branco");
		carro1.setCombustivel("Gasolina");
		
		//Carro 2
		Carro carro2 = new Carro();
		carro2.setModelo("Bmw 320i");
		carro2.setValorTabela(153290);
		carro2.setCor("Cinza");
		carro2.setCombustivel("Flex");
		
		//moto 1
		Carro moto1 = new Carro();
		moto1.setModelo("Honda Gold Wing 1800 GL");
		moto1.setValorTabela(112000);
		moto1.setCor("Preto");
		moto1.setCombustivel("Gasolina");
		
		//moto 2
		Carro moto2 = new Carro();
		moto2.setModelo("CBR 650R");
		moto2.setValorTabela(45760);
		moto2.setCor("Azul escuro");
		moto2.setCombustivel("Gasolina");
		
		//Impressão
		carro1.imprimirFicha();
		carro2.imprimirFicha();
		moto1.imprimirFicha();
		moto2.imprimirFicha();
		
		

	}

}
