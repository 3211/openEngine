package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	private GraphicsDevice gd;
	private int topInsets;
	private JPanel contentPane;
	private JPanel canvas;
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		canvas = new JPanel();
		contentPane.add(canvas, BorderLayout.CENTER);
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		topInsets = this.getInsets().top;
	}
	public GraphicsDevice getScreen(){
		return gd;
	}

	public Graphics getCanvasGraphics(){
		return canvas.getGraphics();
	}
	public int getScreenWidth(){
		return gd.getDisplayMode().getWidth();
	}
	public int getScreenHeight(){
		return gd.getDisplayMode().getHeight();
	}
	public JPanel getCanvas(){
		return canvas;
	}

}
