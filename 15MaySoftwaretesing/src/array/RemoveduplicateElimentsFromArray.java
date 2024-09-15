package array;

public class RemoveduplicateElimentsFromArray {

	public static void main(String[] args) {
		int num[]= {10,20,30,10,20};
		int j=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=num[i+1]) {
				num[j++]=num[i];
			}
		}
         
	}

}
