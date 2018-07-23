package riot.api.dto.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Gold{

	@JsonProperty("total")
	private int total;

	@JsonProperty("purchasable")
	private boolean purchasable;

	@JsonProperty("sell")
	private int sell;

	@JsonProperty("base")
	private int base;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setPurchasable(boolean purchasable){
		this.purchasable = purchasable;
	}

	public boolean isPurchasable(){
		return purchasable;
	}

	public void setSell(int sell){
		this.sell = sell;
	}

	public int getSell(){
		return sell;
	}

	public void setBase(int base){
		this.base = base;
	}

	public int getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"Gold{" + 
			"total = '" + total + '\'' + 
			",purchasable = '" + purchasable + '\'' + 
			",sell = '" + sell + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}