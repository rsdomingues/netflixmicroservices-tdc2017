
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TDCSimulation1 extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:8765")
		.inferHtmlResources()
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:50.0) Gecko/20100101 Firefox/50.0")
		.disableFollowRedirect

	
	val scn = scenario("Todas as funcionalidades")
		.exec(http("Foo Bar Request")
				.get("/foo/call")
				.check(substring("Fallback").notExists)
				.check(status.is(200)))
        .exec(http("Foo Request")
				.get("/foo/info")
				.check(status.is(200)))
        .exec(http("Bar Request")
				.get("/bar/info")
				.check(status.is(200)))
            
	setUp(
		scn.inject(
    		atOnceUsers(5),
    		constantUsersPerSec(15) during(30 seconds),
    		constantUsersPerSec(30) during(30 seconds),
    		constantUsersPerSec(45) during(30 seconds),
    		constantUsersPerSec(60) during(30 seconds)
    	).protocols(httpProtocol)
    )
}