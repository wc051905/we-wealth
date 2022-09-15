package com.chen.web;


import static java.lang.Thread.sleep;

public class T implements Runnable {
    private int num;

    public T(int i) {
        this.num = i;
    }

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        try {
            if (num == 2) {
                Thread.sleep(500);
                System.out.println(num);
            } else if (num == 1) {
                sleep(1500);
                System.out.println(num);
            } else {
                System.out.println(num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class  TT{
    public static void main(String[] args) throws InterruptedException {
        String str = "hshaksdhqqkqwkasfa123shgjqijasjkdhajkcsnidh";
        int a=0;
        int s=0;

        for (int i =0;i<str.length();i++){
            if (str.charAt(i)=='a'){
                a=i;
            }
            if(i>0) {
                if (str.charAt(i) == 's') {
                    s = i;
                    String str1 = str.substring(a + 1, s);
                    System.out.println(str1);
                }
            }
        }

    }
}
