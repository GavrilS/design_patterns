package pattern_lib.data_access_object_pattern;


public class UserDaoImplementation implements UserDao {
//    private final EntityManager entityManager; // JPA Entity manager as example


//    public UserDaoImplementation(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    @Override
    public void create(User user){
//        entityManager.persist(user);
    }

    @Override
    public User read(Long id) {
//        return entityManager.find(User.class, id);
        return null;
    }

    @Override
    public void update(User user) {
        //
    }

    @Override
    public void delete(String userName) {
        //
    }
}
