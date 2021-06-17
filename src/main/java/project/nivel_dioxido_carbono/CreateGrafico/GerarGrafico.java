package project.nivel_dioxido_carbono.CreateGrafico;

import java.util.ArrayList;

import org.jfree.chart.JFreeChart;
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
		return null;

	}
	
	public JFreeChart createGrafico() {
		return null;

	}
	
	
}
