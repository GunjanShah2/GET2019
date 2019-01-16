import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main(){
		
		int qty=0;
		String name=null;
		char ch='y';
		double pr=0.0;
		Item obj = new Item();
		List<Item> items=new ArrayList<Item>();
		List<ShoppingCart> cart=new ArrayList<ShoppingCart>();
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.println("Enter item name, price and available quantity");
			name = sc.nextLine();
			pr = Double.parseDouble(sc.next());
			qty = Integer.parseInt(sc.next());
			
			obj.set(name,pr,qty);
			
			items.add(obj);
			
			System.out.println("Want to add more item (y/n):");
			ch = sc.next().charAt(0);
			
		}while(ch =='Y'|| ch =='y');
		

		do{
			System.out.println("Items in the store : ");
			for(Item item: items)
			{
				System.out.println(item);
			}
			
			
			System.out.println("Want to add more item (y/n):");
			ch = sc.next().charAt(0);
			
		}while(ch =='Y'|| ch =='y');
		
		sc.close();
	}
}