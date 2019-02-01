package tw.com.jerry.interpceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {


	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**");

	}

}
