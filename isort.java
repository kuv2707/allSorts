
import JGraph.BarGraph;
public class isort 
{
    public static void main()
    {
        double[] arr=arrGen.arr(200);
        BarGraph bg=new BarGraph(arr);
        bg.show(true);
        
        for(int i=1;i<arr.length;i++)
        {
            var val=arr[i];
            int j=i-1;
            while(j>-1 &&  arr[j]>val)
            {
                bg.setKey(j);
                arr[j+1]=arr[j];
                j--;
                try
                {
                    Thread.sleep(2);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
            arr[j+1]=val;
        }
    }
}
