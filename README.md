FizzBuzz: What is FizzBuzz?
FizzBuzz is a programming exercise that asks developers to print out a range of numbers. For multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

FizzBuzz as a service
Non integer path parameters should result in an error.
Please demonstrate use of Java 8
Please demonstrate use of one or more design patterns and add comments as to why you choose that pattern.
Code should be delivered as a standalone deliverable with instructions on how to run.

Instructions

Create a small web application that can do fizzbuzz as a web service. This server should support one GET endpoint:

Sample endpoint
http://localhost:8080/fizzbuzz/{upper bound as an integer}  //e.x http://localhost:8080/fizzbuzz/100

This service should consume an upper boundry as a path parameter, and determine which numbers would print "Fizz", "Buzz", and "FizzBuzz". It should then be able to respond to the caller with these numbers, grouped by Fizz, Buzz, and FizzBuzz. For example:

Sample response
HTTP GET - http://localhost:8080/fizzbuzz/15
 
 
{"Fizz": [3, 6, 9, 12],"Buzz": [5, 10],"FizzBuzz": [15]}
