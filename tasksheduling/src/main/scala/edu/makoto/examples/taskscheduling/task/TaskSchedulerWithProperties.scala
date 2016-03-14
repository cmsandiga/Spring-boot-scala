package edu.makoto.examples.taskscheduling.task

import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class TaskSchedulerWithProperties {


  @Scheduled(cron = "${task.cron}")
  def init(): Unit ={
    println("run cron with properties" )
  }

}
