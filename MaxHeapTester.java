/*
Name:Hing li
Student ID:014525901
li_hing@student.smc.edu
hing.li@sjsu.edu
*/
import java.util.*; 
import java.lang.Math; 
public class MaxHeapTester
{
	public static void main(String[] args)
	{
		MaxHeap<Integer> maxheap = new MaxHeap<Integer>();
		maxheap.add(1);
		maxheap.add(10);
		maxheap.add(2);
		maxheap.add(4);
		maxheap.add(5);
		maxheap.add(11);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		MaxHeap<Integer> maxheap1 = new MaxHeap<Integer>();
		maxheap1.add(15);
		maxheap1.add(2);
		maxheap1.add(18);
		maxheap1.add(7);
		maxheap1.add(4);
		maxheap1.add(14);
		maxheap1.add(20);
		maxheap1.add(71);
		maxheap1.add(6);
		maxheap1.add(3);
		//maxheap1.find_first_n_biggest_element(3);//should print out 71,20,18
		maxheap1.find_first_n_biggest_element(3); // should print out 71,20,18,15,14
	}
}

class MaxHeap<Type extends Comparable<Type>>
{
	private ArrayList<Type> arr;
	private int holePosition;
	public MaxHeap()
	{
		arr = new ArrayList<Type>();
		holePosition = 0;
	}
	public void add(Type element)
	{
		if(arr.isEmpty())
		{
			arr.add(element);
		}
		arr.add(++holePosition,element);
		travelHeap_step_by_step(element);
		maxHeapify();

	}
	private void maxHeapify()
	{
		for(int i = holePosition;i>1;i/=2)
		{
			Type tempMax = arr.get(i);
			if(arr.get(i).compareTo(arr.get(i/2))>0)
			{
				System.out.println("Max-Heap after swaped "+arr.get(i/2)+" and "+tempMax+": ");
				arr.set(i,arr.get(i/2));
				arr.set(i/2,tempMax);
				travelHeap();
			}
			else
			{
				break;
			}
		}
	}
	private void travelHeap_step_by_step(Type element)
	{
		System.out.println("Max-Heap after inserting an element :"+element);
		travelHeap();
	}
	public void travelHeap()
	{
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		int level = 1;
		int numberOfNode = (int)Math.pow(2,level) -1;
		for(int i=1;i<arr.size();i++)
		{
			System.out.print(arr.get(i)+" ");
			if(i == numberOfNode)
			{
				System.out.println();
				numberOfNode = (int)Math.pow(2,++level)-1;
			}
		}
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	public void find_first_n_biggest_element(int firstNth)
	{
		ArrayList<Type> tempMaxArr = new ArrayList<Type>();
		Type tempMax;
		for(int i=1;i<=firstNth;i++)
		{
			tempMax = remove_the_biggest();
			tempMaxArr.add(tempMax);
		}
		for(int i=0;i<tempMaxArr.size();i++)
		{
			System.out.println("The first "+(i+1) +" (st/nd)"+" biggest as the following: "+tempMaxArr.get(i));
		}
	}
	private Type remove_the_biggest()
	{
		Type tempMax = arr.get(1);
		arr.set(1,arr.get(holePosition));
		arr.remove(holePosition);
		holePosition--;
		for(int i=1;i<holePosition;)
		{
			//If left child of root is grater than root, and left child greater than right child..
			if((i*2)<=holePosition && arr.get(i*2).compareTo(arr.get(i))>0&&arr.get(i*2).compareTo(arr.get(i*2+1))>0)
			{
				Type temp = arr.get(i*2);
				System.out.println("Max-Heap re-heapify process after swaped "+ temp+" and "+arr.get(i));
				arr.set(i*2,arr.get(i));
				arr.set(i,temp);
				i = i*2;
				travelHeap();
			}
			//If Right child of root is grater than root, and Right child greater than left child..
			else if((i*2+1)<=holePosition&&arr.get(i*2+1).compareTo(arr.get(i))>0&&arr.get(i*2+1).compareTo(arr.get(i*2))>0)
			{
				Type temp = arr.get(i*2+1);
				System.out.println("Max-Heap re-heapify process after swaped "+ temp+" and "+arr.get(i));
				arr.set(i*2+1,arr.get(i));
				arr.set(i,temp);
				i = i*2+1;
				travelHeap();
			}
			//If root is the biggest, then no need to swap number again.
			else
			{
				break;
			}
		}
		System.out.println("Max-Heap after remove the biggest element: "+ tempMax);
		travelHeap();
		return tempMax;
	}
}