package mediator.party;

public interface PartyMember {
    void joinedParty(Party party);
    void partyAction(Action action);
    void act(Action action);
}
