public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(21,10,Famiglia.quadrilateri);
        Triangolo_rettangolo triangolo_rettangolo = new Triangolo_rettangolo(21,10,Famiglia.triangoli);
        Triangolo_isoscele triangolo_isoscele = new Triangolo_isoscele(21,10,Famiglia.triangoli);
        Quadrato quadrato = new Quadrato(21,10,Famiglia.quadrilateri);
    }

}