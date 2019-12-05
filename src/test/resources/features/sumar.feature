#language: es

Característica: Realizar una operaciones con la calculadora de Windows
  Yo como Usuario
  Quiero abrir la calculadora
  Para realizar las operaciones basicas

  Escenario: Suma Exitosa
    Dado que Juan se encuentra en la calculadora de Windows
    Cuando Juan realiza la suma de 6 y 8
    Entonces el deberia de ver el resultado igual a 14

  Escenario: Resta Exitosa
    Dado que Juan se encuentra en la calculadora de Windows
    Cuando Juan realiza la resta de 4 y 2
    Entonces el deberia de ver el resultado igual a 2