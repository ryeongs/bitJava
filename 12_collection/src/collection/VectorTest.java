package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
//선입선출 FIFO
//용량 개큼
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		System.out.println("벡터 크기="+v.size()); //0
		System.out.println("벡터 용량="+v.capacity()); //기본용량 10개,10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i = 1; i<=10;i++) {
			v.add(i+"");
		}
		System.out.println("벡터 크기="+v.size()); //10
		System.out.println("벡터 용량="+v.capacity()); //10 for문으로 10개까지 
		System.out.println();
		
		v.addElement(5+""); //중복허용,순서대로
		System.out.println("벡터 크기="+v.size()); //11
		System.out.println("벡터 용량="+v.capacity()); //20 
		System.out.println();
		
		for(int i = 0; i<v.size();i++) {
			System.out.println(v.get(i)+" ");
			
		}
		System.out.println("-----------------------------");
		v.remove("5"); 	//삭제 먼저들어간 5 부터 삭제 
		//v.remove(10); //뒤에있는 5를 제러할려면
		Iterator<String> it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2); //용량 5개 2개 증가 설정가능
	}

}
