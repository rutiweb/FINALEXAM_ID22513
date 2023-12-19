package mkr.inspections.Roads.Utilities.Inspection.dao;


import mkr.inspections.Roads.Utilities.Inspection.Domain.User;

import java.util.List;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);

    public void saveUpdate(User theUser);

    public User findByEmail(String email);

    public User findByEmailAndTelNumber(String email, String tel);
    public User findById(Long id);

    public List<User> findUsers(int page, int size);

    public List<User> findUsers(int page, int size, String searchTerm);

    public long countUsers();


}
