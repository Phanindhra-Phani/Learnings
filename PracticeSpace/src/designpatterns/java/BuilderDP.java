package designpatterns.java;

public class BuilderDP {

	//mandatory fields
	private String HDD;
	private String RAM;
	
	//Optional Fields
	private boolean isGraphicCardEnabled;
	private boolean isBlueToothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	public boolean isBlueToothEnabled() {
		return isBlueToothEnabled;
	}
	
	private BuilderDP(ComputerBuilder computerBuilder){

		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isBlueToothEnabled = computerBuilder.isBlueToothEnabled;
		this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
		
	}
	
	public static class ComputerBuilder{
		
		//mandatory fields
		private String HDD;
		private String RAM;
		
		//Optional Fields
		private boolean isGraphicCardEnabled;
		private boolean isBlueToothEnabled;
		
		public ComputerBuilder(String HDD, String RAM){
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public void setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
		}

		public void setBlueToothEnabled(boolean isBlueToothEnabled) {
			this.isBlueToothEnabled = isBlueToothEnabled;
		}
		
		public BuilderDP build(){
			return new BuilderDP(this);
		}
		
	}
	
}
