/**
 * Esta clase extiende de Figura y servira para sacar su area y perimetro
 * @author Alan Bellon
 * @version 1.0.0
 */
public class Circulo extends Figura{
    
    //atributo radio
    protected double radio;
    /**
     *Constructor vacio
     */
    protected Circulo(){
    }

    //getter y setters
    /**
     * Getter
     * @return radio
     */
    public double getRadio(){
	return radio;
    }
    /**
     * Setter
     * @param radio
     */
    public void setRadio(double radio){
	this.radio = radio;
    }
    
    /**
     * @Override
     * @return resultadoArea
     */
    public double calcularArea(){
	double pi = 3.141592;
	double resultadoArea = pi * radio * radio;
	return resultadoArea;
	    
    }

    /**
     * @Override
     * @return resultadoPerimetro
     */
    public double calcularPerimetro(){
	double pi = 3.141592;
	double resultadoPerimetro = 2 * pi * radio;
	return resultadoPerimetro;
    }
}
