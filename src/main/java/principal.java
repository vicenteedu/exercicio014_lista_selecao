
import javax.swing.JOptionPane;



public class principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 à 7: "));
        
        switch(dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro: número inválido! Digite de 1 a 7. ");
        }
    }
}
