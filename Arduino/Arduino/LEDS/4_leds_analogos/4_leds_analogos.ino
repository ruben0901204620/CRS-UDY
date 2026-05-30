int pinLed = 9;
int brillo1 = 255;
int brillo2 = 200;
int brillo3 = 150;
int brillo4 = 100;
int brillo5 = 50;
int brillo6 = 25;
int brillo7 = 0;
int delayTiempo = 1000;

void setup() {
  pinMode(pinLed,OUTPUT);

}

void loop() {
  analogWrite(pinLed,brillo1);
  delay(delayTiempo);

  analogWrite(pinLed,brillo2);
  delay(delayTiempo);

  analogWrite(pinLed,brillo3);
  delay(delayTiempo);

  analogWrite(pinLed,brillo4);
  delay(delayTiempo);

  analogWrite(pinLed,brillo5);
  delay(delayTiempo);

  analogWrite(pinLed,brillo6);
  delay(delayTiempo);

  analogWrite(pinLed,brillo7);
  delay(delayTiempo);

}
