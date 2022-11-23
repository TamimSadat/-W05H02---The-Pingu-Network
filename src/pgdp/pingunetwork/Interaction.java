package pgdp.pingunetwork;

// TODO: Fülle diese Klasse entsprechend der Aufgabenstellung
public class Interaction {

    private User user;
    private int interactionType;

    public Interaction(User nutzer, int interactionType) {
        this.user = nutzer;
        this.interactionType = interactionType;
    }

    public int getInteractionType() {
        return interactionType;
    }

    public User getUser() {
        return user;
    }



}
