package com.andru.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWedInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; //так как нет рут кофиг классов вернем null
    }

    //ссылка на applicationContext.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Myconfig.class};//<param-value>/WEB-INF/applicationContext.xml</param-value>
    }

//    <servlet-mapping>
//       <servlet-name>dispatcher</servlet-name>
//           <url-pattern>/</url-pattern>
//    </servlet-mapping>
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //<url-pattern>/</url-pattern>
    }
}
