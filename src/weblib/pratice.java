package weblib;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class pratice {
	
	
public static  void lst() {

	//HashMap<String, String> m = new HashMap<String, String>();
	HashMap m  =new HashMap();
	m.put("1", "sri");
	m.put(2, "kanth");
	m.put(3, "Reedy");
	m.put(4, "ch");
	

	
	
	Object xx =m.get("1");
	System.out.println(xx );
	
	boolean value = m.containsKey(2);
	if(value==true) {
		System.out.println(value);
		
		
		System.out.println(xx );
	}else {
		System.out.println(value);
	}
	
	
	
	
	/*Set t=m.entrySet();
	Iterator r =t.iterator();
	
	
	
	
	while(r.hasNext()) {
		Object e =r.next();
		System.out.println(e);
		
	}
	*/
	

}

public static void main (String arg[]) {
	pratice n = new pratice();
	n.lst();
			

}
}
