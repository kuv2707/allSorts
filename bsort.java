
import JGraph.BarGraph;
public class bsort 
{
    public static void main()
    {
        double[] arr=arrGen.arr(100);
        BarGraph bg=new BarGraph(arr);
        bg.show(true);
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                bg.setKey(j);
                if(arr[j]>arr[j+1])
                {
                    var temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
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
    }
}
