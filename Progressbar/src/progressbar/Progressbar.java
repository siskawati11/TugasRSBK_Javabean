/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author ASUS
 */
public class Progressbar extends Panel {
     private long count=0;
 private Label label;
 private long maxValue=20;
 public void setMaxValue(long max) {
 maxValue = max;
 }
 public long getMaxValue() {
return maxValue;
 }
 public Progressbar() {
 setBackground(Color.blue);
 setForeground(Color.white);
 label = new Label(""+count);
 add(label);
 }
 public void increment () {
 if (count < maxValue) {
 count++;
 label.setText(count+" ");
 }
 else label.setText("!!");
 }
 
 public long getValue(){
     return count;
 }
}
