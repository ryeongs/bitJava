package collection;
import static java.lang.System.out;
import java.util.Stack;

//후입선출(LIFO: Last In First Out)은 나중에 넣은 객체가 먼저 빠져나가는 자료구조를 말합니다.
public class StackTest {

	public static void main(String[] args) {
		String[] groupA= {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i =0; i<groupA.length;i++) {
			stack.push(groupA[i]);
		}
		while(!stack.isEmpty()) 
			out.println(stack.pop());
	}

}
