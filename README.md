	
Nagyi receptkönyve (Java)
Gyerekkoromban gyakran forgolódtam nagymamám köténye körül, miközben ő a finomabbnál finomabb ételeket készítette számunkra. 
A receptkönyvében minden egyes étel mellett fel volt sorolva, hogy milyen hozzávalók kellenek az adott étel elkészítéséhez. 
Soronként egy-egy étel neve és összetevői szerepeltek a receptkönyvben, így:
étel_neve:hozzávaló[,hozzávaló]…
Írjon programot, amely a standard bemenetről beolvassa a receptkönyv adatait, majd a standard kimenetre írja soronként a példa kimenetben
megadott formában azt, hogy az egyes hozzávalók mely ételek elkészítéséhez szükségesek!
A hozzávalókat lexikografikusan növekvő sorrendben (ábécérendben) írja a kimenetre! Ha egy hozzávaló több ételhez is kell, 
akkor az ételek nevét is lexikografikusan növekvő sorrendben (ábécérendben) írja a hozzávaló sorába!

Példa bemenet:
tejfolos lencseleves:lencse,sargarepa,voroshagyma,so,tejfol,mustar,ecet,baberlevel,liszt,viz
paprikas krumpli:burgonya,voroshagyma,piros paprika,lecsokolbasz,so,viz
krumplis teszta:liszt,tojas,so,voroshagyma,burgonya,piros paprika,tejfol,viz
zoldsegleves:sargarepa,petrezselyem,so,piros paprika,zeller,karalabe,burgonya,viz

A példa bemenethez tartozó kimenet:
baberlevel:tejfolos lencseleves
burgonya:krumplis teszta,paprikas krumpli,zoldsegleves
ecet:tejfolos lencseleves
karalabe:zoldsegleves
lecsokolbasz:paprikas krumpli
lencse:tejfolos lencseleves
liszt:krumplis teszta,tejfolos lencseleves
mustar:tejfolos lencseleves
petrezselyem:zoldsegleves
piros paprika:krumplis teszta,paprikas krumpli,zoldsegleves
sargarepa:tejfolos lencseleves,zoldsegleves
so:krumplis teszta,paprikas krumpli,tejfolos lencseleves,zoldsegleves
tejfol:krumplis teszta,tejfolos lencseleves
tojas:krumplis teszta
viz:krumplis teszta,paprikas krumpli,tejfolos lencseleves,zoldsegleves
voroshagyma:krumplis teszta,paprikas krumpli,tejfolos lencseleves
zeller:zoldsegleves
