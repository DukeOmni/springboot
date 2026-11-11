# Welcome to Learning Area for Springboot

## Branch Versioning API with request Header

### Why?
Once clients depend on your API, you can’t freely rename fields, change types, or remove endpoints without breaking them. Versioning lets you ship breaking changes as a new version while old clients keep working until they migrate.
### How?
Spring Framework 7 / Spring Boot 4 has first-class versioning. You choose one strategy (header, path segment, query param, or media type) and declare the version on each mapping:
1. Override configureApiVersioning Bean/Edditing properties spring.mvc.apiversion (must have default/use.header: API-Version)
2. Map handlers to versions using SpringBoot Annotation.
## Request Query Param Strategy
This is the easiest to try in a browser or curl, and it works well for public or exploratory APIs. The downside is that it mixes a protocol concern into the query string, and some caches and CDNs treat query strings inconsistently.