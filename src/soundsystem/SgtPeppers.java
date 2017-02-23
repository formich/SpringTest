package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by aformichetti on 22/02/2017.
 */

@Component
public class SgtPeppers implements CompactDisc{

    private  String title = "Sgt. Peppers' lonely Hearths Club band";
    private  String  artist = "The Beatles";

    public void play(){
        System.out.println("Playing "+ title + " by "+ artist);
    }

}
