package LinkedList;

import java.util.LinkedList;

public class NumLinkedList {
	private LinkedList<Integer> nums;

	public LinkedList<Integer> getNums() {
		return nums;
	}

	public NumLinkedList(){
		nums = new LinkedList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
	}

	public LinkedList<Integer> swapNums() {
		if(nums.size() > 1){
			int first = nums.getFirst();
			int last = nums.getLast();
			nums.set(0, last);
			nums.set(nums.size() -1, first);
		}
            return  nums;
	}
}
