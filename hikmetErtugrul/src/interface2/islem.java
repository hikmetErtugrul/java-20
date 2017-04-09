package interface2;

public class islem {public static void main(String[] args) {
	

	IDortýslem ýslem =new matematik();
	IArray ýslemArray=new matematik();
	System.out.println(ýslem.çarpma(3, 5));
	System.out.println(ýslem.toplama(2, 5));
	int [] array = ýslemArray.buSayiyaKadarKökBul(50);
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
	}
	
	System.out.println(ýslemArray.arrayMinBul(ýslemArray.buSayiyaKadarKökBul(50)));

}
}