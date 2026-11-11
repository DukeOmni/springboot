# Welcome to Learning Area for Springboot

## Branch Versioning API with request Header

### Why?
Once clients depend on your API, you can’t freely rename fields, change types, or remove endpoints without breaking them. Versioning lets you ship breaking changes as a new version while old clients keep working until they migrate. 
### How?
Spring Framework 7 / Spring Boot 4 has first-class versioning. You choose one strategy (header, path segment, query param, or media type) and declare the version on each mapping:
1. Override configureApiVersioning Bean/Edditing properties spring.mvc.apiversion (must have default/use.header: API-Version)
2. Map handlers to versions using SpringBoot Annotation.
## Request Header Strategy
URLs stay clean and stable, and it’s easy to apply through gateways and clients. The downside is that the version isn’t visible in the URL, so you can’t test it by pasting a link into a browser, and caches need Vary: API-Version.
