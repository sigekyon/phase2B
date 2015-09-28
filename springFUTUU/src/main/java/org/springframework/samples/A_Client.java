package org.springframework.samples;


public class A_Client {

    public static void main(String[] args){

        B_Service b = new B_Service();
        long total = b.adjustment("フェーズ2B研修", 10);
        System.out.println("合計:" + total);


    }

}
