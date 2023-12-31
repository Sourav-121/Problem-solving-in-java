import java.sql.SQLOutput;

public class Main {

        public static void main(String args[]){
            //1.sum of array
            int [] arr={2,4,1,5,6};
            array_sum(arr);
            System.out.println();

            //2. largest element in the array.
            int [] arr2={2,4,1,5,6};
            largest(arr2);
            System.out.println();

            //3. even odd in an array.
            even_odd(arr2);
            System.out.println();

            //4--reverse the array
            reverse(arr2);
            System.out.println();

            //5--factorial
            int n=5;
            int ans=fact(n);
            System.out.println(ans);
            System.out.println();

            //6--palindrome

            char [] st={'h','e','l','l','o'};
            char [] st2={'n','o','o','n'};
            palindrome(st);
            palindrome(st2);
            System.out.println();

            //7-prime number check
            int n1=5;
            int n2=90;
            prime(n1);
            prime(n2);
            System.out.println();

            //8--recursive fibonacci series

            int n3=5;
            System.out.print(0+" "+1+" ");

            Fibonaci(0,1,n-2);
            System.out.println();

            //9--linear search
            int search1=4;
            int search2=8;
            linear_search(arr,search1);
            linear_search(arr,search2);

            //10--binary search

            int[] arr3={3,4,5,6,7};
            binary_search(arr3,search1);
            binary_search(arr3,search2);

            //11--find duplicate element

            int [] arr4={1,4,2,5,6,2};
            if(duplicate_element(arr4)){
                System.out.println("duplicate element found.");
            }
            else{
                System.out.println("duplicate element not found.");
            }

            //12--count vowels and consonant

            char [] s={'s','o','u','r','a','v'};
            vowel_consonant(s);

            //13 multiplication table
            int n4=5;
            mul_table(n4);


            //14--5*5 matrix addition

            int[][] mat1={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
            int[][] mat2={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
            mat_addition(mat1,mat2);

            //15-average of an array

            average(arr);


            //16--leap year check

            int y=2023;
            int y1=2024;
            leap_year(y);
            leap_year(y1);

            //17--diamond pattern

            pattern();

            //18--reverse a string using char
            reverse_string(st);

            //19--Armstrong number

            int arms=153;
            int arms2=123;
            armstrong(arms);
            armstrong(arms2);

            //20--max-min

            max_min(arr);

            //21-calculate interest

            int p=4325;
            double r=.06;
            int t=5;

            interest(p,r,t);

            //22--temperature converter

            double c=98;
            double f=208.4;

            temperature(c,f);

            //23--check uppercase, lowercase, digit or s.chr

            char ch='@';
            Check_char(ch);

            //24--second largest
            getMax(arr);

            //25--sum of numbers in a string
            String sc="sou121rav";
            sum_string(sc);



        }

        //1.1--sum of array elements
    public static void array_sum(int [] arr){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    //2.1-- largest element in the array.
    public static void largest(int [] arr) {
        int l = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (l < arr[i]) {
                l = arr[i];
            }
        }
        System.out.println(l);



    }

    //3.1--even_odd in array
    public static void even_odd(int [] arr){
        int c=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                c++;
            }
        }
        System.out.println("number of even elements= "+c );
        System.out.println("number of odd elements= "+(arr.length-c));
    }


    //4.1--reverse the array

    public static void reverse(int [] arr){
        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();

    }


    //5.1--factorial
    public static int fact(int n){
        if(n==1 || n==0) return 1;

        int a=fact(n-1);
        int f=n*a;
        return f;
    }

    //6.1--palindrome
    public static void palindrome(char[] st){
            int j=st.length-1;

            for(int i=0;i<=st.length/2;i++){
                if(st[i]!=st[j]){
                    System.out.println("This string is not palindrome.");
                    return;
                }
                j--;
            }
        System.out.println("This string is palindrome.");
    }

    //7.1---prime number check

    public static void prime(int n){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("It is not a prime number.");
                    return;
                }
            }
        System.out.println("It is a prime number.");
    }

    //8.1--recursive fibonacci series

    public static void Fibonaci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        Fibonaci(b,c,n-1);
    }

    //9.1--linear search

    public static void linear_search(int[] arr, int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    System.out.println("given number found.");
                    return;
                }
            }
        System.out.println("given number not found.");
    }

    //10.1--binary search

    public static void binary_search(int[] arr, int key){

            int l=0, h=arr.length-1, mid=0;
            while(l<=h){
             //   mid=l+(h-l)/2;
                mid=(l+h)/2;
                if(arr[mid]==key){
                    System.out.println("number found.");
                    return;

                }
                else if(arr[mid]>key){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }

        }
        System.out.println("number not found.");
    }

    //11.1--find duplicate element

    public static boolean duplicate_element(int [] arr){

            for(int i=0;i<=arr.length-2;i++){

                for(int j=i+1;j<=arr.length-1;j++){

                    if(arr[i]==arr[j]) return true;
                }
            }
            return false;
    }

    //12.1--vowel and consonant
    public static void vowel_consonant(char[] s){

        int count=0;

        for(int i=0;i<s.length;i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                count++;
            }
        }
        System.out.println("number of vowels: "+count);
        System.out.println("number of consonants: "+(s.length-count));
    }

    //13.1--multiplication table

    public static void mul_table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

    //14.1--5*5 matrix addition
    public static void mat_addition(int[][] mat1, int [][] mat2){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat1[i][j]=mat1[i][j]+mat2[i][j];
            }

        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //15-1--average of an array

    public static void average(int[] arr){
            float sum=0;
            float av=0;

            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            av= (sum/arr.length);
        System.out.println("Average of the array: "+av);
    }



    //16-1--leap year check
    public static void leap_year(int y){
        if(y%4==0 && y%100!=0 || y%400==0){
            System.out.println(y+" is a leap year.");
        }
        else{
            System.out.println(y+" is not a leap year.");
        }
    }

    //17.1--diamond pattern

    public static void pattern(){
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //18.1--reverse a string

    public static void reverse_string(char[] st){
        System.out.print("main string: ");
            for(int i=0;i<st.length;i++){
                System.out.print(st[i]);
            }
        System.out.println();

        System.out.print("reverse string: ");
        for(int i=st.length-1;i>=0;i--){
            System.out.print(st[i]);
        }
        System.out.println();
    }

    //19.1--Armstrong number

    public static void armstrong(int n){
        int l=(int)(Math.log10(n)+1);
        int temp=n;
        int ans=0;

        while(temp>0){
        int r=temp%10;
         temp=temp/10;
         ans+=Math.pow(r,l);

        }

        if(ans==n) System.out.println(n+" is a palindrome number.");
        else System.out.println(n+" is not a palindrome number.");

    }

    public static void max_min(int [] arr){
            int max=arr[0];
            int min=arr[0];

            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                else{
                    min=arr[i];
                }
            }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }

    //21.1--interest
    public static void interest(int p, double r, int t){
            double inter=(double)(p*r*t);
        System.out.println(inter);
    }

    //22.1--temperature converter
    public static void temperature(double c,double f){
        double cs=((f-32)/9)*5;
        double ft=((c/5)*9)+32;
        System.out.println("celsius: "+c+" to fahrenheit: "+ft);
        System.out.println("fahrenheit: "+ft+" to celsius: "+cs);
    }

    //23.1--check uppercase, lowercase, digit or s.chr
    public static void Check_char(char ch){
            if(ch>='A' && ch<='Z'){
                System.out.println("Uppercase.");
            }
            else if(ch>='a' && ch<='z'){
                System.out.println("Lowercase.");
            }
            else if(ch>='0' && ch<='9'){
                System.out.println("Digit.");
            }
            else{
                System.out.println("Special character.");
            }
    }

    //24.1--second largest
    public static void getMax(int [] ara){
        int max1=ara[0];
        int max2=ara[0];
        for(int i=0;i<ara.length;i++){
            if(max1<ara[i]){
                max2=max1;
                max1=ara[i];
            }
        }
        System.out.println( max2 );

    }

    //25.1--sum of numbers in a string

    public static void sum_string(String sc){
            int sum=0;
            int cn=0;
            for(int i=0;i<sc.length()-1;i++){
                if(sc.charAt(i)>='0' && sc.charAt(i)<='9'){
                       cn=cn*10+(sc.charAt(i)-'0');
                }
                else if(cn>0){
                    sum+=cn;
                    cn=0;
                }
            }
        if(cn>0){
            sum+=cn;
        }

        int l=(int)(Math.log10(sum)+1);
        int sum2=0;

        for(int i=0;i<=l;i++){
            sum=sum%10;
            sum2+=sum;
        }
        System.out.println(sum2);
    }

}