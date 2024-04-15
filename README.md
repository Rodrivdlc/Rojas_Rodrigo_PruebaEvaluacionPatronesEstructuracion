# Rojas_Rodrigo_PruebaEvaluacionPatronesEstructuracion

En este repositorio se resuelve el Ejercicio1 de la Prueba de Evaluación Continua:Prueba de Evaluación Patrones de Estructuración.

https://github.com/Rodrivdlc/Rojas_Rodrigo_PruebaEvaluacionPatronesEstructuracion.git

Enunciado:

Una empresa de mobiliario modular realiza ventas de varios tipos de «elementos». Los elementos pueden ser piezas simples o grupos de «elementos» que forma un «kit», con lo que un «kit» es un grupo de «elementos» de cualquiera de los dos tipos.

Para cada tipo de elemento simple existe una clase definida que lo modela, heredera de la clase ELEMENTO que dispone de características diferidas precio:REAL y codigo:INTEGER, sin embargo no existe en el sistema ninguna clase que modele el «kit».

Elabore el diagrama de clases así como el código en Java correspondiente de un sistema que permita la gestión de los elementos que vende la empresa, considerando que cada «kit» tendrá un código numérico propio, y que el precio de un «kit» se calcula como la suma de los precios de sus elementos, pero con un descuento del 10 %. Implemente completamente la clase que permite modelar un «kit», prestando especial atención a su construcción y al cálculo de su precio, que debe realizarse en tiempo de ejecución.


# Soluciónes:

Solución ejercicio: src/main/java/Ejercicio1: clases Elemento, ElementoSimple, Kit, Main

UML: src/main/java/Ejercicio1/UML: Ejercicio1.puml

Tests: src/test/java/Ejercicio1: clases ElementoSimpleTest, KitTest
