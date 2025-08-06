public class SwitchEx1 {
    public static void main(String[] args) {
        int valor = 4;

        //versao 1 com if e else
        /* if (valor == 1 || valor == 2){
            System.out.println("olar");
        }
        else if (valor == 3 || valor == 4){
            System.out.println("desolar");
        }
        else if (valor == 5 || valor == 6){
            System.out.println("adeus");
        }
        else{
            System.out.println("bolar");
        } */

        //versao 2 com switch case
        switch (valor) {
            case 1:
            case 2:
                System.out.println("bdsmer");
            case 3:
            case 4:
                System.out.println("bodosamer");
                break;
            case 5:
            case 6:
                System.out.println("babysaja");
                break;
            default:
                System.out.println("defo");
        }
    }
}
