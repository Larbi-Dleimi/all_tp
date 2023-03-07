package ma.education.tp.FunctionalInterface;

import java.util.regex.Pattern;

public class TestFunctionInterface {

    public static void main(String[] args){

        ITestable testable = new ITestable() {
            @Override
            public Boolean isCorrect(String mail) {
                return Pattern.compile("^(.+)@(\\\\S+)$").matcher(mail).matches();
            }
        };

        ITestable testable1 = mail -> Pattern.compile("^(.+)@(\\\\S+)$").matcher(mail).matches();

        System.out.println(testable1.isCorrect("aaaa@gmail.com"));

        IOperation operation = (a, b) -> a+b;

        System.out.println(operation.addition(12,5));

        ILogger logger = log -> System.out.println(log);

        logger.display("Hello logger");





    }
}
