package negocio;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private static Registry INSTANCE = new Registry();

    private Map<String, Automovel> repository = new HashMap<>();

    private Registry(){
        Automovel fusca = new Automovel();
        fusca.setAno(1990);
        fusca.setChassi("12312312");
        fusca.setKm(1000000);
        fusca.setMarca("VW");
        fusca.setModelo("Fusca");
        fusca.setPlaca("IVO1245");
        fusca.setPreco(10000);
        fusca.setMotor(new Motor(1000, "muito bom"));
        this.registrar("fusca", fusca);
    }

    public void registrar(String key, Automovel automovel){
        repository.put(key, automovel);
    }

    public Automovel get(String key){
        try {
            return (Automovel) this.repository.get(key).clone();
        } catch (Exception e) {
            System.out.println("Key inexistente!");
        }
        return null;
    }

    public static synchronized Registry getInstance() {
        return INSTANCE;
    }

}
