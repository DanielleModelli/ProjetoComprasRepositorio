package br.edu.up.jpa;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.RequestMapping;

//@ComponentScan({ "br.edu.up.jpa.Resource" })
//@EnableJpaRepositories({ "br.edu.up.jpa.Resource" })
@SpringBootApplication
@EnableRabbit
//@EnableEurekaClient
public class ComprasCorpApplication {

	@Value("${queue.order.name}")
	private String orderQueue;
	
	public static void main(String[] args) {
		SpringApplication.run(ComprasCorpApplication.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new Queue(orderQueue, true);
	}
	
	// @RequestMapping("/greeting")
	    //public String greeting() {
	        //return "Hello from EurekaClient!";
	    //}
	 
}
