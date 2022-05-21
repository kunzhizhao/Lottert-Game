package 樂透開獎程式;
public class CreateRandomNumber {
	public int[] CreateNumber() {
		int[] a = new int[7];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*49)+1;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		return a;
	}
}