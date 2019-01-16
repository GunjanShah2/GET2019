
public class Item {

	String item_name;
	double price;
	int avail_qty;
	
	public void set(String name, double pr, int qty)
	{
		item_name = name;
		price = pr;
		avail_qty = qty;
	}
}