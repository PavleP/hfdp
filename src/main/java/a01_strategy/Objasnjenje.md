Problem prvo krece od situacije da imamo 
Duck abstraktnu klasu koju nasledjuju posebne implementacije,
od kojih svaka ima svoj display metod koji nije od sustinske
vaznosti ovde. Ideja je cisto da se svaka implementacija 
medjusobno razlikuje.

U abstraktnoj Duck klasi imamo metode fly i quack koje se 
mogu koristiti u svim impementacijama, na primer u display
metodu.

Vremenom se pojavljuju patke sa razlicitim fly i quack 
ponasanjem (**behavior**). Na primer imamo drvenu patku
koja ne moze da leti i onda ima drugaciji fly behavior tzv. 
**NoFlyBehavior**. Takodje imamo gumenu patku koja niti moze
da leti niti moze da kvace, nego pisti (**Squeak**).

Da bismo sada u **svakoj implementaciji imali odgovarajuci 
behavior**, **PRVA IDEJA** je da napravimo zadrzimo u 
abstraktnoj klasi postojece (**default-ne**) implementacije
za **Quack** i **Fly**, a onda po potrebi da to Override-ujemo.
Ovo je pogresno jer:
 - Imamo dupliranje koda kada se neke specificne implementacije poklapaju. 
 Na primer za Drvenu i Gumenu patku imamo identican Fly behavior tj. 
 **NoFlyBehavior**., a moramo ga kopirati u obe implementacije zato sto je 
 defaultna implementacija **Fly**.
  - Tesko je utvrditi koja patka ima koje ponasanje jer su ona u nekim slucajevima
  promenjena u podklasama a u nekima nisu.
  - Promena defaultnog ponasanje afektuju sve koji klase koje ga nisu prepisale 
  (znaci vecinu)
  - Tesko je u runtime-u promeniti ponasanje pojedine patka klase
  
**DRUGA IDEJA** je da uvedemo **dva interfece-a** za FlyBehavior i QuackBehavior,
i da onda svaka podklasa mora da ih implementira i da ih definise. Slicno ovome
je da napravimo dve abstraknte metode u Duck abstraknoj klasi. Problem sa ovim je
**ogromno dupliciranje** koda jer vecina pataka ima defautn-o ponasanje. Naravno, i 
runtime promena ponasanja je problematicna.

**NAJOLJA IDEJA** je **Strategy pattern**. On podrazumeva da se uvedu dva nova 
interfejsa **FlyBehavior** (fly metod) i **QuackBehavior** (quack metod) i da njih 
impelentiraju razlicita ponasanja za Fly i Quack, i onda da duck klasa ima polja 
**flyBehavior** i **quackBehavior**. Zatim se prilikom pravljenja svake implementaicje 
duck-u definise koji (koja impeletacija) mu je **flyBehavior** i **quackBehavior**. 
Prednosti:
 - Nema **dupliciranja behavior-a**. Definisu se samo na jednom mestu i primenjuju se gde koji treba.
 - Nema uvezanosti koju smo imali sa defualtni. Svakoj se patki zasebno zadaju oba
 behaviore-a.
 - Transparentno je kojoj se patki zadao koji behavior.
 - U runtime se kroz setere moze promeniti behavior od svake patke.

PRIMENJENI PRINICIPI SU:
 - **Encapsulate what varies**
   Mi smo enkapsulairali dve grupe implementacija za dva behaviora.
 - **Favor composition over inheritance**
   Kompoziciciju smo koristili u Duck klase, gde smo je komponovali od 
   flyBehaviora i quackBehaiora
 - **Program to interfaces, not implementaitions**
    Koristili smo interfejse za oba behaviora pa ih je lako bilo menjati za svaku 
    razlicitu impementaciju. Oni su definisali kontrakt - da svaki taj behavior ima
    fly tj quack metod i on se moze koristiti u display metodu.
 
