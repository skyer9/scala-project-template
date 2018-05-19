# scala-project-template

Template for Scala Project

```sh
git clone https://github.com/skyer9/scala-project-template.git
mv scala-project-template MyProject
find MyProject -type f -exec sed -i 's/TemplateProject/MyProject/g' {} +
cd MyProject
sbt assembly
spark-submit --class Main --master local target/scala-2.11/MyProject-assembly-0.0.1.jar
```