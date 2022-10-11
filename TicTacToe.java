import java.util.Scanner;
import java.lang.StringBuffer;

public class TicTacToe
{
    public static void main(String [] args)
    {
        char [][] arr = new char[3][3];
        System.out.println("!!!!!!!!Rows and Columns are starting from 0!!!!!!!!!");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
                arr[i][j] = ' ';
        }


        show(arr);

        for(int i = 0; i<9; i++)
        {
            System.out.print("Enter the row and column: ");
            if(i%2 == 0) turnB(arr);
            else turnA(arr);
            show(arr);
            if(check(arr) == 'x' || check(arr) == 'o')
            {
                System.out.println("You won!!!");
                System.exit(0);
            }
            if(i == 8)
                System.out.println("Match Draw!!!");
        }
        
    }
    public static void turnA(char [][] arr)
    {
        char ch = 'x';
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        arr[row][col] = ch;
        // scan.close();
    }
    public static void turnB(char [][] arr)
    {
        char ch = 'o';
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        arr[row][col] = ch;
        // scan.close();
    }
    public static char check(char [][] arr)
    {
        if(arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
            return 'x';
        else if(arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x')
            return 'x';
        else if(arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
            return 'x';
        else if(arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
            return 'x';
        else if(arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
            return 'x';
        else if(arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
            return 'x';
        else if(arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
            return 'x';
        else if(arr[2][0] == 'x' && arr[1][1] == 'x' && arr[0][2] == 'x')
            return 'x';

        else if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
            return 'o';
        else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o')
            return 'o';
        else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
            return 'o';
        else if(arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
            return 'o';
        else if(arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
            return 'o';
        else if(arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
            return 'o';
        else if(arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
            return 'o';
        else if(arr[2][0] == 'o' && arr[1][1] == 'o' && arr[0][2] == 'o')
            return 'o';
        else 
            return '?';
    }
    public static void show(char [][] arr)
    {
        System.out.println("_________");
        for(int i = 0; i<3; i++)
        {
            System.out.print("|");
            for(int j = 0; j<3; j++)
                System.out.print(arr[i][j] + "|");
            System.out.println();
        }
        System.out.println("---------");

    }
}
