
public class Moto extends Veiculo{
	
	@Override
	public double calculaIpva() {
		this.setIpva(super.getValorTabela() * 0.02);
		return this.getIpva();
	}
}
