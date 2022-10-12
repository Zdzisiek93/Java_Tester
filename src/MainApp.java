import model.Bug;
import model.User;

public class MainApp {

    public static void main(String[] args) {

//        Bug bug1 = new Bug("Bład klienta", "adam@błąd.pl", 1);
//
//        bug1.showAllInformation();
//        bug1.showUserEmail();
//        bug1.showBugStatus();
//        bug1.showBugStatus();

        User marian = new User("Marian", "Kowalski", "marian@kowalski.pl", 33);

        marian.getAllInfo();
    }
}
