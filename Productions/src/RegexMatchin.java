import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchin {

    public void suggeestUserNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = sc.next();
        Pattern pattern1 = Pattern.compile("@");
        String[] splits = pattern1.split(email);

        String use = splits[0];
        String less = splits[1];
        // System.out.println(less);
        Pattern pattern0 = Pattern.compile(".");
        // String more = String.join("", less);
        String[] sllipts = pattern0.split(less);

        String arr0 = String.join("", sllipts[0]);
        // System.out.println(arr0);

        System.out.println("Possible user name for you:  "+ " " + use);
    }
    public static void main(String[] args) {
        RegexMatchin rm = new RegexMatchin();
        rm.suggeestUserNames();
//         String id = String.valueOf(101);
        
//         String patternName = "Biscuits";

//         Pattern pattern = Pattern.compile(patternName);
//         String compliledPattern = pattern.pattern();
//         System.out.println(compliledPattern);

//         boolean matches = Pattern.matches(patternName, "Biscuits");
//         System.out.println(matches);

//         Pattern pattern1 = Pattern.compile(":");
//         String[] splits = pattern1.split("The comments are as follows: Junior has 2 balls");

// //        String use = splits[0];
//         for (String i: splits) {
//             System.out.println("Sentence: " + i);
//         }

//         Matcher matcher = pattern.matcher("Biscuits can be hard and Biscuits can be soft");
//         StringBuffer buffer = new StringBuffer();
//         while (matcher.find()) {
//             matcher.appendReplacement(buffer, "Balls");
//             System.out.println(buffer.toString());
//             //if pattern is found in matcher, then it will be replaced with "Balls"
//             System.out.println(matcher);
//         }
//         matcher.appendTail(buffer);
//         System.out.println(buffer.toString());
//         String replacement = matcher.replaceAll("Butter");
//         System.out.println(replacement);
//         String replacFirst = matcher.replaceFirst("Butter");
//         System.out.println(replacFirst);

//         Pattern patt = Pattern.compile("@yell.out");
//         Matcher mat = patt.matcher("The email is euismax@yell.out");
//         while (mat.find()) {
//             System.out.println("Match started at :" + " " + mat.start(0));
//             System.out.println("Match started at :" + " " + mat.end(0));

//         }

    }
}
