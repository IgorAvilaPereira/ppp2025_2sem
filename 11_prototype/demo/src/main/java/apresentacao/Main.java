package apresentacao;

import java.util.ArrayList;
import java.util.Arrays;

import negocio.FormRegistry;
import negocio.Formulario;

public class Main {
    public static void main(String[] args) {        
        FormRegistry formRegistry = FormRegistry.getInstance();                      
        Formulario formularioFuncionario = formRegistry.getForm("cadastra_paciente");
        formularioFuncionario.getCampos().add("siape");
        formularioFuncionario.setTitulo("Add Funcionario");
        formularioFuncionario.setUrl("/funcionarios/add");
        // System.out.println(formularioFuncionario);
        formRegistry.addForm("formularioFuncionario", formularioFuncionario);
        
        Formulario formNovo = formRegistry.getForm("cadastra_paciente");
        Formulario formNovissimo = formNovo.clone();
        formNovo.getCampos().forEach(c -> System.out.println(c));
        formNovissimo.getCampos().forEach(c -> System.out.println(c));


        System.out.println(formRegistry);
        
        // System.out.println(formNovissimo.hashCode());
        // System.out.println(formularioFuncionario.hashCode());




    }
}