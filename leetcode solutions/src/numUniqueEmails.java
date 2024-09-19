import java.util.*;

public class numUniqueEmails {
    numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String[] splitedEmail = emails[i].split("@");
            splitedEmail[0] = splitedEmail[0].replace(".", "");
            splitedEmail[0] = splitedEmail[0].split("[+]")[0];
            set.add(splitedEmail[0] + splitedEmail[1]);
        }

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
