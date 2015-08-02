
public class Reverseword {
	public static String reverseSentence(String str){
		String revStr="";
		StringBuilder sb=new StringBuilder();
		int j=str.length();
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i) == ' ' || i==0 ){
				if(i==0){
					sb.append(str.charAt(i));
				}
				sb.append(str.substring(i+1, j));
				sb.append(" ");
				j=i;	
			}
		}
	return sb.toString();
	}
	public static void main(String[] args) {
		String str="I am a boy";
		System.out.println(reverseSentence(str));

	}

}
