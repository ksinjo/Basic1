package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main (String []args){
	HashSet<String> A = new HashSet<String>();
	A.add("a");
	A.add("b");
	A.add("c");
	
	HashSet<String> B = new HashSet<String>();
	B.add("c");
	B.add("d");
	B.add("e");
	
	HashSet<String> C = new HashSet<String>();
	C.add("A");
	C.add("B");

	
	System.out.println(A.containsAll(B));
	
	//A.addAll(B);합집합
//	A.retainAll(B);
	B.removeAll(A);
	Iterator hi = A.iterator();
	while(hi.hasNext()){
		System.out.println(hi.next());
	}
}
}