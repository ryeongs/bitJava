package collection;

import java.util.LinkedList;
import static java.lang.System.out;
//반대로 선입선출(FIFO: First In First Out)은 먼저 넣은 객체가 먼저 빠져나가는 구조를 말합니다.
public class QueueTest {

	public static void main(String[] args) {
		String[] item = {"소나타","렉스톤","제규어"};
		LinkedList<String> q=new LinkedList<String>();
		
		for(String n:item)
			q.offer(n); //요소 추가
		
		out.println("q의 크기"+q.size());
		String data="";
		
		//데이터 꺼내기
		while( (data=q.poll()) != null) {
			out.println(data+"삭제!");
			out.println("q의 크기: "+q.size()+"\n");
		}//while

	}

}
