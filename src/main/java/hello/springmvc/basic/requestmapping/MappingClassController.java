package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping()
    public String users() {
        return "get users";
    }

    @PostMapping()
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId) {
        return "get userId = "+userId;
    }

    @PatchMapping("/{userId}")
    public String UpdateUser(@PathVariable("userId") String userId) {
        return "Update userId = "+userId;
    }

    @DeleteMapping("/{userId}")
    public String DeleteUser(@PathVariable("userId") String userId) {
        return "Delete userId = "+userId;
    }


}
