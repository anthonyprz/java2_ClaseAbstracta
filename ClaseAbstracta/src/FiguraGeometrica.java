/*
Es una clases cuya descripción es incompleta. Una clase abstracta declara métodos, pero no
tiene que implementarlos. 
	
	No proporcionan la implementación de todos sus métodos
	Los métodos no implementados se declaran como abstract
	Una clase con un método abstracto debe declararse como clase abstracta
	Pero una clase puede declararse como abstracta aunque no tenga ningún método
	abstracto

		los métodos abstactos no tienen cuerpo {}
		 
		 Las subclases de una clase abstracta deben:
 			Sobreescribir todos los métodos abstractos de la superclase, o bien
 			Ser declaradas como clases abstractas
 		Una clase abstracta no puede instanciarse
			No se pueden crear objetos de una clase abstracta
		Una clase abstracta puede incluir variables y métodos no abstractos.
 		No se pueden definir constructores abstractos o métodos estáticos abstractos.
		
		una clase abstracta tiene que tener al menos un metodo abstracto
		
		
		
*/
public abstract class FiguraGeometrica {
	public abstract void dibujar();
}
