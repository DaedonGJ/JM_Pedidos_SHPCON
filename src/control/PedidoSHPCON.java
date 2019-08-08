package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;

import modelo.pedidos.Pedidos;
import modelo.pedidos.Pedidos.Pedido;
import modelo.shpcon.DELVRY03;
import modelo.shpcon.SHPCONDELVRY03;

public class PedidoSHPCON {
	protected static DELVRY03 delvry03 = new DELVRY03();

	public DELVRY03 runable(Pedidos mipedido) {
		pedidoxIdoc(mipedido);
		return delvry03;
	}

	public void pedidoxIdoc(Pedidos mipedido) {
		List<Pedido> lpedidos = mipedido.getPedido();
		lpedidos.stream().forEach((Object o) -> generateidocxpedido((Pedido) o));
	}

	/**
	 * Este metodo genera un idoc por cada pedido
	 **/
	public void generateidocxpedido(Pedido pedido) {
		SHPCONDELVRY03 shpcondelvry03 = new SHPCONDELVRY03();

		delvry03.getIDOC().add(shpcondelvry03);
	}

	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {

		OutputStream outp = out.getOutputPayload().getOutputStream();
		InputStream io = in.getInputPayload().getInputStream();

		Pedidos mipedido;
		mipedido = leerXml(io);
		delvry03 = (DELVRY03) runable(mipedido);
		generarXml(delvry03, out.getOutputPayload().getOutputStream());
	}

	public Pedidos leerXml(InputStream io) {
		Pedidos pedidos = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Pedidos.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			pedidos = (Pedidos) unmarshaller.unmarshal(io);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return pedidos;

	}

	/**
	 * Este metodo genera el xml de salida
	 * 
	 **/
	public void generarXml(Object object, OutputStream outputStream) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(object.getClass());
			Marshaller organizador = contexto.createMarshaller();
			organizador.marshal(object, outputStream);

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
