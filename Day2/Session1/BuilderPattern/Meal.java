package builder;
import java.util.ArrayList;
import java.util.List;
public class Meal {
	List<Item> list=new ArrayList<Item>();
	public void addItem(Item item) {
		list.add(item);
	}
	public float getCost() {
		float cost=0.0f;
		for(Item item:list) {
			cost+=item.price();
		}
		return cost;
	}
	public void showItem() {
		for(Item item:list) {
			System.out.println("Item : "+item.name());
			System.out.println("Packing : "+item.packing());
			System.out.println("Price : "+item.price());
		}
	}
}
