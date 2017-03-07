import java.io.File;
public class FileValidator {

    private final String limit_type_file = "cpp|java|c|swift";

    public boolean checkFileType(String path){
        File f = new File(path);
        if(f.exists()){
            return  validFile(f.getName());
        }else{
            return false;
        }
    }

    private boolean validFile(String fileName){
        if(fileName.length()>0){
            String[] parts=fileName.split("\\.");
            if(parts.length>0){
                String extension = parts[parts.length-1];
                return this.limit_type_file.contains(extension);
            }
        }
        return false;
    }

}
