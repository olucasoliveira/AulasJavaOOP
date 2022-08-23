
public class fatura {
	
	int numFat, desconto;
	String descFat;
	int quantItem;
	float precoUnit, valorTotalFat, valorFat;
	
	public int getNumFat() {
		return numFat;
	}
	public void setNumFat(int numFat) {
		this.numFat = numFat;
	}
	public String getDescFat() {
		return descFat;
	}
	public void setDescFat(String descFat) {
		this.descFat = descFat;
	}
	public int getQuantItem() {
		return quantItem;
	}
	public void setQuantItem(int quantItem) {
		this.quantItem = quantItem;
	}
	public float getPrecoUnit() {
		return precoUnit;
	}
	public void setPrecoUnit(float precoUnit) {
		this.precoUnit = precoUnit;
	}
	
	public float calculaFatura() {
		valorFat = quantItem * precoUnit;
		return valorFat;
	}
	
	public float somaFatura(float valorFat) {
		valorTotalFat = valorFat + this.valorFat;	
		return valorTotalFat;
	}
	
	public float aplicaDesconto(int desconto){
		return precoUnit - desconto;
	}
	
	
	

}
