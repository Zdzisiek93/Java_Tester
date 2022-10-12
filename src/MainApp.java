import model.Bug;
import model.User;

public class MainApp {

    public static void main(String[] args) {

        Bug newIssue = new Bug("Wystąpił problem z programem", "zgłoszenie@błędu.com", 4);

//        System.out.println(newIssue.getBugDescription());
//
//        newIssue.setBugDescription("Teraz");
//
//        System.out.println(newIssue.getBugDescription());

//        System.out.println(newIssue.getEmail());
//
//        newIssue.setEmail("dupadupa.pl");
//
//        System.out.println(newIssue.getEmail());

        System.out.println(newIssue.getBugPriority());

        newIssue.setBugPriority(99);

        System.out.println(newIssue.getBugPriority());
//    }
    }

}
