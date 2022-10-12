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
        if (bugDescription.length() < 10) {
            System.out.println("Opis błędu jest za krótki");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    // czy jest poprawny email - czy zawiera "@"
    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Adres mailowy jest niepoprawny");
        } else {
            this.email = email;
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    // nowe bug priority mieści się w przedziale od 1 -5
    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default:
                System.out.println("Wartość spoza zakresu");
        }
    }
        public boolean getBugStatus() {
            return bugStatus;
        }

        public void setBugStatus ( boolean bugStatus){
            this.bugStatus = bugStatus;
        }

        public void showAllInformation () {
            System.out.println("Bug Description :" + bugDescription + " Email : " + email + " Bug priority : "
                    + bugPriority + " Bug status : " + bugStatus);
        }

        public void showUserEmail () {
            System.out.println(" : " + email);
        }

        public void showBugStatus () {
            System.out.println("Bug Status : " + bugStatus);
        }

    }
