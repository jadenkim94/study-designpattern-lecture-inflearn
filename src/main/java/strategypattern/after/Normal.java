package strategypattern.after;

//concrete strategy
public class Normal implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무  궁  화  꽃  이 ");
    }

    @Override
    public void redLight() {

    }
}
