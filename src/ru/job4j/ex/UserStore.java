package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user:users) {
            if (user.getUsername().equals(login)) {
               rsl = user;
               break;
           }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = user.isValid() && user.getUsername().length() >= 3;
        if (rsl) {
            throw new UserInvalidException("Invalid user.");
        }
        return rsl;
    }

    public static void main(String[] args) {

        User[] users = {new User("Petr Arsentev", false)};

        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
            System.out.println("user not valid");
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
            System.out.println("user not found");
        }
    }

}
