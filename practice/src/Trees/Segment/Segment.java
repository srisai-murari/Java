package Trees.Segment;

public class Segment {
    public static void main(String[] args) {
        int [] arr = {3,8,7,6,-2,-8,4,9};
        Segment st = new Segment(arr);
    }


    Node root;

    public Segment(int [] arr){
        //construct the said tree
        this.root = populate(arr, 0, arr.length - 1);
    }

    public Node populate(int [] arr, int start, int end){
        if(start == end){
            //we are at leaf node
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = start + (end - start) / 2;

        node.leftRange = populate(arr, start, mid);
        node.rightRange = populate(arr, mid + 1, end);

        node.value = node.leftRange.value + node.rightRange.value;
        return node;
    }

    public void display(Node node){
        String str = "";

        if(node.leftRange != null){
            str = str + "interval = [" + node.leftRange.start + " - " + node.rightRange.end + " data = " + node.value;
        }
        else str = str + " No left child";

        str = str + "Interval = [" + node.leftRange + " - " + node.rightRange + " data = " + node.value;

        if(node.rightRange != null){
            str = str + "interval = [" + node.rightRange.start + " - " + node.rightRange.end + " data = " + node.value;
        }
        else str = str + " No right child";

    }

















    private class Node{
        int value;
        int start;
        int end;
        Node leftRange;
        Node rightRange;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
