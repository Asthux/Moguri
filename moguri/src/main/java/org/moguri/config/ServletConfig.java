package org.moguri.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {
        "org.moguri.*",
        "org.moguri.exception",
        "org.moguri.member.controller",
        "org.moguri.event.attendance.controller",
        "org.moguri.event.quiz.controller",
        "org.moguri.event.roulette.controller",
        "org.moguri.accountbook.controller",
        "org.moguri.stock.controller",
        "org.moguri.common.config"
}) // Spring MVC용 컴포넌트 등록을 위한 스캔 패키지
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("forward:/resources/index.html");
        
//        registry.addViewController("/index").setViewName("forward:/resources/index.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**") // url이 /resources/로 시작하는 모든 경로
                .addResourceLocations("/resources/"); // webapp/resources/경로로 매핑

        registry.addResourceHandler("/assets/**")
                .addResourceLocations("/resources/assets/");
    }

    // jsp view resolver 설정
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }
}