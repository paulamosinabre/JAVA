
class Chessboard {
    public static void main(String[] args) {
        chessboard(3);
        chessboard(4);
    }
    
    public static void chessboard(int size){
        for(int i = 0; i < size; i++){
            int index = (i % 2 == 0) ? 0 : 1;
            for(int j = 0; j < size; j++){
                if(index == 0){
                    System.out.print("1");
                    index = 1;
                } else {
                    System.out.print("0");
                    index = 0;
                }
            }
            System.out.println("");
        }
        System.out.println("--------------");
    }
}
