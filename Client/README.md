1.日志log4j
		日志级别：trace debug info warn error fatal 默认info
		
2、监听器actuator

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

3.添加Client依赖，接作为客户端访问服务器Server

       <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-client</artifactId>
            <version>1.5.6</version>
        </dependency>

4.添加热部署依赖，修改代码后自动重新加载项目
       
       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
        </dependency>