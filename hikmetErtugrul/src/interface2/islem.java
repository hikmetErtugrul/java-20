package interface2;

public class islem {public static void main(String[] args) {
	

	IDort�slem �slem =new matematik();
	IArray �slemArray=new matematik();
	System.out.println(�slem.�arpma(3, 5));
	System.out.println(�slem.toplama(2, 5));
	int [] array = �slemArray.buSayiyaKadarK�kBul(50);
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
	}
	
	System.out.println(�slemArray.arrayMinBul(�slemArray.buSayiyaKadarK�kBul(50)));

}
}