package satelier.estacionamientov2.logic.controllers.util;

import satelier.estacionamientov2.logic.models.User;

public class Authenticate {

    public static boolean authenticate(User user, String username, String password) {
        boolean autenticated = false;

        if (user != null) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {

                    autenticated = true;
                    return autenticated;
                }
            }
        }

        return autenticated;
    }

}
