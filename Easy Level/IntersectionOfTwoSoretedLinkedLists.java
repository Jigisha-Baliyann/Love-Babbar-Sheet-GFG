class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node res = null;
        Node curr = null;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (head1 != null) {
            map.put(head1.data, map.getOrDefault(head1.data,0) + 1);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (map.containsKey(head2.data) && map.get(head2.data) > 0) {
                map.put(head2.data,map.get(head2.data) - 1);
                if (res == null) {
                    res = new Node(head2.data);
                    curr = res;
                }
                else {
                    curr.next = new Node(head2.data);
                    curr = curr.next;
                }
            }
            head2 = head2.next;
        }
        return res;
    }
}
