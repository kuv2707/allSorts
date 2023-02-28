
import JGraph.BarGraph;
public class merge_sort 
{
    static BarGraph bg;
    public static void main()
    {
        double[] arr=arrGen.arr(200);
        bg=new BarGraph(arr);
        bg.show(true);
        for(double k:arr)
        System.out.print(k+"  ");
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        
    }
    public static Object[] mergeSort(double arr[],int s,int e)
    {
        System.out.println(s+" "+e);
        if((e-s+1)<2)
        return new Object[]{s,e};
        int mid=(s+e)/2;
        return merge(mergeSort(arr,s,mid),mergeSort(arr,mid+1,e),arr);
    }
    public static Object[] mergee(Object[] left,Object[] right,double[] arr)
    {
        int l=(int)left[0];
        int h=(int)right[1];
        simpl_sort(l,h+1,arr);
        return new Object[]{l,h};
    }
    public static Object[] merge(Object[] left, Object[] right,double[] arr)
    {
        //
        
        int lefU=(int)(left[1]);
        int rigU=(int)(right[1]);
        int lefL=(int)(left[0]);
        int rigL=(int)(right[0]);
        Object[] ret=new Object[]{lefL,rigU};
        
        double[] mr=new double[rigU-lefL+1];
        int ptr=0;
        int larr=lefL;
        int rarr=rigL;
        while(larr<=lefU && rarr<=rigU)
        {
            if(arr[larr]<arr[rarr])
            mr[ptr++]=arr[larr++];
            else
            mr[ptr++]=arr[rarr++];
        }
        while(larr<=lefU)
        {
            mr[ptr++]=arr[larr++];
        }
        while(rarr<=rigU)
        {
            mr[ptr++]=arr[rarr++];
        }
        for(int i=0;i<mr.length;i++)
        {
            try
            {
                Thread.sleep(2);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
            arr[lefL+i]=mr[i];
        }
        System.out.println();
        return ret;
    }
    static void simpl_sort(int l,int h,double[] arr)
    {
        for(int i=1+l;i<h;i++)
        {
            var val=arr[i];
            int j=i-1;
            while(j>l-1 &&  arr[j]>val)
            {
                bg.setKey(j);
                try
                {
                    Thread.sleep(2);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
}
