# NumSum  

public class ArrayNum {
	public static void main(String[] args) {
String s[]={"123","12","A1111C","C9a"};
int sum=0;
for(int i=0;i<s.length;i++){
	char charArr[]=s[i].toCharArray();
	for(int j=0;j<charArr.length;j++){
		if(charArr[j]>48&&charArr[j]<58){
			sum=sum+charArr[j]-48;
		}
	}
}
System.out.println(sum);
	}

}
