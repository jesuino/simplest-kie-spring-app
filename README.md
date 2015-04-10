# simplest-kie-spring-app
The simplest Kie Spring app ever

It uses Spring to make the KieBase configuration and fire a single rule that prints Hello World in the console.

Simple use `mvn test` to see the rule being executed.

Main files:

* The rule is in `src/test/resources/com/redhat/gss/kie/hello.drl`;
* Our test class is `HelloKieSpringTest` and it loads the file `src/test/resources/com/redhat/gss/kie/kmodule-spring.xml` as a Spring configuration;
* In `kmodule-spring.xml` you can find the declaration of our default kbase and ksession;
* We get the ksession bean from our Spring context and make it execute all the rules.
