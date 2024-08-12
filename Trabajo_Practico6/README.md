## Trabajo Práctico 6:  Abstracciones (Clases abstractas)

### Clases Abstractas

Definición: Una clase abstracta es una clase que no puede ser instanciada directamente. Está diseñada para ser extendida por otras clases.

Propósito: Permite definir métodos que deben ser implementados por las subclases, proporcionando una base común para clases derivadas.

Métodos Abstractos: Son métodos que se declaran en la clase abstracta pero que no se implementan (es decir no tienen comportamiento). Las subclases concretas deben proporcionar una implementación para estos métodos.

---

## 1 Sistema de Alquiler

Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
abandonará los registros en papel e implementará un sistema unificado de alquiler. El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.

Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos.

---

## 2 Centro de Cómputos

Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas.

---

## 3 Puerto de Cereales

Un puerto debe coordinar las actividades de carga de los barcos con cereal traído por
camiones desde el campo. Sólo se puede cargar un barco a la vez. Los barcos que esperan ser
cargados se ubican en una cola de espera que los ordena teniendo en cuenta su capacidad (los
barcos con mayor capacidad serán atendidos en primer lugar). Sólo se puede descargar un
camión a la vez. Los camiones que esperan ser descargados se ubican en una cola de espera
que los ordena teniendo en cuenta la fecha en que fueron cargados (los camiones que fueron
cargados primero serán atendidos en primer lugar).

---

## 4 Abstracción

Abstraer el comportamiento en común de los ejercicios 2 y 3 e implementar la solución.
Implementar como quedaron las dos versiones

