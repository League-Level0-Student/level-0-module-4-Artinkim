import javax.swing.JOptionPane;

public class test_score {
	public static void main(String[] args) {
String s = JOptionPane.showInputDialog("what is your test score");
int s2 = Integer.parseInt(s);
if (s2 == 100)
{
	JOptionPane.showMessageDialog(null,"Wow you aced the test");
}
else if (s2 >90)
{
	JOptionPane.showMessageDialog(null,"Amazing job");
}
else if (s2 >80)
{
	JOptionPane.showMessageDialog(null,"Great job");
}
else if (s2 >70)
{
	JOptionPane.showMessageDialog(null,"ok job");
}
else if (s2 >60)
	{
		JOptionPane.showMessageDialog(null,"you barely passed");
	}
else if (s2 <60)
{
	JOptionPane.showMessageDialog(null,"you failed");
}
		}

}
