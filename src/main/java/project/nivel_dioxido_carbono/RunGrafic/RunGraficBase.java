package project.nivel_dioxido_carbono.RunGrafic;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import project.nivel_dioxido_carbono.CreateGrafico.GerarGrafico;

public class RunGraficBase {
  
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			public void run() {
				GerarGrafico grafic = new GerarGrafico("Niveis anuais de Niveis de dioxido de carbo");
				grafic.setSize(800,400);
				grafic.setLocationRelativeTo(null);
				grafic.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

				grafic.setVisible(true);
			}
		});
	}
}
