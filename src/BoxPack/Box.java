package BoxPack;

public class Box {
    int size;
    boolean isEmpty;
    String color;

    Box(){
        isEmpty =false;
    }
    Box(int size,String color){
        isEmpty =false;
        this.size=size;
        this.color=color;
    }
    Box(String color){
        this(0,color);
    }
    Box(int size){
        this(size,"None");
    }

    void SetSize(int size) {
        size= this.size;
    }
    void SetColor(String color) {
        color= this.color;
    }
    void FillBox() {
        isEmpty = false;
    }
    void VacateBox(){
        isEmpty =true;
    }
    void CheckBox() {
        System.out.printf("박스의 크기는 %d이고 색은 %s이며, 박스는 현재 %s있다",size,color,isEmpty ? "비어":"채워져");
    }
}
