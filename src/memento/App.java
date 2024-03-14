package memento;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.type("Напечатал.");
        editor.type("Сохранил.");
        EditorMemento saved = editor.save();
        editor.type("Напечатал, а сохранить забыл.");
        System.out.println("===== before load =======");
        System.out.println(editor.getContent());
        editor.restore(saved);
        System.out.println("---------- after load ---------");
        System.out.println(editor.getContent());
    }
}
