package interfece;

public class bisiklet implements Ibisiklet{

	@Override
	public void pedal() {
		
	}

	@Override
	public void fren() {
		System.out.println("fren sistemi devreye girdi");
		diskFren();
	}

	private void diskFren() {
		System.out.println("disk fren sistemi devreye girdi");
		
	}

	@Override
	public void vites() {
		
	}
	

}
