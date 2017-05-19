package com.example.naven.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.naven.tictactoe.R.id.sq00;

public class MainActivity extends AppCompatActivity {

    char player = 'x', opponent = 'o';
    char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sq00 = (TextView)findViewById(R.id.sq00);
        sq00.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq00, true);
                updateBoard(0, 0, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }

            }
        });

        final TextView sq01 = (TextView)findViewById(R.id.sq01);
        sq01.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq01, true);
                updateBoard(0, 1, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq02 = (TextView)findViewById(R.id.sq02);
        sq02.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq02, true);
                updateBoard(0, 2, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq10 = (TextView)findViewById(R.id.sq10);
        sq10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq10, true);
                updateBoard(1, 0, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq11 = (TextView)findViewById(R.id.sq11);
        sq11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq11, true);
                updateBoard(1, 1, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq12 = (TextView)findViewById(R.id.sq12);
        sq12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq12, true);
                updateBoard(1, 2, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq20 = (TextView)findViewById(R.id.sq20);
        sq20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq20, true);
                updateBoard(2, 0, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq21 = (TextView)findViewById(R.id.sq21);
        sq21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq21, true);
                updateBoard(2, 1, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();
                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });

        final TextView sq22 = (TextView)findViewById(R.id.sq22);
        sq22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq22, true);
                updateBoard(2, 2, true);
                if(isMovesLeft()){
                    Move bstMove = new Move();
                    bstMove = findBestMove();
                    updateBoard(bstMove.row, bstMove.col, false);
                    updateView(bstMove.row, bstMove.col);
                }
                else
                    recreate();

                if(evaluate()==-10){
                    Toast.makeText(getApplicationContext(), "Computer WON!", Toast.LENGTH_SHORT).show();
                    recreate();
                }


            }
        });






    }

    public void setchar(TextView view, boolean isMax){
        if(isMax){
            view.setText("X");
        }
        else
            view.setText("O");
        view.setOnClickListener(null);
    }

    public class Move
    {
        public int row, col;
    };




    boolean isMovesLeft()
    {
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                if (board[i][j]=='_') {
                    Log.d("Moves left", "Row" + i + " Column " + j);
                    return true;
                }

        return false;
    }


    int evaluate()
    {

        for (int row = 0; row<3; row++)
        {
            if (board[row][0]==board[row][1] &&
                    board[row][1]==board[row][2])
            {
                if (board[row][0]==player)
                    return +10;
                else if (board[row][0]==opponent)
                    return -10;
            }
        }

        for (int col = 0; col<3; col++)
        {
            if (board[0][col]==board[1][col] &&
                    board[1][col]==board[2][col])
            {
                if (board[0][col]==player)
                    return +10;

                else if (board[0][col]==opponent)
                    return -10;
            }
        }

        // Checking for Diagonals for X or O victory.
        if (board[0][0]==board[1][1] && board[1][1]==board[2][2])
        {
            if (board[0][0]==player)
                return +10;
            else if (board[0][0]==opponent)
                return -10;
        }

        if (board[0][2]==board[1][1] && board[1][1]==board[2][0])
        {
            if (board[0][2]==player)
                return +10;
            else if (board[0][2]==opponent)
                return -10;
        }


        return 0;
    }


    int minimax(int depth, boolean isMax)
    {
        int score = evaluate();

        // If Maximizer has won the game return his/her
        // evaluated score
        if (score == 10)
            return score-depth;

        // If Minimizer has won the game return his/her
        // evaluated score
        if (score == -10)
            return score+depth;

        // If there are no more moves and no winner then
        // it is a tie
        if (isMovesLeft()==false)
            return 0;

        // If this maximizer's move
        if (isMax)
        {
            int best = -1000;

            // Traverse all cells
            for (int i = 0; i<3; i++)
            {
                for (int j = 0; j<3; j++)
                {
                    // Check if cell is empty
                    if (board[i][j]=='_')
                    {
                        // Make the move
                        board[i][j] = player;

                        // Call minimax recursively and choose
                        // the maximum value
                        best = Math.max( best,
                                minimax(depth+1, !isMax) );

                        // Undo the move
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }

        // If this minimizer's move
        else
        {
            int best = 1000;

            // Traverse all cells
            for (int i = 0; i<3; i++)
            {
                for (int j = 0; j<3; j++)
                {
                    // Check if cell is empty
                    if (board[i][j]=='_')
                    {
                        // Make the move
                        board[i][j] = opponent;

                        // Call minimax recursively and choose
                        // the minimum value
                        best = Math.min(best,
                                minimax(depth+1, !isMax));

                        // Undo the move
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }
    }

    // This will return the best possible move for the player
    Move findBestMove()
    {
        int bestVal = 1000;
        Move bestMove = new Move();
        bestMove.row = -1;
        bestMove.col = -1;


        // Traverse all cells, evalutae minimax function for
        // all empty cells. And return the cell with optimal
        // value.
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                // Check if celll is empty
                if (board[i][j]=='_')
                {
                    // Make the move
                    board[i][j] = opponent;

                    // compute evaluation function for this
                    // move.
                    int moveVal = minimax(0, true);
                    Log.d("moveVal ", "values "+moveVal);

                    // Undo the move
                    board[i][j] = '_';

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (moveVal < bestVal)
                    {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }



        return bestMove;
    }

    public void updateBoard(int row, int col, boolean isMax){
        if(isMax){
            board[row][col]='x';
        }
        else{
            board[row][col]='o';
        }
    }

    public void updateView(int row, int col){
        if(row==0){
            if(col==0){
                TextView sq00 = (TextView)findViewById(R.id.sq00);
                setchar(sq00, false);
                sq00.setOnClickListener(null);
            }
            if(col==1){
                TextView sq01 = (TextView)findViewById(R.id.sq01);
                setchar(sq01, false);
                sq01.setOnClickListener(null);
            }
            if(col==2){
                TextView sq02 = (TextView)findViewById(R.id.sq02);
                setchar(sq02, false);
                sq02.setOnClickListener(null);
            }
        }

        if(row==1){
            if(col==0){
                TextView sq00 = (TextView)findViewById(R.id.sq10);
                setchar(sq00, false);
                sq00.setOnClickListener(null);
            }
            if(col==1){
                TextView sq01 = (TextView)findViewById(R.id.sq11);
                setchar(sq01, false);
                sq01.setOnClickListener(null);
            }
            if(col==2){
                TextView sq02 = (TextView)findViewById(R.id.sq12);
                setchar(sq02, false);
                sq02.setOnClickListener(null);
            }
        }

        if(row==2){
            if(col==0){
                TextView sq00 = (TextView)findViewById(R.id.sq20);
                setchar(sq00, false);
                sq00.setOnClickListener(null);
            }
            if(col==1){
                TextView sq01 = (TextView)findViewById(R.id.sq21);
                setchar(sq01, false);
                sq01.setOnClickListener(null);
            }
            if(col==2){
                TextView sq02 = (TextView)findViewById(R.id.sq22);
                setchar(sq02, false);
                sq02.setOnClickListener(null);
            }
        }
    }
}



