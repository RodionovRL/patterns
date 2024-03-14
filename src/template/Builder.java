package template;

public abstract class Builder {
    public abstract void test();
    public abstract void lint();
    public abstract void assemble();
    public abstract void deploy();

    final public void build(){
        this.test();
        this.lint();
        this.assemble();
        this.deploy();
    }
}
