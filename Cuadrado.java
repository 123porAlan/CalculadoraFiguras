public class Cuadrado extends Figura{

    protected double lado;

    protected Cuadrado(){
    }

    //getters and setters
    public double getLado(){
	return lado;
    }
    public void setLado(double lado){
	this.lado = lado;
    }

    @Override
    public double calcularArea(){
	double resultadoArea = lado * lado;
	return resultadoArea;
    }
    @Override
    public double calcularPerimetro(){
	double resultadoPerimetro = 4 * lado;
	return resultadoPerimetro;
    }
}
