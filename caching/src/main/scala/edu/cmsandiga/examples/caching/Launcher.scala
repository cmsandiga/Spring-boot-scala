package edu.cmsandiga.examples.caching

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableCaching
@EnableScheduling
class Launcher


object Launcher extends App{
  SpringApplication.run(classOf[Launcher])
}
