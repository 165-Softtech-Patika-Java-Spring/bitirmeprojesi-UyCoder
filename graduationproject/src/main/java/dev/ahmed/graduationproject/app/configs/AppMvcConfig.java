//package dev.ahmed.graduationproject.app.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * @Created: 3/23/2022 13:37
// * @Email: AhmedBughra@gmail.com
// * @CreatedWith: IntelliJ IDEA
// */
//public class AppMvcConfig extends WebMvcConfigurerAdapter {
//

//    @Bean
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("login");
//                registry.addViewController("/main.html").setViewName("login");
//                registry.addViewController("/main.html").setViewName("main");
//            }
//        };
//        return adapter;
//    }
//}
