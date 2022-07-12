package seleniumstart;

import java.util.ArrayList;

public class collection1 {

	public static void main(String[] args) {

ArrayList<Object> a= new ArrayList<>();
		
		a.add("heena");
		a.add('B');
		a.add(456);
		a.add(true);
		a.add(456.456);
		a.add("heena");
		a.add(null);
		a.add(456);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size();
		System.out.println(a.isEmpty());
		System.out.println(a.contains(456));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(456));
		System.out.println(a.indexOf("heena"));
		System.out.println(a.lastIndexOf("heena"));
		System.out.println(a.remove(1));
		System.out.println(a);
		
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
	

	}

}
}
