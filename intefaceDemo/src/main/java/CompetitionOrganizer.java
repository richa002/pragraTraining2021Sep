import java.util.ArrayList;
import java.util.List;

public class CompetitionOrganizer {
    public static void main(String[] args) {



        List<Performer> list = registrationCounter();

        for( Performer p   : list){
           p.performArt();
        }


    }

    public static List<Performer> registrationCounter(){
     List<Performer> performers = new ArrayList();
     performers.add(new SalsaPeformer());
     performers.add(new JazzPeformer());
     performers.add(new ContempoaryPeformer());
      return performers;
    }

}


class SalsaPeformer implements Performer{


    @Override
    public void performArt() {
        System.out.println("salsa");
    }
}

class JazzPeformer implements  Performer{


    @Override
    public void performArt() {
        System.out.println("jazz");
    }
}

class ContempoaryPeformer implements Performer{

    @Override
    public void performArt() {
        System.out.println("contem");
    }
}
 interface Performer{

    void performArt();
}