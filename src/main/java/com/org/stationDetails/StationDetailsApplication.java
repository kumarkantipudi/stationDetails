package com.org.stationDetails;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.OpenJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
@EnableJpaAuditing
@EnableAutoConfiguration()
public class StationDetailsApplication extends JpaBaseConfiguration{

	protected StationDetailsApplication(DataSource dataSource, JpaProperties properties,
			ObjectProvider<JtaTransactionManager> jtaTransactionManager,
			ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
		super(dataSource, properties, jtaTransactionManager, transactionManagerCustomizers);
	}

	public static void main(String[] args) {
		SpringApplication.run(StationDetailsApplication.class, args);
	}

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
		OpenJpaVendorAdapter jpaVendorAdapter = new OpenJpaVendorAdapter();
		jpaVendorAdapter.setShowSql(true);
		return jpaVendorAdapter;
	}

	@Override
	protected Map<String, Object> getVendorProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("API for LDARS Data Save and Retrive").description("This API gives LDARS to save and retrive Parameter details")
//				.version("1.0").build();
//	}
//
//	@Bean
//	public Docket aclApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("ldarsperems").apiInfo(apiInfo()).select()
//				.paths(regex("/ldars.*")).build();
//	}
}
