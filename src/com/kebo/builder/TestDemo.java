package com.kebo.builder;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 11:00 2019/2/2
 * @ Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        /*ActorController actorController=new ActorController();*/
        ActorBuilder actorBuilder=new HeroBuilder();
        Actor actor=actorBuilder.createActor();
        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getCostume());
        System.out.println(actor.getFace());
        System.out.println(actor.getHairstyle());
    }
}
