
package TicTacToeProject;

public class WinnerCheck {
char[][] XOboard = ShowBoard.XOboard;

public boolean WhoIsWinner() {
    
//first row check
    if (XOboard[0][0] != '_' && XOboard[0][0] == XOboard[0][1] && XOboard[0][0] == XOboard[0][2])
        return false;
    if (XOboard[0][1] != '_' && XOboard[0][1] == XOboard[0][2] && XOboard[0][1] == XOboard[0][3])
        return false;
    if (XOboard[0][2] != '_' && XOboard[0][2] == XOboard[0][3] && XOboard[0][2] == XOboard[0][4])
        return false;
    if (XOboard[0][3] != '_' && XOboard[0][3] == XOboard[0][4] && XOboard[0][3] == XOboard[0][5])
        return false;
    if (XOboard[0][4] != '_' && XOboard[0][4] == XOboard[0][5] && XOboard[0][4] == XOboard[0][6])
        return false;
    
    //second row check
    
    if (XOboard[1][0] != '_' && XOboard[1][0] == XOboard[1][1] && XOboard[1][0] == XOboard[1][2])
        return false;
    if (XOboard[1][1] != '_' && XOboard[1][1] == XOboard[1][2] && XOboard[1][1] == XOboard[1][3])
        return false;
    if (XOboard[1][2] != '_' && XOboard[1][2] == XOboard[1][3] && XOboard[1][2] == XOboard[1][4])
        return false;
    if (XOboard[1][3] != '_' && XOboard[1][3] == XOboard[1][4] && XOboard[1][3]== XOboard[1][5])
        return false;
    if (XOboard[1][4] != '_' && XOboard[1][4] == XOboard[1][5] && XOboard[1][4] == XOboard[1][6])
        return false;
    
    //third row check
    
    
            if (XOboard[2][0] != '_' && XOboard[2][0] == XOboard[2][1] && XOboard[2][0] == XOboard[2][2])
        return false;
            if (XOboard[2][1] != '_' && XOboard[2][1] == XOboard[2][2] && XOboard[2][1] == XOboard[2][3])
        return false;
            if (XOboard[2][2] != '_' && XOboard[2][2] == XOboard[2][3] && XOboard[2][2] == XOboard[2][4])
        return false;
            if (XOboard[2][3] != '_' && XOboard[2][3] == XOboard[2][4] && XOboard[2][3] == XOboard[2][5])
        return false;
            if (XOboard[2][4] != '_' && XOboard[2][4] == XOboard[2][5] && XOboard[2][4] == XOboard[2][6])
        return false;
     
            //fourth row check
       if (XOboard[3][0] != '_' && XOboard[3][0] == XOboard[3][1] && XOboard[3][0] == XOboard[3][2])
        return false;
            if (XOboard[3][1] != '_' && XOboard[3][1] == XOboard[3][2] && XOboard[3][1] == XOboard[3][3])
        return false;
            if (XOboard[3][2] != '_' && XOboard[3][2] == XOboard[3][3] && XOboard[3][2] == XOboard[3][4])
        return false;
            if (XOboard[3][3] != '_' && XOboard[3][3] == XOboard[3][4] && XOboard[3][3] == XOboard[3][5])
        return false;
            if (XOboard[3][4] != '_' && XOboard[3][4] == XOboard[3][5] && XOboard[3][4] == XOboard[3][6])
        return false;
            
            //fifth row check
               if (XOboard[4][0] != '_' && XOboard[4][0] == XOboard[4][1] && XOboard[4][0] == XOboard[4][2])
        return false;
            if (XOboard[4][1] != '_' && XOboard[4][1] == XOboard[4][2] && XOboard[4][1] == XOboard[4][3])
        return false;
            if (XOboard[4][2] != '_' && XOboard[4][2] == XOboard[4][3] && XOboard[4][2] == XOboard[4][4])
        return false;
            if (XOboard[4][3] != '_' && XOboard[4][3] == XOboard[4][4] && XOboard[4][3] == XOboard[4][5])
        return false;
            if (XOboard[4][4] != '_' && XOboard[4][4] == XOboard[4][5] && XOboard[4][4] == XOboard[4][6])
        return false;
            //sixth row check
               if (XOboard[5][0] != '_' && XOboard[5][0] == XOboard[5][1] && XOboard[5][0] == XOboard[5][2])
        return false;
            if (XOboard[5][1] != '_' && XOboard[5][1] == XOboard[5][2] && XOboard[5][1] == XOboard[5][3])
        return false;
            if (XOboard[5][2] != '_' && XOboard[5][2] == XOboard[5][3] && XOboard[5][2] == XOboard[5][4])
        return false;
            if (XOboard[5][3] != '_' && XOboard[5][3] == XOboard[5][4] && XOboard[5][3] == XOboard[5][5])
        return false;
            if (XOboard[5][4] != '_' && XOboard[5][4] == XOboard[5][5] && XOboard[5][4] == XOboard[5][6])
        return false;
            
            
            
    
    
    //first coloumn check
    if (XOboard[0][0] != '_' && XOboard[0][0] == XOboard[1][0] && XOboard[0][0] == XOboard[2][0])
        return false;
    if (XOboard[1][0] != '_' && XOboard[1][0] == XOboard[2][0] && XOboard[1][0] == XOboard[3][0])
        return false;
    if (XOboard[2][0] != '_' && XOboard[2][0] == XOboard[3][0] && XOboard[2][0] == XOboard[4][0])
        return false;
    if (XOboard[3][0] != '_' && XOboard[3][0] == XOboard[4][0] && XOboard[3][0] == XOboard[5][0])
        return false;
    
    
    //second column check
    if (XOboard[0][1] != '_' && XOboard[0][1] == XOboard[1][1] && XOboard[0][1] == XOboard[2][1])
        return false;
    if (XOboard[1][1] != '_' && XOboard[1][1] == XOboard[2][1] && XOboard[1][1] == XOboard[3][1])
        return false;
    if (XOboard[2][1] != '_' && XOboard[2][1] == XOboard[3][1] && XOboard[2][1] == XOboard[4][1])
        return false;
    if (XOboard[3][1] != '_' && XOboard[3][1] == XOboard[4][1] && XOboard[3][1] == XOboard[5][1])
        return false;
    
    //third column check
     if (XOboard[0][2] != '_' && XOboard[0][2] == XOboard[1][2] && XOboard[0][2] == XOboard[2][2])
        return false;
      if (XOboard[1][2] != '_' && XOboard[1][2] == XOboard[2][2] && XOboard[1][2] == XOboard[3][2])
        return false;
       if (XOboard[2][2] != '_' && XOboard[2][2] == XOboard[3][2] && XOboard[2][2] == XOboard[4][2])
        return false;
       if (XOboard[3][2] != '_' && XOboard[3][2] == XOboard[4][2] && XOboard[3][2] == XOboard[5][2])
        return false;
      
       //fourth column check
       
       if (XOboard[0][3] != '_' && XOboard[0][3] == XOboard[1][3] && XOboard[0][3] == XOboard[2][3])
        return false;
      if (XOboard[1][3] != '_' && XOboard[1][3] == XOboard[2][3] && XOboard[1][3] == XOboard[3][3])
        return false;
       if (XOboard[2][3] != '_' && XOboard[2][3] == XOboard[3][3] && XOboard[2][3] == XOboard[4][3])
        return false;
       if (XOboard[3][3] != '_' && XOboard[3][3] == XOboard[4][3] && XOboard[3][3] == XOboard[5][3])
        return false;
    
       
       //fifth column check
       
       if (XOboard[0][4] != '_' && XOboard[0][4] == XOboard[1][4] && XOboard[0][4] == XOboard[2][4])
        return false;
      if (XOboard[1][4] != '_' && XOboard[1][4] == XOboard[2][4] && XOboard[1][4] == XOboard[3][4])
        return false;
       if (XOboard[2][4] != '_' && XOboard[2][4] == XOboard[3][4] && XOboard[2][4] == XOboard[4][4])
        return false;
       if (XOboard[3][4] != '_' && XOboard[3][4] == XOboard[4][4] && XOboard[3][4] == XOboard[5][4])
        return false;
    
    
    //sixth coulmn check
     if (XOboard[0][5] != '_' && XOboard[0][5] == XOboard[1][5] && XOboard[0][5] == XOboard[2][5])
        return false;
      if (XOboard[1][5] != '_' && XOboard[1][5] == XOboard[2][5] && XOboard[1][5] == XOboard[3][5])
        return false;
       if (XOboard[2][5] != '_' && XOboard[2][5] == XOboard[3][5] && XOboard[2][5] == XOboard[4][5])
        return false;
       if (XOboard[3][5] != '_' && XOboard[3][5] == XOboard[4][5] && XOboard[3][5] == XOboard[5][5])
        return false;
    
    //seventh column check
     if (XOboard[0][6] != '_' && XOboard[0][6] == XOboard[1][6] && XOboard[0][6] == XOboard[2][6])
        return false;
      if (XOboard[1][6] != '_' && XOboard[1][6] == XOboard[2][6] && XOboard[1][6] == XOboard[3][6])
        return false;
       if (XOboard[2][6] != '_' && XOboard[2][6] == XOboard[3][6] && XOboard[2][6] == XOboard[4][6])
        return false;
       if (XOboard[3][6] != '_' && XOboard[3][6] == XOboard[4][6] && XOboard[3][6] == XOboard[5][6])
        return false;
    
    
    for (int i=0;i<4;i++){
    
            for (int j=0;j<5;j++){
            
            if (XOboard[i][j] != '_' && XOboard[i][j] == XOboard[i+1][j+1] && XOboard[i][j] == XOboard[i+2][j+2]){
                        return false;
                        
           
            }

    }
    }
     for (int i=5;i>0;i--){
    
            for (int j=0;j<5;j++){
            
            if (XOboard[i][j] != '_' && XOboard[i][j] == XOboard[i-1][j+1] && XOboard[i][j] == XOboard[i-2][j+2]){
                        return false;
            
            }

    }
    }
    
   
    return true;

    
}

}