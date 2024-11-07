import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
	static Map<Integer, Item> map = new HashMap<Integer, Item>();

	static void addItem(Item item) {
		if (map.containsKey(item.id)) 
		{
			throw new Error(item.id +" Already Exists") ;
		}
		else {
		map.put(item.id, item);
		}

	}

	static void display() {
		for (Map.Entry<Integer, Item> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	static void delete(int id) 
	{
		if(map.containsKey(id)) {
			map.remove(id);
		}
		else {
			throw new Error(id+" Id doesn't Exists");
		}
		
	}

	public static void main(String[] args) {

		Item item1 = new Item(101, "vibrator", 20);
		InventoryManagement.addItem(item1);
		Item item2 = new Item(102, "v", 00);
		InventoryManagement.addItem(item2);

		InventoryManagement.display();
//		System.out.println("Enter Id To Delete");
		InventoryManagement.delete(101); 
		InventoryManagement.display();
	}

}
