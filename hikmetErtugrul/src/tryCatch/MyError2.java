package tryCatch;

public class MyError2 {
	public static void main(String[] args) {
		int[] array = new int[3];
		for (int i = 0; i < 15; i++) {
			if (i>=array.length) {
				throw  new ArrayIndexOutOfBoundsException("ben burdan devam edemem");
			}
			array[i]=i;
			
		}

	}

}
