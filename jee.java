class JEE {
    public static void main(String[] args) {
        int arr[] = {4,3,7,2,6,1};
        int s=arr[0];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<s){
                s=arr[i];
            c++;
            }
        }
        System.out.println("Count: " + c);
    }
}
