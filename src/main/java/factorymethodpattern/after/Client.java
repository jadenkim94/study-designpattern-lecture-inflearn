package factorymethodpattern.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "jaden@email.com");
        client.print(new BlackShipFactory(), "BlackShip", "jaden@email.com");


    }

    private void print(ShipFactory whiteShipFactory, String whiteShip, String email) {
        whiteShipFactory.orderShip(whiteShip, email);
    }

}
