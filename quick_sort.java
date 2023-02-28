import JGraph.BarGraph;
import java.util.Stack;

public class quick_sort 
{
    static BarGraph bg;
    public static void main()
    {
        double[] arr=arrGen.arr(200);
        bg=new BarGraph(arr);
        bg.show(true);
        
        quicksort(arr,0,arr.length-1);
    }
    static class LH
    {
        int l,h;
        LH(int l,int h)
        {
            this.l=l;
            this.h=h;
        }
    }
    static void quicksort(double[] arr,int l, int h)
    {
        Stack<LH> stack=new Stack<LH>();
        stack.push(new LH(l,h));
        while(stack.size()>0)
        {
            LH curr=stack.pop();
            l=curr.l;
            h=curr.h;
            if(l>=h)
            continue;
            int piv=partition(arr,l,h);
            stack.push(new LH(l,piv));
            stack.push(new LH(piv+1,h));
            
            try
            {
                Thread.sleep(2);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        
    }
    //TODO: lomuto partition scheme
    static int partition(double[] arr, int l, int h)//hoare partition scheme
    {
        int lp=l-1;
        int hp=h+1;
        double pivot=arr[l];
        bg.setKey(l);
        while(true)
        {
            do
            {
                lp++;
            }
            while(arr[lp]<pivot);
            do
            {
                hp--;
            }while(arr[hp]>pivot);
            if(lp>=hp)
            return hp;//WHY
            swap(arr,lp,hp);
            try
            {
                Thread.sleep(2);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        
    }
    static void swap(double[] arr, int i, int j)
    {
        double t=arr[j];
        arr[j]=arr[i];
        arr[i]=t;
    }
}
