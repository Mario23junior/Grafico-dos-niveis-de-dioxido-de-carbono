package project.nivel_dioxido_carbono.CreateGrafico;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GerarGrafico extends JFrame{
private static final long serialVersionUID = 8893382574084004135L;
    
public GerarGrafico(String title) {
	 super(title);

// criando conjunto de dados 
 XYDataset dataset = createDataset();
  
  // criando grafico central
 
  String InformacaoDireita = "CO² Concentrado (ppm)";
  String ValusAnuais = "";
  
  JFreeChart chart = ChartFactory.createScatterPlot(
 	"Niveis de dioxido de carbono na terra",ValusAnuais,InformacaoDireita, dataset
  );
  
  
  // criando panel de exibicao do grafico
  ChartPanel panel = new ChartPanel(chart);
  setContentPane(panel);
  
  }

   private XYDataset createDataset() {
	 XYSeriesCollection dataset = new XYSeriesCollection();
	 
	 XYSeries series1 = new XYSeries("1990");
	 series1.add(1,6.24);
	 series1.add(2,6.18);
	 series1.add(3,11.02);
	 series1.add(4,4.53);
	 series1.add(5,13.96);
	 series1.add(6,1.16);
	 series1.add(7,6.93);
	 series1.add(8,4.27);
	 series1.add(9,8.98);
	 series1.add(10,19.50);
	 series1.add(11,22.21);
	 dataset.addSeries(series1);

	 XYSeries series2 = new XYSeries("1991");
	 series2.add(1,6.19);
	 series2.add(2,6.11);
	 series2.add(3,11.01);
	 series2.add(4,2.63);
	 series2.add(5,13.49);
	 series2.add(6,1.19);
	 series2.add(7,6.90);
	 series2.add(8,4.87);
	 series2.add(9,9.07);
	 series2.add(10,18.79);
	 series2.add(11,21.75);
	 dataset.addSeries(series2);
     
	 XYSeries series3 = new XYSeries("1992");
	 series3.add(1,6.19);
	 series3.add(2,6.11);
	 series3.add(3,11.01);
	 series3.add(4,2.63);
	 series3.add(5,13.49);
	 series3.add(6,1.19);
	 series3.add(7,6.90);
	 series3.add(8,4.87);
	 series3.add(9,9.07);
	 series3.add(10,18.79);
	 series3.add(11,21.75);
	 dataset.addSeries(series3);
	 
	 XYSeries series4 = new XYSeries("1993");
	 series4.add(1,6.04);
	 series4.add(2,5.92);
	 series4.add(3,10.77);
	 series4.add(4,2.87);
	 series4.add(5,12.62);
	 series4.add(6,1.22);
	 series4.add(7,6.87);
	 series4.add(8,5.03);
	 series4.add(9,9.07);
	 series4.add(10,15.46);
	 series4.add(11,21.90);
	 dataset.addSeries(series4);

	 
 	 return dataset;
   }     
}
