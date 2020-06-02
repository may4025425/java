package com.may;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowCanvas extends Canvas {
    List<Snow> snows = new ArrayList<Snow>();//<>：泛集。Snow類別添加的雪會放到ArrayList的<Snow>泛集中，然後這群雪會以陣列：snows統稱

    public SnowCanvas() {
        for (int i = 0; i < 50; i++) {//五十顆雪
            Snow snow = new Snow(this);//Snow類別建構子。放this，有Snow類別在SnowCanvas類別上建物件換成SnowCanvas類別在Snow類別上建物件
            snow.start();//start方法啟動Snow類別中的執行緒，才啟動run方法，雪才會重劃（因run方法使x,y改變了）。
            snows.add(snow);//放一顆雪
        }
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        for (Snow snow : snows) {//foreach
            g.setColor(Color.WHITE);
            g.drawString("雪", snow.x, snow.y);
        }
        // g.drawString("s",10,10);
        // g.drawLine(50,50,150,230);
    }
}
