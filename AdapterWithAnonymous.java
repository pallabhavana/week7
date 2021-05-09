

import java.awt.*;
import java.awt.event.*;

public class AdapterWithAnonymous extends Frame
{
Button btn;
public AdapterWithAnonymous()
{
setLayout(new FlowLayout());
btn = new Button("Click for Red");
add(btn);
btn.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("Your click is Successful");
setBackground(Color.red);
}
}
);
setSize(300, 300);
setVisible(true);
}
public static void main(String args[])
{
new AdapterWithAnonymous();
}
}
