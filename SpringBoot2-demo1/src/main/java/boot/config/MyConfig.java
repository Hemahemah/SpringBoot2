package boot.config;

import boot.bean.Car;
import boot.bean.Pet;
import boot.bean.User;
import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


/**
 * @Configuration
 * 配置类使用Bean注解在方法上给容器注册组件(配置文件),默认为单实例
 * 配置类本身也是组件
 * proxyBeanMethods():代理Bean的方法
 * 外部无论对配置类中的组件注册方法调用多少次获取的都是之前注册容器中的单实例
 *      Full(proxyBeanMethods = false)全模式
 *      Lite=(proxyBeanMethods = true)轻量模式
 *      组件依赖
 */
@Configuration(proxyBeanMethods = true)

/**
 * @Import
 * 给容器自动创建出给定类型的组件,默认组件名字是全类名
 */
@Import({User.class, DBHelper.class})

/**
 * @ImportResource
 * 导入Spring的配置文件
 *
 */
@ImportResource(locations = "classpath:beans.xml")
/**
 * @EnableConfigurationProperties
 * 开启Bean的配置绑定功能,把组件自动导入容器中
 */
@EnableConfigurationProperties(Car.class)
public class MyConfig {


    @Bean
    /**
     * 给容器中添加组件,以方法名作为组件id,
     * 返回类型为组件类型,返回值为组件在容器中的实例
     */
    public User user(){
        return new User("张三",10,pet());
    }

    @Bean
    public Pet pet(){
        return new Pet("tomcat");
    }
}
