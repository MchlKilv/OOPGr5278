public class Calculator implements iCalculable {
    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public int getResult() {
        // TODO Auto-generated method stub
        return primaryArg;
    }

    @Override
    public iCalculable mult(int arg) {
        // TODO Auto-generated method stub
        primaryArg *= arg;
        return this;
    }

    @Override
    public iCalculable sum(int arg) {
        // TODO Auto-generated method stub
        primaryArg += arg;
        return this;
    }

}