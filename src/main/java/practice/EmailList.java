package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> emails = new TreeSet<>();
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w\\.-]+@[\\w\\.-]+\\.[a-z]{2,}$",
            Pattern.CASE_INSENSITIVE);

    public void add(String email) {

        if (isValidEmail (email)) {
            emails.add(email.toLowerCase());
        } else {
            System.out.println("Некорректный формат email: " + email);
        }
    }
    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public List<String> getSortedEmails() {

        return new ArrayList<>(emails);


    }

}

