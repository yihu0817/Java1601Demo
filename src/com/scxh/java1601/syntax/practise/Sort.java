package com.scxh.java1601.syntax.practise;

public class Sort {

	public static void main(String[] args) {
//		int[] oldArrays = {79, 97, 68, 77, 89};
//		println("排序前: ",oldArrays);
//		
//		int[] newArrays = sortData(oldArrays);
//
//		println("排序后: ",newArrays);
		
		
//		sortOne();
		
		sortTwo();
	}
	
	
	
	/**
	 *   冒泡排序  冒泡数据往上冒
	 *     
	 *   int[] a = {89,98,78,68,76}  - > {68,76,78,89,98}  
	 *   
                    第一次冒泡：
                   n        n-1     ,  n    <     n-1              
                         .................
                 基本思想:    第五个数据与第四个数比较，若第五个数小于第四个数则交换位置，   {89,98,78,68,76}
		                         第四个数据与第三个数比较，若第四个数小于第三个数则交换位置       {89,98,68,78,76}
		                         三                      二               ,    三    <     二                               {89,68,98,78,76}
		                         二                      一               ,    二                  一                               {68,89,98,78,76}
		                         
	    
	 */
	public static void sortOne(){
		int[] a = {89,98,78,68,76};
		
		for(int j = 0; j < a.length-1; j++){
			
			for(int i = a.length-1; i > j; i--){     // i=4,3
		          if(a[i] < a[i-1]){                //a[4] < a[3]   a[3]<a[2]
		             int temp = a[i];
		             a[i] = a[i-1];
		             a[i-1] = temp;
		          }
		          
			}
			
			println(j,a);
		}
	}
	/**
	 * 冒泡数据往下沉
	 * 
	 * {89,98,78,68,76}  - > {68,76,78,89,98}  
      
           第一次冒泡：
	     第一个数与第  二 个数比较，若第 一个数大于 第 二个数则交换位置       {89,98,78,68,76}
	        二        		三             		 二      >     三                  		  {89,78,98,68,76}
	        三        		四             		 三      >     四                    		  {89,78,68,98,76}
	        四       		 五             		 四      >     五                    		  {89,78,68,76,98}
	        
	  第二次冒泡：
	  
	  ......
	  
	  第n-1次冒泡：
	  
	 */
	public static void sortTwo(){
		
		int[] a = {89,98,78,68,76};
		
		for(int j = 0; j < a.length-1; j++){
			for(int i = 0; i< a.length-1 - j; i++){
				if(a[i] > a[i+1]){
					swap(a,i,i+1);
				}
				
			}
			println(j,a);
		}
	}
	
	
	/**
	 * 交互数组a，x和y位置数据
	 * @param a
	 * @param x
	 * @param y
	 */
	public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
	}
	
	/**
	 * 交换数组相邻数据
	 * @param a
	 * @param k
	 */
	public static void swap(int[] a,int k){
		int temp = a[k];
		a[k] = a[k+1];
		a[k+1] = temp;
	}
	
    /**
     * 数据交换
     * 分析：
     *   {89,78} -> {78,89}
     */
	public void swap(){
		 int[] a = new int[2]; 
		 a[0] = 89; 
		 a[1] = 79;
		  
		 int min = a[0]; 
		 a[0] = a[1];
		 a[1] = min;
		 
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
