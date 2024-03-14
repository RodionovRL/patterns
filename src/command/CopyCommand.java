package command;

public class CopyCommand implements Command {
    private final Document doc;
    private final int startPosition;
    private final int length;
    public CopyCommand(Document doc, int startPosition, int length) {
        this.doc = doc;
        this.startPosition = startPosition;
        this.length = length;
    }
    @Override
    public void execute() {
        this.doc.copy(startPosition, length);
    }
    @Override
    public void unExecute() {
        System.out.println("Uncopy operation is blocked");
    }
    @Override
    public boolean isReversible() { return false; }
}
