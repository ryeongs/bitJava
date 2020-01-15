package collection_Assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

//번호, 이름, 국어, 영어, 수학 
public class SungJukService {
	Scanner sc = new Scanner(System.in);
	ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. 입력");
			System.out.println("  2. 출력");
			System.out.println("  3. 검색");
			System.out.println("  4. 삭제");
			System.out.println("  5. 정렬");
			System.out.println("  6. 종료");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = sc.nextInt();
			if (num == 6)
				break;

			if (num == 1)
				this.insertArticle(); // 내 클래스 안에 잇는 함수를 사용
			else if (num == 2)
				this.printArticle();
			else if (num == 3)
				this.searchArticle();
			else if (num == 4)
				this.deleteArticle();
			else if (num == 5)
				this.sortArticle();

		} // while
	}

	private void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.println("----------------------");
		System.out.print("이름 입력 : ");
		dto.setName(sc.next());
		System.out.print("번호 입력 : ");
		dto.setNum(sc.nextInt());
		System.out.print("국어  입력 : ");
		dto.setKor(sc.nextInt());
		System.out.print("영어  입력 : ");
		dto.setEng(sc.nextInt());
		System.out.print("수학 입력");
		dto.setMath(sc.nextInt());
		dto.calc();
		list.add(dto);
	}

	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어 \t수학\t총점\t평균 ");
		for (SungJukDTO dto : list) {
			System.out.println(dto);
		}
	}

	public void searchArticle() {
		System.out.println("찾으실 분 이름 입력:");
		String name = sc.next();
		int i;
		int count = 0;
		for (SungJukDTO dto : list) {
			if (dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}
		if (count == 0)
			System.out.println("찾는 회원이 없습니다");
	}

	public void deleteArticle() {
		System.out.println("삭제할 이름 입력:");
		String name = sc.next();
		int count = 0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();

			if (dto.getName().equals(name)) {
				it.remove();
				count++;
			}
		}//while
		if(count==0)System.out.println("찾는 회원이 없습니다");
		else System.out.println(count+"명 삭제완료");
		
	}

	public void sortArticle() {
		int num = 0;
		while(true) {
			System.out.println();
			System.out.println("1.이름으로 오름차순");
			System.out.println("2.총점으로 내림차순");
			System.out.println("3.이전메뉴");
			System.out.println("번호 입력: ");
			num=sc.nextInt();
			if(num==3) break;
			
			if(num==1) {
				Comparator<SungJukDTO> com=new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};
				Collections.sort(list,com);
				printArticle();
				
			}
			if(num==2) {
				Collections.sort(list);
				printArticle();
				
			}
		}//while

	}

}
