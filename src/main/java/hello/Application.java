package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Although scheduled tasks can be embedded in web apps and WAR files,
 * the simpler approach demonstrated below creates a standalone application.
 * You package everything in a single, executable JAR file, driven by a good old Java main() method.
 *
 * SpringBootApplication is a convenience annotation that adds the following:
 *  - @Configuration tags the class as a source of bean definitions for the application context.
 *  - @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans,
 *    and various property settings. Technically, Spring Boot doesn't have anything to auto-configure when it comes
 *    to scheduling but a future version might.
 *  - @ComponentScan tells Spring to look for other components, configurations, and services in the hello package,
 *    allowing it to find the ScheduledTasks (see the @Component annotation on ScheduledTasks).
 *
 * The EnableScheduling annotation ensures that a background task executor is created.
 * Without it, nothing gets scheduled.
 *
 *  Run the application:
 *  1) ./gradlew build
 *  2) java -jar build/libs/gs-scheduling-tasks-0.1.0.jar
 *
 *  Or, you can run the application using ./gradlew bootRun
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    /**
     * Uses Spring Boot's SpringApplication.run() method to launch an application.
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }
}