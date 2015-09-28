package jp.ex.sample;




import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        String formattedDate = "";

        model.addAttribute("serverTime", formattedDate );

        return "login";
    }

    public String welcome(Model model)
    {

        String userName ="";
        String message ="";

        model.addAttribute("userName",userName);
        model.addAttribute("message",message);

        return "welcome";
    }

    /**
     * 例外をキャッチしerror.jspに遷移させる
     * @return error
     */
    public String exceptionHandler(){
        //エラー用のJSPを表示する
        return "error";
    }

}
