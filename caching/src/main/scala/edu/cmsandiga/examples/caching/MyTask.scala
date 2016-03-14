package edu.cmsandiga.examples.caching

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Component
class MyTask @Autowired()(myService: MyService) {

  @Scheduled(cron="* * * * * *")
  def init(): Unit = {
    println(myService.webserviceCall())
  }
}
