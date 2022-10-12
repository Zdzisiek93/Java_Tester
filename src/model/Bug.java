public class Bug {

    String bugDescription;
    String email;
    int bugPriority;
    boolean bugStatus;

    Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    void showAllInformation() {
        System.out.println("Bug Description :" + bugDescription + " Email : " + email + " Bug priority : "
                + bugPriority + " Bug status : " + bugStatus);
    }

    void showUserEmail() {
        System.out.println(" : " + email);
    }

    void showBugStatus() {
        System.out.println("Bug Status : " + bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }
}
