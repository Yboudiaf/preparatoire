
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = "boun@arfp.asso.fr";
		String regex = "^[a-zA-Z0-9]{4,10}@(gmail|hotmail|arfp.asso)[.](com|fr)$";
		System.out.println(mail.matches(regex) ? "Oui" : "Non");
	}

}
