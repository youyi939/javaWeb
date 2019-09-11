package cn.lnfvc.spring_demo3.conller;

import cn.lnfvc.spring_demo3.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestConller {

    @Autowired
    JdbcTemplate template;

//    @RequestMapping(value = "/test")
//    public String test(Model model){
//        model.addAttribute("uname","唔哩哇嗏");
//        return "suc";
//    }

    @RequestMapping("regist")
    public String regist(User user){
        String sql = "insert into user(uname,age,sex) values(?,?,?)";
        template.update(sql,user.getName(),user.getAge(),user.getSex());
        return "suc";
    }



}
