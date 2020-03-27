package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        boolean access;
        String root = new String("root");
       if (root.equals(login)) {
        access = true;
       } else {
         access = false;
         }
     return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
