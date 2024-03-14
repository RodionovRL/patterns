package mediator.party;

import mediator.party.members.Hobbit;
import mediator.party.members.Hunter;
import mediator.party.members.Rogue;
import mediator.party.members.Wizard;

public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        Party party = new PartyImpl();
        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);
        System.out.println("====================");
        hobbit.act(Action.ENEMY);
        System.out.println("--------------------");
        wizard.act(Action.TALE);
        System.out.println("--------------------");
        rogue.act(Action.GOLD);
        System.out.println("--------------------");
        hunter.act(Action.HUNT);
    }
}
