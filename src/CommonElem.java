
public class CommonElem {

	public static int findCommon(int[] arr1,int[] arr2){
		int commonInt=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]&& arr2[j]>commonInt){
				commonInt=arr2[j];
					
				}
				
			}
			
		}
		return commonInt;
	}
	public static void main(String[] args) {
	int arr1[]={1,3,5,4,33};
	int [] arr2={2,3,4,5,22,33,44};
	int common=findCommon(arr1,arr2);
System.out.print(common);

	}

}
