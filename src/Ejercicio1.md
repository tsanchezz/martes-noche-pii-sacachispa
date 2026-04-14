Clase 17-03-2026

## Ejercicio 1

### Especificacion con Pila:

```
TDA GarageDeSuperAutos
  InicializarGarage
  EntrarAuto
  SacarAuto
  PrimerAuto
  HayAutos
```

### Implementacion con Pila:

```
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
```

## Especificacion con Cola:

```
TDA LavaderoDeSuperAutos
  InicializarLavadero
  EntrarAuto
  SacarAuto
  AutoParaLavar
  HayAutosParaLavar
```

### Implementacion con Cola:

```
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
```

## Ejercicio 2

Analisis de estrategias.

<img width="602" height="863" alt="image" src="https://github.com/user-attachments/assets/7a9415fd-889a-430c-9ebe-9f00aeb4c0dd" />