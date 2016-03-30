package com.scxh.java1601.syntax.practise;

public class Sort {

	public static void main(String[] args) {
		int[] oldArrays = {79, 97, 68, 77, 89};
		println("排序前: ",oldArrays);
		
		int[] newArrays = sortData(oldArrays);

		println("排序后: ",newArrays);
	}
	
	
    /**
     * 数据交换
     * 分析：
     *   {89,78} -> {78,89}
     */
	public void switchData(){
		 int[] a = new int[2]; 
		 a[0] = 89; 
		 a[1] = 79;
		  
		 int min = a[0]; 
		 a[0] = a[1];
		 a[1] = min;
		 
	}
	/**
	 * 冒泡排序
	 * （1）基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
	 * 让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
	 * 按由小到到输出下列数据:{79,97,68,77,89,84,62}
	 * 
	 * 
	 * @param arrays
	 * @return
	 */
	public static int[] sortData(int[] arrays) {
		int length = arrays.length;

		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < length - i - 1; j++) {

				if (arrays[j] > arrays[j + 1]) {
					switchs(arrays,j);
				}

			}
		}
		return arrays;
	}

	/**
	 * 交换数组数据
	 * @param a
	 * @param k
	 */
	public static void switchs(int[] a,int k){
		int temp = a[k];
		a[k] = a[k+1];
		a[k+1] = temp;
	}
	
	/**
	 * 3.简单选择排序
		       基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
		       然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
		       
	 * @param a
	 * @return
	 *                         外循环次数
	 * 分析：   {79,97,68,77,89}    第1次       {68,97,79,77,89}
	 *        内循环找最小值  :68                   
	 *      
	 *      {68,97,79,77,89}     第2次     {68,77,79,97,89}
	 *        内循环找最小值  :77  
	 *       
	 *      {68,77,79,97,89}     第3次     {68,77,79,97,89}
	 *       内循环找最小值  :79 
	 *         
	 *      {68,77,79,97,89}     第4次        {68,77,79,89,97}
	 *       内循环找最小值  :89
	 *       
	 *                           第n次      最小值与第n个位置交换
	 */
	
	public static int[] selectSort(int[] a) {
		
		/**
		 * 外层循环作用：将内层循环所得最小值与外层循环所在位置交互
		 */
		int postion = 0;
		for(int j = 0; j < a.length-1; j++){
			int min = a[j];
			postion = j;
			/**
			 * 内层循环作用：找最小值并记录下最小值所在数组下标
			 */
			for(int i = j+1; i < a.length; i++){
				if(a[i] < min){
					min = a[i];
					postion = i;
				}
			}
			
			a[postion] = a[j];
			a[j] = min;
			
			println(j,a);
		}
		return a;
	}
	
	/**
	 * 显示排序后结果
	 * @param j 排序次数
	 * @param a 结果数组
	 */
	public static void println(int j ,int[] a){
		System.out.print("第"+(j+1)+"次排序  :\t");
		for(int k = 0; k < a.length; k++){
			System.out.print(a[k] + " ");
		}
		System.out.println();
	}
	/**
	 * 显示提示信息
	 * @param msg
	 * @param a
	 */
	public static void println(String msg,int[] a){
		System.out.print(msg);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
