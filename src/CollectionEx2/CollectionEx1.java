package CollectionEx2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEx1 {

	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("W");
		al.add("Second");
		al.add("third");
		al.add("third");
		System.out.println("ArrayList--------");
		
		Iterator ai = al.iterator();
		// Iterator 반복자  ai 변수에 담아 iterator 개체에 접근 가능한 개체  
		/*
				Iterator method 
		 hasNext()  ==  읽어올 정보가 있으면 True  없으면 False  Return 
		 next() = 일어올 정보가 있다면 True --> 하여 정보를 가져옴. 
		   		자주 사용하는 프레임 웍 
		*/
		
		while(ai.hasNext()){
			System.out.println(ai.next());
		}
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("forth");
		
		Iterator hi = hs.iterator();
		System.out.println("hashSet----------");
		while(hi.hasNext()){
			System.out.println(hi.next());

		}
	}
}
