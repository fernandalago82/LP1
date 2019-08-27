package Main;

//@author Fernanda Lago Agostinho
import java.text.DecimalFormat;

class Saida {

    public void imprimirNumeroDouble(String msg, double num) {
        //formata e imprime um número double
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(msg + " => " + df.format(num));
    }

    public void imprimirRotuloEString(String msg, String s) {
        System.out.println(msg + "=>" + s);
    }
}
