
public class Carro extends Veiculo{

	@Override
	public double calculaIpva() {
		this.setIpva(super.getValorTabela() * 0.04);
		return this.getIpva();
	}
	
}
