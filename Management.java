package DOANJAVA;

import java.util.*;

public class Management {
	public static void main(String[] args) {
		System.out.println("1: display");
		System.out.println("2: add");
		System.out.println("3: remove");
		System.out.println("4: edit");
		System.out.println("5: search");
		System.out.println("6: save");
		
		Scanner sc = new Scanner(System.in);
		
		Juice b = new blueberry();  //upcasting
		Pepsi c = new blueberry();	//upcasting
		
		List<Foods> list = new ArrayList<Foods>();
		// attribute origin
		list.add(new Foods("Bun bo", 5)); 
		list.add(new Foods("Banh my", 2));
		list.add(new Foods("Pho", 3));
		list.add(new Foods("Xoi", 2));
		while(true) {
			int index;
			String id;
			System.out.println("Input choise: ");
			int choice = Integer.parseInt(sc.nextLine());
			System.out.println();
			switch(choice) {
				case 1:
					System.out.println("List menu:");
					c.display(list);
					System.out.println();
					break;
				case 2:
					c.add(list);
					System.out.println();
					break;
				case 3:
					c.display(list);
					System.out.println("input remove index: ");
					index = Integer.parseInt(sc.nextLine());
					b.remove(list, index); // danh sach bat dau bang 0
					System.out.println();
					break;
				case 4:
					c.display(list);
					System.out.println("input edit index: ");
					index = Integer.parseInt(sc.nextLine());
					b.edit(list, index);
					System.out.println();
					break;
				case 5:
					System.out.println("input search name: ");
					id = sc.nextLine();
					System.out.println("The Food you are looking for:");
					c.search(list, id);
					System.out.println();
					break;
				case 6:
					b.save(list);
					break;
				case 0:
				System.exit(0);
			}	
		}
	}
}
