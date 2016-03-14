package edu.cmsandiga.examples.caching

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class MyService {

  @Cacheable(cacheNames = Array("hosts"))
  def webserviceCall(): String = {
    println("Calling from Service")
    "hello world"
  }

}
