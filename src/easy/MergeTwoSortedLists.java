package easy;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists main = new MergeTwoSortedLists();
        main.mainHelper();
    }

    public void mainHelper() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a2.next = a3;
        a1.next = a2;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b2.next = b3;
        b1.next = b2;

        //System.out.println(mergeTwoLists(a1, b1));
        System.out.println(mergeTwoLists(null, b1));
        System.out.println(mergeTwoLists(a1, null));
        System.out.println(mergeTwoLists(null, null));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeHelp(list1, list2, new ListNode()).next;
    }

    public ListNode mergeHelp(ListNode l1, ListNode l2, ListNode out) {
        if (l1 == null && l2 == null) {
            return out;
        }
        if (l1 == null) {
            return appendNode(l2, out);
        }
        if (l2 == null) {
            return appendNode(l1, out);
        }
        if (l1.val <= l2.val) {
            appendValue(l1.val, out);
            return mergeHelp(l1.next, l2, out);
        } else {
            appendValue(l2.val, out);
            return mergeHelp(l1, l2.next, out);
        }
    }

    private ListNode appendNode(ListNode toAppend, ListNode root) {
        ListNode current = root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = toAppend;
        return root;
    }

    private void appendValue(int val, ListNode ancestor) {
        ListNode current = ancestor;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }
}
