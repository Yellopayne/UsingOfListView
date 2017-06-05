package yello.kontrolery;

/**
 * Created by User on 2017-05-27.
 */
public class Kontrolery  {
    private String name;
    private int pic;
    private String descript;




    public static final  Kontrolery KontroleryArray[] ={
      new  Kontrolery("LPK-25",R.drawable.lpk25_web_large,"Kontroler MIDI typu mini"),
      new Kontrolery("MPK-225", R.drawable.mpk225,"Pokazniejszy kontroler o wiekszych mozliwosciach")
    };

    private Kontrolery(String n, int resource, String des){
        this.name =n;
        this.pic =resource;
        this.descript=des;

    }



    public String getDescript() {
        return descript;
    }

    public int getPic() {

        return pic;
    }

    public String getName() {

        return name;

    }

    public String toString(){
        return this.name;
    }



}

