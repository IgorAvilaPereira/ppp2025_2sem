package negocio;

import java.util.Arrays;
import java.util.HashMap;

public class FormRegistry {
    private static final FormRegistry INSTANCE = new FormRegistry();
    private HashMap<String, Formulario> registry;

    private FormRegistry() {
        this.registry = new HashMap<>();
        Formulario cadastraPaciente = new Formulario();
        cadastraPaciente.setTitulo("Cadastra Paciente");
        cadastraPaciente.setUrl("/pacientes/adicionar");
        cadastraPaciente.setMethodHttp("POST");
        cadastraPaciente.setCampos(Arrays.asList("Nome", "Cpf", "Data Nascimento"));        
        this.registry.put("cadastra_paciente", cadastraPaciente);

        Formulario cadastraConsulta = new Formulario();
        cadastraConsulta.setTitulo("Cadastra Consulta");
        cadastraConsulta.setUrl("/consultas/adicionar");
        cadastraConsulta.setMethodHttp("POST");
        cadastraConsulta.setCampos(Arrays.asList("Data/Hora", "Observações",
        "Paciente Nome:", "Medico Nome"));
        this.registry.put("cadastra_consulta", cadastraConsulta);

        Formulario cadastrarMedico = new Formulario();
        cadastrarMedico.setTitulo("Cadastra Medico");
        cadastrarMedico.setUrl("/medico/adicionar");
        cadastrarMedico.setMethodHttp("POST");
        cadastrarMedico.setCampos(Arrays.asList("Nome", "CRM", "Data Nascimento"));
        this.registry.put("cadastra_medico", cadastrarMedico);

        // Formulario cadastrarMedico = cadastraPaciente.clone();
        // cadastrarMedico.setTitulo("Cadastra Medico");
        // cadastrarMedico.setUrl("/medico/adicionar");
        // cadastrarMedico.getCampos().remove(1);
        // cadastrarMedico.getCampos().add("crm");
        // System.out.println(cadastrarMedico);
    }

    public Formulario getForm(String nomeFormulario){
        try {
            if (this.registry.containsKey(nomeFormulario)){
                return this.registry.get(nomeFormulario).clone();
            }            
            throw new IllegalArgumentException("Não há este tipo!");            
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }        
    }

    public void addForm(String nomeFormulario, Formulario formulario){
        this.registry.put(nomeFormulario, formulario);
    }
    
    public boolean removeForm(String nomeFormulario){
        if (this.registry.containsKey(nomeFormulario)){
            this.registry.remove(nomeFormulario);
            return true;
        }
        return false;
    }

    public String toString(){
        return this.registry.keySet().toString();
    }

    public static synchronized FormRegistry getInstance() {
        return INSTANCE;

    }
}
