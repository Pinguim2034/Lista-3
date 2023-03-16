package exercicio_01l3;

public class Exericio_01l3 {
	public static void main (String[]args) {
		Cachorro c1 = new Cachorro("Tony");
		String c1r = "Bordercollie + Bluehiller";
		double c1p = 15.00;
		c1.setPeso( c1p);
		c1.setRaça(c1r);
		System.out.println(c1.toString());
	}
}
