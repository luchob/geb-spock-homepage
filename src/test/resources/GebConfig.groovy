/*
 This is the Geb configuration file.
 See: http://www.gebish.org/manual/current/#configuration
 */


waiting 
{ 
	timeout = 30
    retryInterval = 1.0 
}

// To run the tests with all browsers just run /gradlew test
baseUrl = "http://balev.eu"
reportsDir = new File("build/reports")
