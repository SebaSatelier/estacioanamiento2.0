
package satelier.estacionamientov2.persistence;

import java.util.List;
import satelier.estacionamientov2.logic.models.User;
import satelier.estacionamientov2.persistence.JPAPersistence.UserJpaController;

public class PersistenceController {
    
    UserJpaController userJpaController = new UserJpaController();

    public List<User> authenticate() {
        return userJpaController.findUserEntities();
        
    }
    
}
