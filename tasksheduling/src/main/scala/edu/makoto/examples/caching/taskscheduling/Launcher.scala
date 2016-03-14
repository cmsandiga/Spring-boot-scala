package edu.makoto.examples.caching.taskscheduling

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class Launcher

object Launcher extends App {

  SpringApplication.run(classOf[Launcher])
}

