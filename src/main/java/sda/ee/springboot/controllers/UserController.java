package sda.ee.springboot.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sda.ee.springboot.dto.User;
import sda.ee.springboot.repositories.UserRepository;
import javax.websocket.server.PathParam;


@RestController
// This handles what we used to do with XML and JSP servlet mapping
@RequestMapping(path = "/users")

public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    // example of query param: http://google.com/search?name=Karl
    @RequestMapping(method = RequestMethod.POST, path = "/add")
    // we can extract the name variable from the request
    public void addNewUser(@PathParam("name") String name) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);

    }
}
