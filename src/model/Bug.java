package model;

public class Bug {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }
// nie może być krótszy niż 10 znaków
    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
    }

    public String getEmail() {
        return email;
    }
// czy jest poprawny email - czy zawiera "@"
    public void setEmail(String email) {
        this.email = email;
    }

    public int getBugPriority() {
        return bugPriority;
    }
// nowe bug priority mieści się w przedziale od 1 -5
    public void setBugPriority(int bugPriority) {
        this.bugPriority = bugPriority;
    }

    public boolean getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void showAllInformation() {
        System.out.println("Bug Description :" + bugDescription + " Email : " + email + " Bug priority : "
                + bugPriority + " Bug status : " + bugStatus);
    }

    public void showUserEmail() {
        System.out.println(" : " + email);
    }

    public void showBugStatus() {
        System.out.println("Bug Status : " + bugStatus);
    }

}
