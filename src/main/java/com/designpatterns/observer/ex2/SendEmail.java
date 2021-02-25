package com.designpatterns.observer.ex2;

public class SendEmail implements ExecuteAction {
    @Override
    public void execute(Order order) {
        System.out.println("Email sent with success for user " + order.getUserName());
    }
}
