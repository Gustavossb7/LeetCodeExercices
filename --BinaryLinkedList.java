import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }

        StringBuilder binaryString = new StringBuilder();
        while(!stack.isEmpty()){
            binaryString.append(stack.pop());
        }

        int getDecimalValue = Integer.parseInt(binaryString.toString(), 2);

        return getDecimalValue;
    }
}