Task:

Create a Java web application that contains a REST resource for adding numbers.
We can send any number of numbers to the application. The numbers are summed and returned.


REST should be accessible as: /api/addUpNumbers


Numbers are sent to REST resource in JSON format:
[1,2,3,4,5,6,7,8]

The result is also returned in JSON format:

{
result: 36
}


Execution:

The end result should be a small maven web project using Embedded version of Jetty.
The RestEasy framework should be used to implement REST resource.


To implement summation, SummaryService class, should be created
This class is injected in REST resource using the Java CDI (SE) for summary calculation.
So, the result of the task should demonstrate the use of CDI in the Java SE environment.
Use OpenJDK 14.

The final testing of the task should be e.g. with curl, for an example:
curl -X POST http://localhost:8080/api/addUpNumbers ...
