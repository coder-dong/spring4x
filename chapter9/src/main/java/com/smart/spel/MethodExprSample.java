package com.smart.spel;

import com.smart.User;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class MethodExprSample {
    public static void main(String[] args) {
        User user = new User();
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext(user);

        String substring = parser.parseExpression("'Spring SpEL'.substring(7)").getValue(String.class);
        Integer index = parser.parseExpression("'Spring SpEL'.indexOf('SpEL')").getValue(Integer.class);

//        boolean isCorrect = parser.parseExpression("validatePassword('123456')").getValue(context, Boolean.class);
//        isCorrect = parser.parseExpression("validatePassword2('123456')").getValue(context, Boolean.class);
//        isCorrect = parser.parseExpression("validatePassword3('123456')").getValue(context, Boolean.class);
        parser.parseExpression("addInterests('Js','C')").getValue(context, Boolean.class);

        testMethod();

    }

    public static void testMethod(){
        User user = new User();
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext(user);

        System.out.println(parser.parseExpression("'hello world'.length()").getValue(context, Integer.class));
        System.out.println("<================================>");
        System.out.println(parser.parseExpression("'this is my house'.substring(0, 10)").getValue(context, String.class));
        System.out.println("<================================>");
        parser.parseExpression("addInterests('Js','C')").getValue(context, Boolean.class);
        System.out.println(parser.parseExpression("interestsList[0]").getValue(context, String.class));

    }

}
