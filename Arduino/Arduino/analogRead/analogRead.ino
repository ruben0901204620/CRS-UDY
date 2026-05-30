#include <Wire.h> // comunicarse con el LCD
#include <LiquidCrystal.h> // para controlar el LCD
#include <SPI.h> // comunicarse con RFID
#include <MFRC522.h> // libreria del lector RFID522
#include <Stepper.h> // controla el motor paso a paso

// instancia del objeto
LiquidCrystal_I2c lcd(0x27, 16, 2); // 16 columnas y 2 filas

#define SS_PIN 10 //define el lector (SDA)
#define SRT_PIN A1 // es el reset 
MFRC522 frid(SS_PIN, RST_PIN); // crea objeto

// pines para sensor ultrasonico
#define TRIG_PIN A2  //emite pulsos
#define ECHO_PIN A3 //recibe inpulsos

#define BUZZER_PIN 7 // buzzer pasivo
#define STEPS_PER_REV 2048 // define el motor con 2018 pasos de revolucion
Stepper stepper(STEPS_PER_REV, 2,4,3,5); //se conectan a los pines

#define FAN_PIN 6 // se conecta al pin motor DC
#define LDR_PIN A0 // se conecta al A0
#define LDR_THRESHOLD 500 // si la luz es > 500 activa el ventilador

bool accessConcendido = false; // indica si ya se permitio el acceso
const float DIST_THRESHOLD = 30.0; // istancia del sensor ultrasonico

void setup() {
  Serial.begin(9600); /// inicia el monitor serial para depurar
  SPI.begi(), // inicia el bus de SPI (usado por RFID)
  rfid.PCD_Init(); // inicializa el lector RFID

  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);
  pinMode(BUZZER_PIN, OUTPUT);

  pinMode(FAN_PIN, OUTPUT);
  pinMode(LDR_PIn, INPUT);

  stepper.setSpeed(10); // velocidad del motor paso a paso rpm

  lcd.init(); // inicializa la pantalla LCD
  lcd.backlight(); //enciende la luz de fondo
  lcd.serCursor(0, 0) //posiciona el cursor
  lcd.print("Acceso denegado") // mensaje inicial del LCD

  void loop() {

    if( !accesDenegado && rfid.PICC_IsNewCardPresent() && rfid.PICC_ReadCardSerial() ) {
      accessConcedido = true;
      noTone(BUZZER_PIN); // apaga el buzzer( por si sonaba)

      lcd.clear();
      lcd.setCursor(0, 0);
      lcd.print("acceso concedido");
       




    }

  }


}


















