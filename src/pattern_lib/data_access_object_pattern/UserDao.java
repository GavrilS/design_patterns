package pattern_lib.data_access_object_pattern;

public interface UserDao {
    void create(User user);
    User read(Long id);
    void update(User user);
    void delete(String userName);
}
