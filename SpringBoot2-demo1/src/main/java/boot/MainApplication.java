package boot;

import boot.bean.Pet;
import boot.bean.User;
import boot.config.MyConfig;
import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自动装配原理
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 *
 * @SpringBootApplication
 *  1.@Configuration
 *    public @interface SpringBootConfiguration 是一个配置类
 *  2.@ComponentScan 包扫描注解
 *  3.@EnableAutoConfiguration
 *      1).@AutoConfigurationPackage 自动配置包
 *      2).@Import({AutoConfigurationImportSelector.class})
 *              @Import({Registrar.class}) 利用Registrar导入一系列组件(将指定一个包下所有组件导入进来)
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        //IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        //获取容器中的组件
        User user1 = context.getBean("user",User.class);
        User user2 = context.getBean("user",User.class);
        Pet pet = context.getBean("pet",Pet.class);
        System.out.println(user1);
        System.out.println(pet);
        System.out.println(user1 == user2);
        System.out.println("==================");


        MyConfig bean = context.getBean(MyConfig.class);
        System.out.println(bean);
        User user = bean.user();
        User user3 = bean.user();
        System.out.println(user == user3);
        System.out.println("==================");

        User user4 = context.getBean("user", User.class);
        Pet pet1 = context.getBean("pet", Pet.class);
        System.out.println(user4.getPet() == pet1);
        System.out.println("==================");

        String[] names = context.getBeanNamesForType(User.class);
        for (String name : names) {
            System.out.println(name);
        }
        DBHelper dbHelper = context.getBean(DBHelper.class);
        System.out.println(dbHelper);
        System.out.println("==================");

        System.out.println(context.containsBean("hema"));

    }
}
