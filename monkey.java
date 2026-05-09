public class monkeys {
    public static void main(String[] args) {
        int n=20,k=2,j=3,m=12,p=12;
        int bananafed=m/k;
        int peanutfed=p/j;
        int remainingbananas=m%k;
        int remainingpeanuts=p%j;
        int totalfed=bananafed+peanutfed;
        int monkeysleft=(m-remainingbananas)/k+(p-remainingpeanuts)/j   ;
        System.out.println("Total monkeys left: " + monkeysleft);

    }
}

