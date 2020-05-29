package web;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
/*    @Autowired
    private UserService userService;*/

    @RequestMapping("login")
    public String login(){
        System.out.println("....");
        return "Default";
    }

    @RequestMapping("manage")
    public String user( ){
        return "User/UserManage";
    }

    @RequestMapping("salary")
    public String salary(){
        return "Salary/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }

    @RequestMapping("update")
    public String update(){
        return "User/UserUpdate";
    }
}
