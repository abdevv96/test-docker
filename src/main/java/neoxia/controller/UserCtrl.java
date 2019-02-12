package neoxia.controller;

import neoxia.entity.User;
import neoxia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class UserCtrl {

    @Autowired
    UserRepository userRepository;
    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}
