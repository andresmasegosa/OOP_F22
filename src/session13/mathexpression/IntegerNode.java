package session13.mathexpression;

import session13.visitors.Visitor;

public class IntegerNode extends Node{

    int intValue;

    public IntegerNode(String string) {
        super(string);
        this.intValue = Integer.parseInt(string);
    }

    public int getIntValue() {
        return intValue;
    }

    public static boolean detectNode(String string){
        try{
            Integer.parseInt(string);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "IntegerNode{" +
                "intValue=" + intValue +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
