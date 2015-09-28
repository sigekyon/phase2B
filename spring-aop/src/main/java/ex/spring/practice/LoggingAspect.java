package ex.spring.practice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private Logger log = Logger.getLogger(this.getClass());

	@Before("execution(long checkPrice(..)) || execution(* *test())")
	public void logBefore(JoinPoint jp){
		log.info(jp.getSignature().getName() + "()メソッドが始まりました。");
	}
	
	@After("@target(org.springframework.stereotype.Service)")
	public void logAfter(JoinPoint jp){
		log.info(jp.getSignature().getName() + "()メソッドが終了しました。");
	}
	
	@Around("bean(*)")
	public Object logAround(ProceedingJoinPoint jp) throws Throwable {
		long beforeTime = System.currentTimeMillis();
		Object result = jp.proceed();
		long afterTime = System.currentTimeMillis();
		long exeTime = afterTime - beforeTime; // 実行時間の取得
		log.info(jp.getSignature().getName() + "()メソッドの実行時間(ミリ秒)："+exeTime);
		return result;
	}
	
	@AfterThrowing(value="execution(* B_Service.*(..))",throwing ="ex")
	public void handlingExcept(IllegalArgumentException ex){
		log.info("例外：" + ex.getMessage() + "が起きました。");
	}
}
