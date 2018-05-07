package in.co.basic;

public class GarbageCollector
{
    public static void main(String[] args) throws InterruptedException
    {
    	GarbageCollector t1 = new GarbageCollector();
    	GarbageCollector t2 = new GarbageCollector();
      
        t1 = null;
            System.gc();
         
        t2 = null;
         
        Runtime.getRuntime().gc();
     
    }
     
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
