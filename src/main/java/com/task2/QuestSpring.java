package com.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                                              "applicationContext2.xml");

        Quest quest = context.getBean("questHarry", Quest.class);

//     ------------------- Knight може приймати іншу реалізацію
//      Quest quest = context.getBean("questJones", Quest.class);

        Knight knight = new Knight(quest);
        knight.toDoes();
        context.close();
    }
}
