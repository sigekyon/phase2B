package org.springframework.samples;

public class B_Service{


    public long adjustment(String lessonName, int number) {

        System.out.println("研修名："+lessonName);
        System.out.println("人数:"+number);

        C_Repository c = new C_Repository();

        long price = c.checkPrice();

        return price * number;
    }

}
