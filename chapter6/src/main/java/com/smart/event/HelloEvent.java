package com.smart.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * Created by coding-dong on 2018/6/13.
 */
public class HelloEvent extends ApplicationContextEvent{


    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public HelloEvent(ApplicationContext source) {
        super(source);
    }

    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
