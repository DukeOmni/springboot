# Welcome to Learning Area for Springboot

## Branch Versioning API with request Header

### Why?
Once clients depend on your API, you can’t freely rename fields, change types, or remove endpoints without breaking them. Versioning lets you ship breaking changes as a new version while old clients keep working until they migrate.
### How?
Spring Framework 7 / Spring Boot 4 has first-class versioning. You choose one strategy (header, path segment, query param, or media type) and declare the version on each mapping:
1. Override configureApiVersioning Bean/Edditing properties spring.mvc.apiversion (must have default/use.header: API-Version)
2. Map handlers to versions using SpringBoot Annotation.
## Path Segment Strategy
This is the most visible and cache-friendly option, and it’s the familiar /v1/ style. Some details to know:
1. The mapping must declare a {version} URI variable in that segment.
2. The default parser strips the v prefix.
3. You can add the /api/{version} prefix centrally with PathMatchConfigurer.addPathPrefix(...) instead of repeating it on every controller.
4. With this strategy the version is effectively always present, so a default version doesn’t really apply.
5. The cost is that a resource’s URI changes between versions, which purists argue goes against REST principles.
