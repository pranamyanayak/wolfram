
//Given 1->2->3->4->5->NULL and k = 2,
//return 4->5->1->2->3->NULL.
/*
 * Three pointers.
 * Make sure the first pointer always points to the head.
 * Increment until the difference between the 2 pointers is 2.
 * Increment until the last pointer hits the end of the list.
 * Point the last node to the first.
 * Point the last - k node to null
 * List is rotated.
 */
		
public class RotateList {

}
