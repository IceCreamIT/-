package 第三天作业;
/*public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}*/
 public class Solution {
    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode merge = null;

        if(list1.val<list2.val){
            merge = list1;
            merge.next = mergeTwoList(list1.next,list2);
        }else if(list1.val==list2.val){
            merge = list1;
            merge.next = mergeTwoList(list1.next,list2);
        }else{
            merge = list2;
            merge.next = mergeTwoList(list1,list2.next);
        }
        return merge;
    }
}
