# language: es

Característica: Contratar empleado en la plataforma OrangeHRM
  Yo como analista
  Quiero ingresar a la pagina de OrangeHRM
  Para realizar el reclutamiento de un empleado con exito

  @Caso1
  Esquema del escenario: Contratacion exitosa de un candidato
    Dado que se ingresa a la pagina de OrangeHRM con usuario <usuario> y clave <clave>
    Y se procede a agregar un candidato
    |nombre    |apellido   |vacante               |correo       |telefono|
    |Joaquina  |Petit      |Payroll Administrator |liz@gmail.com|123456  |
    Cuando cumple con el proceso de entrevista
      |titulo_entrevista|entrevistador|fecha     |
      |Automatizador    |Orange       |2024-14-11|
    Y el candidato es contratado
    Entonces validamos que el candidato tenga estado <contratado>

    Ejemplos:
      |usuario|clave   |contratado|
      |Admin  |admin123|Hired     |



