public class AndExpression implements Expression{
    Expression ex1 = null;
    Expression ex2 = null;

    public AndExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    public boolean interpret(String context) {
        return ex1.interpret(context) & ex2.interpret(context);
    }
}
