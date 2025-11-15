package negocio;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class GeradorDePDF {
    private String pageOrientation = "portrait";
    private String unit = "mm";
    private int pageSizeX = 70;
    private int pageSizeY = 140;
    private int marginTop = 30;
    private int marginRight = 20;
    private int marginBottom = 30;
    private int marginLeft = 20;
    private boolean hasHeader = true;
    private int headerHeight = 15;
    private boolean hasFooter = true;
    private int footerHeight =  15;
    private String pageColor =  "#ffffff";
    private String encode =  "UTF-8";
    private String content;

    // private GeradorDePDF() {

    // }

    


    public GeradorDePDF(String pageOrientation, String unit, int pageSizeX, int pageSizeY, int marginTop,
            int marginRight, int marginBottom, int marginLeft, boolean hasHeader, int headerHeight,
            boolean hasFooter, int footerHeight, String pageColor, String encode, String content) {
        this.pageOrientation = pageOrientation;
        this.unit = unit;
        this.pageSizeX = pageSizeX;
        this.pageSizeY = pageSizeY;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
        this.marginLeft = marginLeft;
        this.hasHeader = hasHeader;
        this.headerHeight = headerHeight;
        this.hasFooter = hasFooter;
        this.footerHeight = footerHeight;
        this.pageColor = pageColor;
        this.encode = encode;
        this.content = content;
    }


    public String getPageOrientation() {
        return pageOrientation;
    }


    public void setPageOrientation(String pageOrientation) {
        this.pageOrientation = pageOrientation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPageSizeX() {
        return pageSizeX;
    }

    public void setPageSizeX(int pageSizeX) {
        this.pageSizeX = pageSizeX;
    }

    public int getPageSizeY() {
        return pageSizeY;
    }

    public void setPageSizeY(int pageSizeY) {
        this.pageSizeY = pageSizeY;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public boolean isHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    public int isHeaderHeight() {
        return headerHeight;
    }

    public void setHeaderHeight(int headerHeight) {
        this.headerHeight = headerHeight;
    }

    public boolean isHasFooter() {
        return hasFooter;
    }

    public void setHasFooter(boolean hasFooter) {
        this.hasFooter = hasFooter;
    }

    public int getFooterHeight() {
        return footerHeight;
    }

    public void setFooterHeight(int footerHeight) {
        this.footerHeight = footerHeight;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }    

    public void createPDF() {
        Document document = new Document();
        document.setMargins(marginLeft, marginRight, marginTop, marginBottom);
        // document.setPageSize(new Rectangle(pageSizeX,pageSizeY));
        document.addAuthor("Igor");
        document.addCreator("Igor");
        document.addLanguage("pt-br");
    
        try {
            PdfWriter.getInstance(document, new java.io.FileOutputStream("meu_pdf.pdf"));
            document.open();
            document.add(new Paragraph(this.content));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    

    @Override
    public String toString() {
        return "GeradorDePDF [pageOrientation=" + pageOrientation + ", unit=" + unit + ", pageSizeX=" + pageSizeX
                + ", pageSizeY=" + pageSizeY + ", marginTop=" + marginTop + ", marginRight=" + marginRight
                + ", marginBottom=" + marginBottom + ", marginLeft=" + marginLeft + ", hasHeader=" + hasHeader
                + ", headerHeight=" + headerHeight + ", hasFooter=" + hasFooter + ", footerHeight=" + footerHeight
                + ", pageColor=" + pageColor + ", encode=" + encode + "]";
    }




    public static class Builder {
        private String pageOrientation = "portrait";
        private String unit = "mm";
        private int pageSizeX;
        private int pageSizeY;
        private int marginTop;
        private int marginRight;
        private int marginBottom;
        private int marginLeft;
        private boolean hasHeader;
        private int headerHeight;
        private boolean hasFooter;
        private int footerHeight;
        private String pageColor;
        private String encode;
        private String content;

        public Builder(String pageOrientation){
            this.pageOrientation = pageOrientation;
        }

        public Builder pageColor(String pageColor) {
            this.pageColor = pageColor;
            return this;
        }

        public Builder marginTop(int marginTop){
            this.marginTop = marginTop;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }


        // ......

        public GeradorDePDF build(){
            GeradorDePDF geradorDePDF =  new GeradorDePDF(pageOrientation, unit, pageSizeX, pageSizeY, marginTop, marginRight, marginBottom, marginLeft, hasHeader, headerHeight, hasFooter, footerHeight, pageColor, encode, content);
            return geradorDePDF;
        }


    }




    
}