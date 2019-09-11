package com.kodilla.good.patterns.food2Door2;

public class MailSend implements IsSold{
    @Override
    public void information(Order order, boolean isSold) {
        if (isSold) {
            System.out.println("\n\nYour order "+order.getUser().getFirstName() + " "+" is almost ready... ");
            System.out.println("You receive " + order.getProduct().getProductName() +" "+ order.getVolume());
            System.out.println("Mail generated automatically: " + order.getUser().getEmail());


        } else {
            System.out.println("Sorry " + order.getUser().getFirstName() + " " + order.getUser().getSurname()
                    + " We have some problems with your order");
        }
    }
}
