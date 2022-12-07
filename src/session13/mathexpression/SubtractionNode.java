package session13.mathexpression;

import session13.visitors.Visitor;

public class SubtractionNode extends Node{

    public SubtractionNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("-"))
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
        return "SubtractionNode{" +
                "string='" + string + '\'' +
                '}';
    }
}
