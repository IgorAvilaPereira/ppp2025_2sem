/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
// pai - abstrata
public abstract class Html {
   
    // template method
    public final String render(String title){        
        return "<html> " +
                "<head> " +
                "<title> " + title + "</title>"  +
                "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">"+
                "</head> " + 
                "<body> " + 
                showHeader(title) + 
                showContent() +
                showFooter() +
                "</body> </html>";
    }

    // header => fixo
    private String showHeader(String title) {
        return "<h1>" + title + "</h1>";
    }  

    // footer => fixo
    private String showFooter() {
        return "<footer> Rodapé!</footer>";
    }

    // customizavel/mutavel/variante => conteudo!
    protected abstract String showContent();
    
}
