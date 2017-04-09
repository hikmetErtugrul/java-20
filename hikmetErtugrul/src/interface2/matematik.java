package interface2;

public class matematik implements IArray, IDortýslem {

	public int toplama(int a, int b) {
		int sonuc = a + b;
		return sonuc;
	}

	public int çarpma(int a, int b) {
		int sonuc = a * b;
		return sonuc;
	}

	public int[] buSayiyaKadarKökBul(int sayi) {
		int[] array = new int[sayi];

		for (int i = 1; i*i < sayi; i++) {
			array[i-1] = i;

			
		}
		return array;
		
	}

	public int arrayMinBul(int[] array) {
		int min=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i-1]<array[i]){
			min=array[i];
		}
		return min;
		}
		return 0;}
	}
