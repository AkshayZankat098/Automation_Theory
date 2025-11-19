package RestAssured;
public class RestAssured_Theory {

/*

-------------------------------------------------- Basic Of APIs -------------------------------------------------------

What is XML and JSON response & why required ?
What are the rest Api architectural design principles

What is APIs testing :
- UI testing (including the behavior of JavaScript pop-up messages) cannot guarantee the functionality of the backend. Therefore, APIs testing is essential.
- Focuses on verifying that the backend logic of your application works correctly independently of the user interface.

Below are the common things that need to be verified while API testing :
 1) Data integrity: Does the API return the correct data in the expected format?
 2) Functionality: Do the API endpoints perform their intended actions (e.g., creating, reading, updating, deleting data)?
 3) Error handling: Does the API handle errors gracefully and return appropriate error codes and messages?
 4) Performance: Does the API respond within acceptable timeframes?
 5) Security: Is the API secure against unauthorized access and vulnerabilities?

-------------------------------------------------- Postman -------------------------------------------------------------

WorkSpace : Area where we maintain all the files and this saved in sign-in google cloud inside the PostMan.
We can create, rename and delete workspace

Collection : Collection is like a folder that holds a bunch of API requests. Think of it as a way to organize and manage your API tests.
We can create, rename and delete collection , Also If we want to run all APIs then simply Run the whole collection

-------------------------------------------------- HTTP Requests -------------------------------------------------------

Request --→ API --→ Processing --→ Response

1) GET : Retrieve the data from the server or database
2) POST : Create new data into server or database
3) PUT : Update existing data on server or database
4) PATCH : Update some portion of data or update partial details
5) DELETE : Delete existing or new data on server or database

-------------------------------------------------- Common Definition In Rest-Assured -----------------------------------
Payloads -
Endpoints – Specific paths in the API that perform operations.
Body – The data sent in the request or received in the response.
Headers – Key-value pairs carrying metadata with request/response.
Path-Parameters -
Parameters – Input values like query, path, or form parameters.
Base URL/URI – Root address of the API before endpoints.
Content-Type – Defines the media type of request/response (JSON, XML).
Request Specification – Defines base URI, headers, params, and authentication.
Response Body – The actual data returned by the API.
Response Status Code – HTTP status code (200, 400, 401, 404, 500).
Response Headers – Metadata like content-type, server info, cache control.
Authentication – Mechanism to secure API access (Basic, OAuth, Token).
Request Methods – Operations like GET, POST, PUT, DELETE, PATCH.
Response Time -
Schema Validation – Whether response matches defined schema.

-------------------------------------------------- Rest-Assured Framework ----------------------------------------------

- Main uses of create framework is code Re-usability (Write once, use multiple times.),
- Maintainability (Ease of modifying, fixing, and enhancing the system), Readability (Easy to understand and maintain)

>>>>- Below is the folder structure

src-main-java : Framework logic (Abstract_Method, POM structure file & POJOs for rest assured)
src-main-resource : If any resource is required then add
src-test-java : Actual test cases (Step Definition Files, Test Runner, BaseTest Files)
src-test-resource : Feature Files

1) Given
2) When
3) Then











 */
}
