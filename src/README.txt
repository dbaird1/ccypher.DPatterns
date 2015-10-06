Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all

## To run by specifying arguments from command line [similarly for the 2nd argument and so on ...]
ant -buildfile src/build.xml run -Darg0=firstarg 

## To run by specifying args in build.xml
ant -buildfile src/build.xml run

## To create tarball for submission
ant -buildfile src/build.xml tarzip

CS542 Design Patterns
Fall 2015
PROJECT <1> README FILE

Due Date: <Thursday, October 8, 2015>
Submission Date: <Thursday, October 8, 2015>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <Daniel D'Alessandro, David Baird>
e-mail(s): <ddaless1@binghamton.edu, dbaird1@binghamton.edu>


PURPOSE:

[
  Application of design patterns/principles for a simple multi-threaded application
  that decrypts a Caeser Cipher string.
]

PERCENT COMPLETE:

[
  I believe I have met all provided criteria and completed 100% of this project.
]

PARTS THAT ARE NOT COMPLETE:

[
  None.
]

BUGS:

[
  None.
]

FILES:

[
  This project includes 5 files:

  Driver.java, the file which contains and executes the main function
  FileProcessor.java, the file responsible for reading from a specified file
  CaesarCipherI.java, represents a Caesar Cipher Interface file
  CaesarDecrypt.java, the file to decrypt a Caesar Cipher string
  CreateWorkers.java, creates a specified number of thread 'workers'
  ThreadedDecrypter.java, invokes a method in the FileProcessor to read one line and decrypts the string using the instance of CeaserCipher then writes it to DecodedStore
  DecodedStore.java, stores decoded strings in an output file
  DisplayI.java, represents a Display interface to display data to a file
  Logger.java, prints debug information to stdout
]

SAMPLE OUTPUT:

[
  [ddaless1@binghamton:~ddaless1]$ ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=decoded_strings.txt -Darg2=1 -Darg3=2 -Darg4=1
  change-sample-output-here
]

TO COMPILE:

[
  Extract the files.
  Compile the program with ant -buildfile src/build.xml all .
]

TO RUN:

[
  Please run as: ant -buildfile src/build.xml run -Darg0=<input_file_name> -Darg1=<output_file_name> -Darg2=<cipher-shift> -Darg3=<num-threads> -Darg4=<debug-value>
  For example: ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=decoded_strings.txt -Darg2=1 -Darg3=2 -Darg4=1
]

EXTRA CREDIT:

[
  N/A
]


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<Daniel D'Alessandro, David Baird>

[
  * http://www.javacoffeebreak.com/faq/faq0017.html
]

ACKNOWLEDGEMENT:

[
  None.
]