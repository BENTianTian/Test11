/*class Check{
	public boolean vaildate(String name,String password){
		if (name.equals("lixinghua")&&password.equals("mldn")){
			return true;
		}else {
			return false;
		}
	}
}*/

public class Test2{
	public static void main(String[]agre){
		String str1 = "oioeuioeui";
		System.out.println(login(str1));
		}
	public static boolean login(String str){
		if (str == null){
			return false;
		}else{
		char c[] = str.toCharArray();
		for (int i=0;i<c.length;i++){
			if (c[i]>=48&&c[i]<=057){
				return true;
			}
		}
		return false;

		}
	}
}



