# B-VSA LS 21/22 - Semestrálny projekt 1 - Skupina B

![Java 1.8](https://img.shields.io/badge/Java-1.8-blue)
![EclipseLink 2.7.10](https://img.shields.io/badge/EclipseLink-2.7.10-green)
[![Public domain](https://img.shields.io/badge/License-Unlicense-lightgray)](https://unlicense.org)

Cieľom 1. semestrálneho projektu je naprogramovať aplikáciu rezervačného systému parkovacích domov využívajúcu
technológiu JPA s pripojením na SQL databázu. Aplikácia poskytuje konzolové rozhranie (CLI) pre prácu používateľa.
Rozhranie má byť jednoduché a poskytovať prístup ku všetkým funkcionalitám aplikácie. Môžte sa inšpirovať projektami z
cvičení.

## Entity

Aplikácia musí pracovať s entitami:

- **Parkovací dom** - má atribúty názov, adresa, cena za hodinu parkovania
- **Poschodie parkovacieho domu** - obsahuje identifikačné označenie poschodia
- **Parkovacie miesto** - obsahuje identifikačné označenie miesta
- **Auto** - obsahuje atribúty značka, model, EČV, farba
- **Zákazník** - obsahuje atribúty meno, priezvisko, email

### Asociácie

Medzi implementovanými entitami musia byť dodržané vzťahy nasledovne:

* Parkovací dom obsahuje viacero poschodí.
* Poschodie parkovacieho domu obsahuje viacero parkovacích miest.
* Parkovacie miesto obslúži viacero áut, avšak maximálne jedno pre daný čas.
* Každé auta má práve jedného vlastníka/zákazníka.
* Auto môže byť zaparkované iba na jednom parkovacom mieste v danom čase.
* Ktoré auto je zaparkované na ktorom parkovacom mieste je definované rezerváciou, ktorá obsahuje čas začiatku, čas
  ukončenia parkovania a celkovú cenu za parkovanie. Maximálna dĺžka parkovania nie je určená. Účtuje sa každá začatá
  hodina.

## Funkcionalita

Aplikácia musí zabezpečiť CRUD operácie nad všetkými entitami spomenuté vyššie. Taktiež musí umožniť používateľovi
rezervovať si parkovacie miesto pre vlastné auto. Rezervácia môže byť vytvorená iba na špecifický čas. Po odídení z
parkovacieho miesta sa rezervácia ukončí a zapíše sa čas ukončenia rezervácie a vypočíta sa celková cena za rezerváciu
parkovacieho miesta.

Aplikácia musí umožniť používateľovi zobrazenie zoznamu rezervácií za špecifický deň a parkovacie miesto, zoznam svojich
aktívnych rezervácií a taktiež musí obsahovať možnosť kontroly obsadenosti parkovacieho domu.

Pri vymazaní parkovacieho domu musia byť vymazané aj všetky jeho poschodia aj parkovacie miesta. Rovnako ak je vymazaný
zákazník musia byť vymazané aj jeho autá.

## Doplňujúce kritéria

### Skupina B

Rozšírte aplikáciu o **typy áut**, ktoré môžu v parkovacom dome parkovať (napr. elektrické, LPG a pod.). Jednotlivé
parkovacie miesta obsahujú atribút, pre ktorý typ auta sú určené a taktiež každé auto má definovaný typ. Implementujte
riešenie tak aby typ auta bola samostatný entita. Pri vytvorení rezervácie musí byť implementovaná kontrola, kde iba
auto rovnakého typu ako je určené v parkovacom mieste na ňom môže parkovať, v opačnom prípade bude rezervácia
odmietnutá.

## Hodnotenie

**Zadanie je hodnotené 20 bodmi. Vypracovanie je nutné odovzdať do 30.3.2022 23:59.**

Zadanie si naklonujte z repozitára zadania. Svoje vypracovanie nahrajte do vášho repozitára pre toto zadanie pomocou
programu Git (git commit + git push). Vypracovanie môžete “pusho-vať” priebežne. Pri vypracovaní
použite [poskytnutú sadu dát](src/test/resources/test-data.csv) pre otestovanie dodržania zadania.

**Neupravujte pom.xml**, okrem pridania závislosti pre driver databázy podľa vlastného výberu. Povolené SQL databázy:

- MySQL
- OracleDB
- Derby
- PostgreSQL
- H2 (s databázou do súboru)

**Názov `persistence-unit`** v súbore [persistence.xml](src/main/resources/META-INF/persistence.xml) **nemeňte**. Pre
spustenie aplikácie použite metódu main v triede [Project1](src/main/java/sk/stuba/fei/uim/vsa/pr1b/Project1.java).
Použitá databáza sa musí volať **VSA_PR1** a musí mať vytvoreného používateľa s **menom 'vsa' a heslom 'vsa'**. Pre
tieto účeli môžte využiť súbor [starter.sql](starter.sql).

Jednotlivé tabuľky pre entity musia byť uppercase a v anglickom jazyku:

- Parkovací dom = CAR_PARK
- Poschodie parkovacieho domu = CAR_PARK_FLOOR 
- Parkovacie miesto = PARKING_SPOT
- Auto = CAR
- Zákazník = USER
- Rezervácia = RESERVATION

Implementujte neabstraktnú triedu, ktorá bude dediť od triedy `AbstractCarParkService` a tak implementovať jej
abstraktné metódy a preťažovať konštruktor. Táto trieda má slúžiť ako API (alebo ako fasáda) pre funkcionality aplikácie
a testy hodnotenia budú využívať jej implementáciu.

Hodnotiť sa bude iba master/main branch. Kvôli testom a zrýchleniu opravovania je nutné dodržať pokyny a štruktúru
projektu, ako je stanovené v zadaní! Iba kód poslednej verzie vypracovania (t.j. z posledného commitu) do termínu
odovzdania sa berie do úvahy. Okrem testov sa bude kód a funkcionalita kontrolovať aj manuálne. Hodnotiť sa budú iba
skompilovateľné a spustiteľné riešenia.