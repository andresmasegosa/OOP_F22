package session13.mathexpression;

import session13.visitors.Visitor;

public class SumNode extends Node{

    public SumNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("+"))
            return true;
        else
            return false;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "SumNode{" +
                "string='" + string + '\'' +
                '}';
    }
}
