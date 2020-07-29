package cn.lucky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.lucky.mapper")
@SpringBootApplication
public class Luckytest1Application {

    public static void main(String[] args) {
        SpringApplication.run(Luckytest1Application.class, args);
    }

}
