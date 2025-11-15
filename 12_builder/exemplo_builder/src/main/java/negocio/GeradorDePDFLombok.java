package negocio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class GeradorDePDFLombok {
    private String pageOrientation = "portrait";
    private String unit = "mm";
    private int pageSizeX;
    private int pageSizeY;
    private int marginTop;
    private int marginRight;
    private int marginBottom;
    private int marginLeft;
    private boolean hasHeader;
    private boolean headerHeight;
    private boolean hasFooter;
    private int footerHeight;
    private String pageColor;
    private String encode;

    
}
