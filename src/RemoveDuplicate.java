import java.util.HashMap;


public class RemoveDuplicate {

	public static void main(String[] args) {
		boolean [] arr1=new boolean[256];
		String str="abccddsrd";
		HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(arr1[str.charAt(i)])
			{
				continue;
			}
			else{
			hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}
