class ColorGraph
{
   int x[];
  public void color(int k)
   {
     
     while(true)
     {
         newValue(k);
           if(x[k]==0)
             return ;
           if(k==n)
              return;
          else(k+1)    
              
     }
   }
   
   
   public void newValue(int k)
   {
      while(true)
      {
          x[k] = (x[k]+1)%(m+1);
          if(x[k]==0)
            return;
          for(int j=1; j<n;j++)
          {
             if(//to write condition)
                return;
          }
      
      }
   
   }
}
