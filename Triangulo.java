/**
 * Esta clase extiende dde Fiura y servira para sacar su area y perimetro
 * @author Alan Liu
 * @version 1.0.0
 */
public class Triangulo extends Figura{
    //atributo base
    protected double base;
    //atributo altura
    protected double altura;
    /**
     * Constructor vacio
     */
    protected Triangulo(){
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
	double resultadoArea = (base * altura)/2;
	return resultadoArea;
    }
    /**
     * @Override
     * @return resultadoPerimetro
     */
    public double calcularPerimetro(){
	double resultadoPerimetro = base * 3;
	return resultadoPerimetro;
    }
}
