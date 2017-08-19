package hello

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import scala.collection.JavaConverters

class Handler extends RequestHandler[String, String] {
	def handleRequest(input: String, context: Context): String = {
		return "hello scala on serverless!" + input
	}
}
