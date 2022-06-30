package java_practice;

import java.util.List;
import java.util.Scanner;

public class ProgramController {
	Scanner scan = new Scanner(System.in);
	public void addList(List<ProgramVO> list) {
		System.out.println("프로그램 이름을 입력하세요.");
		String title = scan.next();
		System.out.println("가수 이름을 입력하세요.");
		String singer = scan.next();
		System.out.println("장르 이름을 입력하세요.");
		String genre = scan.next();
		
		list.add(new ProgramVO(title, singer, genre));
	}
	
	public void outList(List<ProgramVO> list) {
		for(ProgramVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void searchList(List<ProgramVO> list) {
		System.out.println("검색할 프로그램 이름을 입력하세요.");
		String title = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				System.out.println(list.get(i));
			}
		}
	}
	
	
	public void modifyList(List<ProgramVO> list) {
		System.out.println("수정할 프로그램 이름을 입력하세요.");
		String title = scan.next();
		for(ProgramVO vo : list) {
			if(vo.getTitle().equals(title)) {
				System.out.println("변경할 이름을 입력하세요.");
				vo.setTitle(scan.next());
			}
		}
	}
	
	public void deleteList(List<ProgramVO> list) {
		System.out.println("삭제할 프로그램 이름을 입력하세요.");
		String title = scan.next();
		for(ProgramVO vo : list) {
			if(vo.getTitle().equals(title)) {
				list.remove(list.indexOf(vo));
			}
		}
	}
}
