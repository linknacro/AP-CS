
/**
 *
 * @author williamchissoe
 * homework to understand the helpfulness of interfaces, specifically the Comparable Interface
 */
public class ComparingDriver {

    public static void main(String[] args) {

        AccountC a1 = new AccountC("Pat", "Jones", 11461, 500);
        AccountC a2 = new AccountC("Drew", "Ballants", 26468, 2000);

        if (a1.compareTo(a2) < 0 )
            System.out.println("a1  \n   a2");
        else
            System.out.println("a2  \n   a1"  );

        AirlineTicket at1 = new AirlineTicket(650, 2);
        AirlineTicket at2 = new AirlineTicket(500, 3);
        //    Output at1 and at2 to the screen in ascending order. AirlineTicket implements Comparable\
        if (at1.compareTo(at2) < 0 )
            System.out.println("at1  \n   at2");
        else
            System.out.println("at2  \n   at1"  );

        Animal an1 = new Animal("Coyote", 35);
        Animal an2 = new Animal("Brown Bear", 700);
        //    Output to the screen in ascending order.  Animal implements Comparable
        if (an1.compareTo(an2) < 0 )
            System.out.println("an1  \n   an2");
        else
            System.out.println("an2  \n   an1"  );

        Author aut1 = new Author("Nora", "Roberts", 200);
        Author aut2 = new Author("Corin", "Tellado", 4000);
        //    Output to the screen in ascending order.  Author implements Comparable 
        if (aut1.compareTo(aut2) < 0 )
            System.out.println("aut1  \n   aut2");
        else
            System.out.println("aut2  \n   aut1"  );

        Friend f1 = new Friend("Robin", "Roberts", 5);
        Friend f2 = new Friend("Pat", "Roberts", 7);
        //    Output to the screen in ascending order.  Friend does NOT implement Comparable
        if (f1.compareTo(f2) < 0 )
            System.out.println("f1  \n   f2");
        else
            System.out.println("f2  \n   f1"  );

        SoccerPlayer s1 = new SoccerPlayer("Pele", 10);
        SoccerPlayer s2 = new SoccerPlayer("Clint Dempsey", 2);
        //    Output to the screen in ascending order.  SoccerPlayer implements Comparable   
        if (s1.compareTo(s2) < 0 )
            System.out.println("s1  \n   s2");
        else
            System.out.println("s2  \n   s1"  );

        BaseballPlayer bb1 = new BaseballPlayer("Cal Ripkin, Jr", 8);
        BaseballPlayer bb2 = new BaseballPlayer("Ozzie Smith", 1);
        //    Output to the screen in ascending order. 
        if (bb1.compareTo(bb2) < 0 )
            System.out.println("bb1  \n   bb2");
        else
            System.out.println("bb2  \n   bb1"  );

        Employee e1 = new Employee("O'Connor, Sharon", 100000);
        Employee e2 = new Employee("Elliott, Amy", 75000);
        //    Output to the screen in ascending order.  Employee implements Comparable
        if (e1.compareTo(e2) < 0 )
            System.out.println("e1  \n   e2");
        else
            System.out.println("e2  \n   e1"  );

        TaxPayer c1 = new TaxPayer("Pappas, Dini", 50000);
        TaxPayer c2 = new TaxPayer("Luna, Greg", 72000);
        //    Output to the screen in ascending order. 
        if (c1.compareTo(c2) < 0 )
            System.out.println("c1  \n   c2");
        else
            System.out.println("c2  \n   c1"  );

        MovieDirector md1 = new MovieDirector("Spike", "Lee", 69, 65);
        MovieDirector md2 = new MovieDirector("James", "Cameron", 72, 24);
        //    Output to the screen in ascending order. 
        if (md1.compareTo(md2) < 0 )
            System.out.println("md1 \n   md2");
        else
            System.out.println("md2  \n   md1"  );

        MovieProducer mp1 = new MovieProducer("Michael", "Bay", 61, 47);
        MovieProducer mp2 = new MovieProducer("Ron", "Howard", 61, 89);
        //    Output to the screen in ascending order.  MovieProducer implements Comparable  
        if (mp1.compareTo(mp2) < 0 )
            System.out.println("mp1  \n   mp2");
        else
            System.out.println("mp2  \n   mp1"  );

        System.out.println("\n\n\nEnd of program");
    }

}
