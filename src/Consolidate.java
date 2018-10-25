public class Consolidate {
    public void consolidate()
    {
      for(int i=0;i<this.spaces.length-1;i++)
      {
          if(this.space[i]==null)
          {
              for(int j=i+1;j<this.spaces.length;j++)
              {
                  if(this.spaces[j]!=null) {

                      this.spaces[i]=this.spaces[j];
                      this.spaces[j]=null;
                      j=this.spaces.length;
                  }
              }
          }
      }
    }
}
