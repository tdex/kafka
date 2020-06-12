package processamentoVendas.deserializer;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import vendaIngressos.model.Venda;

public class VendaDeserializer implements Deserializer<Venda> {

	@Override
	public Venda deserialize(String topic, byte[] venda) {
		try {
			return new ObjectMapper().readValue(venda, Venda.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
