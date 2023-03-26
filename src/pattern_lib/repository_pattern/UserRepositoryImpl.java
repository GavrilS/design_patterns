package pattern_lib.repository_pattern;

import pattern_lib.data_access_object_pattern.User;
import pattern_lib.data_access_object_pattern.UserDaoImplementation;

public class UserRepositoryImpl implements UserRepository {
    private UserDaoImplementation userDaoImplementation;

    @Override
    public User get(long id) {
        return userDaoImplementation.read(id);
    }

    @Override
    public void add(User user) {
        userDaoImplementation.create(user);
    }

    // ... To Do: add the rest of the commented methods in the interface
}
