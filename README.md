DESCRIPCION:
Este proyecto es una aplicación en Java que permite gestionar información de carros dentro de un concesionario.
El sistema permite crear, consultar, actualizar y eliminar carros, junto con los datos de su propietario, compañía y motor.

FUNCIONALIDADES
. Crear un carro
. Consultar un carro por ID
. Actualizar datos de un carro
. Eliminar un carro
. Registrar información del propietario
. Asociar compañía y motor al vehículo

ESTRUCTURA DEL PROYECTO

El proyecto está organizado en paquetes:

models → Clases como Car, Owner, Company, Motor
enums → Enumeraciones como Color, FuelType, TypeVehicle
services → Lógica del sistema (CarServices)

COMO FUNCIONA
El usuario ingresa los datos del carro desde consola
Se validan algunos datos como:
Precio (no negativo)
Color (válido dentro del enum)
Email (formato básico)
El carro se almacena en una lista (ArrayList)
Se pueden realizar operaciones de consulta, actualización y eliminación

CONCEPTOS APLICADOS
Encapsulamiento
Uso de clases y objetos
Relaciones entre clases (Car → Owner, Company, Motor)
Validación de datos
Manejo básico de errores (try-catch)
