package SSM.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("SSM")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@Import({jdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
