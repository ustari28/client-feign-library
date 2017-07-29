# Feign interfaces
We created interfaces for easier communication with micro-services. This interfaces use Spring annotation and give 
a human readable definition. In addition we use [lombok project](https://projectlombok.org) for POJOs definitions.

## Use
If you use this project like dependency it's necessary to define the following property into you application property
 file:
```
client.server.url
```
This property said the location for real service.
## Notes
Definition of services it's in the following repo: [Services](https://github.com/ustari28/eureka-client-services)
