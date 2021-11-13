package factorymethodpattern.before;

public class ShipFactory {

    static Ship orderShip(String name, String email) {
        // validation
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("베에는 이름이 필요합니다.");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일이 필요합니다.");
        }


        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if(name.equalsIgnoreCase("whiteship")){
            ship.setLogo("\uD83D\uDEE5");
        } else if(name.equalsIgnoreCase("blackship")){
            ship.setLogo("\uD83D\uDEE5");
        }


        if(name.equalsIgnoreCase("whiteship")){
            ship.setColor("white");
        } else if(name.equalsIgnoreCase("blackship")){
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 완성됐음을 알림 for " + email);
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    

}
