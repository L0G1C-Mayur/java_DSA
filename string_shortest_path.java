public class string_shortest_path {
    public static float getshortestpath(String path){
        int x=0;
        int y=0;

        for(int i =0; i<path.length();i++){
            char direction = path.charAt(i);

            if(direction == 'S'){            //south
                y--;
            }
            else if(direction == 'N'){       // north
                y++;
            }
            else if(direction == 'W'){       //west
                x--;
            }
            else{                            //east
                x++; 
            }
        }

        int x_square = x*x;     //(x_2 - x_1)^2    where, x_1 is 0 thats why we wrote only x^2 i.e x*x
        int y_sqaure = y*y;     //(y_2 - y_1)^2    where, y_1 is 0 thats why we wrote only y^2 i.e y*y

        return (float)(Math.sqrt(x_square + y_sqaure));      // Math.sqrt(x_square + y_sqaure) it gives int output but our returntype is float so make it float by help of typecaste i.e  (float)(Math.sqrt(x_square + y_sqaure)

    }
    public static void main (String args[]){
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
}
