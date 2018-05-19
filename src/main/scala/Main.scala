import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object Main {
    def main(args: Array[String]) {

        val conf = new SparkConf().setAppName("TemplateProject")
        val sc = new SparkContext(conf)

        println("Hello, world!")

        sc.stop()
    }
}
