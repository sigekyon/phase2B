package jp.ex.sample.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LogAop {

    @Before("execution(* findByUserIdAndPassWord(..))")
    public void logAfter(JoinPoint jp){
        System.out.println(jp.getSignature().getName() +"()が実行されました");
    }

}
