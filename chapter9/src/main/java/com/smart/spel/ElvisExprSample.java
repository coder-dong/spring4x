package com.smart.spel;

import com.smart.PlaceOfBirth;
import com.smart.User;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;

public class ElvisExprSample {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("tom");
        user.setLastVisit(new Date());
        user.setCredits(100);
        user.setPlaceOfBirth(new PlaceOfBirth("中国","厦门"));

        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext(user);

        String userName = parser.parseExpression("UserName?:'用户名为空'").getValue(context, String.class);
        System.out.println(userName); // tom
        user.setUserName(null);
        userName = parser.parseExpression("UserName?:'用户名为空'").getValue(context, String.class);
        System.out.println(userName); // 用户名为空

        testElvis();

    }

    public static void testElvis(){
        User user = new User();
        user.setUserName("tom");
        user.setLastVisit(new Date());
        user.setCredits(100);
        user.setPlaceOfBirth(new PlaceOfBirth("中国","厦门"));

        ExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext(user);

        String userName = expressionParser.parseExpression("userName?:'userName is empty'").getValue(evaluationContext, String.class);
        System.out.println(userName);
        System.out.println("<========================>");
        user.setUserName(null);
        userName = expressionParser.parseExpression("userName?:'userName is empty'").getValue(evaluationContext, String.class);
        System.out.println(userName);

    }
}
