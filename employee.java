public class employee{
    private String ename;
    private int eid;
    private float sal;
    private int pwd;

    public employee(String s,int a,float b,int n){
        this.ename=s;
        this.eid=a;
        this.sal=b;
        this.pwd=n;
    }

    public String getString(){
        return this.ename;
    }
    public void setString(String sc){
        this.ename=sc;
        System.out.println(ename);
    }

    public int geteid(){
        return this.eid;
    }

    public float getsal(){
        return this.sal;
    }
    public void setsal(float f){
        this.sal=f;
        System.out.println(sal);
        }

    public int getpwd(){
        return this.pwd;
    }
    

}

