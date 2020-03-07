package HotelExample;

public class Room {
    private String no;
    private String type;
    private boolean isUse;
    public Room(){
        super();
    }
    public Room(String no,String type,boolean isUse){
        super();
        this.no = no;
        this.type = type;
        this.isUse = isUse;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public String toString() {
        return "["+no+","+type+","+(isUse?"占用":"空闲")+"]";
}
}