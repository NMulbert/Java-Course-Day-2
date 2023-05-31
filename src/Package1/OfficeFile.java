package Package1;

public class OfficeFile {
    private  String Description;
    private String Type;
    private String Classification;

    public String GetDescription(){
        return Description;
    }
    public void SetType(String type){
        Type = type;
    }
    public String GetClassification(){
        return Classification;
    }
    private void UpdateClassification(String UpdatedClassification){
        Classification = UpdatedClassification;
    }
}
