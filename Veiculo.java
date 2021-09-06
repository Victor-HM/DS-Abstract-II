
public abstract class Veiculo {
	private String Modelo;
	private double valorTabela;
	private String Cor;
	private String Combustivel;
	private double ipva;
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public double getValorTabela() {
		return valorTabela;
	}
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	public abstract double calculaIpva();
	
	public void imprimirFicha() {
		System.out.println("Seu modelo: " + this.getModelo());
		System.out.println("Valor: " + this.getValorTabela());
		System.out.println("Combustivel: " + this.getCombustivel());
		System.out.println("Sua cor: " + this.getCor());
		System.out.println("Valor do IPVA: " + this.calculaIpva());
		System.out.println("-------------------------------------------");
	}
	
	
}
