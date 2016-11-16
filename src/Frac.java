/**
 * Created by student1 on 07.11.16.
 */
public class Frac {
    int c;
    int z;
    Frac(int a, int b) {
        c=a;
        z=b;
    }
    Frac(){
        c=1;
        z=0;
    }
    public String toString(){
        String cel="";
        String ot="";
        if (c>z&&z!=0){
            cel=Integer.toString(c/z);
            c=c%z;
            for (int e=0;e<cel.length();e++){
                ot=ot+" ";
            }
        }
        return(ot+c+"\n"+cel+"-\n"+ot+z);
    }
    Frac makeShort(){
        int a=c;
        int b=z;
        while (a!=0&&b!=0){
            if (a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        int res=(a==0)?b:a;
        return new Frac(c/res,z/res);
    }
    Frac inverce(){
        return new Frac(z,c);
    }
    Frac sum(Frac f){
        return new Frac(c* f.z+ f.c*z,z* f.z).makeShort();
    }
    Frac sum(int i){
        return new Frac(c+z*i,z);
    }
    Frac mult(int i){
        return new Frac(c*i,z).makeShort();
    }
    Frac mult(Frac f){
        return new Frac(f.c*c,f.z*z).makeShort();
    }
    Frac div(int i){
        return new Frac(c,z*i);
    }
    Frac div(Frac f){
        return new Frac(c*f.z,z*f.c);
    }
    boolean isShorten(){
        return new Frac(c,z).makeShort()==new Frac(c,z);
    }
    boolean isEqual(Frac f){
        f.makeShort();
        Frac f1=new Frac(c,z);
        return f.c==f1.c&&f.z==f1.z;
    }
    int compareTo(Frac f){
        Frac f1=new Frac(c,z);
        f.makeShort();
        f1.makeShort();
        int i=0;
        if(f.c>f1.c){
            if(f.z<=f1.z){
                i=-1;
            }
            else{

            }
        }
    }
}
