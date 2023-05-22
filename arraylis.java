import java.util.ArrayList;

public class arraylis {

    public static ArrayList<Integer> abc(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<=10;i++){
            list.add(i);
        }
        return list;
    }
public static void main(String[] args) {
    ArrayList<Integer> list = abc();
    for(int i = 0;i<=list.size();i++){
        System.out.println(list.get(i));
    }
}
}
