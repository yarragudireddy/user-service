# SantanderTransactionsAPI

git config --global user.name "yarragudireddy"

git config --global user.email "yarragudi.reddy@coforge.com"

git clone https://github.com/yarragudireddy/SantanderTransactionsAPI.git

git add "files"

git add "file-name"

git commit -m 'comment added'

git push


# Docker file creation and steps

# FROM : To pull the base image
FROM openjdk:11

# 
ADD target/com.santander-0.0.1-SNAPSHOT.jar com.santander-0.0.1-SNAPSHOT.jar

EXPOSE 8085

# To configure a container that will run as an executable

ENTRYPOINT ["java", "-jar", "/com.santander-0.0.1-SNAPSHOT.jar"]

# After completion of docker file we need to run terminal and check the docker version
> docker -version
> docker build -f Dockerfile -t com.santander .

Download the openjdk from docker hub:...

[+] Building 33.1s (8/8) FINISHED
 => [internal] load build definition from Dockerfile                                                                                                                   0.1s
 => => transferring dockerfile: 212B                                                                                                                                   0.0s
 => [internal] load .dockerignore                                                                                                                                      0.0s
 => => transferring context: 2B                                                                                                                                        0.0s
 => [internal] load metadata for docker.io/library/openjdk:11                                                                                                          5.2s
 => [auth] library/openjdk:pull token for registry-1.docker.io                                                                                                         0.0s
 => [internal] load build context                                                                                                                                      0.3s
 => => transferring context: 44.77MB                                                                                                                                   0.2s
 => [1/2] FROM docker.io/library/openjdk:11@sha256:99bac5bf83633e3c7399aed725c8415e7b569b54e03e4599e580fc9cdb7c21ab                                                   27.0s
 => => resolve docker.io/library/openjdk:11@sha256:99bac5bf83633e3c7399aed725c8415e7b569b54e03e4599e580fc9cdb7c21ab                                                    0.0s
 => => sha256:001c52e26ad57e3b25b439ee0052f6692e5c0f2d5d982a00a8819ace5e521452 55.00MB / 55.00MB                                                                       5.4s
 => => sha256:2068746827ec1b043b571e4788693eab7e9b2a95301176512791f8c317a2816a 10.88MB / 10.88MB                                                                       2.0s
 => => sha256:99bac5bf83633e3c7399aed725c8415e7b569b54e03e4599e580fc9cdb7c21ab 1.04kB / 1.04kB  
 

# Run below command to verify the docker images running... 


> docker images
REPOSITORY            TAG       IMAGE ID       CREATED         SIZE
com.santander-0.0.1   latest    552032f50b4d   2 minutes ago   699MB

# We need to run the particluar docker image 
# we need to push and running applcication port 8084 with docker container port 

>docker run -p 8084:8084 com.santander

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.3)

2022-09-07 18:01:47.938  INFO 1 --- [           main] c.s.SantanderTransactionsApiApplication  : Starting SantanderTransactionsApiApplication v0.0.1-SNAPSHOT using Java 11.0.16 on ac58af22d628 with PID 1 (/com.santander-0.0.1-SNAPSHOT.jar started by root in /)
2022-09-07 18:01:47.940  INFO 1 --- [           main] c.s.SantanderTransactionsApiApplication  : No active profile set, falling back to 1 default profile: "default"
2022-09-07 18:01:48.457  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-09-07 18:01:48.523  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 55 ms. Found 1 JPA repository interfaces.
2022-09-07 18:01:49.005  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8084 (http)
2022-09-07 18:01:49.015  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-09-07 18:01:49.015  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
2022-09-07 18:01:49.084  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-09-07 18:01:49.084  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1094 ms
2022-09-07 18:01:49.115  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-09-07 18:01:49.304  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-09-07 18:01:49.316  INFO 1 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
2022-09-07 18:01:49.472  INFO 1 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-09-07 18:01:49.519  INFO 1 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.10.Final
2022-09-07 18:01:49.672  INFO 1 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-09-07 18:01:49.790  INFO 1 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2022-09-07 18:01:50.307  INFO 1 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-09-07 18:01:50.315  INFO 1 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-09-07 18:01:50.779  WARN 1 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-09-07 18:01:51.061  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8084 (http) with context path ''
2022-09-07 18:01:51.070  INFO 1 --- [           main] c.s.SantanderTransactionsApiApplication  : Started SantanderTransactionsApiApplication in 3.554 seconds (JVM running for 3.912) 