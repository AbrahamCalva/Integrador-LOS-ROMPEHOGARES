import javax.swing.JOptionPane;

public class formulaCuadratica {

    public static void main(String[] args) {
     String coordenadasPunto1 = JOptionPane.showInputDialog("Ingrese las coordenadas del punto1(X y Y) separadas por una coma(,): ");
        
        String coordenadasPunto2 = JOptionPane.showInputDialog("Ingrese las coordenadas del punto2(X y Y) separadas por una coma(,): ");
        
        //separar coordenadas utilizando el método split()
        String[] coordenadasArrayPunto1 = coordenadasPunto1.split(",");
        String[] coordenadasArrayPunto2 = coordenadasPunto2.split(",");
        
        //obtener coordenadas X y Y
        int coordenadaX1 = Integer.parseInt(coordenadasArrayPunto1[0].trim());
        int coordenadaY1 = Integer.parseInt(coordenadasArrayPunto1[1].trim());
        
        int coordenadaX2 = Integer.parseInt(coordenadasArrayPunto2[0].trim());
        int coordenadaY2 = Integer.parseInt(coordenadasArrayPunto2[1].trim());
        
        JOptionPane.showMessageDialog(null, "Coordenada X1: " + coordenadaX1 + "\n" +"Coordenada Y1: " + coordenadaY1 + "\n" + "Coordenada X2: " + coordenadaX2 + "\n" + "Coordenada Y2: " + coordenadaY2);

        
        //realiza las operaciones o acciones
        
        //Inclinacion de la recta
        double m = (coordenadaY2 - coordenadaY1)/(coordenadaX2 - coordenadaX1);
        
        //Intersección de la recta en Y 
        double b = coordenadaY1 - m * coordenadaX1;
        
        //angulo interno entre el eje horizontal y la recta
        double anguloRadianes = Math.atan(m);
        double anguloGrados = anguloRadianes * (180/Math.PI);
        
        
        //resultados
        JOptionPane.showMessageDialog(null, "La intersección de la recta: " + b + "\n" + "El ángulo interno: "+anguloGrados);

    }
}