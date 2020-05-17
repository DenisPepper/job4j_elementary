package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user:users) {
            if (user != null && user.getUsername().equals(login)) {
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
        boolean isValid = user.isValid();
        boolean validName = user.getUsername().length() >= 3;
        if (!isValid) {
            throw new UserInvalidException("Invalid user.");
        }
        if (!validName) {
            throw new UserInvalidException("Invalid user name.");
        }
        return isValid && validName;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", false)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            System.out.println("Invalid user.");
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            System.out.println("User not found.");
            nfe.printStackTrace();
        }
    }

}
