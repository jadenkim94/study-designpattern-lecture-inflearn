package commandPattern.before;

public class Button { // button 은 light 에 요청을 보내는 invoker
    private Light light; // light 는 요청을 받는 receiver

    public Button(Light light) {
        this.light = light;
    }

    public void press(){
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
    }
}
