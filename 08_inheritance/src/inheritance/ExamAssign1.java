package inheritance;

public class ExamAssign1 {

	private String name;
	private String dap;

	private int score;
	private final String JUNG="11111";
	private char[] ox=new char[JUNG.length()];
	
	public ExamAssign1(String name, String dap) {
		this.name=name;
		this.dap=dap;
	}
	public String getDap() {
		return dap;
	}
	public String getName() {
		return name;
	}
	public void compare() {
		for(int i=0; i<JUNG.length();i++) {

			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i]='O';
				System.out.print(ox[i]+" ");
				score+=20;
			}else {
				ox[i]='X';
				System.out.print(ox[i]+" ");

			}

		}
			
	}
	
	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
