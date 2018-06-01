package generics;

public class MyGenerics <S>{

	S name;
	
	public void add(S name){
		this.name = name;
	}
	
	public S getName(){
		return name;
	}
}
