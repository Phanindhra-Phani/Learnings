package pojos;

import java.beans.Transient;
import java.io.Serializable;

public class Employee implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name;
	public String cityName;
	public String dummyName;
	
	public final String dum="Phani";
	
	static public transient String country;
	
	
	static public String CEOName = "Sravan Kumar";
	
	public String getDum() {
		return dum;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public static String getCEOName() {
		return CEOName;
	}
	public static void setCEOName(String cEOName) {
		CEOName = cEOName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getDummyName() {
		return dummyName;
	}
	public void setDummyName(String dummyName) {
		this.dummyName = dummyName;
	}
	
	@Override
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
	
}
