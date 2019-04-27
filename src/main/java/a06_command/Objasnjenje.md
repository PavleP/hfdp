Kod command patterna imamo 4 tipa klasa:
* Receiver
* Command
* Invoker
* Client

Primer je dobro objasnjen sa daljinskim upravljacem.
Daljiinski upravljac ima dugmad.
U command patternu daljinski upravljac je **invoker**.
Svako dugme ima svoj metod tipa **buttonOnePressed**.
Mi zelimo da pridruzimo svakom dugmetu neku akciju, na primer **paljenje svetla u dnevnoj sobi**.
Da bismo to resili mogli bismo u samoj klasi daljinskog upravljaca (invokeru) reci za svaki 
metod koji je pridruzen nekom dugmetu sta radi - odnosno **hardkodovati**. Na primer:
```
public void buttonOnePressed() {
  Light livingRoomLight = new Light("Living room");
  livingRoomLight.on();
}
```

Ideja command patterna je da metodi u invokeru ne znaju sta rade. Odnosno da se **invoker parametrizuje 
spolja** odnosno od strane **client-a**.

Zato se definise interfejs **Command** sa samo jednim metodom **execute()**.

**Receiver-i** su instance na kojima se komanda izvrsava. 
Na primer **Light livingRoomLight = new Light("Living room");** je receiver.
Light moze imati na primer 2 metoda (moze i vise), on() i off().

Onda napravimo konrketnu komandu tako sto **implementiramo** interfejs **Command**.
Na primer **LightOnCommand**. Ona ima kao field **Light light;** koji kaze koje svetlo je u pitanju.
U execute() metodi ove komande imamo **light.on()**;.

I sada u **invoker** dodamo field-ove tipa Command. Za svaki button po jedan takav field.
Sada metodi tipa **buttonOnePressed** postaju jednosavni:
```
private Command buttonOneCommand; 
public void buttonOnePressed(){
  buttonOneCommand.execute();
}
``` 

Onda u samom klijentu (gde je main metod) kreiramo **invoker**.
I zatim mu setujemo u klijentu komande. **Invoker nije svestan koje su mu komande setovane**.
Znaci invoker je **potpuno decouplovan** od receiver-a.

S obzirom da **Command** interfejs ima samo jedan metod execute(), njegove se implementacije 
mogu praviti i kao **lambde**. Tako se izbegne kreiranje puno klasa koji implentiraju komandu.

  
 

