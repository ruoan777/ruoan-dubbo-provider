# 项目使用导读
1.dubboOne项目需要与dubboTwo项目配合使用  
2.项目整合了zookeeper,dubbo,完成了一个dubbo的helloworld  
3.使用前,需要先启动zookeeper  
> ```zkServer start```  
或者  
>```zkServer restart```
 
4.项目还映入了dubbo-admin,进行一些生产者和消费者的监控,使用方式,进入dubboOne项目的主目录下面,使用  
> ```java -jar dubbo-admin-0.0.1-SNAPSHOT.jar```

当然,在dubbo官网下载的dubbo-admin源码还需要先进行打包编译  
> ```mvn package -Dmaven.test.skip=true```  

5. 注意各种端口的混淆,如果需要查看端口占用情况,使用命令
> ```lsof -i:8080```

6. zookeeper启动的时候会默认开一个8080端口进行监控,这是一个大坑,导致tomcat部署的时候经常遇到端口冲突,使得tomcat不能在zookeeper
启动的时候开启在8080端口,解决方案
> 
```
vim /usr/local/etc/zookeeper/zoo.cfg
admin.serverPort=8888
```

7.下面是用到的一些url,日后使用时候,如果遇到报错,可以从下面找当初调试通过的url
```
GET http://localhost:8094/dubboTwo/item/list
GET http://localhost:8094/dubboTwo/base/one?param=helloworld
GET http://localhost:8094/dubboTwo/item/page/list?pageNo=3&pageSize=3

POST http://localhost:9013/v1/record/push
{
    "itemId":1,
    "total":2,
    "customerName":"jack"
}

POST http://localhost:8094/dubboTwo/order/record/push
{
    "itemId":1,
    "total":2,
    "customerName":"jack"
}
```
