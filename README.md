# Sacachispa

Repositorio para entrega de ejercicios de Algoritmos y Estructuras de Datos II

## Especificacion:

TDA GarageDeSuperAutos
  InicializarGarage
  EntrarAuto
  SacarAuto
  PrimerAuto
  HayAutos

## Implementacion:

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
