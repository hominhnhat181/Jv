package DOANJAVA;

import java.io.*;
import java.util.*;

public class blueberry extends Pepsi implements Juice  {
	Scanner sc = new Scanner(System.in);
	
	public void add(List<Foods> list) {
		System.out.print("input new name Food: ");
		String name = sc.nextLine();
		System.out.print("input new price: ");
		int price = sc.nextInt();
		
		Foods f = new Foods(name, price);
		list.add(f);
	}
	public void display(List<Foods> list) {
		for(Foods o: list)
		o.inAn();
	}
	public void search(List<Foods> list, String name) {
		for(Foods o : list)
			if(o.getName() != null && o.getName().equalsIgnoreCase(name))
				o.inAn();
	}
	public void remove(List<Foods> list, int index) {
		for (int j = 0; j <= list.size(); j++) {
			if(j == index) {
				list.remove(j);
				break;
			}
		}
	}
	public void edit(List<Foods> list, int index) {
		for (int j = 0; j < list.size(); j++) {
			if(j == index) {
				System.out.print("input new name Food: ");
				String name = sc.nextLine();
				System.out.print("input new price: ");
				int price = sc.nextInt();
				list.get(j).setName(name);
				list.get(j).setPrice(price);
				break;			
			}
		}
	}
	public void save(List<Foods> list) {
		try {
				FileOutputStream fout = new FileOutputStream("D:\\Java\\save.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				out.writeObject(list);
				out.close();
				fout.close();
				System.out.println("Completed save");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
