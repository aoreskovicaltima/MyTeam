public class SumAverage {
    public static void main(String arg []){
        int n=11,result=0;
        int a[]= new int [11];

        a[0]=11;
        a[1]=12;
        a[2]=13;
        a[3]=14;
        a[4]=15;
        a[5]=16;
        a[6]=17;
        a[7]=18;
        a[8]=19;
        a[9]=20;
        a[10]=21;

        for(int i=0;i<n;i++)
            result=result+a[i];
        System.out.println("Prosjecna cijena igraca je "+ result/n + " milijuna eura.");

    }



}