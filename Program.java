package java_practice;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	
	
	public static void main(String[] args) {
		List<ProgramVO> programList = new ArrayList<ProgramVO>();
		ProgramController cont = new ProgramController();
		
		boolean energy = true;
		while(energy) {
			
			System.out.println("1)�Է� 2)��� 3)�˻� 4)���� 5)���� 6)����");
			int choice = cont.scan.nextInt();
			switch(choice) {
			case 1 : cont.addList(programList); break;
			case 2 : cont.outList(programList); break;
			case 3 : cont.searchList(programList); break;
			case 4 : cont.modifyList(programList); break;
			case 5 : cont.deleteList(programList); break;
			case 6 : 
				System.out.println("�����մϴ�.");
				energy = false;
			}
		}
	}
}
