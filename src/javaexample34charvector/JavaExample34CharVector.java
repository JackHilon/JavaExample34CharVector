
package javaexample34charvector;


public class JavaExample34CharVector {

    
    public static void main(String[] args) {
        
        char[] vector=new char[] {'a','b','c','d','1','2','3','4','*','+','#','&'};
        System.out.print("Your vector: ");
        PrintCharArray(vector);
        System.out.println();
        char[] newVector=ToUpperCaseCharArray(vector);
        System.out.print("Your old vector: ");
        PrintCharArray(vector);
        System.out.print("Your new vector: ");
        PrintCharArray(newVector);
        
    }
    private static char ToUpperCaseChar(char a)
    {
        char b=Character.toUpperCase(a);
        return b;
    }
    private static char[] ToUpperCaseCharArray(char[] array)
    {
        char[] res=new char[array.length];
        for (int i = 0; i < res.length; i++) {
            res[i]=ToUpperCaseChar(array[i]);
        }
        return res;
    }
    private static void PrintCharArray(char[] a)
    {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("] ");
    }
    
}
