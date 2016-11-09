/**
 * Created by student1 on 07.11.16.
 */
public class D{
    int c;
    int z;
    public D(int a,int b) {
        c=a;
        z=b;
    }
    public D norm(){
        int res=1;
        for (int i=z;i>0;i--){
            if (c%i==0&&(z%i==0)) {res=i; break;}
        }
        return new D(c/res,z/res);
    }
    public String toString(){
        String cel="";
        String ot="";
        if (c>z){
            cel=Integer.toString(c/z);
            c=c%z;
            for (int e=0;e<cel.length();e++){
                ot=ot+" ";
            }
        }
        return(ot+c+"\n"+cel+"-\n"+ot+z);
    }
    float fl(){
        return (float)c/(float)z;
    }
    D sum(D d2){
        return new D(c*d2.z+d2.c*z,z*d2.z).norm();
    }
    D mult(int i){
        return new D(c*i,z).norm();
    }
}
