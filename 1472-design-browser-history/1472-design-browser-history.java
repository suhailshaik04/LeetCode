class BrowserHistory {
    class Node {
        String val;
        Node pre, next;
        public Node(String val) {
            this.val = val;
        }
    }
    Node cur;
    public BrowserHistory(String homepage) {
        cur = new Node(homepage);
    }
    
    public void visit(String url) {
        Node node = new Node(url);
        cur.next = node;
        node.pre = cur;
        cur = cur.next;
    }
    
    public String back(int steps) {
        while (cur.pre != null && steps > 0) {
            cur = cur.pre;
            steps--;
        }
        return cur.val;
    }
    
    public String forward(int steps) {
        while (cur.next != null && steps > 0) {
            cur = cur.next;
            steps--;
        }
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
