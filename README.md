# scala-project-template

Template for Scala Project

```sh
$ git clone https://github.com/skyer9/scala-project-template.git
$ mv scala-project-template MyProject
$ find MyProject -type f -exec sed -i 's/TemplateProject/MyProject/g' {} +
$ cd MyProject
$ sbt assembly
$ spark-submit --class Main --master local target/scala-2.11/MyProject-assembly-0.0.1.jar
......
:: USE VERBOSE OR DEBUG MESSAGE LEVEL FOR MORE DETAILS
:: retrieving :: org.apache.spark#spark-submit-parent
        confs: [default]
        0 artifacts copied, 72 already retrieved (0kB/26ms)
Hello, world!
```