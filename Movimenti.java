public class Movimenti {
 
    
    private String mittente;
    private String beneficiario;
    private int denaro;
    private int codice;
    private int data;
    private String causale;
    


    public Movimenti (String mittente, String beneficiario, int denaro, int codice, int data, String causale) {
        this.mittente = mittente;
        this.beneficiario = beneficiario;
        this.denaro = 0;
        this.codice = 0;
        this.data = 0;
        this.causale = causale;

    }


    public String getMittente() {
        return this.mittente;
    }

    public String getBeneficiario() {
        return this.beneficiario;
    }

    public int getDenaro() {
        return this.denaro;
    }

    public int getCodice() {
        return this.codice;
    }

    public int getData() {
        return this.data;
    }

    public String getCausale() {
        return this.causale;
    }


    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setDenaro(int denaro) {
        this.denaro = denaro;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setCausale( String causale) {
        this.causale = causale;
    }







}
