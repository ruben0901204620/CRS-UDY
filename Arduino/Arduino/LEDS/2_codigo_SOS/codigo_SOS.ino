int ledPin = 8;
int punto = 100;
int largo = 500;
int delayFinal = 1500;
void setup() {
  pinMode(ledPin,OUTPUT); // Envia informacion al Arduino

}

void loop() {
  // COdigo SOS
  // ----------------------------------------------------------
  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(largo);

  // ----------------------------------------------------------
  digitalWrite(ledPin,HIGH);
  delay(largo);
  digitalWrite(ledPin,LOW);
  delay(largo);

  digitalWrite(ledPin,HIGH);
  delay(largo);
  digitalWrite(ledPin,LOW);
  delay(largo);

  digitalWrite(ledPin,HIGH);
  delay(largo);
  digitalWrite(ledPin,LOW);

  // ----------------------------------------------------------
  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  digitalWrite(ledPin,HIGH);
  delay(punto);
  digitalWrite(ledPin,LOW);
  delay(punto);

  delay(delayFinal);

}
