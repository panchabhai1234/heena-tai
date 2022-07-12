package seleniumstart;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class collection2 {

	public static void main(String[] args) {
		
		/*ArrayList<Object> al=new ArrayList<>();
		
		al.add("maharashtra");
		al.add('a');
		al.add(123);
		al.add(true);
		al.add(123.123);
		al.add("Velocity");
		al.add(null);
		al.add(123);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(123));
		System.out.println(al.get(1));*/

	{
		ArrayList<Object> a= new ArrayList<>();
		
		a.add("Velocity");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(123.123);
		a.add("Velocity");
		a.add(null);
		a.add(123);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Velocity"));
		System.out.println(a.lastIndexOf("Velocity"));
		System.out.println(a.remove(1));
		System.out.println(a);
		
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		
		
		System.out.println("====================");
		
		
		Iterator it = (Iterator) a.iterator();
		
		while it).hasnext()) //
		{
			System.out.println(it.next());
		}
		System.out.println("====================");
				
		ListIterator ltr = a.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("====================");
		
		for(Object v:a)
		{
			System.out.println(v);
		}
		
		
		ArrayList<Integer>ai= new ArrayList<>();
		
		ai.add(12);
		ai.add(10);
		ai.add(8);
		ai.add(6);
		ai.add(4);
		
		System.out.println(ai);
		
		for(Integer s:ai)
		{
			System.out.println(s);
		}
		
		
		ArrayList<Character> as= new ArrayList<>();
		
		as.add('A');
		as.add('B');
		as.add('C');
		as.add('D');
		as.add('E');
		as.add('F');
		
		System.out.println(as);
		
		for(Character d:as)
		{
			System.out.println(d);
		}
	}

}*/
		
		
		
		
	}

}
