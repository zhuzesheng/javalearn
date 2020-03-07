package HotelExample;

public class Hotel {
    //房间
    Room[][] rooms;
    //Constructor
    Hotel(){

        rooms = new Room[5][10];
        //赋值
        //1,2标准间 3,4双人间 5 豪华间
        for (int i = 0;i<rooms.length;i++){
            for (int j = 0;j<rooms[i].length;j++){
                if (i==0 || i==1){
                    rooms[i][j] = new Room((i+1)*100+j+1+"","标准间",false);
                }
                if (i==2 || i==3){
                    rooms[i][j] = new Room((i+1)*100+j+1+"","双人间",false);
                }
                if (i==4){
                    rooms[i][j] = new Room((i+1)*100+j+1+"","豪华间",false);
                }
            }
        }

    }
    //对外提供一个打印酒店房间列表的方法
    public void print(){
        for (int i = 0;i<rooms.length;i++){
            for (int j = 0;j<rooms[i].length;j++){
                System.out.println(rooms[i][j]+" ");
            }
            System.out.println( );
        }
    }

    //对外提供一个预定酒店的方法
    public void order(String no){
        for (int i = 0;i<rooms.length;i++){
            for (int j = 0;j<rooms[i].length;j++){
                if (rooms[i][j].getNo().equals(no)){
                    rooms[i][j].setUse(true);
                    return;
                }
            }
        }
    }
}
