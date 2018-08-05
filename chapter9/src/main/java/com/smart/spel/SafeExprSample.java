package com.smart.spel;

import com.smart.PlaceOfBirth;
import com.smart.User;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;

public class SafeExprSample {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("tom");
        user.setLastVisit(new Date());
        user.setCredits(100);
        user.setPlaceOfBirth(new PlaceOfBirth("中国","厦门"));

        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext(user);
        String city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, String.class);
        System.out.println(city); // 厦门
        user.setPlaceOfBirth(null);
        city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, String.class);
        System.out.println(city); // null

        safeExprTest();
    }

    public static void safeExprTest(){
        User user = new User();
        user.setUserName("tom");
        user.setLastVisit(new Date());
        user.setCredits(100);
        user.setPlaceOfBirth(new PlaceOfBirth("中国","厦门"));

        ExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext(user);

        System.out.println(expressionParser.parseExpression("placeOfBirth?.city").getValue(evaluationContext, String.class));

        user.setPlaceOfBirth(null);

        System.out.println("<=======================>");
        System.out.println(expressionParser.parseExpression("placeOfBirth?.city").getValue(evaluationContext, String.class));
    }
}
