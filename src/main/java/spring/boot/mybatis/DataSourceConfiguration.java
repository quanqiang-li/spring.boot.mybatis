package spring.boot.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

/**
 * @Configuration是等效xml配置的,包含@bean注解等效<bean>
 * @Configurable是注入对象到不在容器管理范围内的aspectj对象中
 * @author liqq
 *
 */
//开启此配置,自动配置的数据源就失效了,采用这里自定义的配置
@Configuration
public class DataSourceConfiguration {
	
	@Bean
	@ConfigurationProperties("app.datasource") // 使用配置文件中app.datasource开头的属性,后缀要符合HikariDataSource规范
	public HikariDataSource dataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}
}
