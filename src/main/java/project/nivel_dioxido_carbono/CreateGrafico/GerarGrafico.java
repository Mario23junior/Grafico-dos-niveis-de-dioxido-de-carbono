package project.nivel_dioxido_carbono.CreateGrafico;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;

public class GerarGrafico extends JFrame{
private static final long serialVersionUID = 8893382574084004135L;
    
public GerarGrafico(String title) {
	 super(title);

// criando conjunto de dados 
 XYDataset dataset = createDataset();
  
  // criando grafico central
  JFreeChart chart = ChartFactory.createScatterPlot(
	"Niveis de dioxido de carbono na terra", "X-axis","Y-axis", dataset	  
  );
  
  // alterando cor da base de dados
   XYPlot plot = (XYPlot)chart.getPlot();
  plot.setBackgroundPaint(new Color(255,228,196));
   
  // criando panel de exibicao do grafico
  ChartPanel panel = new ChartPanel(chart);
  setContentPane(panel);
	
 }

   XYDataset createDataset() {
	   return null;
   }  
}
