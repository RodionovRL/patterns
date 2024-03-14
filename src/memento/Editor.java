package memento;

public class Editor {
    private String content = "";
    public void type(String newWords) {
        StringBuilder sb = new StringBuilder(content);
        content = sb.append(" ").append(newWords).toString();
    }
    public String getContent() {
        return content;
    }
    public EditorMemento save(){
        return new EditorMemento(this.content);
    }
    public String restore(EditorMemento memento){
        return content = memento.getContent();
    }
}
