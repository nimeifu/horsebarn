public class HorseBarn {
    private Horse[] spaces;
    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
                return i;
            }

        }
        return -1;
    }
    }
    pubic void consolidate(){
        for(int i=0;i<this.spaces.length-1;i++){
         if(this.space[i])==null)
        {
          for(int j=i+1=j;j<this.spaces.l);
        }

