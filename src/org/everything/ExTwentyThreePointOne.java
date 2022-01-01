package org.everything;

import java.util.LinkedList;
import java.util.List;

public class ExTwentyThreePointOne {
	
	public static void main(String[] args) {
		
		ExTwentyThree ew = new ExTwentyThree();
		ew.setEmpId(11);
		ew.setEmpName("Hari");
		ew.setPhoneNum(996245);
		
		ExTwentyThree ew1 = new ExTwentyThree();
		ew1.setEmpId(22);
		ew1.setEmpName("Mani");
		ew1.setPhoneNum(00101101);
		
		ExTwentyThree ew2 = new ExTwentyThree();
		ew2.setEmpId(33);
		ew2.setEmpName("Vicky");
		ew2.setPhoneNum(98745612);
		
		List<ExTwentyThree> li = new LinkedList<ExTwentyThree>();
		li.add(ew);
		li.add(ew1);
		li.add(ew2);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getPhoneNum());
		}
 		
	}

}
