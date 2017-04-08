package ku.spa.springbankapp.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by chinnonae on 8/4/2560.
 */
@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class);

    @Before(value = "execution(* ku.spa.springbankapp.service.*Service.*(..))")
    public void log(JoinPoint joinPoint) {
        logger.info(String.format("StudentID: 5710546194"));
        logger.info(String.format("Entering %ss %s", joinPoint.getTarget().getClass().getSimpleName(), joinPoint.getSignature().getName()));

        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            logger.info(String.format("args[%d] -> %s", i, args[i]));
        }
    }
}
