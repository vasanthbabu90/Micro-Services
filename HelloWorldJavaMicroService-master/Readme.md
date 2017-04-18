# "Hello World" Micro Service

Language: Java

Framework: Spring

Tool: STS

##for Testing##
https://spring.io/guides/gs/spring-boot/

##run in command 
- java -jar namejar

@springbootannotation
If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.

@componentscan annotation will only scan the package we defined. - by default
declare - @ComponentScan(basePackages = .. ) for other components to scan

##*******Spring 3 supports JSR 330 and will do below things and it needed javax.inject dependency**
@Inject instead of Spring’s @Autowired to inject a bean.
@Named instead of Spring’s @Component to declare a bean.

##******************Controllers useful link
http://www.baeldung.com/spring-requestmapping
http://howtodoinjava.com/spring/spring-mvc/spring-mvc-requestmapping-annotation-examples/
****************************



*******
		/* sample type List<JSONObject> entities = new ArrayList<JSONObject>();
		    for (Entity n : entityList) {
		        JSONObject Entity = new JSONObject();
		        entity.put("id", n.getId());
		        entity.put("address", n.getAddress());
		        entities.add(entity);
		    }*/
*****