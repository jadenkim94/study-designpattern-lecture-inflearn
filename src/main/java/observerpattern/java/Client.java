package observerpattern.java;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();
        subject.addObserver(observer);
        subject.add("하하하핳");
        subject.removeObserver(observer);
        subject.add("메롱메롱");
    }

}
