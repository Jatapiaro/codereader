import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {



        CodeReader cr = new CodeReader();
        StringBuilder sb = new StringBuilder();
        sb.append(""+cr.countLines("/Users/jacobotapia/Desktop/code.cpp")+"\n");
        sb.append(""+cr.countLines("/Users/jacobotapia/Desktop/COJ1140.java")+"\n");
        sb.append(""+cr.countLines("/Users/jacobotapia/Desktop/avion.rb")+"\n");
        sb.append(""+cr.countLines("/Users/jacobotapia/Desktop/some.py")+"\n");
        sb.append(""+cr.countLines("/Users/jacobotapia/Desktop/falso.txt")+"\n");
        System.out.println(sb.toString());

    }
}