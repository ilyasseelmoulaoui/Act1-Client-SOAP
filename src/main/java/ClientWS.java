import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();  // en train de créer un Middleware (intermédiaire), grace a cet objet, mon application peut se communiquer avec le web service facilement
        System.out.println(stub.convert(5120));   //en train d'appeler la methode convert d'un web service qui se trouve quelque part dans une autre machine
        Compte cp = stub.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
