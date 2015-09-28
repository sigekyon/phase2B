package jp.ex.sample.controller;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import jp.ex.sample.entities.User;
import jp.ex.sample.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    @Autowired
    @Qualifier("service")
    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        return "login";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model,
            @RequestParam("userId") Integer userId,
            @RequestParam("userPassWord") String userPassWord)
    {


        //IDのデータを取得
        User dataOne = userService.findByUserIdAndPassWord(userId,userPassWord);

        String userName ="";
        String message ="";
        if(dataOne == null){
            System.out.println("データがありませんでした");
            message = "IDまたはパスワードが違います";
        }
        else{
            userName = dataOne.getUserName();
            message = "さん、ようこそ！！";
        }

        model.addAttribute("userName",userName);
        model.addAttribute("message",message);

        return "welcome";
    }

    /**
     * 例外をキャッチしerror.jspに遷移させる
     * @return error
     */
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(){
        //エラー用のJSPを表示する
        return "error";
    }

}
