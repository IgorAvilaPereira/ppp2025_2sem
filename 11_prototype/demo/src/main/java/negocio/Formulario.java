package negocio;

import java.util.ArrayList;
import java.util.List;

public final class Formulario implements Cloneable {
    private String titulo;
    private List<String> campos;
    private String url;
    private String methodHttp;

    protected Formulario(){
        this.campos = new ArrayList<String>();
    }        

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public List<String> getCampos() {
        return campos;
    }
    public void setCampos(List<String> campos) {
        this.campos = campos;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    public String getMethodHttp() {
        return methodHttp;
    }



    public void setMethodHttp(String methodHttp) {
        this.methodHttp = methodHttp;
    }

    @Override
    public String toString() {
        String html = "";
        html+= "<form action='"+this.url+"' method='"+this.methodHttp+"'>";
        for (String nome_campo : campos) {
            html += nome_campo+": <input type='text' name='"+nome_campo+"'> <br>";            
        }
        html+="<input type='submit' value='Enviar'> <br>";
        html+="</form>";
        return html;
    }

    @Override
    public Formulario clone(){        
        try {
            Formulario clone = (Formulario) super.clone();
            clone.setCampos(new ArrayList<>());
            for (String nome_campo : campos) {
                clone.getCampos().add(nome_campo);
            }            
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;

    }


    



    

}
