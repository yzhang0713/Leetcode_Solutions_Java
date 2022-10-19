/**
 * Problem 2. Add Two Numbers
 */
public class AddTwoNumbers {

    private class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {
            val = 0;
            next = null;
        }
        public ListNode(int val) {
            this.val = val;
            next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(val);
            ListNode pointer = next;
            while (pointer != null) {
                sb.append(",");
                sb.append(pointer.val);
                pointer = pointer.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode pointer = sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int digitAddition = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = digitAddition / 10;
            digitAddition %= 10;
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = digitAddition;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if (carry > 0) {
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = carry;
        }
        return sum.next;
    }

    public String addTwoNumbersTestHelper(int v1, int v2) {
        return addTwoNumbers(buildListNodeWithInteger(v1), buildListNodeWithInteger(v2)).toString();
    }

    private ListNode buildListNodeWithInteger(int v) {
        if (v == 0) {
            return new ListNode();
        }
        ListNode l = new ListNode();
        ListNode pointer = l;
        while (v != 0) {
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = v % 10;
            v /= 10;
        }
        return l.next;
    }
}
