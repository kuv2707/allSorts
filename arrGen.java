class arrGen
{
    public static double[] arr(int n)
    {
        n=500;
        double ndup=n;
        double[] arr=new double[n];
        while(n>0)
        {
            arr[--n]=(int)(Math.random()*2*ndup);
        }
        return arr;
    }
}