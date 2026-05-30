float vOut;
float vRead;
int dt = 800;
float analogVal;

void setup() {
  pinMode(vRead, INPUT);
  Serial.begin(9600);
}

void loop() {

  analogVal = analogRead(vRead);
  vOut = (5.*analogVal)/1023;
  Serial.println("El voltaje actual es de: ");
  Serial.print(vOut);
  Serial.println(" voltios");
  delay(dt);

}
