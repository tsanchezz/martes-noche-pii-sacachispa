# Sacachispa

Repositorio para entrega de ejercicios de Algoritmos y Estructuras de Datos II

## Especificacion con Pila:

´´´
TDA GarageDeSuperAutos
  InicializarGarage
  EntrarAuto
  SacarAuto
  PrimerAuto
  HayAutos
´´´

## Implementacion con Pila:

´´´
GarageDeSuperAutos:
  Garage<Arreglo>
  primero = primer auto

  InicializarGarage:
    CrearArreglo 

  EntrarAuto:
    Sumar auto al arreglo en la primera posicion
    Cambiar primero por el nuevo auto

  SacarAuto:
    HayAutos() Fijarse si el garage esta vacio
    Sacar el primer auto
    Cambia el primero

  PrimerAuto:
    Retorna primero

  HayAutos: 
    Si existe primero
´´´

## Especificacion con Cola:

´´´
TDA LavaderoDeSuperAutos
  InicializarLavadero
  EntrarAuto
  SacarAuto
  AutoParaLavar
  HayAutosParaLavar
´´´

## Implementacion con Cola:

´´´
LavaderoDeSuperAutos:
  Lavadero<Arreglo>
  primero = primer auto

  InicializarGarage:
    CrearArreglo 

  EntrarAuto:
    Sumar auto al arreglo en la primera posicion
    Cambiar primero por el nuevo auto

  SacarAuto:
    HayAutosParaLavar() Fijarse si el lavadero esta vacio
    Sacar el primer auto
    Cambia el primero

  PrimerAuto:
    Retorna primero

  HayAutosParaLavar: 
    Si existe primero
´´´

