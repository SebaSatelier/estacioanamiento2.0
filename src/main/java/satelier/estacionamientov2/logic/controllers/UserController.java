package satelier.estacionamientov2.logic.controllers;

import java.util.List;
import satelier.estacionamientov2.logic.controllers.util.Authenticate;
import satelier.estacionamientov2.logic.models.User;
import satelier.estacionamientov2.persistence.PersistenceController;


public class UserController {
    
    PersistenceController persistenceController = new PersistenceController();

    public User validateUser(String userName, String password) {
        User validateUser = null;
        
        List<User> userList = persistenceController.authenticate();
        
        if(userList != null){
            for(User user : userList){
               if(Authenticate.authenticate(user, userName, password)){
                   validateUser = user;
                   return validateUser;
               }
            }    
        }
        
        return validateUser;
    }

    
    
    
}
