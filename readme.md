- https://youtrack.jetbrains.com/issue/IDEA-384663/Spring-xml-import-beans-from-resources-without-classpath-classpath-prefixes-are-not-resolved: use for example the 
 `app-module/src/main/resources/moduleApp/nested/to_upper_level.xml`,
 `app-module/src/main/resources/no_prefix.xml` or `web-module/src/main/webapp/WEB-INF/application-context.xml`
Not repeatable in the master branch
- https://youtrack.jetbrains.com/issue/IDEA-384665/Spring-xml-import-resources-are-not-resolved-if-referenced-from-the-module-that-doesnt-have-them-in-its-classpath: 
 use the `module-c/src/main/resources/import_from_submodule.xml` file
   
 