package project.nivel_dioxido_carbono.CreateGrafico;

import java.awt.Dimension;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import project.nivel_dioxido_carbono.CreateGrafico.Model.NiveisDeDioxidoDeCarbono;

public class GerarGrafico {
   
	public CategoryDataset createDataSet(ArrayList<NiveisDeDioxidoDeCarbono> listDados) {
		
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		
		for(NiveisDeDioxidoDeCarbono dioxidoCarbonoInfo : listDados) {
			dataSet.addValue(dioxidoCarbonoInfo.getAno(), dioxidoCarbonoInfo.getCidade(), "");
		}
		return dataSet;
	}
	
	
	public JFreeChart createBaChart(CategoryDataset dataset) {
		JFreeChart graficoInformacao = ChartFactory.createBarChart(
				"Niveis de dioxido de carbono",
				"",
				"Aumento",
				dataset,
 				PlotOrientation.VERTICAL, 
				true, 
				false, 
				false);
		
		return graficoInformacao;

	}
	
	public ChartPanel createGrafico(ArrayList<NiveisDeDioxidoDeCarbono> listNiveis) {
		
		CategoryDataset dataSet = this.createDataSet(listNiveis);
		JFreeChart grafico = this.createBaChart(dataSet);
		
		ChartPanel painelGrafico = new ChartPanel(grafico);
		painelGrafico.setPreferredSize(new Dimension(400, 400));
		
		return painelGrafico;
		 

	}
	
	
}
