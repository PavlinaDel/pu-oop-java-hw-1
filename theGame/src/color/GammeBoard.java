package color;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import color.GameTile;

public class GammeBoard extends JFrame {
        private ArrayList<Object> pieceCollection;

    public GammeBoard () {

        this.pieceCollection = new ArrayList<>();


        this.setSize(500, 500);
         this.setVisible(true);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row <5; row++) {
            for(int col=0; col <5; col++) {

                GameTile tile = new GameTile(row,col);
                tile.render(g);


            }
        }

    }
}
