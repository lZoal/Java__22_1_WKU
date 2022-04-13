package BoxPack;

public class BoxMain {
    public static void main(String[] args){
        Box box=new Box(10,"회색");
        box.CheckBox();
        box.SetColor("주황색");
        box.SetSize(25);
        box.CheckBox();
    }
}
