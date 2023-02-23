package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//		JFileChooser chooser = new JFileChooser("resources");
		//		chooser.showOpenDialog(null);
		//		File f = new File(chooser.getSelectedFile().getPath());
		//		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.setPenColor(StdDraw.RED);
		String shape = "rectangle";
		//		int r = 255;
		//		int g = 0;
		//		int b = 0;
		//		double x = .5;
		//		double y = .8;
		//		double halfWidth = 0.45;
		//		double halfHeight = 0.15;
		StdDraw.filledRectangle(.5, .8, .45, .15);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(.5, .5, .45, .15);
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledRectangle(.5, .2, .45, .15);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(.5, .5, .15, .15);
		StdDraw.setPenColor(StdDraw.BLACK);
		double[] x = {.35, .5, .65, .35, .65, .35};
		double[] y = {.35, .65, .35, .6, .6, .35};
		StdDraw.filledPolygon(x, y);

	}
}
