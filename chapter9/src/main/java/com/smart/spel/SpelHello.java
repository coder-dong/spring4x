package com.smart.spel;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelHello {
    public static void main(String[] args) {
        ExpressionParser parser =new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello'+' World'");
        String message = (String) exp.getValue();
        System.out.println(message);

        printHello();
    }

    public static void printHello(){
        ExpressionParser parser = new SpelExpressionParser();

        Expression expression = parser.parseExpression("'hello' + ' world'");

        String value = expression.getValue(String.class);

        System.out.println(value);
    }
}
