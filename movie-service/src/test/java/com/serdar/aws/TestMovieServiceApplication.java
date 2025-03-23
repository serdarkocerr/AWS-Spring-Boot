package com.serdar.aws;

import org.springframework.boot.SpringApplication;
// bu test ise, normal uygulamayı çalıştırma testidir.
// yani smoke test olabilir.
// normalde uygulamayı test edebilmek için, PostgreSQL konfigürasyonu yapılmalı ve database ayakta olmalıdır.
// bu testte uygulama normal çalışıyor ama database olarak bir konfigürasyona gerek yok. TestContainer a ECS den verilen
// postgre docker image'i çalıştırılıp test db var gibi yapılabilir.

// application.properties teki 7070 portundan embedded tomcati i çalıstırır.
//http://localhost:7070/api/movies
public class TestMovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(AwsApplication::main).with(TestContainersConfiguration.class).run(args);
	}

}
