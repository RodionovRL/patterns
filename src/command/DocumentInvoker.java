package command;

import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {
    private final List<Command> commandList = new ArrayList<>();

    public void executeCommand(Command command){
        commandList.add(command);
        command.execute();
    }
    public void unExecuteCommand(Command command){
        commandList.add(command);
        command.unExecute();
    }
}