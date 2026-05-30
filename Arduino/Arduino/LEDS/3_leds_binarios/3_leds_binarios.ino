// ENCENDER LEDS BINARIOS
int ledAmarillo = 5;
int ledAzul = 6;
int ledRojo = 7;
int ledVerde = 8;
int tiempo = 900;
int delayFInal = 2000;

void setup() {
  pinMode(ledAmarillo,OUTPUT);
  pinMode(ledAzul,OUTPUT);
  pinMode(ledRojo,OUTPUT);
  pinMode(ledVerde,OUTPUT);

}

void loop() {
  // ********************** TODOS APAGADOS **********************
  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** UNO ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

    // ********************** DOS ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** TRES ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** CUATRO ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** CINCO ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** SEIS ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** SIETE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,LOW);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** OCHO ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** NUEVE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** DIEZ ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** ONCE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,LOW);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** DOCE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** TRECE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,LOW);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(tiempo);

  // ********************** CATORCE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,LOW);
  delay(tiempo);

  // ********************** QUINCE ENCENDIDO **********************

  // LED AMARILLO
  digitalWrite(ledAmarillo,HIGH);
  // LED AZUL
  digitalWrite(ledAzul,HIGH);
  // LED ROJO
  digitalWrite(ledRojo,HIGH);
  // LED VERDE
  digitalWrite(ledVerde,HIGH);
  delay(delayFInal);

  

}
