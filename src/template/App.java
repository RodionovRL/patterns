package template;

public class App {
    public static void main(String[] args) {
        AndroidBuilder androidBuilder = new AndroidBuilder();
        androidBuilder.build();
        System.out.println("============================");
        IosBuilder iosBuilder = new IosBuilder();
        iosBuilder.build();
    }
}
