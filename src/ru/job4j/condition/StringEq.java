package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
      // boolean access = false;
      // String root = new String("root");
       //if (root.equals(login)) {
       //access = true;
       //}
      // return access;
        String root = new String("root");
        return root.equals(login);
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
