package pgdp.pingunetwork;

// TODO: Erweitere die Klasse entsprechend der Aufgabenstellung so, dass ein Bild für die Gruppe dargestellt werden kann.
public class Group {
    private User owner;
    private String name;
    private String description;
    private User[] members;
    private Picture picture;

    public Group(String name, String description, User owner, Picture picture) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.picture = picture;

        members = new User[1];
        members[0] = owner;
    }

    /** Fügt den übergebenen Nutzer in das 'members'-Array mit ein.
     * @param user Ein beliebiges User-Objekt
     */
    public void addUser(User user) {
        User[] nMembers = new User[members.length + 1];
        int k = 0;
        for (int  i = 0; i < members.length; i++) {
            if (members[i] == user) {
                if (members[i] == owner) {
                    nMembers[0] = owner;
                }
            }
            else {
                nMembers[k] = members[i];
                k++;
            }
        }
        nMembers[members.length] = user;
        members = nMembers;
    }

    /** Entfernt das übergebene User-Objekt aus dem 'members'-Array.
     *  Wenn der entfernte Nutzer der Gruppen-Admin war, wird diese Position
     *  entsprechend auf den ersten im übrigen Array angepasst.
     *  Wenn der übergebene Nutzer gar nicht in der Gruppe ist, geschieht nichts.
     * @param user Ein beliebiges User-Objekt.
     */
    public void removeUser(User user) {
        // TODO: Implementiere diese Methode entsprechend der Aufgabenstellung
        int x = 0;
        for (int i = 0; i < members.length; i++) {//Geprüft an welcher Stelle der Owner ist
            if (members[i] == owner) {
                x = i;
                break;
            }
        }
        int y = 0;
        for (int i = 0; i < members.length; i++) {//Geprüft ob User in Members enthalten
            if (members[i] == user) {
                y++;
                break;
            }
        }
        if (y == 0) {//Wenn User nicht enthalten, dann tue nichts

        }
        else {
            int i = 0;
            User[] nMembers = new User[members.length - 1];
            for (int  k = 0; k < members.length; k++) {

                if (members[k] != user) {
                    nMembers[i] = members[k];
                    i++;
                }
                else {
                   // k++;
                }
            }
            if (user == owner && nMembers.length < 1) {
                owner = null;
            }
            else if (user == owner) {
                owner = nMembers[0];
            }
            this.members = nMembers;
        }

    }

    /* ================ Getter und Setter ================ */

    public User getOwner() {

        return owner;
    }
    public String getName() {

        return name;
    }
    public String getDescription() {

        return description;
    }
    public User[] getMembers() {

        return members;
    }

    public Picture getPicture() {
        return picture;
    }


    public void setOwner(User owner) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == owner) {
                this.owner = owner;
                break;
            }
        }
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setDescription(String description) {

        this.description = description;
    }

    public void setPicture(Picture picture) {

        this.picture = picture;
    }
}
