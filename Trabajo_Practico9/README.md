## Trabajo Práctico 9:  Ejercicios complejos (de parciales anteriores). Búsquedas ordenadas y uso de patrones de diseño.

Patron de diseño: Composite

Intención:
- Componer objetos en jerarquías todo-parte y permitir a los clientes tratar objetos simples y compuestos de manera uniforme.

Ventajas:
- Permite tratamiento uniforme de objetos simples y complejos así como composiciones recursivas.
- Simplifica el código de los clientes, que sólo usan una interfaz.

Inconvenientes:
- Es difícil restringir los tipos de los hijos
- Las operaciones de gestión de hijos en los objetos simples pueden presentar problemas: seguridad frente a flexibilidad

---

## 1 Sistema de Archivos (Fyle System --> resuelto en clase)

Un Sistema de Archivos debe organizar y manipular: archivos, directorios, links y archivos
comprimidos. Los archivos se definen por un nombre, una fecha de creación y un tamaño.
Los directorios tienen un nombre, una fecha de creación y además contienen un conjunto de
archivos y un conjunto de subdirectorios. El tamaño de un directorio está dado por el tamaño
de sus sub-directorios, sus archivos, sus links y sus archivos comprimidos. Los links son
vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación y su tamaño en
disco es siempre igual a 1Kb. Los archivos comprimidos son un tipo particular de archivo el
cual contiene otros archivos y/o directorios en formato comprimido según una tasa de
compresión dada (El tamaño de un archivo comprimido es el tamaño de todo lo contenido
dividido el factor de compresión), tiene un nombre y una fecha de creación.

El sistema debe permitir realizar búsquedas de cualquiera de sus elementos según diferentes
criterios (simples y compuestos ), por ejemplo:

- Todos los elementos cuyo nombre contenga la palabra “parcial”.
- Todos los elementos que se hayan modificado luego del 15-10-2020.
- Todos los elementos que fueron creados antes del 15-03-2020 y cuyo nombre sea
igual a “parcial”.
- Cualquier combinación lógica (and, or y not) de búsquedas simples.

Aclaración sobre las búsquedas. Un archivo comprimido será incluido en el resultado de la
búsqueda, si alguno de los elementos que contiene en su interior cumple con el criterio de la
búsqueda (se agrega el archivo comprimido al resultado, pero no los elementos que contiene).
Un link cumple con el criterio de búsqueda por sí mismo, sin tener en cuenta el elemento que
apunta.

A la hora de realizar una búsqueda, el usuario puede especificar también un criterio de orden
en el que quiere que se retornen los elementos resultantes. Por ejemplo, ordenados
ascendentemente por fecha de creación y luego por nombre, ordenados descendentemente por
tamaño, luego por fecha de creación y finalmente por nombre descendente, entre otros
posibles criterios de ordenamiento.

---

## 2 Sistema Electoral

Un sistema de recuento automático de votos para una elección registra los votos recibidos por
los diferentes candidatos. Los candidatos poseen un nombre, un partido político y una
agrupación.

Cada votante registra su voto en una mesa. Cada mesa tiene asociado un conjunto de personas
que pueden votar en la misma (padrón), identificadas únicamente por su DNI. Las mesas se
encuentran distribuidas en diferentes establecimientos educativos, que a su vez se agrupan
por barrio y localidad. Adicionalmente, puede haber mesas especiales que no pertenezcan a
un establecimiento educativo sino al barrio o localidad directamente.

Cuando un votante se presenta a emitir su voto, se debe controlar que el mismo se encuentre
en el padrón correspondiente. Si se cumple esta condición, se registra el voto de la persona,
que puede contener una referencia a un candidato o ser un voto en blanco (sin referencia a
ningún candidato). Adicionalmente el voto guarda la hora en que se emitió el mismo (el
momento en el que se crea el voto).

Nota: Todos los votos emitidos se guardan en la mesa, aunque sean en blanco (es decir,
siempre existe el voto, es lo mismo que sucede con un sobre en una elección real)

Implementar los siguientes servicios:
- Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos recibidos por un candidato particular.
- Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos en blanco recibidos.
- Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate
implementa la interface Comparable)
- Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la
cantidad total de votos que se emitieron.
- Obtener un listado de todos los candidatos que se presentan a la elección, ordenado
por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
misma agrupación ordenarlos por nombre.

Aclaración, los porcentajes se calculan como la cantidad de votos que cumplen la condición
dividido el total de votos emitidos en la mesa, establecimiento, barrio o localidad
multiplicado por 100.

---

## 3 Sitio Web de Noticias

Se desea modelar un administrador de contenidos de un sitio web de noticias. Los contenidos
del sitio están agrupados en categorías y dentro de cada categoría se dividen en secciones.
Asimismo, es posible que una sección se sub-divida nuevamente en otras sub secciones, y así
sucesivamente. Cada categoría, posee una descripción y una imagen asociada, lo mismo para
las secciones.

Una noticia puede estar asociada a una categoría, sección o sub-sección, posee un título, un
listado de palabras claves, una introducción, el texto, el autor, y un link asociado.

El modelo presentado debe proveer servicios que permitan obtener la cantidad de noticias que
contiene una categoría, y la cantidad de noticias que contiene una sección, sub-sección, etc.

Se debe proveer un mecanismo mediante el cual el administrador de contenidos pueda
restringirse a un tópico determinado, es decir ingresando una palabra clave se genera una
nueva interfaz en donde sólo las noticias que contienen esta palabra clave se muestran (esimportante que se respete la organización de las mismas, es decir categoría, sección, sub-sección y así sucesivamente).

La nueva estructura obtenida es una copia de la existente, si se introduce un cambio en esta,
el mismo NO se refleja en la estructura original.

Adicionalmente se debe proveer servicios que permitan la búsqueda de noticias, por
ejemplo:

1. Buscar todas las noticias donde el largo del texto sea superior a 200.
2. Buscar todas las noticias del autor “Juan Pérez”.
3. Buscar todas las noticias que posean la palabra clave “Partido” y la palabra Clave
“Goleada”.
4. Buscar las noticias que el título sea “Ultimo momento”

Los anteriores son sólo algunos ejemplos de búsqueda. Los distintos tipos de búsqueda
también pueden combinarse.

Debido a la dinamicidad del sitio (se crean constantemente nuevas categorías, secciones,
sub-secciones) es necesario proveer un mecanismo que permita armar el mapa del sitio, es
decir, obtener un listado de los distintos niveles del sitio y los links asociados a cada una de
las noticias, por ejemplo a partir del contenido del sitio actual obtener una lista de la
siguiente forma:

Generales

Generales\Espectáculos

Generales\Espectáculos\Link 1

Generales\Espectáculos\Divorcios

Generales\Espectáculos\Divorcios\Link 2

Generales\Espectáculos\Divorcios\Link 3

Generales\Deportes

Generales\Deportes\Fútbol

Generales\Deportes\Fútbol\Link 4

Generales\Deportes\Link 5

Generales\Link 6

Solo se devuelven los nombres de las categorías/secciones y en el caso de las noticias el link
asociado. La lista resultado concatena la información de manera tal de contar con el path de
la estructura.

En el ejemplo anterior, el Link5 está dentro de la sección “Deportes”, la cual está dentro de
la categoría “Generales”.

---

## 4 Aseguradora (Parcial de otro año)

Una aseguradora provee distintos tipos de seguros dentro de su cartera, entre los mismos se
encuentran:

- Seguro Automotor, en el cual se cuenta con un número de póliza y una descripción
(por ejemplo, “todo riesgo”, el monto asegurado, el DNI del dueño de la póliza)
- Seguro de Vida, donde se registra el DNI del asegurado, el número de la póliza, su
descripción y el monto asegurado.
- Seguro Hogar, el número y descripción de la póliza, el monto del seguro y el DNI
del dueño de la póliza.
- Seguro Integrador, en el cual se guarda un cliente (solo el DNI) y los seguros con
los que cuenta (Automotor, Hogar, Vida, Integrador, y cualquier otro tipo de seguro
que ofrezca o pueda ofrecer la compañía). El monto asegurado de un seguro
integrador se calcula como la suma de todos los seguros que contiene. El número de
póliza de un seguro integrador queda determinado por el mayor número de póliza de
los seguros que contiene.
- Seguro Temporal, Está pensado para un seguro que tiene una fecha de inicio y fin,
puede ser de cualquier tipo de seguro existente. El número de póliza es el mismo que
la póliza contenida. El monto asegurado es el monto del seguro contenido siempre y
cuando la fecha actual esté dentro del periodo de validez.

La Aseguradora posee diferentes formas de calcular el costo de la póliza. Por ejemplo, hay
seguros automotores que se calculan como un monto fijo y otros que son un porcentaje del
valor asegurado. En el caso del Seguro Hogar se calcula como un monto fijo más un
porcentaje del valor asegurado. En el caso del seguro de vida es un porcentaje del valor
asegurado. Sin embargo, la forma de calcular el costo del seguro puede cambiar en cualquier
momento, e incluso se pueden incorporar nuevas formas de calcular el costo. Para el caso de
seguro integrador es la suma de los costos de los seguros contenidos, en el seguro temporal el
costo es el costo del seguro contenido, siempre y cuando la fecha actual esté dentro de la
vigencia del seguro (caso contrario es 0).

Se desea brindar listados en los cuales se incluyan todos los seguros que posee la compañía
que cumplan con determinado criterio. A continuación se listan algunos ejemplos.

a) Listar todos los seguros cuya descripción contenga la palabra “Automotor”,
ordenados por dni del asegurado, y luego por número de póliza si un asegurado posee
más de un seguro que coincida con la búsqueda
b) Listar todos los seguros cuya descripción contenga la palabra “Hogar” y el monto
asegurado sea superior a $250.000, ordenados por dni del asegurado
c) Listar todos los seguros donde haya un DNI igual a 24.134.323, ordenado por número
de póliza.
d) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones
lógicas de las mismas. Los criterios de ordenamiento también pueden variar y deben
poder combinarse de cualquier manera.

NOTA: en el caso de seguro integrador el resultado de la búsqueda incluye cualquier seguro
que posea y cumple con la búsqueda (no se incluyen seguros integradores en los resultados).
En el caso del seguro temporal, solo se incluye como resultado de la búsqueda los elementos
por él contenidos y que cumplen con la búsqueda siempre y cuando esté vigente.

---

## 5 Alquilo ahora

Una empresa dedicada al alquiler de un sin fin de elementos, desea organizar sus elementos
disponibles en alquiler. Los tipos de elementos que dispone en alquiler son los siguientes:

Herramientas de trabajo, de las cuales se registra el valor, antigüedad (en meses),
código de identificación y una descripción.
- Muebles de oficina, de los cuales se registra el tiempo que hace que los tiene la
empresa (en meses) el valor del mueble un código de identificación y una descripción
- Inmuebles, donde se registra un código de identificación, una descripción, cuantos
meses hace que se incorporó a la empresa y el valor de la misma.
- Combos armados, un combo posee un código de identificación y los elementos que
lo conforman (herramientas, muebles, inmuebles, combos y cualquier otro tipo de
elementos que la empresa alquila ahora o puede alquilar en un futuro). El valor total
de un combo queda determinado por la suma de todos los elementos que posee. La
antigüedad de un combo queda determinada por la mayor antigüedad de sus
elementos.
- Elemento deprecated, está pensado para cuando los elementos se van a volver
obsoletos a cierta cantidad de meses de antigüedad (por ejemplo 12) y puede ser
cualquier tipo de elemento existente. Tienen un código de identificación propio y el
valor del elemento deprecated es el valor del elemento contenido siempre que la
antigüedad sea menor que los meses de envejecimiento, en caso de ser mayor se descuenta, al día de hoy, un 2% por mes de diferencia. La empresa está evaluando el
2% y piensa cambiarlo a un 3% o 5% en un futuro.

Se desea listar todos los elementos de la empresa que cumplan con determinado criterio. A
continuación se listan algunos ejemplos.

Listar todos los elementos que en la descripción contenga la palabra “Makita”,
b) Listar todos elementos que tengan más de 3 meses de antigüedad y el valor sea menor
a $50.000,
c) todos los elementos cuyo código de identificación sea igual a 35,
d) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones
lógicas de las mismas.

Todos los resultados se devuelven ordenados por código de identificación, y en caso de
igualdad por antigüedad

NOTA: en el caso de los combos el resultado de la búsqueda incluye cualquier elemento que
posea y cumple con la búsqueda (No se incluyen combos en los resultados de una búsqueda).
En el caso del elemento deprecated, se retorna el elemento contenido siempre y cuando
cumpla con el criterio de búsqueda y la antigüedad del mismo no haya superado la pre
establecida.

--- 

## 6 Bazar Aladin (Parcial de otro año)

La empresa posee distintas formas de cobrar alquiler por sus elementos. Por ejemplo, hay
herramientas que tienen un costo fijo de alquiler, mientras que por otras herramientas se
cobra un porcentaje de su valor. Los inmuebles se los alquila por un porcentaje de su valor
más un monto fijo a modo de seguro. En el caso de los muebles de oficina se cobra un monto
fijo. Sin embargo, la forma de calcular el costo de alquiler puede cambiar en cualquier
momento, e incluso se pueden incorporar nuevas formas de calcular el costo.
Para el caso de los combos el costo de alquiler es la suma de los costos de elementos que
posee, en el caso del elemento deprecated el costo de alquiler es la mitad del costo de alquiler
del elemento contenido si se paso la antigüedad pre establecida, sino sigue siendo el costo de
alquiler del elemento contenido.

Un bazar desea ofrecer a sus clientes, además de los productos individuales, combos
pre-armados con importantes descuentos. Cada combo, puede agrupar productos sueltos u
otros combos ya armados, sin perder la estructura de qué producto pertenece a cada combo
original. Por ejemplo, los productos “pico decoración liso”, “pico decoración estrella”, y
“pico decoración plano” se agrupan en un combo llamado “picos de decoración”. Luego puede existir un combo “combo decoración básico”, que incluye, una “manga pastelera” y el combo “picos de decoración”.

Los productos poseen una lista de categorías, un peso y un precio. En el caso del combo, el
precio queda determinado por la suma de los precios de todos sus componentes, menos un
1,4% por cada producto contenido. Se debe tener en cuenta que el descuento nunca debe
superar el 50% del precio original del combo (si supera, el descuento queda en 50%), a futuro
ambos valores pueden variar, incluso ser distintos dependiendo del combo. El peso de cada
combo queda determinado por la suma de los pesos de todos sus componentes. Las categorías
de un combo se determinan como la unión, sin repetidos, de todas las categorías de los
elementos que contienen.

A la hora de armar combos, el bazar establece ciertas condiciones sobre los componentes que
se pueden incorporar inicialmente a los mismos. Por ejemplo, que el componente que se
agrega al combo posea una categoría dada y un precio menor a $3000. Otros combos
controlan que el componente a agregar posea la categoría dada, otros que el precio no supere
los $400, o incluso algunos combos que controlan que el peso sea superior a 250 gramos.
Igualmente, como la demanda va cambiando, este requisito se puede combinar y variar
dinámicamente.

El bazar desea que se provean los siguientes servicios :

- Contar la cantidad total de productos que posee un combo, considerando todos los
niveles de agrupamiento.
- Retornar el producto con menor peso de un combo. Nota: debe ser un producto y no
un combo.
- Realizar búsquedas de productos/combos. Las búsquedas retornan un listado de
productos o combos que cumplen ciertas condiciones. Por ejemplo:
o Todos los que tienen un peso superior a 300 gramos.
o Todos los que el precio no supere los 500 pesos.
o Todos los que posean la categoría “cocina”
o Los anteriores son solo algunos ejemplos de búsqueda, se pueden crear nuevas
formas y combinaciones lógicas de los anteriores.

Nota 1: En el caso de la búsqueda, si un combo cumple con lo que se está buscando,
el combo en sí será parte del resultado, en caso que no cumpla se propaga la búsqueda
sobre los elementos que él contiene.

El bazar también quiere incluir dos tipos nuevos de combos: uno que se identifica como
“Paga uno”, en el cual el precio se calcula siempre como el mayor precio de sus
componentes (no va a cambiar nunca la forma). y otro que se identifica como “Masterchef”,
el cual solo acepta elementos que posean la categoría “Cocina Gourmet”.

