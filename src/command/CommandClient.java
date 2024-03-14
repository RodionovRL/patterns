package command;

public class CommandClient {
    public static void main(String[] args) {
        Document document = new Document();
        CopyCommand copyCommand = new CopyCommand(document, 33, 44);
        CutCommand cutCommand = new CutCommand(document, 55, 66);
        PasteCommand pasteCommand = new PasteCommand(document, "I'm in", 11);
        DocumentInvoker documentInvoker = new DocumentInvoker();
        System.out.println("============ copyCommand ==================");
        documentInvoker.executeCommand(copyCommand);
        documentInvoker.unExecuteCommand(copyCommand);
        System.out.println("============ cutCommand ===================");
        documentInvoker.executeCommand(cutCommand);
        documentInvoker.unExecuteCommand(cutCommand);
        System.out.println("============ pasteCommand==================");
        documentInvoker.executeCommand(pasteCommand);
        documentInvoker.unExecuteCommand(pasteCommand);
    }
}
