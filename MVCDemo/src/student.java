public class student implements AutoCloseable {
    private int id;
    private String name;

    student(){}
    public student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void close() throws Exception {

    }
}
