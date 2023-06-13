
public class llmiddle {

 //We can also use slow fast pointer to do it in single go.
 //Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 } 
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int tempcount=0;
while(tempcount!=(count/2)){
temp=temp.next;
tempcount++;}
return temp;  
    }
}

