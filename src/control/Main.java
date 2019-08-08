package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import modelo.pedidos.Pedidos;
import modelo.shpcon.DELVRY03;



public class Main {
		
	public static void main(String[] args) {
		File f = new File("src/test.xml");
		File fout = new File("src/out.xml");
		Pedidos mipedido;
		DELVRY03 delvry03 = new DELVRY03();
		PedidoSHPCON mapeo = new PedidoSHPCON();
		try {
			FileOutputStream fous = new FileOutputStream(fout);
			FileInputStream fis = new FileInputStream(f);
			mipedido = mapeo.leerXml(fis);
			delvry03 = (DELVRY03) mapeo.runable(mipedido);

			mapeo.generarXml(delvry03, fous);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
