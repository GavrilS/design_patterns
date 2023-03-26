package pattern_lib.repository_pattern;

import pattern_lib.data_access_object_pattern.User;

public interface UserRepository {
    User get(long id);
    void add(User user);
//    void update(User user);
//    void remove(User user);
}
