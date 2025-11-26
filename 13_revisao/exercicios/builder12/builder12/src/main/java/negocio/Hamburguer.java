package negocio;

public class Hamburguer {
    private String tipoPao;
    private int qtdeCarne;
    private String tipoQueijo;
    private boolean comAlface;
    private boolean comTomate;
    private boolean comMolhoDaCasa;

    private Hamburguer(String tipoPao, int qtdeCarne, String tipoQueijo, boolean comAlface, boolean comTomate,
            boolean comMolhoDaCasa) {
        this.tipoPao = tipoPao;
        this.qtdeCarne = qtdeCarne;
        this.tipoQueijo = tipoQueijo;
        this.comAlface = comAlface;
        this.comTomate = comTomate;
        this.comMolhoDaCasa = comMolhoDaCasa;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public int getQtdeCarne() {
        return qtdeCarne;
    }

    public void setQtdeCarne(int qtdeCarne) {
        this.qtdeCarne = qtdeCarne;
    }

    public String getTipoQueijo() {
        return tipoQueijo;
    }

    public void setTipoQueijo(String tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    public boolean isComAlface() {
        return comAlface;
    }

    public void setComAlface(boolean comAlface) {
        this.comAlface = comAlface;
    }

    public boolean isComTomate() {
        return comTomate;
    }

    public void setComTomate(boolean comTomate) {
        this.comTomate = comTomate;
    }

    public boolean isComMolhoDaCasa() {
        return comMolhoDaCasa;
    }

    public void setComMolhoDaCasa(boolean comMolhoDaCasa) {
        this.comMolhoDaCasa = comMolhoDaCasa;
    }

    

    @Override
    public String toString() {
        return "Hamburguer [tipoPao=" + tipoPao + ", qtdeCarne=" + qtdeCarne + ", tipoQueijo=" + tipoQueijo
                + ", comAlface=" + comAlface + ", comTomate=" + comTomate + ", comMolhoDaCasa=" + comMolhoDaCasa + "]";
    }



    public static class Builder {
        private String tipoPao;
        private int qtdeCarne;
        private String tipoQueijo;
        private boolean comAlface;
        private boolean comTomate;
        private boolean comMolhoDaCasa;

        public Builder(String tipoPao, int qtdeCarne) {
            this.tipoPao = tipoPao;
            this.qtdeCarne = qtdeCarne;
        }

        public Builder tipoQueijo(String tipoQueijo) {
            this.tipoQueijo = tipoQueijo;
            return this;
        }

        public Builder comAlface(boolean comAlface) {
            this.comAlface = comAlface;
            return this;
        }

        public Builder comTomate(boolean comTomate) {
            this.comTomate = comTomate;
            return this;
        }

        public Builder comMolhoDaCasa(boolean comMolhoDaCasa) {
            this.comMolhoDaCasa = comMolhoDaCasa;
            return this;
        }

        public Hamburguer builder() {
            return new Hamburguer(tipoPao, qtdeCarne, tipoQueijo, comAlface, comTomate, comMolhoDaCasa);
        }
    }

}
