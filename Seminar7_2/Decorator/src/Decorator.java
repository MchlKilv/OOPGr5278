public class Decorator implements iCalculable {

    private Calculator oldCalculator;
    private Logger logger;

    public Decorator(Calculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(int arg) {

        int firsrArg = oldCalculator.getResult();

        // TODO Auto-generated method stub
        logger.log(
                String.format("First value of calculator is %d. Begin call method sum with param %d", firsrArg, arg));
        iCalculable result = oldCalculator.sum(arg);
        logger.log(String.format("The sum method was called"));

        return result;
    }

    @Override
    public iCalculable mult(int arg) {
        int firsrArg = oldCalculator.getResult();
        // TODO Auto-generated method stub
        logger.log(
                String.format("First value of calculator is %d. Begin call method mult with param %d", firsrArg, arg));
        iCalculable result = oldCalculator.mult(arg);
        logger.log(String.format("The mult method was called"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalculator.getResult();
        // TODO Auto-generated method stub
        logger.log(String.format("Result of calculator is %d", result));
        return result;
    }
}
