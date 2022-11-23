package pgdp.pingunetwork;

// TODO: Fülle diese Klasse entsprechend der Aufgabenstellung
public class Interaction {

    private User nutzer;
    private int interactionType;

    public Interaction(User nutzer, int interactionType) {
        this.nutzer = nutzer;
        this.interactionType = interactionType;
    }

    public int getInteraction() {
        return interactionType;
    }

    public User getUser() {
        return nutzer;
    }



}
