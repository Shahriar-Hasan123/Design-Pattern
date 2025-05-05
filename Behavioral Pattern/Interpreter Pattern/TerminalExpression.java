public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data)
    {
        this.data = data;
    }

    public boolean interpret(String context)
    {
        if(context.contains(data))
            return true;
        return false;
    }
}
