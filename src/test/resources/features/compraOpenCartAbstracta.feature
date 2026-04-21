# language: es
Característica: Crear una compra de invitado en la pagina web Open Cart Abstracta
  Yo como ingeniero de pruebas de automatización
  Quiero crear una compra de invitado en la pagina web Open Cart Abstracta
  Para verificar la funcionalidad de compra de invitado

  @crearCompra
  Escenario: Crear una compra de invitado
    Dado que el usuario está en la página de inicio de Open Cart Abstracta
    Cuando el usuario selecciona el producto a comprar
    Y el usuario selecciona el producto a comprar
    Y el usuario va a el carro de compra
    Y el usuario procede a la compra
    Y el usuario ingresa sus datos personales
    Y el usuario ingresa comentarios adicionales
    Y el usuario ingresa la forma de pago
    Y el usuario confirma la compra
    Entonces la compra se realiza exitosamente mostrando un mensaje de confirmación el cual es "Your order has been placed!"

