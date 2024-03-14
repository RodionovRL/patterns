package state;

public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new Default());
        editor.type("ПрЕвЕд, ПаДон@Г");
        editor.setState(new UpperCase());
        editor.type("И незачем так орать!");
        editor.setState(new LowerCase());
        editor.type("Тишина. Тссс. Тихо, тихо, тихо, тишина.");
    }
}
