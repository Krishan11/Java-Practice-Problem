
public class DistinctElem {
	//print distinct character from the string str
public static void printDistinct(String str){
	int flag=0;
	for(int i=0;i<str.length();i++){
		for(int j=0;j<i;j++){
			if(str.charAt(i)==str.charAt(j)){
				flag++;
				break;
			}	
			flag=0;
		}
		if (flag==0)
			System.out.print(str.charAt(i));
	}
}
	


	public static void main(String[] args) {
	String str="abadcddedfrre";
		printDistinct(str);
	
	}

}
