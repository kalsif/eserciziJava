public class Unicode {
    public String stringa ;

    public Unicode(String stringa){
        this.stringa=stringa;
    }

    public String unicodeChar(int x){
        if(x >= 0 && x < stringa.length()){
            int valoreChar = stringa.charAt(x);
            StringBuilder numero = new StringBuilder();
            numero.append("Il valore della lettera in posizione = ").append(x).append(" è ").append(valoreChar);
            return numero.toString();
        }else {
            return "Errore";
        }

    }
}
