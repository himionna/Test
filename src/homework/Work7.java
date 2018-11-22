package homework;
class Array {
	public int[] getArray(int[] arr,int times) {
		for(int i = 0;i<times;i++) {
			//引用每次指向新开辟的数组，把之前的断掉
			arr = new int[arr.length*2];
			System.out.println(arr.length);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return arr;
	}
	
}
public class Work7 {
	public static void main(String[] args) {
		int[] arr = new int[1];
		Array a = new Array();
		
		int[] arr2 = a.getArray(arr, 8);
		
	}

}
