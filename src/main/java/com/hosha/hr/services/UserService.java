package com.hosha.hr.services;

import com.hosha.hr.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/30/20 8:02 PM
 */
@Service // @Component
public class UserService {

    public List<User> findUsers(){
        User user1 = new User();
        user1.setName("ali");
        user1.setLastName("sadeghi");
        user1.setAge(29);

        User user2 = new User();
        user2.setName("mohamad");
        user2.setLastName("aliyari");
        user2.setAge(23);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        return users;
    }
}
