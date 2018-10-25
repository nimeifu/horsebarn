public class HorseRunner {
    public static void main(String[] args) {
        Horse horse1 = new Unicorn("Secretaritat",12000);
        Horse horse2=new Unicorn("Dustry Trail",22000);
        Horse horse3=new Unicorn("Silver",12000);

        Horse[] horses=new Horse[6];

        horses[1]=horse1;
        horses[2]=horse2;
        horses[5]=horse3;
        HorseBarn barn=new horseBarn(horses);

        System.out.println(barn);
        System.out.println("Dusty Trail is in space: "+barn.findHorseSpace("Dustry Trail"));
        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty Trail is now in space: "+barn.findHorseSpace("Dustry Trail"));
    }
}
