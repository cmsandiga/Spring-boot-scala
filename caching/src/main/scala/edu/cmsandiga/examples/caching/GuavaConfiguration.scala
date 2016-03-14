package edu.cmsandiga.examples.caching

import java.util.concurrent.TimeUnit

import com.google.common.cache.CacheBuilder
import org.springframework.cache.guava.GuavaCacheManager
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class GuavaConfiguration {

  @Bean
  def guavaCache() ={
    val cacheManager = new GuavaCacheManager()
    cacheManager.setCacheBuilder(
      CacheBuilder.newBuilder().expireAfterWrite(5, TimeUnit.SECONDS).maximumSize(100)
    )
    cacheManager
  }

}
