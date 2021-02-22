package DOANJAVA;

import java.util.*;
import java.io.*;

public class deser {
public static void main(String[] agrs) throws Exception{
	Scanner sc = new Scanner(System.in);
	List<Foods> list = new ArrayList<Foods>();
	while(true) {
		System.out.println("Input choise: ");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
			case 1:
				try {
					FileInputStream fin = new FileInputStream("D:\\Java\\save.txt");
					ObjectInputStream in1 = new ObjectInputStream(fin);
					list = (List)in1.readObject(); // OK
					Collections.sort(list, new Comparator<Foods>() { 
				    	 public int compare(Foods x1, Foods x2) {
				    		 return x1.getPrice() > x2.getPrice() ? 1 : -1;		
				    	 }
				    });		
					System.out.println("ascending by price: "); // tang dan
					for(Foods o : list)o.inAn();
					in1.close();
					fin.close();
				}catch(IOException e) {
					e.printStackTrace();
					return;
				}
				break;
			case 2:
				try {
					FileInputStream fin = new FileInputStream("D:\\Java\\save.txt");
					ObjectInputStream in1 = new ObjectInputStream(fin);
					list 											= (List)in1.readObject();
					Collections.sort(list, new Comparator<Foods>() { 
				    	 public int compare(Foods x1, Foods x2) {
				    		 return x1.getPrice() > x2.getPrice() ? -1 : 1;	
				    	 }
				    });		
					System.out.println("descending by price: "); // giam dan
					for(Foods o : list)o.inAn();
					in1.close();
					fin.close();
				}catch(IOException e) {
					e.printStackTrace();
					return;
				}
				break;
			case 3: // nhung mon co gia tien <= gia tien khach hang yeu cau
				try {
					System.out.println("Input price for foods: ");
					FileInputStream fin = new FileInputStream("D:\\Java\\save.txt");
					ObjectInputStream in1 = new ObjectInputStream(fin);
					list = (List)in1.readObject();
					Collections.sort(list, new Comparator<Foods>() { 
				    	 public int compare(Foods x1, Foods x2) {
				    		 return x1.getPrice() > x2.getPrice() ? -1 : 1;	
				    	 }
				    });		
					int order  = Integer.parseInt(sc.nextLine());
					System.out.println("descending at set prices: ");
					for(Foods o : list)
						if(o.price <= order)
						o.inAn();
					in1.close();
					fin.close();
				}catch(IOException e) {
					e.printStackTrace();
					return;
				}
				break;
			case 0:
				System.exit(0);
				break;
			}
		}	
	}
}