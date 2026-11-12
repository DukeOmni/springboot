# Welcome to Learning Area for Springboot

## Branch Versioning API with custom Resolver

### Why?
Once clients depend on your API, you can’t freely rename fields, change types, or remove endpoints without breaking them. Versioning lets you ship breaking changes as a new version while old clients keep working until they migrate.
### How?
Spring Framework 7 / Spring Boot 4 has first-class versioning. You choose one strategy (header, path segment, query param, or media type) and declare the version on each mapping:
1. Override configureApiVersioning Bean/Edditing properties spring.mvc.apiversion (must have default/use.header: API-Version)
2. Map handlers to versions using SpringBoot Annotation.

## Custom Resolver Strategy
You can register more than one resolver, for example a header plus a query param. They’re tried in the order you add them, and the first one that returns a version wins. This helps when you migrate from one style to another.