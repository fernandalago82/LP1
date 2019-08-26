package Main;

/**
 *
 * @author radames
 */
public class Processamento {

    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;

    public void somarVotos(int candidato) {
        if (candidato == 1) {
            cont1++;
        } else if (candidato == 2) {
            cont2++;
        } else if (candidato == 3) {
            cont3++;
        }
    }

    public int getCont1() {
        return cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public int getCont3() {
        return cont3;
    }

    
    
    

}
