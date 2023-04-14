package Basic;

import java.util.HashSet;

public class DuplicatElementInArrays {

	public static void main(String[] args) {

		String a[] = { "java", "python", "C++", "c", "python", "React", "Java" };
		
		// one method
//		 boolean flag = false;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					System.out.println("Found the duplicate Element :" + a[i]);
//					flag=true;
//				}
//			}
//		}
//		if (flag == false) {
//			System.out.println("Element not found");
//		}
		
		
		// second method
		boolean flag = false;
		HashSet<String> lang = new HashSet();
		for(String l:a) {
			if(lang.add(l)==false){
				System.out.println("Duplicate Element found :"+l);
				flag = true;
			}
		}
		 if(flag==false ){
			 System.out.println("Element not found");
		 }
		

	}

}
