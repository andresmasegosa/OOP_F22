package session13.visitors;

import session13.mathexpression.EqualNode;
import session13.mathexpression.IntegerNode;
import session13.mathexpression.Node;
import session13.mathexpression.SumNode;

public class Evaluator implements Visitor{

    private int result;
    private int currentInteger;
    Node lastOperation;

    @Override
    public void visit(IntegerNode node) {
        this.currentInteger=node.getIntValue();
    }

    @Override
    public void visit(SumNode node) {
        this.result += this.currentInteger;
        this.lastOperation = node;
    }

    @Override
    public void visit(EqualNode node) {
        this.lastOperation.accept(this);
    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }
}
