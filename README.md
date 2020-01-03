# MaxHeap
- The goal of this project is to implement Max-Heap data structures idea using the Java programing language. 

## How to complier and run the code
- 
  1.Download the java source file, which named "MaxHeapTester.java", to your desktop directory.

  2.Go to the command line. (For Windows user, please press Win+R keys and type "cmd" then press enter key. For MacOs user,   please press command+space keys and type "terminal" and press enter key).

  3.Type "cd desktop" in command line.

  4.Type "javac MaxHeapTester.java" in command line.

  5.Type "java MaxHeapTester" in command line.


## implementation
- In order to easily implement the Max-Heap data structure idea, we can use a ArrayList to repersent the Max-Heap and we ingore the first element in the ArrayList on purpose.(Note: We can not just simply skip the first position of ArrayList and directly insert the items in sceond position of the ArrayList, but we can insert a garbage data to occupy the first position of the ArrayList. Then, we just take care of those data, which locate from the second position of the list to the end of the list.)
- As you can see the picture in the below, it show how an ArrayList can be used to repersent a Max-Heap.
<img width="430" alt="Screen Shot 2020-01-01 at 6 17 27 PM" src="https://user-images.githubusercontent.com/25276186/71649457-ce52d000-2cc3-11ea-8dca-57fdf5429cf5.png">

## Explaination to function named "remove_the_biggest"
-  when we want to remove the biggest number, we just remove the element at the top of the heap and move the last element at the heap to the top of the heap. Then, we perform reheapify process to guarantee the Max-Heap in a ideal structure. 
###### Explaination to reheapify process
-After we remove th biggest numbe from the heap and move the last element at the heap to the top of the heap, we travel the Max-Heap from the top of the Heap to the bottom of the heap so that we can repeatedly compare the value of the each root element and the value it's left and right children until a ideal heap structure has been rebuild again.In addition, since we use the an ArrayList to repersent the Max-heap and we ignore the first element in the ArrayList, the index of left child equal it's parents's index multiple by 2 and the indx of th right child is equal to it's parents's index multiple by 2 and plus 1.     
###### Following picture show the details of remove_the_biggest function
<img width="1309" alt="Screen Shot 2020-01-02 at 11 31 48 PM" src="https://user-images.githubusercontent.com/25276186/71711976-308cfd00-2db8-11ea-91f8-c5a32f17ae15.png">

## Test cases
- Insert 15,2,18,7,4,14,20,71,6 and 3 to an empty Max Heap.
###### Following pictures show the detail of Max-Heap after each element were inserted manually.
![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712092-9c6f6580-2db8-11ea-910a-c6032beb1c41.jpg)
![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712109-a729fa80-2db8-11ea-8036-04e8cbe10e92.jpg)
###### Following pictures show each steps of building Max-Heap by program.
![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712361-ba899580-2db9-11ea-8bbb-a43c8129d966.jpg)

![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712414-f886b980-2db9-11ea-81bc-a0349e41b663.jpg)
###### Following picture show the step of removing first,second and third biggest element from the Max-Heap and process of reheapify after each biggest element was removed.
![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712850-ea399d00-2dbb-11ea-83a6-f800242988eb.jpg)
![CS146_Homework_2](https://user-images.githubusercontent.com/25276186/71712865-fa517c80-2dbb-11ea-91ea-d92d4c7386d5.jpg)

## Credit
Hing Li

