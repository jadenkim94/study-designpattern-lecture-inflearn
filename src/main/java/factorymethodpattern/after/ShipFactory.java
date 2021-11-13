package factorymethodpattern.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    // java 9 부터는 interface 에 private method 가 정의 가능하지만 8 이하버전은 불가능하다.
    // 만약 java 8 버전을 사용한다면 추상클래스를 활용해서 구현할 수 있다.
    // ex - prepareFor() 메소드
    private void validate(String name, String email){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("베에는 이름이 필요합니다.");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일이 필요합니다.");
        }
    }
    void prepareFor(String name);
    /*private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }*/

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 완성됐음을 알림 to " + email);
    }

}

