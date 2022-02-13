/**
 * Esta clase extiende de Figura y servira para sacar su area y perimetro
 * @author Alan Bellon
 * @version 1.0.0
 */
public class Rectangulo extends Figura{
    //Atributo base
    protected double base;
    //Atributo altura 
    protected double altura;
    
    /**
     * Constructor vacio
     */
    protected Rectangulo(){
    }

    //getters and setters
    /**
     * Getter
     * @return base
     */
    public double getBase(){
	return base;
    }
    /**
     * Setter
     * @param base
     */
    public void setBase(double base){
	this.base = base;
    }
    /**
     * Getter
     * @return altura
     */    
    public double getAltura(){
	return altura;
    }
    /**
     * Setter
     * @param altura
     */
    public void setAltura(double altura){
	this.altura = altura;
    }

    /**
     * @Override
     * @return resultadoArea
     */
    public double calcularArea(){
	double resultadoArea = base * altura;
	return resultadoArea;
    }
    /**
     * @Override
     * @return resultadoPerimetro
     */
    public double calcularPerimetro(){
	double resultadoPerimetro = 2 * (base + altura);
	return resultadoPerimetro;
    }
}
