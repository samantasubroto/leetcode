import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String regex = "^/[^/]+/(?:users|orgUsers)/([^/]+)";
        String url = "/occ/v2/biocare/orgUsers/49f749e1-53cb-44e8-98ce-4d60e41d9e00/notifications/type/BANNER/unread";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        System.out.println(matcher.group());
//        if (matcher.find()) {
//            String userId = matcher.group(1);
//            System.out.println("User ID found: " + userId);
//        } else {
//            System.out.println("User ID not found in the URL.");
//        }
    }
}