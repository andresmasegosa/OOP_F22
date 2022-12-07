package session13.mathexpression;

import session13.visitors.Element;

public abstract class Node implements Element {
    protected String string;

    public Node(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}