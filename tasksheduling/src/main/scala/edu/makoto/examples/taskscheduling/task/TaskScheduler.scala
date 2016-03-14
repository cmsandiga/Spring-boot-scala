package edu.makoto.examples.taskscheduling.task

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Component
class TaskScheduler {

  @Scheduled(cron = "* * * * * *")
  def init(): Unit = {
    println("Hello world")
  }
}
