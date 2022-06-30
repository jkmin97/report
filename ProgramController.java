package java_practice;

import java.util.List;
import java.util.Scanner;

public class ProgramController {
	Scanner scan = new Scanner(System.in);
	public void addList(List<ProgramVO> list) {
		System.out.println("���α׷� �̸��� �Է��ϼ���.");
		String title = scan.next();
		System.out.println("���� �̸��� �Է��ϼ���.");
		String singer = scan.next();
		System.out.println("�帣 �̸��� �Է��ϼ���.");
		String genre = scan.next();
		
		list.add(new ProgramVO(title, singer, genre));
	}
	
	public void outList(List<ProgramVO> list) {
		for(ProgramVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void searchList(List<ProgramVO> list) {
		System.out.println("�˻��� ���α׷� �̸��� �Է��ϼ���.");
		String title = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				System.out.println(list.get(i));
			}
		}
	}
	
	
	public void modifyList(List<ProgramVO> list) {
		System.out.println("������ ���α׷� �̸��� �Է��ϼ���.");
		String title = scan.next();
		for(ProgramVO vo : list) {
			if(vo.getTitle().equals(title)) {
				System.out.println("������ �̸��� �Է��ϼ���.");
				vo.setTitle(scan.next());
			}
		}
	}
	
	public void deleteList(List<ProgramVO> list) {
		System.out.println("������ ���α׷� �̸��� �Է��ϼ���.");
		String title = scan.next();
		for(ProgramVO vo : list) {
			if(vo.getTitle().equals(title)) {
				list.remove(list.indexOf(vo));
			}
		}
	}
}
