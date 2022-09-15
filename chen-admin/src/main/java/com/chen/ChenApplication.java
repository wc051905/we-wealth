package com.chen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * 启动程序
 * 
 * @author chen
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class ChenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(com.chen.ChenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
       /* String s1="张三";
        String s4="张三";
        String s2=new String("张三");
        String s3=new String("张三").intern();
        System.out.print(s1 == s2);
        System.out.print(s1.equals(s2));
        System.out.print(s3==s1);
        System.out.print(s3==s1);
        System.out.print(s4.equals(s1));*/
    }


}