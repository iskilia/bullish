This is Isaac Kilis' admission for the Bullish technical assessment

# Starting the application

```
cd electronicsstore
docker build --build-arg JAR_FILE=build/libs/electronicsstore\*.jar -t myorg/myapp
docker run -p 8080:8080 myorg/myapp
```

# Testing the application

```
TK
```

# Bullish - Java Backend Technical Assessment

We are building the Java back-end of a web-based electronics store’s checkout system. From the
requirements below develop a set of RESTful endpoints and their implementation.
Usage of a framework such as Micronaut or Spring Boot is encouraged but not mandatory - if you
feel more comfortable using something else, then please do so.
Persistence should be achieved either through an In-memory DB or Java data structures – in either
case being sure to demonstrate an understanding of safe concurrent usage.

## Electronic Store’s Requirements
### Admin User Operations

-  Create a new product
-  Remove a product
-  Add discount deals for products (Example: Buy 1 get 50% off the second)

### Customer Operations

- Add and remove products to and from a basket
- Calculate a receipt of items, including all purchases, deals applied and total price

### Your Submission

- Everything should be tested with automated tests. If any requirement is not satisfied, a test
should fail
- Include this document in your repo
- There should be one documented command to start the app
- There should be one documented command to run the tests
- Optimise for code clarity instead of performance
- Push your code to a publicly available git repository and provide a link (github.com is our preferred.)

### Out of scope

- Logging
- Continuous Integration
- Deployment
- Metrics

### Additional references used
- https://spring.io/guides/topicals/spring-boot-docker/
- 
