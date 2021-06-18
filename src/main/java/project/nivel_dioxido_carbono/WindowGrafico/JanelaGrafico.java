package project.nivel_dioxido_carbono.WindowGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.JFrame;

import project.nivel_dioxido_carbono.CreateGrafico.GerarGrafico;
import project.nivel_dioxido_carbono.CreateGrafico.Model.NiveisDeDioxidoDeCarbono;

public class JanelaGrafico extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaGrafico frame = new JanelaGrafico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	

	public JanelaGrafico() {
		Panel jpnPanelGrafic = new Panel();
		getContentPane().add(jpnPanelGrafic, BorderLayout.CENTER);	
		
		ArrayList<NiveisDeDioxidoDeCarbono> listDados = new ArrayList<NiveisDeDioxidoDeCarbono>();
		
		listDados.add(new NiveisDeDioxidoDeCarbono("São paulo", 2009L, 232));
		listDados.add(new NiveisDeDioxidoDeCarbono("Minas gerais", 2009L, 123.2));
		listDados.add(new NiveisDeDioxidoDeCarbono("Rio de Janeiro", 2009L, 212.32));
		listDados.add(new NiveisDeDioxidoDeCarbono("Mato groso do sul", 2009L, 723.23));
		
		GerarGrafico create = new GerarGrafico();
		
		getContentPane().add(create.createGrafico(listDados));
		
		pack();
	}

}











