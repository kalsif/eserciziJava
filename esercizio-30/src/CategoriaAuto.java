public class CategoriaAuto {
    public static void categoAuto(Auto [] allAuto){
        for(int i = 0;i< allAuto.length;i++){
            if(allAuto[i].getCilindrata()>=1800){
                System.out.println("Questa è una superCar = " +allAuto[i]);
            }else{
                System.out.println("Questa è un utilitaria = " + allAuto[i]);
            }
        }
    }

}
