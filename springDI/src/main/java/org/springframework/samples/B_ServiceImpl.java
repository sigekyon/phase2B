package org.springframework.samples;

public class B_ServiceImpl implements B_Service{


    private C_Repository c;


    public void setC(C_Repository c){
        this.c = c;
    }

    @Override
    public long adjustment(String lessonName, int number) {

        System.out.println("研修名："+lessonName);
        System.out.println("人数:"+number);

        long price = c.checkPrice(lessonName);

        return price * number;
    }

}
