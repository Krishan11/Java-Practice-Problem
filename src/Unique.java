import java.util.HashMap;

public class Unique{
	public static void main(String args[])
	{
		int[] arr={1,3,4,1,2,2,2,2};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				int count=hm.get(arr[i]);
				count++;
				hm.put(arr[i],count);
			}
			else{
				hm.put(arr[i],1);
			}
			
		}
		for(int i=0;i<hm.size();i++){
			if(hm.get(arr[i])>1){
			System.out.print(arr[i]);
			}
		}
	}
}