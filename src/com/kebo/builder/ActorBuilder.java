package com.kebo.builder;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 10:55 2019/2/2
 * @ Description：
 */
public abstract class ActorBuilder {
    protected  Actor actor=new Actor();
    public abstract void builderType();
    public abstract void builderSex();
    public abstract void builderFace();
    public abstract void builderCostume();
    public abstract void builderHairstyle();

    public  Actor createActor() {
        this.builderType();
        this.builderSex();
        this.builderFace();
        this.builderCostume();
        this.builderHairstyle();
        return actor;
    }
}
