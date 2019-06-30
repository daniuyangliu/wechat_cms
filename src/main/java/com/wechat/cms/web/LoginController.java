package com.wechat.cms.web;

import com.wechat.cms.entity.LoginUser;
import com.wechat.cms.reposotory.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private LoginUserRepository loginUserRepository;
   @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public Response login(String username,String password){
        Response response = new Response();
       System.out.println("username"+username+"passworde"+password);
        if(StringUtils.isEmpty(username) ||StringUtils.isEmpty(password)){
            response.setCode("999");
            response.setMsg("请输入用户名或密码");
            return  response;
        }
        LoginUser loginUser = loginUserRepository.findByUserName(username);
        if(loginUser==null){
            response.setCode("999");
            response.setMsg("无该用户");
            return  response;
        }
        if(!loginUser.getPassWord().equals(password)){
            response.setCode("999");
            response.setMsg("密码错误");
            return  response;
        }
        response.setCode("000");
        response.setMsg("登陆成功");
       System.out.println(response);
        return response;
    }
}

class Response{
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
