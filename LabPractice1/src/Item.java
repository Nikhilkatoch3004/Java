
public class Item {
	
	int id ;
	String name ;
	int quantity ;
	
	Item(int id ,String name , int quantity )
	{
		this.id =id ;
		this.name = name ;
		this.quantity=quantity ;
		
		
	}
	
	public String toString(){
		
		return "ID : "+id+" Name : "+name+" Quantity : "+quantity ;
		
	}
	
}
