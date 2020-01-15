package inheritance;

//class EnumColor{
//	static final String RED="»¡°­";
//	static final String RED="ÃÊ·Ï";
//	static final String RED="ÆÄ¶û";
//	static final String RED="º¸¶ó";
//}

enum EnumColor{
	RED,GREEN,BLUE,MAGENTA
   //0    1    2   3
}
//==============================================
public class EnumMain {
	String colorName;
	EnumColor color;

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		EnumMain em = new EnumMain();
		em.colorName ="»¡°£";
		em.color= EnumColor.RED;
		System.out.println(em.colorName+"\t"+em.color);

		em.colorName ="º¸¶ó";
		EnumColor VIOLET = EnumColor.MAGENTA;
		em.color= EnumColor.RED;
		System.out.println(em.colorName+"\t"+VIOLET);

		for(EnumColor data:EnumColor.values()) {
			System.out.println(data+"\t"+data.ordinal()+"\t"+ data.valueOf(data+""));
		}
	}

}
