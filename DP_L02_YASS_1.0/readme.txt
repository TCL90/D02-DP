Errores encontrados:
En la clase customer, en la relaci�n de complaint, debe ser un Collection
ya que es una relaci�n del tipo 1 a *.

Phone debe tener expresi�n regular:
@Pattern(regexp = "^(((\\+[1-9][0-9]{0,2}) \\(([1-9][0-9]{0,2})\\) (\\d\\d\\d\\d+))|((\\+[1-9][0-9]{0,2}) (\\d\\d\\d\\d+))|((\\d\\d\\d\\d+)))$")

Actor debe tener Collection en socialProfile

A�adir @Column(unique = true) a los atributos con unique

Ticker debe tener expresi�n regular:
@Pattern(regexp = "[0-9]{6}-[A-Z]{6}")

En general, que Alfonso le pegue un repaso al nuevo
UML y se fije en las relaciones.

Queda pendiente hablar lo de las expresiones regulares.


Pendiente:
Cambiar Date por LocalDate


Ruta: Acme-Handy-Worker\src\main\java\domain


Comentarios: He puesto el UML con las clases
que he realizado en naranja.

