import scala.io.StdIn

object CheckPalindrome {
    def main(args:Array[String]): Unit = {
        print("Enter the String : ")
        val string: String = StdIn.readLine()
        println(palindromeChecker(string))
    }
    //Function for checking the Palindrome
    def palindromeChecker(originalString:String):String = {
        var tempString : String = ""
        try {
            for (index <- 0 to originalString.length - 1) {
                tempString += originalString.charAt(originalString.length - index - 1)
            }
        } catch {
            case e : StringIndexOutOfBoundsException => {
                println("\"String out of bound exception has arrived !! \"")
            }
        }
        if(tempString.toUpperCase == originalString.toUpperCase) "YES" else "NO"
    }
}
