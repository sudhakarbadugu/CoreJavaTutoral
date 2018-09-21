class ArraySortDemo4{
   public static void main(String args[]){
   int[] number={5,9,32,1,53,21,6};
   for(int i=0;i<number.length;i++){
   for(int j=0;j<number.length;j++){
   if(number[i]<number[j]){
   int temp=number[i];
   number[i]=number[j];
   number[j]=temp;
   }
}
}
for(int a :number)
System.out.println(a);
}
}
