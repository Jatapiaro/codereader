import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeReader {

    private BufferedReader br;
    private FileReader fr;
    private FileValidator fv;

    public CodeReader(){
        fv = new FileValidator();
    }

    public int countLines(String pathToFile){
        if(fv.checkFileType(pathToFile)){
            build(pathToFile);
            return countLines();
        }else{
            return -1;
        }
    }

    private int countLines(){
        try{
            int numberOfLines = 0;
            StringBuilder sb = new StringBuilder();
            String s;
            while((s = br.readLine()) != null) {
                s = s.trim();
                s = s.replaceAll("\".+?\"", "\"\"");
                sb.append(s+"\n");
            }
            String si = sb.toString();
            /*
            * Quita todos los comentarios multiples.
            * Ahora solo debemos hacernos cargo de los
            * que son single
            */
            si = si.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/","").replaceAll("(?s)/\\*.*?\\*/","");
            String[] lines = si.split("\n");
            for(String line : lines){
                if(!line.startsWith("//") && !line.equals("")){
                    numberOfLines++;
                }
            }
            return numberOfLines;
        }catch(IOException e){
            e.printStackTrace();
            return -1;
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void build(String pathToFile){
        try{
            fr = new FileReader(pathToFile);
            br = new BufferedReader(fr);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
