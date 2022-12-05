package session13.visitors;

import session13.mathexpression.EqualNode;
import session13.mathexpression.IntegerNode;
import session13.mathexpression.SumNode;

public interface Visitor {
    void visit(IntegerNode node);
    void visit(SumNode node);
    void visit(EqualNode node);
}
