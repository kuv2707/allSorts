
import JGraph.BarGraph;
public class ssort 
{
    public static void main()
    {
        double[] arr=arrGen.arr(100);
        BarGraph bg=new BarGraph(arr);
        bg.show(true);
        
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                bg.setKey(j);
                if(arr[j]<arr[min])
                {
                    min=j;
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
            if(min!=i)
            {
                var temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
            
        }
    }
}
