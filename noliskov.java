class Birds{
    public void getInfo() {

        System.out.println("I am a bird and I fly");
    }
}

class sparrows extends Bird{

}
class ostriches extends Bird{

}

public class noliskov {
    public static void main(String[] args) {
        sparrows sp=new sparrows();
        sp.getInfo();
        ostriches os=new ostriches();
        os.getInfo();
    }
}
