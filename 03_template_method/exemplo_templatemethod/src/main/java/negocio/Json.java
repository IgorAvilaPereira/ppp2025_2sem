package negocio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json extends Exportador {

    public Json(String arquivo, String delimitador) {
        super(arquivo, delimitador);
    }

    @Override
    protected String processamento() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonArrayString = null;
        try {
            jsonArrayString = objectMapper.writeValueAsString(this.vetUsuario);
            return jsonArrayString;
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;    
    }

}
