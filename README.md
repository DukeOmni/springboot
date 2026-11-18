# Welcome to Learning Area for Springboot

## Junit and Unit/Integration Testing

### @Before/After Each
Since junit, this method scoped annotation, before or after every test method. Common uses:
1. Creating a new instance of the class under test
2. Resetting or creating mocks
3. Clearing database tables or rolling back a transaction so each test starts clean
4. Resetting a static cache, singleton or clock
5. Capturing System.out, then restoring it afterwards
6. Logging the name of each test with TestInfo
### @Before/After All
This method scoped annotation, runs once before or after every test method runs and done. Common uses:
1. Starting and stopping a database, an embedded server or a Testcontainers container
2. Opening a connection pool or HttpClient
3. Loading large fixture files, config or a Spring-like context
4. Creating a temp directory that all tests in the class share
5. Setting system properties or a default Locale/TimeZone, then restoring them afterwards.

### Need of mock?
* I/O latency. A database query, HTTP call, file read or message-queue publish takes milliseconds to seconds, because it crosses a network or disk boundary. A method call on a mock takes nanoseconds.
* Setup and teardown. Real dependencies often need to be started (a database container, an embedded server), seeded with data, and cleaned up between tests. A mock is just an object created in memory.
* Transitive work. A real OrderService might call a PaymentGateway, which uses an HTTP client, which does TLS handshakes and retries. Mocking the first collaborator removes that whole chain.
* Waiting and timing. Code with timeouts, retries or backoff can make tests actually wait. A mock can return a result or throw the error immediately.
* Parallelism. Tests that share a real database or port have to run one at a time or carefully isolated. Tests that use mocks share nothing, so JUnit can run them in parallel safely.
### Mock with MockitoAnnotations.openMocks
More boilerplate, but is more readable, changed classes becomes more transparent, because it requires change in mock
### Mock with MockitoExtension
it’s shorter, cleans up after itself and has strict stubs.