package cn.eastdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogAnnotationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LogAnnotationApplication.class, args);
    }


    @Autowired
    ServiceTest serviceTest;

    @Override
    public void run(String... strings) throws Exception {
        serviceTest.test1();
        serviceTest.test2();
    }
}
