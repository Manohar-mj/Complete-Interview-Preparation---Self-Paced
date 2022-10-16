class Solution {

    public static Node moveToFront(Node head) {

        // code here

        if(head==null||head.next==null)

        {

            return head;

        }

        Node curr = head;

        

        while(curr.next.next!=null)

        {

            curr = curr.next;

        }

        Node res = curr.next;

        curr.next=null;

        res.next=head;

        return res;

        

    }

}
