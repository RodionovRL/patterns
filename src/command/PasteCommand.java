package command;

public class PasteCommand implements Command {
    private final Document doc;
    private final String text;
    private final int startPosition;
    public PasteCommand(Document doc, String text, int startPosition) {
        this.doc = doc;
        this.text = text;
        this.startPosition = startPosition;
    }
    @Override
    public void execute() {
        this.doc.insert(text, startPosition);
    }
    @Override
    public void unExecute() {
        this.doc.delete(startPosition, text.length());
    }
}
