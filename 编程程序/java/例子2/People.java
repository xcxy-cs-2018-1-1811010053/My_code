class People
{
	int height ;
	String ear ;
	void speak(String s){
		System.out.println(s);
	}
}

class A
{
	public static void main(String args[])
	{
		People zhubajie ;
		zhubajie = new People() ;
		zhubajie.height = 170 ;
		zhubajie.ear    = "两只大耳朵" ;
		System.out.println("身高："+zhubajie.height);
		System.out.println(zhubajie.ear);
		System.out.println("师傅咱们别去西天了，去月宫吧。");
	}
}