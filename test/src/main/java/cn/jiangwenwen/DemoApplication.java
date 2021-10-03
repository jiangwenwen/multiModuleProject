package cn.jiangwenwen;

import cn.jiangwenwen.entity.People;
import cn.jiangwenwen.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    PeopleRepository peopleRepository;

    public static void main(String[] args)  {

        try(ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);){
            DemoApplication app = ctx.getBean(DemoApplication.class);
            app.run(args);
        }catch (Exception e) {
            e.printStackTrace();

            System.out.println("システムエラー");

        }
    }
    public void run(String... args) throws Exception {

        System.out.println("処理開始");
        //アプリの処理
        People people = peopleRepository.findById(1);
        System.out.println(people.toString());
        System.out.println("処理終了");
    }

}
