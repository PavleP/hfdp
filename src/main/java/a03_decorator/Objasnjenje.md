Pocetni problem je da imamo razne vrste kafa. To su bazicne kafe poput **DarkRoast**, 
**Decaf**, **Espresso** i **HouseBlend**. One imaju svoju osnovnu cenu. Cuvaju se u paketu
**coffee**.

Svaka osnovna kafa se moze dodatno obogatiti sa prilozima (**condiment** paket). Zelja je da
se dobije cena gotove kafe i njen opis.

Da bi se to napravilo **PRVA** i **najgluplja** ideja je da se naprave sve moguce kombinacije.
Na primer **HouseMilkWithMilkAndMocha** pa **HouseMilkWithDoubleMilk** i tako beskonacno
kombinacija koje se samo povecavaju sa brojem zacina. Ovo je naravno nezamislivo.

**DRUGA** ideja, koja je mnogo bolja, je da u abstraknoj klasi **Beverage** 
(koju nasledjuju sve kafe) definisemo za svaki zacin uvedemo boolean field (milk,
soy, mocha...), sa defaulntnim vrednostima false. Za svaki taj field imamo 
setter i getter. U toj abstraknoj klasi **Beverage** onda imamo **getCost()** metod koji
racuna koliko kostaju sami zacini (na osovu falogova i cene svakog od zacina). 
Onda kafe koje nasledjuju **Beverage** mogu u kostrukotru da setuju svaki od flagova
(npr espresso sa mlekom) na true, u **getCost()** metodu od kafe se onda poziva 
**super.getCost()** koji sadrzi cenu svih zacina (ukljucenih kroz konstruktor) na koje 
**dodaje cenu od same kafe**. Mane ove implementacije su:
 - Promena cena od zacina nas primorava postojeci kod (Beverage klasu)
 - Novi zacini nas primoravaju da dodajemo nove flag-ove i metode u **Beverage** klasu i da 
 **modifikujemo getCost()** metod. Znaci opet potreba za modifikacijom postojeceg koda.
 - Ako na primer uvedemo **IceTea** beverage, nema smisla da on bude sa mlekom, a mi imamo
 mogucnst da promenimo taj flag - sto je losa ideja.
 - Sta ako zelimo **duplu kolicinu mleka** - to nije moguce sa ovom implementacijom.  

**DA BI SE RESILI SVI OVI PROBLEMI** moze se koristiti **DECORATOR PATTERN**. 
Imamo **Beverage** abstraktnu klasu (tj interfejs) koja ima metode **getCost** i 
**getDescription**. Svaka kafa implementira ovaj interfejs.

Zatim imamo za zacine **CondimentDecorator** kojeg ce naslediti sve klase zacina. 
**CondimentDecorator** implementira takodje interfejs **Beverage**. Znaci svi zacini su
**Beverage**. Ipak **NAJVAZNIJA OSOBINA** klase **CondimentDecorator** (pa samim tim
i svih njenih implementacija) je da ima field **Beverage beverage**. Taj field je zapravo
**beverage** na koji se primenjuje pojedini zacin. Mi prilikom konsturisanja svakog zacina
moramo da navedemo postojecu insancu od **beverage** na koji se taj zacin primenjuje. 
Onda metodi u zacinu **getCost()** i **getDescription()** (koje svaki zacin takodje mora da 
implementira), mogu da pozovu **getCost()** i **getDescription()** od **beverage** field-a, i
da na njih nalepe doprinos od tog zacina.

Znaci mi na primer:
 - konstruisemo objekat kafa, 
 - pa kreiramo novi objekat kafaSaMlekom gde prilikom kreiranja objektu mleko zadajemo filed kafa 
 (jer je mleko condiment i zahteva da mu se podesi beverage)
 - pa kreiremo novi objekat kafaSaMlekomISlagom, gde prilikom kreiranja objekta slag  zadaje field
 kafaSaMlekom (jer je slag condiment i zahteva da mu se podesi beverage)
 - ...
Kada se napravi poslednji objekat (svi zacini pododavani), onda se moze pozivati **getCost()** i 
**getDescription()** metod od tog objekta. On ce u svakom od tih gettera pozvat prvo isti taj
get iz svog beverage fied-a, a ovaj ce iz svog itd. dok se ne dodje do osnovne kafe koja ce vratiti
svoju cenu odnosno opis. Onda se vrac nazad gde se na tu cenu tj. opis dodaju opisi od svakg zacina
dok se ne dodje do pocetnih gettera od poslednje dodatkog zacina.
 
Ono sto je navedeno kao drugi primer je ubacivanje i size-a u pricu (drugi primer). Da bi svaki zacin 
Zogao koristiti size u odredjivanju svoje cene, vazno je da ga on moze iskopati iz osnovne kafa instnce.
On to cini kroz svoj beverage field. Zato **getSize()** u **CondimentDecorator** klasi vraca 
**beverage.getSize()**, a ne **this.size**.
 
Ovime smo izbegli da moramo menjamo beverage klasu kada dodajemo zacine cime smo ispostovali 
**Open-Closed principle** - otvoreno za ektenziju ali zatvorene za promenu.
 
Bilo koji zacin sada mozemo dodavati bilo koliko puta.
 
Kao sto u knjizi pise **Java I/O** klase se u velikoj meri oslanjaju na Decorator pattern-e. 
Sve jako podseca na ovaj primer ovde. Pravi se **InputStream** sto je kao nas **Beverage**. 
Onda imamo **FilterInputStream** sto je kao nas **CondimentDecorator** - on u sebi ima 
polje **InputStream in** i konsruktor za njegovu inzicijalizaciju. Ovo je isto kao sto imamo 
kod nas **Beverage beverage** field u  **CondimentDecorator** klasi. Onda se dodaju ponasanja 
po zelji i kada se pozove npr. **read()** on ce uvaziti sve te prethodno dodate dekoracije.


 