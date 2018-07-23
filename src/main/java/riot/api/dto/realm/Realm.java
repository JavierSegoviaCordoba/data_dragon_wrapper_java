package riot.api.dto.realm;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Realm{

	@JsonProperty("dd")
	private String dd;

	@JsonProperty("css")
	private String css;

	@JsonProperty("v")
	private String V;

	@JsonProperty("lg")
	private String lg;

	@JsonProperty("profileiconmax")
	private int profileiconmax;

	@JsonProperty("store")
	private Object store;

	@JsonProperty("l")
	private String L;

	@JsonProperty("cdn")
	private String cdn;

	@JsonProperty("n")
	private N N;

	public void setDd(String dd){
		this.dd = dd;
	}

	public String getDd(){
		return dd;
	}

	public void setCss(String css){
		this.css = css;
	}

	public String getCss(){
		return css;
	}

	public void setV(String V){
		this.V = V;
	}

	public String getV(){
		return V;
	}

	public void setLg(String lg){
		this.lg = lg;
	}

	public String getLg(){
		return lg;
	}

	public void setProfileiconmax(int profileiconmax){
		this.profileiconmax = profileiconmax;
	}

	public int getProfileiconmax(){
		return profileiconmax;
	}

	public void setStore(Object store){
		this.store = store;
	}

	public Object getStore(){
		return store;
	}

	public void setL(String L){
		this.L = L;
	}

	public String getL(){
		return L;
	}

	public void setCdn(String cdn){
		this.cdn = cdn;
	}

	public String getCdn(){
		return cdn;
	}

	public void setN(N N){
		this.N = N;
	}

	public N getN(){
		return N;
	}

	@Override
 	public String toString(){
		return 
			"Realm{" + 
			"dd = '" + dd + '\'' + 
			",css = '" + css + '\'' + 
			",v = '" + V + '\'' + 
			",lg = '" + lg + '\'' + 
			",profileiconmax = '" + profileiconmax + '\'' + 
			",store = '" + store + '\'' + 
			",l = '" + L + '\'' + 
			",cdn = '" + cdn + '\'' + 
			",n = '" + N + '\'' + 
			"}";
		}
}