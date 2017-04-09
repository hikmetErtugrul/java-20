package interface3;

public class gezegen implements Ielement{

	@Override
	public void tahta() {
		System.out.println("tahta tabi zoruna mý gitti?");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ates() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void su() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toprak() {
		// TODO Auto-generated method stub
		
	}
	public void gezegeniKurtar(){
		ates();
		su();
		toprak();
		tahta();
	}

}
