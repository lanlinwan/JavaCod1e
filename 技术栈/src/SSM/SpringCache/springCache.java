package SSM.SpringCache;

public class springCache {
    /*
        Spring Cache
        Spring Cache是一个框架，实现了基于注解的缓存功能，只需要简单地加一个注解，就能实现缓存功能。
        Spring Cache提供了-层抽象，底层可以切换不同的缓存实现，例如:
        ●EHCache
        ●Caffeine
        ●Redis

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
            <version>2.7.3</version>
        </dependency>
     */
    /*
        常用注解:
         注解               说明
        @EnableCaching    开启缓存注解功能，通常加在启动类上

        @Cacheable        在方法执行前先查询缓存中是否有数据，如果有数据，则直接返回缓存数据;如果
                          没有缓存数据，调用方法并将方法返回值放到缓存中
             @Cacheable(cacheName="userCache",key="#形参")
             @Cacheable(cacheName="userCache",key="#形参.属性")


        @CachePut         加方法上,将方法的返回值放到缓存中
             @CachePut(cacheName="userCache",key="#形参.属性") 存入redis生成 cacheName:key 的层次 key
             @CachePut(cacheName="userCache",key="#返回值.属性")
             @CachePut(cacheName="userCache",key="#p0.属性")


        @CacheEvict       将一条或多条数据从缓存中删除
            @CacheEvict(cacheName="userCache",key="#p0.属性")
            @CacheEvict(cacheName="userCache",allEntries=true) 删除userCache下所有的 key

     */
}
