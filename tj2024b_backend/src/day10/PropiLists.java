package day10;

public class PropiLists {
	
	private String Id;
	private int Number;
	private String Nic;
	
	// 생성자 를 만들어놔야 사용할수있음
	public PropiLists() {}
	
	
	// 생성자를 2개를 만든이유는 생성하고 초기값을 넣을 수도 있고 나중에 값을 넣을 수도 있기 때문에 
	//생성자를 2개 만들어 놓는것
	public PropiLists(String idString , int Number , String Nic) {
		// 대가로 안에 이 값을 사용할거라는 초기화를 하여 미리 정해놓는다.
		//생성자를 사용하는 이유는 이값을 저장해야하고 사용해야하기 떄문
		this.Id = Id; this.Number = Number; this.Nic = Nic;
	}
	
	
	public String getId() {return Id;}
	public void setId(String Id) {this.Id = Id;}
	
	public int getNumber() {return Number;}
	public void setNumber(int Number) {this.Number = Number;}// set id 두번넣고 있었음
	
	public String getNic() {return Nic;}
	public void setNic(String Nic) {this.Nic = Nic;}
	
	


	@Override
	public String toString() {
		return "PropiLists [Id=" + Id + ", Number=" + Number + ", Nic=" + Nic + "]";
	}
	
	

	
	
	
}
