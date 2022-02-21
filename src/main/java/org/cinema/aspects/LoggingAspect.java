package org.cinema.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* org.cinema.models.Show.showInfo())" )
    private void getShowInfoFromShow(){}

    @Before("getShowInfoFromShow()")
    public void beforeGetShowInfo() {
        System.out.println("beforeGetShowInfo: попытка связаться с кинотеатром");
    }

    @Pointcut("execution(* org.cinema.models.Worker.buyTicket())" )
    private void getBuyTicketFromWorker(){}

    @Before("getBuyTicketFromWorker()")
    public void beforeGetBuyTicket() {
        System.out.println("beforeGetBuyTicket: попытка на покупку билета");
    }

    @Pointcut("execution(* org.cinema.models.Worker.printCheck())" )
    private void getPrintCheckFromWorker(){}

    @Before("getPrintCheckFromWorker()")
    public void beforeGetPrintCheck() {
        System.out.println("beforeGetPrintCheck: попытка заявки на получение чека");
    }
}