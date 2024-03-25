public class ChessBoard {
    //declaring instance variables
    public static final int size = 8;
    String[][] board = new String[size][size];
    String color1;
    String color2;
    String resetColor;
    //constructors
    public ChessBoard(){
        this.color1 = ConsoleColors.BLACK_BACKGROUND;
        this.color2 = ConsoleColors.RED_BACKGROUND;
        this.resetColor = ConsoleColors.RESET;
    }
    public ChessBoard(String color1, String color2){
        this.color1 = color1;
        this.color2 = color2;
    }
    public ChessBoard(String[][] board){
        this.board = board;
    }

    //getter && setter
    public String getColor1(){
        return color1;
    }
    public void setColor1(String color1){
        this.color1 = color1;
    }
    public String getColor2(){
        return color2;
    }
    public void setColor2(String color2){
        this.color2 = color2;
    }

    //methods
    public ChessBoard createBoard(){
        String[][] board = new String[size][size];
        for(int i = 0 ; i < size ; i++ ){
            for(int j = 0 ; j < size ; j++ ){
                if ( (i + j) % 2 ==0 ){
                    board[i][j] = color1 + "   " + resetColor;
                }
                else{
                    board[i][j] = color2 + "   " + resetColor;
                }
            }
        }
        return new ChessBoard(board);
    }
    //toString
    public String toString(){
        String tem = "";
        for (int i = 0 ; i< board.length ; i++){
            for(int j = 0 ; j< board.length ; j++){
                tem += board[i][j];
            }
            tem+="\n";
        }
        return tem;
    }

    public void giveCoins(){
        board[0][0] = "gcest";
    }
    //main method
    public static void main(String[] args) {
        ChessBoard board1 = new ChessBoard();
        System.out.println(board1.createBoard());
        board1.giveCoins();
    }
}