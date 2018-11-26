
容器配置：xml 注解 Java

		1.xml:spring依赖注入的形式
			以setter注入 
			以构造器注入（不建议使用，在实例化是造成资源浪费）
			优先状态：构造器先执行，setter覆盖构造器
			
		2.注解：
			@AutoWire	@inject
			@Component 	@Service	@Controller
			@Qualifier("") 	@Resource(name="")
			
		3.java配置：
			@configuration配置类	
			@bean	注入bean
			@ComponentScan(basePackages="xx.xx")	指定加载时扫描哪个文件
			@Primary	在bean相同的情况下使用primary的属性
			
		4.加载配置：
			ClassPathXmlApplicationContext("xx.xml")
			FileSystemXmlApplicationContext("classpath:xx.xml")
		5.自动加载：
			AnnotationConfigApplicationContext()
			anno.scan("com.example");
			//刷新
			anno.refresh();
			//关闭IOC容器
			anno.registerShutdownHook();
			
			//加载指定配置类
			AnnotationConfigApplicationContext(SampleConfig.class);