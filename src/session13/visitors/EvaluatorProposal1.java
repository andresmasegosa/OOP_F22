package session13.visitors;

import session13.mathexpression.*;

public class EvaluatorProposal1 implements Visitor{

    private int result;
    private int currentInteger;
    Node lastOperation;
    boolean holding=false;

    public EvaluatorProposal1() {
        this.result = 0;
        this.lastOperation = new SumNode("+");
    }

    @Override
    public void visit(IntegerNode node) {
        this.currentInteger=node.getIntValue();

        if (this.lastOperation.getString().equals("+"))
            this.result+=currentInteger;
        else if (this.lastOperation.getString().equals("-"))
            this.result-=currentInteger;

    }

    @Override
    public void visit(SumNode node) {
        this.lastOperation=node;
    }

    @Override
    public void visit(EqualNode node) {
    }

    @Override
    public void visit(SubtractionNode node) {
        this.lastOperation=node;
    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }
}
