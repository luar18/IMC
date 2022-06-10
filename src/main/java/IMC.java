
import javax.swing.JOptionPane;


public class IMC {

   
    
    public static void main(String[] args) {
        float peso, altura, resultado;
        String respeso, resaltura;
        respeso=JOptionPane.showInputDialog("Entre com seu peso");
        peso=Float.parseFloat(respeso);
         resaltura=JOptionPane.showInputDialog("Entre com sua altura");
        altura=Float.parseFloat(resaltura);
        resultado= peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é "+resultado);
        
                
    }
    
}
