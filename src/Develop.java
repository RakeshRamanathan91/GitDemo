
public class Develop implements Interfaceconcepts,Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Develop d=new Develop();
d.bank();
d.finance();
Interfaceconcepts dr=new Develop();
dr.insurance();
Animal a=new Develop();
a.tiger();
	}

	@Override
	public void bank() {
		// TODO Auto-generated method stub
	System.out.println("bank");
	System.out.println("bank2");
	System.out.println("bank3");
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("insurance");
	}

	@Override
	public void finance() {
		// TODO Auto-generated method stub
		System.out.println("finance");
	}
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
}

	@Override
	public void tiger() {
		// TODO Auto-generated method stub
		System.out.println("tiger");
	}

	@Override
	public void lion() {
		// TODO Auto-generated method stub
		
	}
}