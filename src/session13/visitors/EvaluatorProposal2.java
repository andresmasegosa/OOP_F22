package session13.visitors;

import session13.mathexpression.*;

public class EvaluatorProposal2 implements Visitor{

    private int result;
    private int currentInteger;
    Node lastOperation;
    boolean holding=false;

    public EvaluatorProposal2() {
        this.result=0;
        this.lastOperation = new SumNode("+");
    }

    @Override
    public void visit(IntegerNode node) {
        this.currentInteger=node.getIntValue();
        this.holding=true;
        this.lastOperation.accept(this);
        this.holding=false;
    }

    @Override
    public void visit(SumNode node) {
        if (holding)
            this.result += this.currentInteger;
        else
            this.lastOperation = node;
    }

    @Override
    public void visit(EqualNode node) {
    }

    @Override
    public void visit(SubtractionNode node) {
        if (holding)
            this.result -= this.currentInteger;
        else
            this.lastOperation = node;
    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }
}
