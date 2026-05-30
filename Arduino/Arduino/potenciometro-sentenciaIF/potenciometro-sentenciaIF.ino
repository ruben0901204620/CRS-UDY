float V2;
int readVal;
int analogPin = A0;
int dt = 500;

int ledPin = 9;
void setup() {
  Serial.begin(9600);
  pinMode(analogPin,INPUT);
  pinMode(ledPin,OUTPUT);
  

}

void loop() {
  readVal = analogRead(analogPin);
  V2 = (5.*readVal)/1023.;

  if(V2 > 4.0) {
    digitalWrite(ledPin, HIGH);
  }

  if(V2 <= 4.0) {
    digitalWrite(ledPin,LOW);
  }

  Serial.println(V2);
  delay(dt);
  

}
