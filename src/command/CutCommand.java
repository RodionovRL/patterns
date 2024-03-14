package command;


public class CutCommand implements Command {
    private final Document doc;
    private String text;
    private final int startPosition;
    private final int noOfChars;
    public CutCommand(Document doc, int startPosition, int noOfChars) {
        this.doc = doc;
        this.startPosition = startPosition;
        this.noOfChars = noOfChars;
    }
    @Override
    public void execute() {
        this.text = this.doc.delete(startPosition, noOfChars);
    }
    @Override
    public void unExecute() {
        this.doc.insert(text, startPosition);
    }
}
