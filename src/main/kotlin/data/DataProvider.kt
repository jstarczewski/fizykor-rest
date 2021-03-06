package data


object DataProvider {

    var equations: List<Equation> = listOf<Equation>(
        Equation(
            "Kinematyka",
            "Ruch jednostajny",
            "$   {v↖{→}={∆s}/t [m/s]}$   <br> $   {v↖{→}}$   prędkość, $  ∆s$   przemieszczenie/przebyta droga, $   t$   czas"
        ),
        Equation(
            "Kinematyka",
            "Ruch jednostajny zmienny",
            "$   {v↖{→}=v_0+at [m/s]}$   ,  $  a↖{→}={∆v}/t [m/s^2]$   <br> $   {v↖{→}}$   prędkość, $   v_0$   prędkość początkowa, $   a↖{→}$   przyśpieszenie, $   t$   czas, dla $   a↖{→}>0$   ruch jednostajnie przyśpieszony, dla $   a↖{→}<0$   ruch jednostajnie opóźniony"
        ),
        Equation(
            "Kinematyka",
            "Droga w ruchu jednostajnie zmiennym",
            "$   s = v_0t +↙{-} {at^2}/2$   $  [m]$  ,  $   s = {v_0 + v_k}/2 t$  ,  $   s = {v_k^2-v_0^2}/{2a}$   <br> $   s$   droga , $   a↖{→}$   przyśpieszenie, $   t$   czas, $   v_k$   prędkość końcowa, $   v_0$   prędkość początkowa <br> $   s_1:s_2:s_3 ..s_n = 1:3:5..n$   <br> Drogi przebyte przez ciało w ruchu jednostajnie przyśpieszonym bez prędkości początkowej mają się do siebie jak kolejne liczby nieparzyste."
        ),
        Equation(
            "Kinematyka",
            "Równania ruchu",
            "$   {v↖{→}}(t),=v_0+↙{-}at$   $  [m/s]$   <br> $   {v(t),}$   prędkość od czasu, $   {a↖{→}}$   przyśpieszenie, $   t$   czas <br> $   {x(t),}=x_0+s$   $   {[m]}$   <br> $   {x(t),}$   położenie od czasu, $   x_0$   położenie początkowe, w miejsce $   {s}$   wstawiamy wzór na drogę w zależności od ruchu jakim porusza się rozpatrywane ciało"
        ),
        Equation(
            "Kinematyka",
            "Spadek swobodny i rzut pionowy",
            "$   v↖{→}(t),=v_0+↙{-}at$   $  [m/s]$   <br> $   v(t),$   prędkość od czasu, $   a↖{→}$   przyśpieszenie, $   t$   czas <br> $   x(t),=x_0+s$   $  [m]$   <br> $   x(t),$   położenie od czasu, $   x_0$   położenie początkowe, w miejsce $   s$   wstawiamy wzór na drogę w zależności od ruchu jakim porusza się rozpatrywane ciało"
        ),
        Equation(
            "Kinematyka",
            "Rzut poziomy",
            "Przy spadku swobodnym, w pionie, bez oporów ruchu $   a↖{→}=g↖{→}$  , $   v↖{→}_0 = 0$  . Spadek swobodny jest ruchem jednostajnie przyśpieszonym, Dla rzutu pionowego $   h(t),=x_0+↙{-}v_0↖{→}t+↙{-}{g↖{→}t^2}/2$  , gdzie $   g$   to przyśpiesznie ziemskie."
        ),
        Equation(
            "Kinematyka",
            "Rzut ukośny",
            "$   Z=v↖{→}_ot$   , $   v↖{→}_{ky}=g↖{→}t$  , $   tgα={v_y}/{v_x}={g_t}/v_o$  ,  $   v↖{→}_c=√{v↖{→}_x^2+v↖{→}_y^2}$   <br> $   Z$   zasięg, $   v↖{→}_{ky}$   prędkość końcowa pionowej składowej wekotra prędkości całkowitej, $   tgα$   tangens kąta pod jakim ciało uderzy w ziemię, $   v↖{→}_c$   prędkość całkowita, która zawsze jest styczna do toru, $   v↖{→}_x$   pozioma składowa wektora prędkośi całkowitej, $   v↖{→}_y$   pionowa składowa wektora prędkości całkowitej"
        ),
        Equation(
            "Kinematyka",
            "Ruch po okręgu",
            "$   {v↖{→}}_{0y}=v_0sinα$  , $   {v↖{→}}_{0x}=v_0cosα$  , $   {t_{wz}}={v↖{→}_0sinα}/g↖{→}$  , $   {t_{cal}}={2v_0sinα}/g$  , $   h_{max}={v_0^2sin^2α}/{2g}$  , $   Z={v_0^2sin2α}/g$   <br> $   {α}$   kąt pod jakim ciało jest nachylone do osi O:X, $   {v↖{→}}_0$  , $   v_0$   prędkość początkowa, $   {v↖{→}}_{0x}$   prędkość początkowa poziomej skłądowej prędkości, $   {v↖{→}}_{0y}$   prędkość początkowa pionowej składowej prędkości, $   {t_{wz}}$   czas wznoszenia, $   {t_{cal}}$   czas całkowity, $   h_{max}$   maksymalna wysokość na jaką wzniesie się ciało. Czas wznoszenia jest równy czasowi spadania ciała."
        ),
        Equation(
            "Kinematyka",
            "Szybkość srednia",
            "Szybkość średnia to stosunek całkowitej drogi przebytej podczasu ruchu do całkowitego czasu trwania tego ruchu."
        ),
        Equation(
            "Kinematyka",
            "Przyspieszenie dośrodkwoe",
            "$   {a_d}↖{→}=v^2/r$   $  [m/s^2]$   <br> $   {a_d}↖{→}$   przyśpieszenie dośrodkowe, $   r$   promień, $   v$   prędkość"
        ),


        Equation(
            "Dynamika",
            "Pierwsza zasada dynamiki",
            "$   {F↖{→}}_w=0$   to w izolowanym układzie ciało/punkt materialny spoczywa, lub porusza się ruchem jednostajnym, $   {F↖{→}}_w$   siła wypadkowa"
        ),
        Equation(
            "Dynamika",
            "Druga zasada dynamiki i pęd",
            "$   {a↖{→}}=F↖{→}/m [{{kg*m/{s^2}}/{kg}=N/{kg}]$   <br> $   {F↖{→}}={∆p↖{→}}/{t}$   <br> $   {p↖{→}}=mv↖{→}$   $  [kg*{m/s}]$   <br> $   {F↖{→}}$   siła, $   {a↖{→}}$   przyśpieszenie, $   m$   masa, $  ∆p$   zmiana pędu, $   t$   czas, $   N$   Newton, jednostka siły <br> $   {p↖{→}}=p↖{→}_1+p↖{→}_{2}...p↖{→}_n={const}↖{→}$   <br> Suma pędów ciał wchodzących w skład układu izolowanego jest stała. <br> $   {p↖{→}}$   pęd, $   {v↖{→}}$   prędkość, $   m$   masa, $   {p↖{→}}_c$   pęd całkowity"
        ),
        Equation(
            "Dynamika",
            "Trzecia zasada dynamiki",
            "$   F↖{→}_{AB}=-F↖{→}_{BA}$   <br> $   F↖{→}_{AB}$   siła z jaką ciało A działa na ciało B, $   F↖{→}_{BA}$   siła z jaką ciało B działa na ciało"
        ),
        Equation(
            "Dynamika",
            "Dynamiczne równania ruchu",
            "Dla dwóch bloczków o masach $   m_1$   i $   m_2$   połączonych nierozciągliwą, lekką nitką, bez siły tarcia ciągniętych siłą $   F↖{→}$  , zaczepioną o drugi bloczek, o zwrocie skierowanym w prawo <br> $   F_{w1}=F_n$  , $   F_{w2}=F-F_n$   <br> $   m_1a=F_n$  , $   m_2a=F-F_n$   <br> $   m_1a+m_2a=F ⇒ a(m_1+m_2),=F ⇒$   $   a=F/{m_1+m_2}$   <br> $   F_{w1}$  , $   F_{w2}$   siła wypadkowa pierwsza u druga, $   F_n$   siła naciągu miedzy bloczkami, $   a_1$  , $   a_2$   przyśpieszenie pierwszego, drugie ciała, $   a$   przyśpieszenie układu"
        ),
        Equation(
            "Dynamika",
            "Tarcie",
            "$   T=μF_n$   <br> $   T↖{→}_s=μ_sF_n$  , $   T↖{→}_k=μ_kF_n$   <br> $   T↖{→}$   tarcie, $   μ$   współczynnik tarcia, $   F_n$   siła nacisku, $   T↖{→}_s$   tarcie statyczne, $   μ_s$   wsp. tarcia statycznego, $   T↖{→}_k$   tarcie kinetyczne $   μ_k$   wsp. tarcia kinetycznego <br> $   T_{smax}>T_{kmax}$  "
        ),
        Equation(
            "Dynamika",
            "Równania ruchu",
            "Dla ciała leżącego na boku $   S$   równi pochyłej o krótszej przyprostokątnej $   h$   i dłuższej $   l$  , przeciwprostokątnej $   S$  , oraz kącie $   α$  , dla którego $   sinα=h/s$   <br> $   F↖{→}_g=mg$  , $   sinα=F_s/F_g ⇒ F↖{→}_s=mgsinα$  , $   cosα=F_n/F_g ⇒ F↖{→}_n=mgcosα$  , $   T↖{→}=μmgcosα$   <br> $   F↖{→}_n$   siła nacisku, $   F↖{→}_s$   siła zsuwająca, $   F↖{→}_g$   siła grawitacji, $   T↖{→}$   siła tarcia, $   μ$   wsp. tarcia na równi, na ciało wjeżdżające na równię działa jedynie siła zsuwająca."
        ),
        Equation(
            "Dynamika",
            "Nieważkość i winda",
            "Dla windy jadącej w górę $   F↖{→}_n=mg+ma$  , Dla windy jadącej w dół $   F↖{→}_n=mg-ma$  , Ruch przyśpieszony w górę to ruch opóźniony w dół, a przyśpieszony w dół, to opóźniony w górę <br> $   F↖{→}_n$   siła nacisku, $   g$   przyśpieszenie ziemskie, $   a$   przyśpieszenie windy, $   m$   masa obiektu w windzie. Jeżeli $   a=g$   to występuje nieważkość"
        ),


        Equation(
            "Praca, moc, energia",
            "Praca",
            "$   {W=F↖{→}◦∆r↖{→}}$  , $   W=Frcosα$  , $  [N*m=J]$   <br> $   W$   praca, $   F↖{→}$   siła, $  ∆r↖{→}$   zmiana położenia, $   α$   kąt zawarty między wektorem siły i przemieszczenia, $   J$   dżul <br> $   W=∫F↖{→}{dr↖{→}$   <br> $   W=∫F↖{→}dr↖{→}$   całka siły po przemiszeczeniu"
        ),
        Equation(
            "Praca, moc, energia",
            "Moc",
            "$   P=W/t$  , $  [J/s=W]$  , gdy $   v↖{→}={const}↖{→}$   to $   P=Fv$   <br> $   P$   moc, $   v$   prędkość, $   F$   siła, jednostka mocy to Wat $   W$  "
        ),
        Equation(
            "Praca, moc, energia",
            "Energia Kinetyczna",
            "$   {E_k}={mv^2}/2$  , $  [kg * m^2/{s^2}=J]$   <br> $   E_k$   energia kinetyczna, $   m$   masa, $   {v↖{→}}$   prędkość, jednostka energi to dżul $   J$  "
        ),
        Equation(
            "Praca, moc, energia",
            "Energia potencjalna",
            "$   E_p=mgh$  , $  [kg*m^2/{s^2}=J]$  , $   R_z>>h$   <br> $   E_p$   energia potencjalna, $   m$   masa, $   g↖{→}$   przyśpieszenie grawitacyjne, $   h$   wysokość, $   R_z$   promień ziemi, $   J$   dżul"
        ),
        Equation(
            "Praca, moc, energia",
            "Energia potencjalna sprężystości",
            "$   {E_{ps}}={k*x^2}/2$  , $   {[J]}$   <br> $   {E_{ps}}$   energia potencjalna sprężystości, $   {k}$   współczynnik sprężystości $  [N/m]$  , $   {x}$   wychylenie/wydłużenie sprężyny"
        ),
        Equation(
            "Praca, moc, energia",
            "Zasada zachowania energii",
            "W izolowanym układzie, całkowita energia mechaniczna nie zmienia sie."
        ),

        Equation(
            "Bryła sztywna",
            "Ruch obrotowy",
            "$   {ω↖{→}}=α/t={2π}/T={2πf}$   $  [{rad}/s]$  , <br> $   {a↖{→}}_s=εr$  , $  [{rad}/s^2]$   <br> $   {a↖{→}_c}=√{a↖{→}_s^2+a↖{→}_d^2$  , <br> $   {ε↖{→}}={Δω}/{Δt}$   $  [{rad}/s^2]$   <br> $   {ω↖{→}}$   szybkość kątowa, $   T$   okres (czas jednego pełnego ruchu), $   f$   częstotliwość, $   t$   czas, $   a↖{→}_s$   przyśpieszenie styczne (do okręgu), $   r$   promień okręgu, $   {a↖{→}_c}$   przyśpieszenie całkowite, $   {ε↖{→}}$   przyśpieszenie kątowe"
        ),
        Equation(
            "Bryła sztywna",
            "Droga kątowa i prędkość kątowa końcowa",
            "$   {ω↖{→}_k} =ω_o+↙{-}εt$  , $   α=ω↖{→}_0t+↙{-}{εt^2}/2$   $  [rad]$  , $   α={{ω_0+ω_k}/2}t$  , $   α={ω_k^2-ω_0^2}/2ε$   <br> $   α$   droga kątowa wyrażona w radianach $  [{rad}]$  , $   {ω↖{→}}_o$   szybkość kątowa początkowa, $   {ω↖{→}}_k$   szybkość kątowa końcowa"
        ),
        Equation(
            "Bryła sztywna",
            "Zależność między wartościami liniowymi a kątowymi",
            "$   s=rα$  , $   {v_s↖{→}}=rω$  , $   a_s↖{→}=rε$   <br> $   s$   droga, $   r$   odległość od osi obrotu, $   α$   droga kątowa, $   v_s↖{→}$   prędkość styczna, $   ω↖{→}$   prędkość kątowa, $   {a_s↖{→}}$   przyśpieszenie styczne, $   {ε↖{→}}$   przyśpieszenie kątowe"
        ),
        Equation(
            "Bryła sztywna",
            "Moment siły",
            " $   M↖{→}=r↖{→}×F↖{→}, $  [N*m]$   M↖{→}=rFsinα$   <br> $   M↖{→}$   moment siły, $   r↖{→}$   wektor przemieszczenia, $   F↖{→}$   siła, $   α $   kąt zawarty między wektorem przemieszczenia a siły"
        ),
        Equation(
            "Bryła sztywna",
            "Moment bezwładności",
            " $   I=∑↖{n}↙{i=1}mr^2$  , $  [kg*m^2]$   $   I=mr^2$   <br> $   I$   moment bezwładności, $  ∑$   suma, $   m$   masa, $   r$   promień <br> Momenty bezwładności wybranych brył/przedmiotów: <br> pręt o długości $   l$   $   I=1/{12}ml^2$   <br> walec $   I=1/2mr^2$   <br> krążek $   I=1/2mr^2$   <br> cienkościenny pierścień $   I=mr^2$   <br> kula $   I=2/5mr^2$  , $   r$   promień"
        ),
        Equation(
            "Bryła sztywna",
            "Twierdzenie Steinera",
            " $   I=I_0+md^2$   <br> $   I$   moment bezwladnosci, $   I_0$   moment bezwładnośći dla bryły, w której oś obrotu przechodzi przez środek masy, $   m$   masa, $   d$   odległość od osi obrotu <br> $   x_{sr}={∑m_1x_1}/∑m_i$  , $   r↖{→}=1/M↖{→}{∑m_ir↖{→}_i$   <br> Dla układu wsp. rozpoczynającego się w środku najcięższego ciała, $   x_{sr}$   pierwsza współrzędna środka masy, $   ∑m_ir_i$   suma iloczynów mas i odległości od położenia 0, $   ∑m_i$   masa punktów całęgo układu, $   r↖{→}$   wektor położenia środka, $   M↖{→}$   moment siły "
        ),
        Equation(
            "Bryła sztywna",
            "Pierwsza zasada dynamiki ruchu obrotowego",
            "Jeżeli $   M↖{→}_w=0$   to w izolowanym układzie bryła pozostaje w spoczynku, lub porusza się ruchem jednostjanym obrotowym. "
        ),
        Equation(
            "Bryła sztywna",
            "Druga zasda dynamiki ruchu obrotowego",
            "$   E↖{→}=M↖{→}/I ⇒ M↖{→}=E↖{→}/I$  , $   M↖{→}={ΔL↖{→}}/{Δt}$   <br> $   M↖{→}$   moment siły, $   E↖{→}$   przyśpieszenie kątowe, $   I$   moment bezwładności, $   ΔL↖{→}$   zmiana momentu pędu, $   Δt$   zmiana czasu"
        ),
        Equation(
            "Bryła sztywna",
            "Dynamiczne równania ruchu",
            "Dla krążka o masie $   m_k$   przywieszonego do sufitu, mogącego się swobodnie obracać, z przywieszonym bloczkiem na lekkim, nierozciągliwym sznurku o masie m <br> $   F_w↖{→}=F_g↖{→}-F_n↖{→}$   <br> $   IE↖{→}=M↖{→}$   <br> $   ma=mg-F_n$   <br> $   IE=rF_n ⇒ 1/2m_k*r^2*a/r=r*F_n$  , $   a={mg}/{m+1/2m_k}$   <br> $   F_w↖{→}$   siła wypadkowa, $   F_g↖{→}$   siła grawitacji, $   F_n↖{→}$   siła naciągu, $   I$   moment bezwładności krążka, $   E↖{→}$   przyśpieszenie kątowe, $   M↖{→}$   moment siły działający na krążek, $   a↖{→}$   przyśpieszenie liniowe bloczka, $   m$   masa bloczka, $   m_k$   masa krążka, $   r$   promień krążka"
        ),
        Equation(
            "Bryła sztywna",
            "Moment pędu",
            "$   L↖{→}=r↖{→}×p↖{→}$  , $   [kg*m^2]$   $   L↖{→}=rmv, L↖{→}=Iω$   <br> $   L↖{→}$   moment pedu, $   r↖{→}$   promień, $   p↖{→}$   pęd, $   m$   masa, $   v↖{→}$   prędkość, $   I$   moment bezwładności, $   ω↖{→}$   prędkość katowa <br> Jeżeli $   M↖{→}_w=0$   to $   L↖{→}={const}↖{→}$  "
        ),
        Equation(
            "Bryła sztywna",
            "Energia kinetyczna ruchu obrotowego",
            "Dla toczącej się kuli $   E_k={Iω^2}/2+{mv↖{→}^2}/2$  , $  [J]$   $   v↖{→}=ωr$   <br> $   E_k$   energia kinetyczna, $   I$   moment bezwładności, $   ω↖{→}$   szybkość kątowa, $   m$   masa, $   v↖{→}$   prędkość, $   r$   promień"
        ),

        Equation("Termodynamika", "Skala Kelwina", "$  0°K=-273,15°C$  ,$  0°C=273,15°K$  "),
        Equation(
            "Termodynamika",
            "Gęstość i ciśnienie",
            "$  n={m_s/M}=N/N_a=V/V_{mol}$   <br> $  n$   liczba moli, $  m_s$   masa substancji $  M$   masa molowa, $  N$   liczba cząstek gazu, $  N_a$   liczba avogadra, $  V$   objętość gazu, $  V_{mol}$   objętość molowa gazu <br> $  N_a=6,022*10^23$  "
        ),
        Equation(
            "Termodynamika",
            "Ciepło właściwe",
            "$  ρ=m/V$   $  [{kg}/m^3]$  , $  p=F↖{→}_n/s={mg↖{→}}/s$   $  [N/m^2=Pa]$   <br> $  p_h=ρgh$   <br> $  F↖{→}_w=ρ_cgV_{ciala}$   <br> $  ρ$   gęstość, $  m$   masa $  V$   objętość, $  p$   ciśnienie, $  F↖{→}_n$   siła nacisku, $  g↖{→}$   przyśpiesznie grawitacyjne, $  Pa$   pascal, $  p_h$   ciśnienie hydrostatyczne, $  h$   wysokość, $  F↖{→}_w$   siła wyporu, $  ρ_c$   gęstość cieczy, $  V_{ciala}$   objętość zanurzonej częsci ciała"
        ),
        Equation(
            "Termodynamika",
            "Liczba moli",
            "$  C_w=Q/{mΔT}$   $  [J/{kg*K}]$   <br> $  Q=mC_wΔT$   <br> $  C_w$   ciepło właściwe, $  Q$   ciepło, Ciepło właściwe ważnych substancji to $  C_{wody}=4190$   <br> $  [J/{kg*k}]$   $  C_{lodu}=2100$    $  [J/{kg*k}]$  "
        ),
        Equation(
            "Termodynamika",
            "Równania gazu doskonałego i rzeczywistego",
            "Dla gazu doskonałego (Clapeyron) <br> $  pV=nRT$   <br> $  pV={NKT}$   <br> Dla gazu rzeczywistego (van der Waals) <br> $  (p+a/V_m^2)(V_m-b)=RT$   <br> $  p$   ciśnienie $  [N/m={Pa}]$  , $  N$   liczba cząstek gazu, $  K$   stała Boltzmana  $  V$   objętość $  [m^3]$  , $  a,b$   stałe dla danego gazu, $  V_m=V/n$   objętość molowa  $  n$   liczba moli, $  R$   stała gazowa $  R=8,31$   $  [J/{{mol}*K}]$  , $  T$   temperatura $  [K]$  "
        ),
        Equation(
            "Termodynamika",
            "Przemiana izotermiczna T=const.",
            "$  pV={const}$  , $  p$   ciśnienie, $  V$   objętość <br> Jeżeli podczas przemiany masa gazu nie ulega zmianie to ciśnienie jest odwrotnie proporcjonalne do objętośći."
        ),
        Equation(
            "Termodynamika",
            "Przemiana izobaryczna p=const.",
            "$  V/T=const$  , $  V$   objętość, $  T$   temperatura <br> Dla stałej masy gazu objętość jest wprost proporcjonalna do temperatury."
        ),
        Equation(
            "Termodynamika",
            "Przemiana izohoryczna V=const.",
            "$  p/T=const$  , $  p$   ciśnienie, $  T$   temperatura <br> Dla stałej masy gazu ciśnienie jest wprost proporcjonalne do temperatury."
        ),
        Equation(
            "Termodynamika",
            "Przemiana adiabatyczna Q=const.",
            "W przemianie adiabatycznej, nie zachodzi wymiana ciepła z otoczeniem, podczas sprężania wzrasta temperatura i ciśnienie gazu. <br> $  pV^χ={const}$  , $  p_0V_0^χ=p_kV_k^χ$  , $  χ=C_p/C_v$   <br> $  p$   ciśnienie, $  V$   objętość, $  χ$   współczynnik adiabaty, $  C_p$   ciepło molowe przy stałym ciśnieniu, $  C_v$   ciepło molowe przy stałej objętości, $  p_0$   ciśnienie początkowe, $  V_0$   objętość początkowa, $  p_k$   ciśnienie końcowe, $  V_k$   objętość końcowa"
        ),
        Equation(
            "Termodynamika",
            "Ciepło przy stałej objętości/ciśnieniu",
            "$  E_{ksr}=i/2KT$  , $  [J]$   $  E_{ksr}$   średnia energia kinetyczna, $  K$   stała Boltzmana, $  T$   temperatura <br> $  i=3$    dla cząsteczek 1 atomowych, $  i=5$   dla cząsteczek 2 atomowych, $  i=6$   dla cząsteczek 3 i więcej atomowych"
        ),
        Equation(
            "Termodynamika",
            "Średnia energia kientyczna",
            "$  ΔU=Q+W$  , $  [J]$   $  ΔU=nC_vΔT$   <br> $  ΔU$   zmiana energii wewnętrznej, $  Q$   ciepło, $  W$   praca, $  ΔT$   zmiana temperatury, $  n$   liczba moli, $  C_v$   ciepło molowe przy stałej objetosci"
        ),
        Equation(
            "Termodynamika",
            "Pierwsza zasada termodynamiki",
            "$  W=∫_cpdV$   lub $  W=-∫_cpdV$  , dla przemiany izohorycznej $  W=0$   <br> Praca to pole figury pod wykresem ciśnienia od objętości, sprężaniu gazu czyli dodatniej pracy sił zewnęrznych towarzyszy wzrost tempratury, a rozpręzaniu czyli ujemnej pracy sił zewnętrznych spadek temperatury. Jeżeli siły zwenętrzne wykonują ujemną pracę to gaz wykonuje dodatnią. W zamkniętym cyklu termodynamicznym praca zawsze jest dodatnia."
        ),
        Equation(
            "Termodynamika",
            "Praca",
            "Niemożliwy jest taki proces termodynamiczny, którego jedynym rezultatem byłoby przekazanie ciepła przez ciało chłodniejsze do ciała cieplejszego. Niemożliwe jest zbudowanie silnika cieplnego, którego sprawność wynosi 100%."
        ),
        Equation(
            "Termodynamika",
            "Druga zasada termodynamiki",
            "$  S={ΔQ}/T$  , $  [J/K]$   <br> Dla procesów odwracalnych i nieodwracalnych mozemy zapisać nierówność $  S≥{ΔQ}/T$   <br> $  S$   entropia czyli miara nieuporządkowania, $  ΔQ$   zmiana ciepła, $  T$   temperatura, drugą zasadę termodynamiki można zapisać następująco: <br> Całkowita entropia układu nie może maleć."
        ),
        Equation(
            "Termodynamika",
            "Sprawność",
            "$  η=W/Q_1={Q_1-Q_2}/Q_1=1-Q_2/Q_1$   <br> Dla silników Carno $  η={T_1-T_2}/T_1=1-T_2/T_1$   <br> $  η$   sprawność, $  W$   praca, $  Q_1$   ciepło początkowe, $  Q_2$   ciepło końcowe, $  T_1$   temperatura początkowa, $  T_2$   temperatura końcowa"
        ),
        Equation(
            "Termodynamika",
            "Entropia",
            "$  Q=nCΔT$   <br> $  C$   ciepło w zależności od rodzaju przemiany <br> $  C_v=Q_v/{n*ΔT}$   <br> Dla czastek 1 atomowych $  C_v=3/2R$  , a $  C_p=5/2R$  , dla czastek 2 atomowych $  C_v=3/2R$  , a $  C_p=7/2R$   <br> $  Q_v$   ciepło przy stałej objętości, $  Q_p$   ciepło przy stałym ciśnieniu, $  ΔT$   rożnica temperatur, $  n$   liczba moli <br> $  C_p$   ciepło molowe przy stałym ciśnieniu, $  C_v$   ciepło molowe przy stałej objętości"
        ),

        Equation(
            "Grawitacja, kosmos",
            "Pierwsze prawo Keplera",
            "W układzie słonecznym składającym się ze słońca i powiązanych z nim ciał niebieskich znajduje się osiem planet,w kolejności rosnącej odległości od słońca to: Merkury, Wenus, Ziemia, Mars Jowisz, Saturn, Uran, Neptun. Każda planeta Układu Słonecznego porusza się wokół Słońca po orbicie w kształcie elipsy, w której w jednym z ognisk jest Słońce."
        ),
        Equation(
            "Grawitacja, kosmos",
            "Drugie prawo Keplera",
            "$ {ΔA}/{Δt}={const}↖{→}$  <br> $ ΔA$   pole zakreślone przez wektor położenia planety, $ Δt$  zmiana czasu"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Trzecie prawo Keplera",
            "$ T^2/R^3={const}↖{→}$  <br> $ T$  okres obiegu planety, $ R$  odległośc od słońca "
        ),
        Equation(
            "Grawitacja, kosmos",
            "Prawo powszechnego ciążenia",
            "$ F↖{→}_{M,m}=G{Mm}/r^2$ , $ G=6,67*10^-11$  $ [m^3/{kg*s^2}]$  <br> $ F↖{→}_{M,m}$  siła z jaką ciało o masie $ M$  działa na ciało o masie $ m$ , $ G$  stała grawitacyjna, $ r$  odległość między planetami, $ M$  masa pierwszego ciała (np. planety), $ m$  masa drugiego ciała (np. satelity) "
        ),
        Equation(
            "Grawitacja, kosmos",
            "Przyśpieszenie grawitacyjne",
            "$ g↖{→}_2=GMm/{Mr}=Gm/r^2$  $ [m/s^2]$  <br> $ g↖{→}_2$  przyśpieszenie ciała 2 przyciąganego przez ciało pierwsze, $ G$  stała grawitacyjna, $ M$  masa ciała pierwszego, $ m$  masa ciała drugiego, $ r$  promień"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Natężenie pola grawitacyjnego",
            "$ γ↖{→}=F_g↖{→}/m=GM/r^2$  $ [N/kg]$  <br> $ γ↖{→}$  natężenie pola grawitacyjnego, $ F_g$  siła grawitacji działająca na masę próbną $ m$ , $ m$  masa próbna, $ G$  stała grawitacji, $ M$  masa ciała pierwszego $ r$  promień "
        ),
        Equation(
            "Grawitacja, kosmos",
            "Energia potencjalna",
            "$ E_p=-G{Mm}/r$  $ [J]$  <br> $ E_p$  energia potencjalna, $ G$  stała grawitacyjna, $ M$  masa pierwszego ciała, $ m$  masa drugiego ciała, $ r$  odległość między ciałami"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Potencjał pola garwitacyjnego",
            "$ V=E_p/m_o=-{GM}/r$  $ [J/kg]$  <br> $ V$  potencjał pola grawitacyjnego, $ G$  stała grawitacyjna, $ E_p$  energia potencjalna, $ M$  masa pierwszego ciała, $ m_0$  masa próbna, $ r$  odległość między ciałami "
        ),
        Equation(
            "Grawitacja, kosmos",
            "Praca w polu grawitacyjnym",
            "$ W=∫↖{r_2}↙{r_1}Fdr=GMm(1/r_2-1/r_1)$  $ [J]$  <br> $ W$  praca, $ G$  stała grawitacyjna, $ M$  masa pierwszego ciała, $ m$  masa drugiego ciała, $ r_1$  odległość początkowa, $ r_2$  odległość końcowa"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Prędkości kosmiczne",
            "$ v↖{→}_1=√{{GM}/r}$  <br> $ v_2↖{→}=√{{2GM}/r}=√2v↖{→}_1$  <br> $ v_1↖{→}$  pierwsza prędkośc kosmiczna, $ G$  Stała grawitacji, $ M$  masa planety, $ r$  promień $ v↖{→}_2$  druga prędkość kosmiczna"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Energia kinetyczna i potencjalna",
            " $ E_k=-1/2{E_p}=GMm/{2r}$  <br> $ E_c=-E_k=1/2{e_p}=-GMm/{2r}$  <br> $ E_k$  energia kinetyczna, $ E_c$  energia całkowita, $ G$  stała grawitacyjna, $ M$  masa planety (pierwszego ciała), $ m$  masa drugiego ciała $ R$  promień"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Natężenie pola grawitacyjnego",
            "$ γ↖{→}={GM}/R^3*r$ , dla $ R>r$ , $ γ↖{→}={GM}/r^2$ , dla $ r>>R$ , $ γ↖{→}$  natężenie, $ G$  stała grawitacyjna, $ M$  masa ziemi , $ R$  promien ziemi, $ r$  promien ciała oddalnego od środka ziemi"
        ),
        Equation(
            "Grawitacja, kosmos",
            "Odległość",
            "Jedna jednostka astronomiczna oznaczana $ au$  to średnia odległość Ziemi od Słońca, w przybliżeniu $ 1,5*10^11 m$ . Jeden rok świetlny to odległość jaką światło o prędkosći $ c=3*10^8[m/s]$  przebyłoby w ciagu roku. Rok świetlny w przybliżeniu to $ 9.46*10^{15}m$ . Parsek to odległość, dla której paralaksa roczna położenia Ziemi widzianej prostopadle do płaszczyzny orbity wynosi 1 sekundę łuku, wynosi ok. $ 3.09*10^{16}m$      "
        ),

        Equation(
            "Ruch drgający",
            "Położenie od czasu",
            "$      x(t)=Asin(ωt+ϕ_o)[m]$      , $      x_{max}=A$ <br> $      x(t)$ położenie od czasu, $      A$ amplituda, $      ω$ częstość kołowa, $      t$ czas, $      ϕ_o$ przesunięcie początkowe"
        ),
        Equation(
            "Ruch drgający",
            "Prędkość od czasu",
            "$      v↖{→}(t)=ωAcos(ωt+ϕ_o)[m/s]$      , $      v_{max}= ωA$ <br> $      v↖{→}(t)$ prędkość od czasu, $      A$ amplituda, $      ω$ częstość kołowa, $      t$ czas, $      ϕ_o$ przesunięcie początkowe"
        ),
        Equation(
            "Ruch drgający",
            "Przyśpieszenie od czasu",
            "$      a↖{→}(t)=-ω^2Asin(ωt+ϕ_o)[m/s^2]$      , $      a_{max}= -ω^2A$ <br> $      a↖{→}(t)$ przyśpieszenie od czasu, $      A$ amplituda, $      ω$ częstość kołowa, $      t$ czas, $      ϕ_o$ przesunięcie początkowe"
        ),
        Equation(
            "Ruch drgający",
            "Siła",
            "$      F↖{→}_s=-kx[kg*m/s^2=N]$      , $      F_x↖{→}=kx$      , $      k=mω^2$ <br> $      F↖{→}_s$ siła sprężystości, $      F_x$ siła wychylająca $      k$ współczynnik sprężystości, $      x$ wychylenie z punktu równowagi, $      m$ masa, $      ω$ częstość kołowa"
        ),
        Equation(
            "Ruch drgający",
            "Praca i energia",
            "$      E_{ps}={kx^2}/2$      , $      E_c={kA^2}/2$      , $      E_k=E_c-E_{ps}=k/2(A^2-x^2)$ $      [J]$ <br> $      E_{ps}$ energia potencjalna sprężystości, $      E_k$ energia kinetyczna, $      E_c$ energia całkowita, $      F↖{→}_x$ siła ciągnąca, $      x$ wychylenie, $      k$ wsp sprężystośći, $      A$ amplituda <br> <br> Praca $      W$ to pole figury pod wykresem $      F_x(x)$ i $      W=E_{ps}[J]$ Energia całkowita nie zależy od wychylenia."
        ),
        Equation(
            "Ruch drgający",
            "Zależność energii od czasu",
            "$      E_{ps}={kx^2}/2={kA}/2sin(ωt+ϕ_o)$ <br> $      E_k={mv↖{→}^2}/2={mω^2A^2cos^2(ωt+ϕ_o)}/2={kA^2}/2cos^2(ωt+ϕ_o)$ <br> $      E_c={kA^2}/2$ <br> $      E_{ps}$ energia potencjalna sprężystości, $      E_k$ energia kinetyczna, $      E_c$ energia całkowita, $      k$ wsp spręzystości, $      v↖{→}$ prędkość, $      A$ amplituda, $      ω$ częstość kołowa, $      t$ czas, $      ϕ_o$ przesunięcie początkowe, $      m$ masa"
        ),
        Equation(
            "Ruch drgający",
            "Wahadło matematyczne",
            "$      T=2π√{l/g↖{→}}$ <br> $      T$ okres, $      l$ długość linki, $      g$ przyśpieszenie grawitacyjne, wzór jest poprawny tylko dla małych wychyleń, ok. 10 stopni."
        ),
        Equation(
            "Ruch drgający",
            "Wahadło fizyczne",
            "$      T=2π√{I/{mg↖{→}d}}$ <br> $      T$ okres, $      I$ moment bezwładności, $      m$ masa $      g↖{→}$ przyśpieszenie grawitacyjne, $      d$ odległość miedzy środkiem masy a osią obrotu"
        ),
        Equation(
            "Ruch drgający",
            "Wahadło sprężynowe/masa na sprężynie",
            "$      T=2π√{m/k}$ <br> $      T$ okres, $      m$ masa obciążenia, $      k$ wsp. sprężystości "
        ),

        Equation(
            "Fale mechaniczne",
            "Prędkość fali",
            "$     v↖{→}=λ/T=λf$     , $     [m/s]$      <br> $     v↖{→}$      prędkość, $     λ$      długość fali, $     T$      okres, $     f$      czestotliwość"
        ),
        Equation(
            "Fale mechaniczne",
            "Równanie fali",
            "$     y(x,t)=Asin[ω(t-x/v)+ϕ_o]$      $     [m]$      <br> $     y(x,t)=Asin(x/λ-t/T)$      $     [m]$      <br> $     y(x,t)$      położenie punkt w zależnosci od $     x$      i $     t$     , $     A$      amplituda, $     λ$      długość fali, $     T$      okres, $     x$      przesuniecie $     λ$      długość fali"
        ),
        Equation(
            "Fale mechaniczne",
            "Interferencja fali",
            "$     y(x,t)=y_1+y_2$     , $     y(x,t)=A_1sin[2π(t/T_1-x_1/λ_1)]$      + $     A_2sin[2π(t/T_2-x_2/λ_2)]$      <br> $     y(x,t)=y_1+y_2$     , $     y(x,t)=2Acos[π({x_2-x_1}/λ)]$      * $     sin[2π(t/T-{x_1+x_2}/{2λ})]$      <br> $     y(x,t)$      położenie punkt w zależnosci od $     x$      i $     t$     , $     y_1$      funkcja opisująca pierwszą falę, $     y_2$      funkcja opisująca drugą falę, $     A$      amplituda, $     T$      okres, $     λ$      długość fali, $     λ_1$      długość pierwszej fali, $     λ_2$      długość drugiej fali, $     x_1$      położenie pierwszego punkut, $     x_2$      położenie drugiego punktu"
        ),
        Equation(
            "Fale mechaniczne",
            "Wypadkowa amplituda fali",
            "$     A_w=2Acos[π({x_2-x_1}/λ)]$      <br> $     A_w$      wypadkowa amplituda, $     λ$      długość fali, $     λ$      długość fali, $     x_1$      położenie pierwszego punkut, $     x_2$      położenie drugiego punktu "
        ),
        Equation(
            "Fale mechaniczne",
            "Maksymalne wzmocnienie fali",
            "Maksymalne wygaszenie fali wystepuje gdy różnica przebytych dróg jest równa nieparzystej wielokrotnościa połowy długości fali <br>  $     Δx=(2n+1)λ/2$     "
        ),
        Equation(
            "Fale mechaniczne",
            "Maksymalne wygaszenie fali",
            "Maksymalne wzmocnienie fali występuje gdy różnica przebytych dróg jest równa całkowitej wielokrotności długości fali <br> $     Δx=nλ$     "
        ),
        Equation(
            "Fale mechaniczne",
            "Natężenie fali",
            "$     I=E/{st}$      $     [J/{m^2*s}=W/m^2]$      <br> $     I$      natężenie, $     E$      energia, $     s$      sfera(powierzchnia), $     t$      czas <br> Próg słyszalności $     I_0=10^{-12}$      $     [W/m^2]$      <br> Czlowiek słyszy dźwieki czyli fale akustyczne z zakresu częstotliwości od $     16{Hz}$      do $     20 000{Hz}$      <br> Poziom natężenia dźwięku $     Λ=10{log}J/J_0 [db]$      "
        ),
        Equation(
            "Fale mechaniczne",
            "Zjawisko Dopplera",
            "$     f_k=f_o{{v↖{→}+↙{-}v↖{→}_{odp}}/{v↖{→}+↙{-}v↖{→}_{zr}}}$      <br> $     f_k$      czestotliwość koncowa, $     f$      czestotliwośc początkowa, $     v↖{→}$      prędkość dźwieku, $     v_{odb}$      prędkość odbiornika, $     v_{zr}$      prędkość źródła, $     v↖{→}=340$      $     m/s$      "
        ),
        Equation(
            "Fale mechaniczne",
            "Piszczałka otwarta",
            "$     f=(2n-1)v/{4L}$      $     [1/s=Hz]$      <br> Piszczałka zamknięta (od strzałki do węzła), $     f$      częstotliwość, $     n$      liczba naturalna, $     v$      prędkość dźwieku, $     L$      długość piszczałki "
        ),
        Equation(
            "Fale mechaniczne",
            "Piszczałka zamknięta",
            "$     f=(2n-1)v/{4L}$      $     [1/s=Hz]$      <br> Piszczałka zamknięta (od strzałki do węzła), $     f$      częstotliwość, $     n$      liczba naturalna, $     v$      prędkość dźwieku, $     L$      długość piszczałki "
        ),

        Equation(
            "Elektrostatyka",
            "Ładunek elektryczny",
            "$    1e=-1,6*10^{-19}C$     <br> $    1p=1,6*10^{-19}C$    , $    C$     kulomb, <br> $    1N=1,6*10^{-27}C$    , <br> $    C$     Kulomb, $    e$     elektron, $    p$     proton, $    N$     neutron <br> $    q=ne$     $    [C]$    , $    q$     ładunek, $    n$     ilość cząstek elementarnych, $    e$     cząstka elementarna (proton, elektron lub neutron)"
        ),
        Equation(
            "Elektrostatyka",
            "Siła elektrostatyczna",
            "$    F↖{→}_{qQ}=k{{qQ}/r^2}[N]$     <br> $    k=1/{4πε}[{N*m^2}/C^2]$    , $    ε=ε_rε_0$     <br> $    F↖{→}_{qQ}$     siła z jaką ładunek $    q$     i $    Q$     oddziałwywują na siebie, $    r$     odległość między ładunkami, $    k$     stała elektrostatyczna $    ε$     względna przenikalność elektryczna, $    ε_0$     wzg. przenikalność próżni, $    ε_r$     skala przenialność ośrodka wzgledem próżni <br><br> W polu jednorodnym lecąca przez nie cząstka zachowuje się jak ciało podczas rzutu poziomego."
        ),
        Equation(
            "Elektrostatyka",
            "Energia potencjalna pola elektrostatycznego",
            "$    E↖{→}=F↖{→}/q_0=kQ/r^2$     $    [N/C]$     <br> $    E↖{→}$     natężenie pola elektrostatycznego, $    Q$     ładunek ciała, $    r$     promień, $    q_0$     ładunek próbny <br> W polu jednorodnym $    E↖{→}=U/d$     <br> W polu centralnym $    E↖{→}=V/r$     <br> $    E↖{→}$     natężenie, $    U$     napięcie, $    d$     odległość między okładkami, $    V$     potencjał, $    r$     promień"
        ),
        Equation(
            "Elektrostatyka",
            "Potencjał pola elektrostatycznego",
            "$    E_p=k{Qq}/r$     $    [J]$     <br> $    E_p$     energia potencjalna, $    k$     stała elektrostatyczna, $    Q$     ładunek ciała pierwszego, $    q$     ładunek ciała drugiego, $    r$     promień"
        ),
        Equation(
            "Elektrostatyka",
            "Natężenie pola elektrostatycznego",
            "$    V=E_p/q_0=kQ/r$     $    [J/C=V]$     <br> $    U=ΔV[V]$    , $    V$     wolt <br> $    v$     potencjał pola elektrostatycznego,$    U$     napięcie, $    k$     stała elektrostatyczna, $    Q$     ładunek ciała pierwszego, $    q$     ładunek ciała drugiego, $    r$     promień"
        ),
        Equation(
            "Elektrostatyka",
            "Praca w polu elektrostatycznym",
            "Praca to $    W=ΔE_p[J]$    , lub $    W=qΔV=qU$     $    [J]$    , $    W=kQq(1/r_2-1/r_1)$     <br> $    W$     praca, $    E_p$     różnica energii potencjalnych,$    Q$     ładunek pierwszy $    q$     ładunek drugi, $    ΔV$     różnica potencjałów, $    k$     stała elektrostatyczna, $    r_1$     promien pierwszy, $    r_2$     promień drugi"
        ),
        Equation(
            "Elektrostatyka",
            "Pojemność kondensatora",
            "$    C=Q/{ΔV}$    , $    C=Q/U$     $    [C/V=F]$    , $    F$     farad <br> $    C$     pojemność, $    Q$     ładunek, $    ΔV$     różnica potencjałów <br> Dla kondensatora płaskiego $    C=ε_0*ε_rs/d$     $    [F]$    , $    ε_0= 8,841941283·10^{-12} F/m$     <br> $    C$     pojemność, $    ε_r$     stała dielektryczna substancji między okładkami kondensatora $    ε_0$     stała dielektryczna próżni, powierzchnia czynna podkładek/wspólna część powierzchni, $    d$     odległość między okłądkami"
        ),
        Equation(
            "Elektrostatyka",
            "Połączenie szeregowe kondensatorów",
            "$    U={const}$     <br> $    Q_c=Q_1+{Q_2}...+{Q_n}$     <br> $    C_c=C_1+{C_2}...{C_n}$    , gdzie $    U$     napięcie, $    Q_c$     ładunek całkowity, $    C_c$     pojemność całkowita"
        ),
        Equation(
            "Elektrostatyka",
            "Połączenie równoległe kondensatorów",
            "$    Q={const}$     <br> $    U_c=U_1+{U_2}....{U_n}$     <br> $    1/C_c=1/C_1+{1/C_2}....+{1/C_n}$    "
        ),
        Equation("Elektrostatyka", "Praca w kondensatorach", "$    W={QU}/2=Q^2/{2C}={CU^2}/2$    "),
        Equation(
            "Elektrostatyka",
            "Natężenie pola elektrostatycznego kuli",
            "$    E↖{→}={kQ}/R^3*r$     dla $    R>r$     <br> $    E↖{→}={kQ}/r^2$     dla $    r>>R$    , $    E↖{→}$     <br> natężenie, $    k$     stała elektrostatyczna, $    Q$     ładunek , $    R$     promien kuli, $    r$     promien ciała oddalnego od środka kuli "
        ),


        Equation(
            "Prąd stały",
            "Natężenie prądu",
            "$   I={Δq}/{Δt}[C/s=A]$    <br> $   I$    natężenie, $   Δq$    zmiana ładunki, $   Δt$    zmiana czasu, $   C$    kulomb, $   s$    sekunda, $   A$    amper"
        ),
        Equation(
            "Prąd stały",
            "Gęstość prądu i prędkość unoszenia ładunku",
            "$   j=l/s[A/m^2]$   , $   v=j/{ne}[m/s]$    <br> $   j$    gęstość prądu, $   l$    długość przewodnika, $   s$    pole przekroju przewodnika, $   n$    liczba przenoszonych czastek, $   e$    ładunek elementarny"
        ),
        Equation(
            "Prąd stały",
            "Opór elektryczny i opór właściwy",
            "$   R=U/I={ρl}/s$    [V/A=Ω] <br> $   ρ={Rs}/l$    <br> $   R$    opór, $   U$    napięcie, czyli różnica potencjałów, $   I$    natężenie prądu, $   Ω$    Ohm, jednostka oporu, $   s$    pole przekroju przewodnika, $   l$    długość przewodnika $   ρ$    opór właściwy "
        ),
        Equation(
            "Prąd stały",
            "Prawo Ohma",
            "Natężenie przyłożonego prądu jest wprost proporcjonale do przyłożonego napięcia $   I∼U$   "
        ),
        Equation(
            "Prąd stały",
            "Połączenie równoległe oporników",
            " $   U={const}$    <br> $   I_c=I_1+{I_2}....{I_n}$    <br> $   1/R_c=1/R_1+{1/R_2}.....{1/R_n}$    <br> $   U$    napięcie, $   R_c$    opór całkowity, $   I_c$    natężenie całkowite, $   I_1,I_2...I_n$    natężenia na kolejnych opornikach w obwodzie $   R_1,R_2...R_n$    opory kolejnych oporników należących do obwodu"
        ),
        Equation(
            "Prąd stały",
            "Połączenie szeregowe oporników",
            "$   I={const}$    <br> $   U_c=U_1+{U_2}+....{U_n}$    <br> $   R_c=R_1+{R_2}....{R_n}$    <br> $   I$    natężenie, $   U_c$    napięcie całkowite, $   U_1,U_2,U_c$    napięcie na kolejnych opornikach obwodu, $   R_c$    opór całkowity, $   R_1,R_2...R_n$   , opory na kolejnych opornika obwodu"
        ),
        Equation(
            "Prąd stały",
            "Praca",
            "$   W=UIt=I^2Rt=U^2/Rt=QU[J]$    <br> $   W$    praca, $   U$    napięcie, $   I$    natężenie, $   t$    czas, $   R$    opór, $   Q$    łądunek"
        ),
        Equation(
            "Prąd stały",
            "Moc",
            "$   P=UI=I^2R=U^2/R[V*A=W]$   , $   1{kWh}=3,6{MJ}$    <br> $   P$    moc, $   U$    napięcie, $   I$    natężenie, $   R$    opór $   W$    watt, jednostka mocy, $   {kWh}$    kilowatogodzina"
        ),
        Equation(
            "Prąd stały",
            "Prawo Ohma dla obwodu zamkniętego",
            "$   I=ε/{(R+r)}[A]$    <br> $   ε=I(R+r)=U+Ir[V]$    <br> $   ε$    siła elektromotoryczna SEM, $   I$    natężenie prądu w obwodzie, $   R$    opór zewnętrzny, $   r$    opór wewnętrzny, $   U$    napięcie"
        ),
        Equation(
            "Prąd stały",
            "Siła elektromotoryczna",
            "Suma natężen wpływających do węzła jest równa sumie natężeń z niego wypływających. <br> $   I_1+I_2=I_3+I_4$   "
        ),
        Equation(
            "Prąd stały",
            "Pierwsze prawo Kirchoffa",
            "W każdym zamkniętym oczku obwodu suma spadków napięć na odbiornikach energii (wraz z oporami wewnętrznymi) jest równa sumie sił elektromotorycznych."
        ),
        Equation(
            "Prąd stały",
            "Drugie prawo Kirchoffa",
            "$   ε={ΔW}/{Δq}[V]$   , $   ε$    siła elektromotoryczna SEM, $   ΔW$    zmiana pracy, $   Δq$    zmiana ładunku"
        ),
        Equation(
            "Prąd stały",
            "Prąd zwarcia i moc obwodu",
            "Maksymalna moc na obwodzie wydziela się kiedy opór zewnętrzny jest równy oporowi wewnętrznemu. Praca w zamkniętej pętli jest równa zero. Gdy nie ma różnicy potencjałów prąd nie płynie. Jeżeli prąd może przepłynąć drogą bez oporu to występuje prąd zwarcia."
        ),

        Equation(
            "Magnetyzm",
            "Wektor magnetyczny",
            "$  B↖{→}=F↖{→}_{⊥}/{qv}=F↖{→}_{⊥}/Il$   $  [N/{C{m/s}}={{Wb}/m^2}=T]$   <br> $  B↖{→}$   indukcja magnetyczna, $  I$   natężenie, $  l$   długość, $  F↖{→}_⊥$   prostopadła siła Lorentza działajaca na łądunek,  $  q$   ładunek $  v↖{→}$   prędkość, $  {Wb}$   Weber, $  T$   tesla"
        ),
        Equation(
            "Magnetyzm",
            "Indukcja magnetyczna wybranych przewodników",
            "Pole cewki cewki $  B↖{→}=μ_0μ_r{nI}/l$  , Pole przewodnika prosoliniowego $  B↖{→}=μ_0μ_r{I}/2πr$  , Pole pętli (w jej środku) $  B↖{→}=μ_0μ_r{I}/2r$   <br> $  B↖{→}$   indukcja magnetyczna, $  n$   liczba zwojów, $  μ_0$   przenikalność magnetyczna próżni, $  μ_r$   względna przenikalność magnetyczna, $  I$   natężenie prądu $  l$   długośc cewki, $  r$   promień przewodnika"
        ),
        Equation(
            "Magnetyzm",
            "Wektor natężenia pola magentycznego",
            "$  H↖{→}=B↖{→}/{μ_0μ_r}$  , $  [{{Wb}/m^2}=T]$  , $  H↖{→}$   wektor natężenia pola magentycznego <br> Dla cewki $  H↖{→}={nI}/l$  , Dla przewodnika prostoliniowego $  H↖{→}=I/2πr$  , Dla pętli w jej środku $  H↖{→}={I}/2r$   <br> $  H↖{→}$  , $  I$   natężenie prąu, $  l$   długośc cewki, $  r$   promień przewodnika"
        ),
        Equation(
            "Magnetyzm",
            "Siła elektrodynamiczna",
            "$  F↖{→}={Il}↖{→}×B↖{→}$  , $  F↖{→}=BIl{sinα}$   <br> $  F↖{→}$   siła elektrodynamiczna działajaca na przewodnik, $  I$   natężenie, $  l$   długość przewodnika, $  B↖{→}$   indukcja magentyczna, $  sinα$   kat zawarty między wektorami iloczynu natęzenia i długośi przewodnika, a indukcji magnetycznej"
        ),
        Equation(
            "Magnetyzm",
            "Siła Lorentza",
            "$  F↖{→}=B{Il}{sinα}=B{q/t}l{sinα}=qvB{sinα}$   <br> $  F↖{→}_{max}=B↖{→}_{⊥}{Il}↖{→}=B↖{→}_{⊥}{q/t}l=qvB_{⊥}$   <br> $  F↖{→}$   siła Lorentza działająca na cząstkę w polu magnetycznym, $  ⊥$   symbol prostopadłości, $  B↖{→}$   wektor indukcji magnetycznej, $  q$   ładunek, $  I$   natężenie, $  l$   odcinek jaki przebędzie ładunek, $  t$   czas <br> $  F↖{→}_{max}=B_{⊥}{Il}=B↖{→}_{⊥}{q/t}l=qvB_{⊥}$   <br> Siła Lorentza nie wpływa na prędkość cząstki, działą ona na określony ładunek elektryczny, gdy $  q>0$   to zwrot wyzanaczamy za pomocą reguły lewej dłoni, a gdy $  0>q$   tak samo, ale siła ma przeciwny zwrot."
        ),
        Equation(
            "Magnetyzm",
            "Związek między siłą dośrodkową a lorentza",
            "Na cząstkę poruszającą się w polu magnetycznym działa siła Lorentza, która zakrzywia jej tor ruchu i jest równa sile dośrodkowej. $  {m { v }^2}/r=qvB_{⊥}$  "
        ),
        Equation(
            "Magnetyzm",
            "Związek między praca a energią kinetyczna",
            "Praca wykonana nad czastka poruszającą sie w polu magnetycznym jest równa zmianie energi kinetycznej tej cząstki, praca w polu magnetycznym jest opisywana jest jak w polu elektrostaycznym. $  qU={m{v↖{→}}^2}$  "
        ),
        Equation(
            "Magnetyzm",
            "Reguła lewej dłoni",
            "Kierunek i zwrot wektora siły elektrodynamicznej, czy zwortu prędkości ładunku (pod wpływem siły Lorentza) wyznacza reguła lewej ręki, jeżeli linie pola magnetycznego wbijają się w wewnętrzną stronę lewej dłoni, a 4 proste palce wskazują kierunek przepływu prądu, to odchylony kciuk wskazuje maksymalną wartość siły."
        ),
        Equation(
            "Magnetyzm",
            "Dodatkowe informacje",
            "Jeżeli pole magnetyczne jest stałe w czasie to nazywamy je polem magnetostatycznym, całkowity strumień magnetyczny przenikający przez dowolną powierzchnię zamkniętą jest równy zeru."
        ),
        Equation(
            "Magnetyzm",
            "Względna przenikalność magnetyczna",
            "Względna przenikalność magnetyczna $  μ_r$   czyli stosunek $  B$   indukowanego (namagnesowania) do $  B_0$   czyli wielkości pola magnesującego $  μ_r=B/B_0$   <br> Względna przenikalność magnetyczna dla ferromagnetyków $  μ_r>>1$  , dla paragamentyków $  μ_r>1$  , dla diamagnetyków $  μ_r<1$  "
        ),

        Equation(
            "Indukcja elektromagnetyczna",
            "Wektor powierzchni/powierzchniowy",
            "Wektor powierzchni/powierzchniowy to peseudowektor, którego wartość jest równa polu powierzchni wybranej figury, jest prostopadły do tej figury."
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Strumień indukcji elektromagnetycznej",
            "$ ϕ=B↖{→}◦S↖{→}=BScosα=LI$ $ [T*m^2={Wb}]$  <br> $ ϕ$  strumień indukcji elektromagnetycznej, $ L$  indukcyjność, $ I$  natężenie, $ B↖{→}$  wektor indukcji magnetycznej, $ S↖{→}$  wektor powierzchniowy, $ cosα$  cosinus kąta zawartego miedzy wektorem indkucji magnetycznej a powierzchniowym, $ Wb$  weber"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Indukowana siła elektromotoryczna",
            "$ ε_{ind}=-{Δϕ}/{Δt}$ $ [Wb/s=V]$  <br> $ ε_{ind}$  indukowana siła elektromotoryczna, $ Δϕ$  ZMIANA strumienia indukcji, $ Δt$  czas, $ V$  wolt"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Reguła przekory",
            "Kierunek prądu indukcyjnego wzynaczamy na podstawie reguły Lenza, która mówi, że prąd indukcyjny ma taki kierunek, że jego własne pole magnetyczne przeciwdziała zmianie strumienia (przyczynie, która ten prąd wywołała)."
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Przewodnik w polu jednorodnym",
            "Dla przewodnika (np. pręta) o koncach oddalonych od siebie o $ l$  poruszajacego się z prędkością $ v$  w jdnorodnym polu magnetycznym: <br> $ U=Bvlsinα$  $ [V]$ , $ ε=-BLvsinα$  <br> $ U$  napięcie, $ B↖{→}$  wektor indukcji magnetycznej, $ v↖{→}$  prędkość $ l$  długość, $ ε$  siła elektromotoryczna, $ sinα$  kąt zawarty między wektorami indukcji magnetycznej a prędkości"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Praca w układzie",
            "$ W_{wl}=P_{wl}t=F↖{→}v↖{→}t$ $ [J]$  $ W_{wl}=W_{ot}$  <br> $ W_{ot}=I^2Rt$ , $ I=U/R={B↖{→}v↖{→}l}/R$  <br> $ W_{wl}$  praca włożona, $ P_{wl}$  moc włożona, $ t$  czas $ F↖{→}$  siła, $ v↖{→}$  prędkość, $ W_{ot}$  praca otrzymana/wydzielona na oporniku, $ I$  natężenie prądu,  $ R$  opór"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Indukcja i energia pola magnetycznego",
            "$ L=μ_0μ_r{N^2S}/l$  $ [{Wb}/A=H]$  <br> $ L=μ_0μ_r{N^2S}/l$ $ [J]$  <br> $ L$  indukcyjność cewki,  $ μ_0$  przenikalność magnetyczna próżni, $ μ_r$  względna przenikalność magnetyczna $ n$  liczba zwojów, $ S$  pole przekroju $ l$  długość, $ E_{ind}$  energia pola elektromagnetycznego zgromadzona w cewce, $ H$  henr,  $ I$  natężenie prądu"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Samoindukcja",
            "$ ε_s={Δϕ}/{Δt}=-L{Δl}/{Δt}$  <br> $ ε_s$  samoindukcja (wzbudzana w zwojnicy podczas zmiany jej własnego pola magnetycznego) $ Δϕ$  zamiana strumienia indukcji, $ Δt$  zmiana czasu, $ L$  indukcyjnosć $ Δl$  zmiana długości"
        ),
        Equation(
            "Indukcja elektromagnetyczna",
            "Indukcja wzajemna",
            "$ ε_{wz}=-M{ΔI}/{Δt}$  <br> $ ε_{wz}$  indukcja wzajemna (wzbudzana gdy np. właczamy i wyłaczamy jedną zwojniecę, to u drugiej obok wzbudza się prąd indukcyjny) $ M$  wsp. proporcjonalności $ ΔI$  zmiana natężenia, $ Δt$  czas"
        ),

        Equation(
            "Prąd przemienny, obwody",
            "Praca prądu przemiennego",
            "$      ε(t)=nSBωsin(ωt)=ε_0sin(ωt)$      , $      V$ <br> $      ε(t)$ siła elektromotoryczna od czasu, $      n$ liczba zwojów, $      S$ przekrój poprzeczny zwojów, $      B$ wartość indukcji pola magnetycznego, $      ω$ częstość kołowa, $      t$ czas $      ε_0$ siła elektromotoryczna początkowa, $      ωt$ faza pradu przemiennego, <br> W prądnicy wytwarza się prąd indukcyjny poprzez obrót uzwojenia w polu magnetycznym."
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Napięcie i natężenie skuteczne",
            "$      I_s=I_0/√2$      , $      U_s=U_0/√2$  <br> Natężenie skuteczne prądu zmiennego to takie natężenie prądu stałego, ze w tym samym obwodzie i czasie wydzielałoby taką samą energię jak prad zmienny <br> $      I_s$ natężenie skuteczne, $      I_0$ natężenie początkowe, $      U_s$ napięcie skuteczne, $      U_o$ napięcie początkowe"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Napięcie i natężenie chwilowe",
            "Jeśli obwód prądu zmiennego nie zawiera zwojnic i kondensatorów to chwilowe napiecie miedzy dwoma punktami jest zgodne w fazie z natężeniem. <br> $      U(t)=U_0sin(ωt)$ <br> $      I(t)=I_0sin(ωt)=U_0/Rsin(ωt)$ <br> $      I_o$ natężenie początkowe, $      I(t)$ natężenie od czasu, $      U(t)$ napięcie od czasu, $      U_0$ napięcie początkowe $      ωt$ faza prądu $      R$ opór"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Moc skuteczna",
            "$      P_s=I_sU_s={I_0U_0}/2$ <br> $      P_s$ moc skuteczna, $      I_s$ natężenie skuteczne, $      U_s$ napięcie skuteczne, $      I_0$ natężenie początkowe, $      U_0$ napięcie początkowe"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Praca prądu przemiennego",
            "Praca to pole figury pod wykresem mocy od czasu. <br> $      W=1/2I_0^2RT$      , gdzi $      W$ praca, $      I_0$ natężenie początkowe, $      R$ opór, $      T$ czas, czyli okres prądu przemiennego"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Wprowadznie do obwodu RLC",
            "Dla obwodu połączonego szeregowo, składającego się z opornika o oporze R, zwojnicy/cewki o indukcyjności L i kondensatora o pojemności C, podłączonym do zródła prądu przemiennego. <br> Opór na oporniku $      =R$      , opór na cewce $      R_L=ωL=2πfL$      , $      R_c=1/{ωC}=1/{2πfC}$ <br> Gdy $      R_L>R_C$ obwód ma charakter indukcyjny/napięcie wyprzedza w fazie natężenie, gdy $      R_C>R_L$ opór ma charakter pojemnościowy/napiecie opóźnia sie w fazie wzg.  natęzenia."
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Zawada obwodu RLC",
            "$      Z_{RLC}=√{R^2+(R_L-R_C)^2}$      ,$      [Ω]$ $      tgα={R_L-R_C}/R$ <br> $      Z_{RLC}$ zawada, $      R$ opór opornika, $      R_L$ opór cewki, $      R_C$ opór kondensatora, zawada to wektor wypadkowy wektorów: $      R$ biegnacego wzdłóz osi x, $      R_L$ biegnącego wzdłóż osi y, w kierunku wartości dodatnich, $      R_C$ wzdłóż osi y w kierunku wartości ujemnych."
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Napięcie i natęrzenie na oporniku w obwodzie RLX",
            "$      U_{RLC}=√{U_R^2+(U_L-U_C)^2}$ <br> $      U_{RLC}$ napięcie w obwodzie, $      U_R$ napięcie na oporniku, $      U_L$ napięcie na cewce, $      U_C$ napięcie na kondensatorze <br> $      U(t)=U_0sin(ωt+φ_0)$      , $      I(t)=I_0sint(ωt+φ_0)$ <br> $      U(t)$ napięcie od czasu, $      I(t)$ natężenie od czasu, $      U_0$ napięcie początkowe, $      I_0$ natężenie początkowe, $      ωt$ faza prądu, $      φ_0$ przesunięcie początkowe"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Transformator",
            "$      n_p/n_p=U_p/U_p=I_p/I_p, k=n_2/n_1$ <br> $      n_p$ ilość zwojów na uzwojeniu pierwotnym, $      n_w$ ilość zwojów na uzwojeniu wtórnym, $      U_p$ napięcnie na uzwojeniu pierwotnym, $      U_w$ napięcie na uzwojeniu wtórnym, $      I_p$ natężenie na uzwojeniu pierwotnym, $      I_w$ natężenie na uzwojeniu wtórnym"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Obwód drgający LC",
            "Obwód LC w którym opór jest bardzo mały $      (R≈0)$      , składa się z kondeansatora o pojemności $      C$ i cewki o indukcyjności $      L$ <br> Naładowanie kondensatora, a potem jego rozładowywanie prowadzi do wytworzenia drgań elektromagentycznych o okresie: $      T=2π√{LC}$  <br> Energia zgromadzona na kondensatorze podczas jego naładowania, $      E_p={CU^2}/2$      , energia zgromadzona na cewce gdy popłynęły przez nią ładunki z kondensatora $      E_w={LI^2}/2$ <br> $      Q(t)=Q_0cos(ωt)$      , $      Q$ ładunek, $      Q_0$ ładunek początkowy, $      ωt$ faza"
        ),
        Equation(
            "Prąd przemienny, obwody",
            "Dioda",
            "Dioda to element prostowniczy obwodu, przewodzi prąd w jednym kierunku bardziej niż w drugim. Idealną dioda (nie przepuszczająca żadnego łądunku, lub przepuszczającą cały łądunek w jedną ze stron) możemy umieścić w kierunku zaporowym (nie przepuszcza) lub przepustowym (przepuszcza)."
        ),


        Equation(
            "Optyka",
            "Zwierciadła",
            "Dla zwierciadła płaskiego wklęsłego, lub wypukłego o promieniu krzywizny $     O$     , ogniskowej $     f=1/2O$     , w pobliżu którego umieszczono przedmiot o wysokości $     h_x$      i odległości od zwierciadła $     x$     , powstaje obraz o wysokości $     h_y$      i odgległości od zwierciadła $     y$      <br> $     1/x+1/y=1/f$      <br> Zdolność skupiająca $     Z=1/f[1/m=D]$      <br> Powiększenie $     p=∣{y/x}∣=∣{h_y/h_x}∣$      <br> $     D$      dioptria"
        ),
        Equation(
            "Optyka",
            "Soczewki",
            "Dla soczewki o ogniskowej rozpraszającej, lub skupiającej o ogniskowej $     f$     , w pobliżu której umieszczono przedmiot o wysokości $     h_x$      i odległości od soczewki $     x$     , powstaje obraz o wysokości $     h_y$      i odgległości od soczewki $     y$      <br> $     1/x+1/y=1/f$      <br> Zdolność skupiająca $     Z=1/f[1/m=D]$      <br> Powiększenie $     p=∣{y/x}∣=∣{h_y/h_x}∣$      <br> $     D$      dioptria <br> "
        ),
        Equation(
            "Optyka",
            "Soczewki skupiające",
            "Dla soczewki o takich samych właściwościach jak w temacie wyżej uwzględniając współćzynnik załamania światła w soczewce i ośrodku zewnętrznym. <br> $     1/f=(n_{sc}/n_{os}-1)(1/r_1+1/r_2)$      <br> $     n_{sc}$      współczynnik załamania soczewki, $     n_{os}$      współczynnik załamania ośrodka, $     r_1$      promień pierwszy, $     r_2$      promień drugi $     f$      ogniskowa <br> dla soczewki skupiającej $     r>0$     , dla soczewki rozpraszającej $     0>r$      <br> jeżeli $     f>0$      to soczewka jest skupiająca, jeżeli $     0>f$      to soczewka jest rozpraszająca <br> ogniskowej soczewki rozpraszającej przypisujemy wartość ujemną"
        ),
        Equation(
            "Optyka",
            "Obrazy",
            "W soczewka, zwierciadłach powstajające obrazy wykazują następujące cechy, mogą być: <br> 1.powięszkone/pomniejszone <br> 2.proste/odwrócone <br> 3.pozorne/rzeczywiste <br> Na ekranie powstaje zawsze obraz rzeczywisty, obraz pozorny powstaje po przecięciu się przedłużen promieni. Gdy obraz jest pozorny to w rówaniu soczewki/zwierciadła składnik $     1/y$      zapisujemy $     -1/y$      "
        ),
        Equation(
            "Optyka",
            "Załamanie światła",
            "Światło przechodząc z jednego ośrodka do drugiego ulega załamaniu, kąt padania światła jest zawsze równy kątowi odbicia. <br> Kąt padania/odbicia jest to kąt miedzy promieniem światła a osią $     y$     , która jest prostopadła do powierzchni styku ośrodka perwszego i drugiego. <br> Podczas przejścia z ośrodka pierwszego do drugiego, gdzie $     v_1>v_2$     , $     λ_1>λ_2$      to <br> $     n_{1,2}={sinα}/{sinβ}=n_2/n_1=v_1/v_2=λ_1/λ_2$      <br> $     n_1$      współczynnik załamania światła ośrodka pierwszego $     n_1=c/v_1$     , $     n_2$      współczynnik załamania ośrodka drugiego, $     α$      kąta pod jakim pada światło w 1 ośrodku, $     β$      kąt pod jakim pada światło w drugim ośrodku $     λ_1$      długość fali w 1 ośrodku, $     λ_2$      długość fali w 2 ośrodku"
        ),
        Equation(
            "Optyka",
            "Zależność między kontem padania/odbicia",
            " Kąt odbicia jest mniejszy od końca padania gdy: <br> $     v_1>v_2$     , $     λ_1>λ_2$     , $     n_2>n_1$      <br> Kąt odbicia jest większy od kąta padania gdy: <br> $     v_2>v_1$     , $     λ_2>λ_1$      lub $     n_1>n_2$      <br> Podczas przejść swiatła między ośrodkami nie zmienia się jego częstotliwość."
        ),
        Equation(
            "Optyka",
            "Kąt graniczny",
            "Kąt graniczny jest to maksymalny kąt pod jakim padajacy promień ulega załamaniu. <br> $     {sinα}=n_2/n_1$      <br> $     {sinα}$      sinus kąta padania, $     n_2$      współczynnik załamania ośrodka drugiego, $     n_1$      współczynnik załamania ośrodka pierwszego"
        ),
        Equation(
            "Optyka",
            "Polaryzacja",
            "Promień jest spolaryzowany gdy kąt zawarty miedzy promieniem odbity, a załamanym jest kątem prostym. Taki kat nazywamy kątem Brustera."
        ),
        Equation(
            "Optyka",
            "Polaryzacja przez odbicie",
            "Polaryzowanie przez odbicie <br> $     {tgα}=n_2/n_1$      <br> $     {tgα}$      tangens kąta padania, $     n_2$      współczynnik załamania światła w ośrodku drugim, $     n_1$      wsp. załamania światła w oś. pierwszym"
        ),
        Equation(
            "Optyka",
            "Polaryzacja poprzez przejście przez szczelinę",
            "Gdy promień niespolaryzowanego światła pada na płytkę polaryzacyjną to przepuszczana jest składowa wektora natężenia pola równoległa do kierunku polaryzacji polaryzatora. <br> $     I=I_0/2$      <br> Gdy wiązka spolaryzowanego światła pada na kolejną płytkę to natężenie zależy od kąta miedzy kierunkiem polaryzacji swiatla a kier. polaryzacji polaryzatora. <br> $     I=I_0{cos^2θ}$     ."
        ),
        Equation(
            "Optyka",
            "Siatka dyfrakcyjna",
            "Światło białe przechodzące przez siątkę dyfrakcyjną ulega rozszczepieniu sie na barwy (światło monochormatyczne nie), powstają prążki w określonych rzędach <br><br> $     nλ=d{sin}α$      <br><br> $     n$      rząd prążka, $     λ$      długośc fali, $     d$      stała siatki dyfrakcyjnej $     {sin}α_n$      kąt między promieniem rzędu ($     P_0$     ) prostopadłego na ekran, a promieniem padającym na wysokość określonego rzędu, $     d$      stała siatki dyfrakcyjnej <br> $     d= $      jednostka długości/ilość rys"
        ),

        Equation(
            "Fizyka współczesna",
            "Zjawisko fotoelektryczne zewnętrzne",
            "$    E_f=W_0+E_k_{max}$     <br> $    E_f$     energia fotonu, $    W_e$     praca wyjścia, $    E_k_{max}$     maksymalna energia kinetyczna <br> $    E_f=hν={hc}/λ$    , $    W_0=hν_{gra.}={hc}/λ_{gra.}$    , $    E_k_{max}={mv^2}/2=eU_h$     <br> $    ν$     częstotliwość fali $    [Hz]$    , $    ν_{gra.}$     częstotliwość graniczna, $    c$     prędkość światła, $    e$     ładunek, $    U_h$     napięie hamowania, $    h$     stała planca $    λ$     długość fali $    [m]$     $    λ_{gra.}$     graniczna długość fali <br> Zjawisko fotoelektryczne zewnętrzne nie zachodzi gdy $    W_0>E_f$    ."
        ),
        Equation(
            "Fizyka współczesna",
            "Model atomu Bohra",
            "$    mV_nr_n=n{h}/{2π}$     <br> $    m$     masa elektronu, $    n$     numer orbity, $    V_n$     prędkość na danej orobicie, $    r_n$     promień danej orbity <br> $    r_1=5,3*10^{-11}[m]$     <br> Stosunek prędkości elektronów na kolejnych orbitach dozwolonych można wyrazić zależnością: $    v_1:v_2:v_3...v_n=1:1/2:1/3....1/n$     <br> Energia na danej orbicie dozwolonej wynosi $    E_n={-13,6}/n^2[eV]$     <br> Stosunek energi elektronów na kolejnych orbitach dozwolonych można wyrazić zależnościa: <br> $    E_1:{E_2}...{E_n}=1:1/{2^2}....1/{n^2}$    "
        ),
        Equation(
            "Fizyka współczesna",
            "Energia jonizacji",
            "Energia potrzebna do przeniesienia elektronu z orbity pierwszej do nieskoczoności nosi nazwę energii jonizacji. <br> $    E_j=E_∞-E_1=13,6[eV]$     <br> $    E_j$     energia jonizacji, $    E_∞$     energia w nieskonczoności, $    E_1$     energia na pierwszej orbicie"
        ),
        Equation(
            "Fizyka współczesna",
            "Widmo",
            "$    ν=cR(1/n^2-1/k^2)$     <br> $    ν$     częstotliwość, $    c$     prędkość swiatła, $    R$     stała Rydberga $    (1,097*10^7 [1/m])$    , $    n$     numer orbity, na którą przechodzi elektron, $    k$     numer orbity, z której elektron jest przenoszony"
        ),
        Equation(
            "Fizyka współczesna",
            "Deficyt masy",
            "$    Δm=m_{sk}-m_{j}=Zm_p+(A-Z)m_n-m_j$     <br> $    Δm$     deficity masy, $    Z$     liczba atomowa, $    m_p$     masa protonu, $    A$     liczba masowa, $    m_n$     masa neutronu"
        ),
        Equation(
            "Fizyka współczesna",
            "Energia wiązania i trwałość",
            "Energia wiązania to energia jaką trzeba dostarczyć do jądra atomu aby rozbić je na poszczególne nukleony $    E=Δmc^2$     <br>"
        ),
        Equation(
            "Fizyka współczesna",
            "Promieniowanie",
            "Promieniowanie alfa/powstają jądra Helu <br> $    ^A_ZX->_{Z-2}^{A-4}Y+_2^4{He}$     <br> Promieniowanie beta minus/powstają elektrony <br> $    ^A_ZX->_{Z+1}^{A}Y+_{-1}^0β^{-}$     <br> Promieniowanie beta plus/powstają pozytony <br> $    ^A_ZX->_{Z+1}^{A}Y+_{1}^0β^{+}$     <br> $    A$     liczba masowa, $    Z$     liczba atomowa, $    X$     dany pierwiastek, $    Y$     powstały pierwiastek, $    {He}=α$     jądro helu, cząstka alfa $    β$     cząstka beta"
        ),
        Equation(
            "Fizyka współczesna",
            "Czas połowicznego rozkładu",
            "Czas połowicznego rozpadu to okres po którym pozostaje połowa masy początkowej danej substancji. Podczas jednego okresu rozpada się połowa masy początkowej. Zależność ilości substancji od czasu opisuje rówanie: <br> $    N(t)=N_0-(1/2)^{t/T_{1/2}}$     <br> $    N$     ilość substancji, $    t$     czas, $    T_{1/2}$     okres połowicznego rozpadu"
        ),
        Equation(
            "Fizyka współczesna",
            "Zasada nieoznaczoności Heisenberga",
            "Nie można dokonać jednoczesnego pomiaru dwóch wielkości charakteryzujących rozpatrywane ciało z tą samą dokładnością <br> $    ΔxΔp≥h/{4π}$     <br> $    ΔEΔt≥h/{4π}$     <br> $    x$     przemieszczenie, $    p$     pęd, $    h$     stała Planca, $    E$     energia, $    t$     czas"
        ),

        Equation(
            "Stałe fizyczne",
            "",
            "1. Przyśpieszenie ziemskie $   g=9,81$    $   [m/s^2]$    <br><br>2. Masa Ziemi $   M_z=5,98·10^24$    $   [kg]$    <br><br>3. Średni promień $   R_z=6370$   $   [km]$    <br><br>"
        ),
        Equation(
            "Stałe fizyczne",
            "",
            "4. Liczba Avogadra $   N_A=6,02·10^23$   $   [1/{mol}]$    <br><br>5. Stała grawitacji $   G=6,67·10^-11$   $   [{Nm^2}/kg^2]$    <br><br>6. Objętość mola dla $   t=0C$    oraz $   p=1013,25{hPa}$   , $   V=22,41 [{dm}^3/mol]$   <br><br> 7. Uniwersalna stała Gazowa $   R=8,31$   $   [J/{mol·K}]$    <br><br>8. Stała Boltzmana $   k_B=1,38·10^{-23}$   $   [J/K]$    <br><br>"
        ),
        Equation(
            "Stałe fizyczne",
            "",
            "9. Stała elektryczna $   k=1/{4π·ε_0}=8,99·10^9$   $   [{N·m^2}/C^2]$    <br><br>10. Przenikalność magnetyczna próżni $   μ_0=4π·10^{-7}$   $   N/A^2$    <br><br> 11. Prędkość światła $   c=3,000·10^8$   $   [m/s]$    <br><br>12. Stała Planca $   h=6,63·10^{-34}$   $   [J·s]$    <br><br>13. Ładunek elektryczny $   e=1,60·10^{-19}$   $   [C]$    <br><br>14. Masa elektronu $   m=9,110·10^{-31}$   $   [kg]$   <br><br>"
        ),
        Equation(
            "Stałe fizyczne",
            "",
            "15. Masa protonu $   m=1,673·10^{-27}$   $   [kg]$    <br><br>16. Masa neutronu $   m=1,675·10^{-27}$   $   [kg]$    <br><br>17. Jednostka masy atomowej $   1u=1,661·10^{-27}$   $   [kg]$    <br><br>18. Elektronvolt $   1eV=1,60·10^{-19}$   $   [J]$    <br><br>19. Stała Hubblea $   H≈75$   $   [km/{s·{Mpc}}]$    <br><br>20. Parsek $   1pc=3,09·10^16$   $   [m]$   "
        ),


        Equation(
            "Przedrostki",
            "Przedrostki",
            "Tera $  10^{12}$  $  [T]$   <br> Giga $  10^{9}$  $  [G]$   <br> Mega $  10^{6}$  $  [M]$   <br> Kilo $  10^{3}$  $  [k]$   <br> Hekto $  10^{2}$  $  [h]$   <br> Deka $  10^{1}$  $  [{da}]$   <br> Decy $  10^1$  $  [d]$   <br> Centy $  10^{-2}$  $  [c]$   <br> Mili $  10^{-3}$  $  [m]$   <br> Mikro $  10^{-6}$  $  [μ]$   <br> Nano $  10^{-9}$  $  [n]$   <br> Piko $  10^{-12}$  $  [p]$  "
        )
    )

    var flashcards = listOf<FlashCard>(
        FlashCard("Kinematyka", false, "Prędkość w ruchu jednostajnym", "$  {v↖{→}} = { ∆s }/t[m/s]$   "),
        FlashCard("Kinematyka", false, "Prędkość w ruchu zmiennym", "$   {v↖{→}}={∆s}/t [m/s]$  "),
        FlashCard("Kinematyka", false, "Przyśpieszenie w ruchu zmiennym", "$  {a↖{ → }} = { ∆v } / t[m / s^2]$ "),
        FlashCard("Kinematyka", false, "Droga w ruchu zmiennym", "$  s = v_0t +↙{-} {at^2}/2$  $  [m/s]$ "),
        FlashCard(
            "Kinematyka",
            true,
            "Droga w ruchu zmiennym z wyk. czasu i prędkości końcowej",
            "$  {s} = {v_0 + v_k}/2 t$ "
        ),
        FlashCard(
            "Kinematyka",
            true,
            "Droga w ruchu zmiennym z wyk. przyspieszenia i predkości koncowej",
            "$  {s = {v_k^2-v_0^2}/{2a}}$ "
        ),
        FlashCard(
            "Kinematyka",
            true,
            "Stosunki dróg przebytych przez ciało w ruchu jednostajnie przyspieszonym bez predkości początkowej",
            "$  {s_1:s_2:s_3:..s_n = 1:3:5..n}$ "
        ),
        FlashCard("Kinematyka", true, "Równanie ruchu v(t)", "$  {v↖{→}(t)}=v_0+at$  $ [m/s]$ "),
        FlashCard("Kinematyka", true, "Równanie ruchu x(t)", "$  {x(t)}=x_0+s$  $ [m/s]$ "),
        FlashCard("Kinematyka", true, "Wysokość od czasu w spadku swobodnym h(t)", "$  {h(t)}=x_0+v_0↖{→}t+s$ "),
        FlashCard("Kinematyka", true, "Zasięg w rzucie poziomym", "$  {Z=v↖{→}}_ot$  $ [m/s]$ "),
        FlashCard("Kinematyka", true, "Prędkość końcowa pionowej składowej prędkości", "$  {v↖{→}}_{ky}=gt$ "),
        FlashCard("Kinematyka", true, "Tangens kąta alfa w rzucie poziomym", "$  {tgα={v_y}}/{v_x}={gt}/v_o$ "),
        FlashCard(
            "Kinematyka",
            true,
            "Prędkośc calłkowita w rzucie poziomym",
            "$  {v↖{→}}_c=√{v↖{→}_x^2+v↖{→}_y^2}$ "
        ),
        FlashCard("Kinematyka", true, "Prędkosć początkowa pozioma w rzucie ukośnym", "$  {v↖{→}}_{0x}=v_0cosα$ "),
        FlashCard("Kinematyka", true, "Prędkość początkowa pionowa w rzucie ukośnym", "$  {v↖{→}}_{0y}=v_0sinα$ "),
        FlashCard("Kinematyka", true, "Czas wznoszenia w rzucie ukośnym", "$  {t_{wz}=}{v_0sinα}/g$ "),
        FlashCard("Kinematyka", true, "Czas całkowity w rzucie ukośnym", "$  {t_{cal}}={2v_0sinα}/g$ "),
        FlashCard("Kinematyka", true, "Maksymalna wysokość w rzucie ukośnym", "$  {h_{max}}={v_0^2sin^2α}/{2g}$ "),
        FlashCard("Kinematyka", true, "Zasięg w rzucie ukośnym", "$  {Z={v↖{→}}_0^2sin2α}/g$ "),
        FlashCard(
            "Kinematyka",
            true,
            "Prędkość liniowa ciała w ruchu po okregu",
            "$  {v↖{→}}= s/t= {2πr}/T = {2πfr}$ "
        ),
        FlashCard("Kinematyka", false, "Przyśpieszenie dośrodkowe", "$  {a_d↖{→}}=v^2/r$ "),
        FlashCard("Kinematyka", true, "Szybkość średnia", "$  {v_{sr}}={v_o+v_k}/2$ "),
        FlashCard("Kinematyka", true, "Częstotliwość", "$  {f=1/T}$ "),

        FlashCard("Dynamika", false, "Druga zasada dynamiki", "$ a↖{→}=F↖{→}/m$ "),
        FlashCard("Dynamika", false, "Pęd", "$ p↖{→}=mv↖{→}$  $ [kg*{m/s}]$ "),
        FlashCard("Dynamika", true, "Zasada zachowania pędu", "$ p↖{→}=p↖{→}_1+p↖{→}_2...p↖{→}_n={const}↖{→}$ "),
        FlashCard("Dynamika", true, "Trzecia zasada dynamiki", "$ F↖{→}_{AB}=-F↖{→}_{BA}$ "),
        FlashCard("Dynamika", true, "Tarcie", "$ T↖{→}=μF_n$ "),
        FlashCard("Dynamika", false, "Tarcie statyczne", "$ T↖{→}_s<<μ_sF_n$ "),
        FlashCard("Dynamika", false, "Tarcie Kinetyczne", "$ T↖{→}_k=μ_kF_n$ "),
        FlashCard("Dynamika", true, "Siła zsuwania na równi pochyłej", "$ F↖{→}_s=mgsinα$ "),
        FlashCard("Dynamika", true, "Siła tarcia na równi", "$ T↖{→}=μmgcosα$ "),
        FlashCard("Dynamika", true, "Siła nacisku na równi", "$ F↖{→}_n=mgcosα$ "),
        FlashCard("Dynamika", true, "Siła nacisku dla windy jadącej w górę", "$ F↖{→}_n=mg↖{→}+ma↖{→}$ "),
        FlashCard("Dynamika", true, "Siła nacisku dla windy jadącej w dół", "$ F↖{→}_n=mg↖{→}-ma↖{→}$ "),
        FlashCard(
            "Dynamika",
            true,
            "Stosunek siły nacisku do siły grawitacji na równi pochyłej",
            "$ cosα=F_n/F_g$ "
        ),
        FlashCard("Dynamika", false, "Druga zasada dynamiki wyrażona pędem", "$ F↖{→}={∆p↖{→}}/{t}$ "),
        FlashCard("Dynamika", false, "Siła grawitacji", "$ F↖{→}_g=m{g↖{→}}$ "),

        FlashCard("Praca, moc, energia", true, "Praca", "$      W=∫F↖{→}dr↖{→}$      "),
        FlashCard("Praca, moc, energia", false, "Praca z wykorzystaniem wektorów", "$      W=Frcosα$      "),
        FlashCard("Praca, moc, energia", false, "Moc", "$      P=W/t$      "),
        FlashCard("Praca, moc, energia", false, "Energia Kinetyczn", "$      E_k={mv^2}/2$      "),
        FlashCard(
            "Praca, moc, energia",
            false,
            "Energia Potencjalna",
            "$      E_p=mgh$      , $      R_z>>h$      "
        ),
        FlashCard(
            "Praca, moc, energia",
            false,
            "Energia Potencjalna sprężystości",
            "$      E_{ps}={k*x^2}/2$      "
        ),
        FlashCard(
            "Praca, moc, energia",
            true,
            "Zasada zachowania energii",
            "W izolowanym układzie, całkowita energia mechaniczna nie zmienia się."
        ),
        FlashCard(
            "Praca, moc, energia",
            true,
            "Moc ciała poruszającego się ze stałą prędkością",
            "$      P=Fv$      "
        ),

        FlashCard("Bryła sztywna", true, "Prędkość kątowa", "$     ω=α/t={2π}/T={2πf}$     "),
        FlashCard("Bryła sztywna", false, "Przyśpieszenie styczne", "$     a↖{→}_s=εr$     "),
        FlashCard("Bryła sztywna", true, "Przyśpieszenie całkowite", "$     a↖{→}_c=√{a↖{→}_s^2+a↖{→}_d^2$     "),
        FlashCard("Bryła sztywna", false, "Przyśpieszenie dośrodkowe", "$     a↖{→}_d =v^2/r$     "),
        FlashCard(
            "Bryła sztywna",
            true,
            "Droga kątowa z wykorzystaniem czasu prędkości kątowej końcowej",
            "$     α={{ω_0+ω_k}/2}t$      "
        ),
        FlashCard(
            "Bryła sztywna",
            true,
            "Droga kątowa z wykorzystaniem przyśpieszenia kątowego i prędkosci kątowej końcowej",
            "$     α={ω_k^2-ω_0^2}/{2ε}$     "
        ),
        FlashCard("Bryła sztywna", true, "Prędkość kątowa końcowa", "$     ω_k =ω_o+↙{-}εt$     "),
        FlashCard("Bryła sztywna", true, "Zależność miedzy drogą liniową, a kątową", "$     s=rα$     "),
        FlashCard(
            "Bryła sztywna",
            true,
            "Zależność między prędkością liniową(styczną), a kątową",
            "$     v↖{→}_s=ωr$     "
        ),
        FlashCard(
            "Bryła sztywna",
            true,
            "Zależność między przyśpieszeniem liniowym(stycznym), a kątowym",
            "$     a↖{→}_s=rε$     "
        ),
        FlashCard("Bryła sztywna", true, "Twierdzenie Steinera ", "$     I = I_0 +md^2$    "),
        FlashCard("Bryła sztywna", false, "Moment siły", "$     M↖{→}=rFsinα$     "),
        FlashCard(
            "Bryła sztywna",
            false,
            "Moment bezwładności",
            "$     I=∑↖{n}↙{i=1}mr^2$      $     I=mr^2$     "
        ),
        FlashCard("Bryła sztywna", true, "Środek masy", "$     x_{sr}={∑m_1x_1}/∑m_i$     "),
        FlashCard(
            "Bryła sztywna",
            false,
            "Druga zasada dynamiki dla ruchu obrotwego",
            "$     E↖{→}=M↖{→}/I  ⇒ M↖{→}=E↖{→}/I$     "
        ),
        FlashCard(
            "Bryła sztywna",
            false,
            "Druga zasada dynamiki ruchy obrotowego z wykorzystaniem pędu",
            "$     M↖{→}=ΔL↖{→}/Δt$     "
        ),
        FlashCard("Bryła sztywna", false, "Moment pędu", "$     L↖{→}=rmv{sinα}$     "),
        FlashCard(
            "Bryła sztywna",
            false,
            "Moment pędu ciała z wykorzystaniem szybkości kątowej",
            "$     L↖{→}=Iω↖{→}$     "
        ),
        FlashCard(
            "Bryła sztywna",
            false,
            "Energia kinetyczna ruchu obrotowego",
            "$     E_k={Iω^2}/2+{mv^2}/2$     "
        ),
        FlashCard("Bryła sztywna", false, "Przyśpieszenie kątowe", "$     ε↖{→}=Δω↖{→}/Δt$     "),


        FlashCard("Termodynamika", true, "0 Stopni Kelwinów to", "$    0°K=-273,15°C$    ,$    0°C=273,15°K$    "),
        FlashCard("Termodynamika", false, "Gęstość", "$    ρ=m/V$     $    [{kg}/m^3]$    "),
        FlashCard("Termodynamika", false, "Ciśnienie", "$    p=F↖{→}_n/s={mg↖{→}}/s$    "),
        FlashCard("Termodynamika", false, "Ciśnienie hydrostatyczne", "$    p_h=ρgh$    "),
        FlashCard("Termodynamika", false, "Ciepło właściwe", "$    C_w=Q/{mΔT}$     $    [J/{kg*K}]$    "),
        FlashCard("Termodynamika", true, "Liczba Moli", "$    n={m_s/M}=N/N_a=V/V_{mol}$    "),
        FlashCard("Termodynamika", false, "Rówanie gazu doskonałego (Clapeyrona)", "$    pV=nRT$    "),
        FlashCard("Termodynamika", true, "Przemiana izotermiczna", "$    pV={const}$    "),
        FlashCard("Termodynamika", true, "Przemiana izobaryczna", "$    V/T=const$    "),
        FlashCard("Termodynamika", true, "Przemiana izohoryczna", "$    p/T=const$    "),
        FlashCard("Termodynamika", true, "Przemiana adiabatyczna", "$    pV^χ={const}$    "),
        FlashCard("Termodynamika", true, "Współczynnik adiabaty", "$    χ=C_p/C_v$    "),
        FlashCard(
            "Termodynamika",
            true,
            "Definicja przemiany adiabatyczej",
            "W przemianie adiabatycznej, nie zachodzi wymiana ciepła z otoczeniem, podczas sprężania wzrasta temperatura i ciśnienie gazu"
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałej objętości",
            "$    C_v=Q_v/{n*ΔT}$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałym ciśnieniu",
            "$    C_p=Q_c/{n*ΔT}$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałej objętości dla cząsteczek 2-atomowych",
            "$    C_v=3/2R+R$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałej objętości dla cząsteczek 1-atomowych",
            "$    C_v=3/2R$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałym ciśnieniu dla cząsteczek 2-atomowych",
            "$    C_p=5/2R+R$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Ciepło molowe gazu doskonałego przy stałym ciśnieniu dla cząsteczek 1-atomowych",
            "$    C_p=5/2R$    "
        ),
        FlashCard("Termodynamika", false, "Średnia energia kinetyczna cząsteczki", "$    E_{ksr}=i/2RT$    "),
        FlashCard("Termodynamika", false, "Ogólna postać pierwszej zasady termodynamiki", "$    ΔU=Q+W$    "),
        FlashCard(
            "Termodynamika",
            true,
            "Pierwsza zasada termodynamiki z wykorzystaniem ciepła molowego przy stałym ciśnieniu",
            "$    ΔU=nC_vΔT$    "
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Praca wykonana przez siły zewnętrzne nad gazdem podczas jego sprężania",
            "$    W=∫_cpdV$    "
        ),
        FlashCard("Termodynamika", true, "Praca wykonana przez gaz podczas sprężania się", "$    W=-∫_cpdV$    "),
        FlashCard("Termodynamika", true, "Praca w przemianie izohorycznej", "$    W=0$    "),
        FlashCard("Termodynamika", true, "Entropia", "$    S={ΔQ}/T$    "),
        FlashCard("Termodynamika", false, "Sprawność", "$    η=W/Q_1={Q_1-Q_2}/Q_1=1-Q_2/Q_1$    "),
        FlashCard("Termodynamika", true, "Sprawność dla silników Carno", "$    η={T_1-T_2}/T_1=1-T_2/T_1$    "),
        FlashCard(
            "Termodynamika",
            true,
            "Druga zasada termodynamiki",
            "Niemożliwy jest taki proces termodynamiczny, którego jedynym rezultatem byłoy przekazanie ciepła przez ciało chłodniejsze do ciała cieplejszego."
        ),
        FlashCard(
            "Termodynamika",
            true,
            "Entropia dla procesów odwracalnych i nieodwracalnych",
            "$    S≥{ΔQ}/T$    "
        ),
        FlashCard(
            "Termodynamika",
            false,
            "Równanie gazu doskonałego z wykorzystaniem liczby cząstek",
            "$    pV={NKT}$    "
        ),
        FlashCard(
            "Termodynamika",
            false,
            "Równanie stanu gazu rzeczywistego (van der Waalsa",
            "$    (p+a/V_m^2)(V_m-b) = RT$   "
        ),

        FlashCard("Ruch drgający", false, "Położenia od czasu", "$   x(t)=Asin(ωt+ϕ_o)[m]$   "),
        FlashCard("Ruch drgający", true, "Maksymalne położenie od czasu", "$   x_{max}=A$   "),
        FlashCard("Ruch drgający", false, "Przyśpieszenie od czasu", "$   a↖{→}(t)=-ω^2Asin(ωt+ϕ_o)[m/s^2]$   "),
        FlashCard("Ruch drgający", false, "Prędkość od czasu", "$   v↖{→}(t)=ωAcos(ωt+ϕ_o)[m/s]$   "),
        FlashCard("Ruch drgający", false, "Przyśpiesznie od czasu", "$   a↖{→}(t)=-ω^2Asin(ωt+ϕ_o)[m/s^2]$   "),
        FlashCard("Ruch drgający", true, "Maksymalne przyśpieszenie", "$   a_{max}= -ω^2A$   "),
        FlashCard("Ruch drgający", true, "Siła sprężystości", "$   F_x↖{→}=kx$    "),
        FlashCard("Ruch drgający", true, "Współczynnik sprężystości", "$   k=mω^2$   "),
        FlashCard("Ruch drgający", true, "Energia potencjalna spreżystości", "$   E_{ps}=1/2F↖{→}_x{kx^2}/2$   "),
        FlashCard("Ruch drgający", true, "Energia całkowita", "$   E_c={kA^2}/2$   "),
        FlashCard("Ruch drgający", true, "Energia kinetyczna", "$   E_k=E_c-E_{ps}=k/2(A^2-x^2)$   "),
        FlashCard("Ruch drgający", false, "Zależność energii od czasu", "$   E_c={kA^2}/2$   "),
        FlashCard("Ruch drgający", false, "Okres drgania wahadła matematycznego", "$   T=2π√{l/g↖{→}}$   "),
        FlashCard("Ruch drgający", false, "Okres drgania wahadła fizycznego", "$   T=2π√{I/{mg↖{→}d}}$   "),
        FlashCard("Ruch drgający", true, "Okres drgania masy na sprężynie", "$   T=2π√{m/k}$   "),

        FlashCard("Fale mechaniczne", true, "Prędkość fali", "$  v↖{→}=λ/T=λf$  "),
        FlashCard(
            "Fale mechaniczne",
            true,
            "Rówanie fali y(x,t) z wykorzystaniem prędkości kątowej",
            "$  y(x,t)=Asin[ω(t-x/v)+ϕ_o]$  "
        ),
        FlashCard(
            "Fale mechaniczne",
            true,
            "Rówanie fali y(x,t) z wykorzystaniem długości fali",
            "$  y(x,t)=Asin(x/λ-t/T)$  "
        ),
        FlashCard(
            "Fale mechaniczne",
            true,
            "Interferencja fali zapisana przez iloczyn",
            " $  y(x,t)=y_1+y_2=2Acos[π({x_2-x_1}/λ)]sin[2π(t/T-{x_1+x_2}/{2λ})]$  "
        ),
        FlashCard("Fale mechaniczne", true, "Wypadkowa amplituda dwóch fal", "$  A_w=2Acos[π({x_2-x_1}/λ)]$  "),
        FlashCard("Fale mechaniczne", true, "Maksymalne wzmocnienie fali", "$  Δx=nλ$  "),
        FlashCard("Fale mechaniczne", true, "Maksymalne wygaszenie fali", "$  Δx=(2n+1)λ/2$  "),
        FlashCard("Fale mechaniczne", true, "Natężenie fali", "$  I=E/{st}$  "),
        FlashCard("Fale mechaniczne", true, "Natezenie fali dźwiękowej [db]", "$  Λ=10logJ/J_0$  "),
        FlashCard(
            "Fale mechaniczne",
            false,
            "Zjawisko Dopplera",
            "$  f_k=f_o{{v↖{→}+↙{-}v↖{→}_{odp}}/{v↖{→}+↙{-}v↖{→}_{zr}}}$  "
        ),
        FlashCard("Fale mechaniczne", true, "Piszczałka otwarta", "$  f={nv↖{→}}/{2L}$  "),
        FlashCard("Fale mechaniczne", true, "Piszczałka zamknięta", "$  f=(2n-1)v/{4L}$  "),

        FlashCard("Grawitacja, kosmos", true, "Drugie prawo Keplera", "$   { ΔA } / { Δt } = { const }↖{ → }$  "),
        FlashCard("Grawitacja, kosmos", false, "Trzecie prawo Keplera", "$  T^2/R^3={const}↖{→}$  "),
        FlashCard("Grawitacja, kosmos", false, "Prawo powszechnego ciążenia", "$  F↖{→}_{M,m}=G{Mm}/r^2$  "),
        FlashCard("Grawitacja, kosmos", true, "Przyśpieszenie grawitacyjne", "$  g↖{→}_2=GMm/{Mr}=Gm/r^2$  "),
        FlashCard("Grawitacja, kosmos", false, "Natężenie pola grawitacyjnego", "$  γ↖{→}=F_g↖{→}/m=GM/r^2$  "),
        FlashCard("Grawitacja, kosmos", false, "Energia potencjalna", "$  E_p=-G{Mm}/r$  "),
        FlashCard(
            "Grawitacja, kosmos",
            true,
            "Praca w polu grawitacyjnym",
            "$  W=∫↖{r_2}↙{r_1}Fdr=GMm(1/r_2-1/r_1)$  "
        ),
        FlashCard("Grawitacja, kosmos", true, "Potencjał pola grawitacyjnego", "$  V=E_p/m_o=-{GM}/r$  "),
        FlashCard("Grawitacja, kosmos", false, "Pierwsza prędkość kosmiczna", "$  v↖{→}_1=√{{GM}/r}$  "),
        FlashCard("Grawitacja, kosmos", false, "Druga prędkość kosmiczna", "$  v_2↖{→}=√{{2GM}/r}=√{2}v↖{→}_1$  "),
        FlashCard("Grawitacja, kosmos", true, "Średnia energia kinetyczna", "$  E_k=-1/2{E_p}=GMm/{2r}$  "),
        FlashCard("Grawitacja, kosmos", true, "Energia całkowita", "$  E_c=-E_k=1/2{e_p}=-GMm/{2r}$  "),
        FlashCard(
            "Grawitacja, kosmos",
            true,
            "Natężenie pola grawitacyjnego ziemi dla Promienia ziemi > r",
            "$  γ↖{→}={{GM}/R^3}r$  "
        ),
        FlashCard(
            "Grawitacja, kosmos",
            true,
            "Natęzenie pola grawitacyjnego ziemi dla r > > Promien ziemi",
            "$  γ↖{→}={GM}/r^2$  "
        ),

        FlashCard("Elektrostatyka", false, "Siła elektrostatyczna", "$  F↖{→}_{qQ}=k{{qQ}/r^2$  "),
        FlashCard("Elektrostatyka", true, "Ładunek", "$  q=ne$   $  [C]$  "),
        FlashCard("Elektrostatyka", true, "Energia potencjalna pola elektrostatycznego", " $  E_p=k{Qq}/r$  "),
        FlashCard("Elektrostatyka", true, "Potencjał pola elektrostatycznego", "$  V=E_p/q_0=kQ/r$  "),
        FlashCard("Elektrostatyka", false, "Natężenie pola elektrostatycznego", "$  E↖{→}=F↖{→}/q_0=kQ/r^2$  "),
        FlashCard(
            "Elektrostatyka",
            false,
            "Praca w polu elektrostatycznym z wykorzystaniem zmiany potencjału",
            "$  W=qΔV=qU$  "
        ),
        FlashCard("Elektrostatyka", true, "Praca w polu elektrostatycznym", "$  W=kQq(1/r_2-1/r_1)$  "),
        FlashCard("Elektrostatyka", false, "Pojemność kondensatora", "$  C=Q/{ΔV},C=Q/U$  "),
        FlashCard(
            "Elektrostatyka",
            false,
            "Pojemność kondensatora płaskiego z wykorzystaniem odległości między jego okładkami",
            "$  C=ε_0*ε_rs/d$  "
        ),
        FlashCard("Elektrostatyka", true, "Natężenie jednorodnego pola elektrostatycznego", "$  E↖{→}=U/d$  "),
        FlashCard("Elektrostatyka", true, "Natężenie centralnego pola elektrostatycznego", "$  E↖{→}=V/r$  "),
        FlashCard(
            "Elektrostatyka",
            true,
            "Ładunek całkowity w równoległym połączeniu kondensatorów",
            "$  Q_c=Q_1+{Q_2}...+Q_n$  "
        ),
        FlashCard(
            "Elektrostatyka",
            true,
            "Ładunek całkowity w szeregowy połączeniu kondensatorów",
            "$  Q={const}$  "
        ),
        FlashCard(
            "Elektrostatyka",
            true,
            "Napięcie całkowite w równoległym połączeniu kondensatorów",
            "$  U={const}$  "
        ),
        FlashCard(
            "Elektrostatyka",
            true,
            "Napięcie całkowite w szeregowym połaczeniu kondensatorów",
            "$  U_c=U_1+U_2....+U_n$  "
        ),
        FlashCard(
            "Elektrostatyka",
            true,
            "Całkowita pojemność układu kondensatorów połączonych szeregowo",
            "$  1/C_c=1/C_1+1/{C_2}....+1/C_n$  "
        ),
        FlashCard("Elektrostatyka", false, "Praca w kondesatorach", "$  W={QU}/2=Q^2/{2C}={CU^2}/2$  "),
        FlashCard(
            "Elektrostatyka",
            true,
            "Natężenie pola elektrostatycznego kuli dla R(kuli)>r",
            "$  E↖{→}={kQ}/R^3*r$  "
        ),
        FlashCard(
            "Elektrostatyka",
            true,
            "Natężenie pola elektrostatycznego kuli dla r >> R(kuli)",
            "$  E↖{→}={kQ}/r^2$  "
        ),
        FlashCard("Elektrostatyka", false, "Natężenie w polu jednorodnym", "$  E↖{→}=U/d$  "),

        FlashCard("Prąd stały", false, "Natężenie prądu", "$  I={Δq}/{Δt}$  "),
        FlashCard("Prąd stały", true, "Gęstośc prądu", "$  j=l/s[A/m^2]$  "),
        FlashCard("Prąd stały", true, "Szybkość ładunku", "$  v=j/{ne}$  "),
        FlashCard("Prąd stały", false, "Opór elektryczny", "$  R=U/I=ρl/s$  "),
        FlashCard("Prąd stały", false, "Opór właściwy", "$  ρ={Rs}/l$  "),
        FlashCard("Prąd stały", true, "Prawo Ohma", "$  I∼U$  "),
        FlashCard(
            "Prąd stały",
            true,
            "Natężenie całkowite w równoległym połączeniu oporników",
            "$  I_c=I_1+{I_2}....{I_n}$  "
        ),
        FlashCard("Prąd stały", true, "Natężenie całkowite w szeregowym połączeniu oporników", "$  I={const}$  "),
        FlashCard(
            "Prąd stały",
            true,
            "Opór całkowity w połączeniu równoległym",
            "$  1/R_c=1/R_1+{1/R_2}.....{1/R_n}$  "
        ),
        FlashCard("Prąd stały", true, "Opór całkowity w połączeniu szeregowym", "$  R_c=R_1+{R_2}....{R_n}$  "),
        FlashCard("Prąd stały", true, "Napięcie całkowite w połączeniu szeregowym", "$  U={const}$  "),
        FlashCard(
            "Prąd stały",
            true,
            "Napięcie całkowite w połączeniu równoległym",
            "$  U_c=U_1+{U_2}....{U_n}$  "
        ),
        FlashCard("Prąd stały", true, "Praca", "$  W=UItW=I^2Rt$   <br> $  W=U^2/Rt=QU$  "),
        FlashCard("Prąd stały", true, "Moc", "$  P=UI=I^2R=U^2/R$  "),
        FlashCard("Prąd stały", true, "Prawo Ohma dla obwodu zamkniętego", "$  ε=I(R+r)=U+Ir$  "),
        FlashCard("Prąd stały", true, "Siła elektromotoryczna", "$  ε={ΔW}/{Δq} [V]$  "),
        FlashCard("Prąd stały", true, "Pierwsze prawo Kirchoffa", "$  I_1+I_2=I_3+I_4$  "),
        FlashCard("Prąd stały", true, "Jedna kilowatogodzina to ?", "$  1{kWh}=3,6MJ$  "),


        FlashCard("Magnetyzm", true, "Wektor indukcji magnetycznej", "$  B↖{→}=F↖{→}_{⊥}/{qv}=F↖{→}_{⊥}/Il$  "),
        FlashCard("Magnetyzm", false, "Pole magnetyczne cewki", "$  B↖{→}=μ_0μ_r{nI}/l$  "),
        FlashCard("Magnetyzm", false, "Pole magnetyczne przewodnika prosoliniowego", "$  B↖{→}=μ_0μ_r{I}/2πr$  "),
        FlashCard("Magnetyzm", false, "Pole magnetyczne pętli (w jej środku)", "$  B↖{→}=μ_0μ_r{I}/2r$  "),
        FlashCard("Magnetyzm", true, "Wektor natężenia pola magnetycznego", "$  H↖{→}=B↖{→}/{μ_0μ_r}$  "),
        FlashCard("Magnetyzm", true, "Wektor natężenia dla cewki", "$  H↖{→}={nI}/l$  "),
        FlashCard("Magnetyzm", true, "Wektor natężenia dla pętli (w jej środku)", "$  H↖{→}={I}/2r$  "),
        FlashCard("Magnetyzm", true, "Wektor natężenia dla przewodnika prostoliniowego", "$  H↖{→}=I/2πr$  "),
        FlashCard("Magnetyzm", false, "Siła elektrodynamiczna", "$  F↖{→}=BIl{sinα}$  "),
        FlashCard("Magnetyzm", false, "Siła Lorentza", "$  F↖{→}=qvB{sinα}$  "),
        FlashCard("Magnetyzm", true, "Związek między siłą dośrodkową a Lorentza", "$  {m{v}^2}/r=qvB_{⊥}$  "),
        FlashCard("Magnetyzm", true, "Związek między pracą a energią kinetyczną", "$  qU={m{v}^2}/2$  "),
        FlashCard("Magnetyzm", true, "Przenikalność magnetyczna", "$  μ_r=B/B_0$  "),
        FlashCard("Magnetyzm", true, "Przenikalność magnetyczna dla ferromagnetyków", "$  μ_r>>1$  "),
        FlashCard("Magnetyzm", true, "Przenikalność magnetyczna dla paramagnetyków", "$  μ_r>1$  "),
        FlashCard("Magnetyzm", true, "Przenikalność magnetyczna dla diamagnetyków", "$  μ_r<1$  "),


        FlashCard(
            "Indukcja elektromagnetyczna",
            false,
            "Strumień indukcji elektromagnetycznej",
            "$  ϕ=B↖{→}◦S↖{→}=BScosα$  "
        ),
        FlashCard(
            "Indukcja elektromagnetyczna",
            false,
            "Indukowana siła elektromotoryczna",
            "$  ε_{ind}=-{Δϕ}/{Δt}$  "
        ),
        FlashCard(
            "Indukcja elektromagnetyczna",
            true,
            "Napięcie przechodzacące przez przewodnik w polu jednorodnym",
            "$  U=Bvlsinα$  "
        ),
        FlashCard("Indukcja elektromagnetyczna", true, "Praca włożona w układzie", "$  W_{wl}=P_{wl}t=Fvt$  "),
        FlashCard(
            "Indukcja elektromagnetyczna",
            true,
            "Praca otrzymana w układzie",
            "$  W_{ot}=I^2Rt$  , $  I=U/R={Bvl}/R$  "
        ),
        FlashCard("Indukcja elektromagnetyczna", true, "Indukcyność cewki", "$  L=μ_0μ_r{N^2S}/l$  "),
        FlashCard("Indukcja elektromagnetyczna", false, "Samoindukcja", "$  ε_s={Δϕ}/{Δt}=-L{Δl}/{Δt}$  "),
        FlashCard("Indukcja elektromagnetyczna", true, "Indukcja wzajemna", "$  ε_{wz}=-M{Δl}/{Δt}$  "),
        FlashCard(
            "Indukcja elektromagnetyczna",
            true,
            "Siła elektromotoryczna przewodnika w polu jednorodnym",
            "$  ε=-BLvsinα$  "
        ),
        FlashCard(
            "Indukcja elektromagnetyczna",
            true,
            "Strumień indukcji elektromagentycznej wyrażony za pomocą natężenia",
            "$  ϕ=LI$  "
        ),


        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Napięcie od czasu w pustym obwodzie pradu zmiennego",
            "$  U(t)=U_0sin(ωt)$  "
        ),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Natężenie od czasu w pustym obwodzie prądu zmiennego",
            "$  I(t)=I_0sin(ωt)=U_0/Rsin(ωt)$  "
        ),
        FlashCard("Prąd przemienny, obwody", true, "Moc skuteczna", "$  P_s=I_sU_s={I_0U_0}/2$  "),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Praca prądu przemiennego",
            "Praca to pole figury pod wykresem mocy od czasu"
        ),
        FlashCard("Prąd przemienny, obwody", true, "Opór na cewce w obwodzie RLC", "$  R_L=ωL=2πfL$  "),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Opór na kondensatorze w obwodzie RLC",
            "$  R_c=1/{ωC}=1/{2πfC}$  "
        ),
        FlashCard("Prąd przemienny, obwody", true, "Obwód RLC jest indukcyjny gdy", "$  R_L>R_C$  "),
        FlashCard("Prąd przemienny, obwody", true, "Obwód RLC ma charakter pojemnościowy gdy ", "$  R_C>R_L$  "),
        FlashCard("Prąd przemienny, obwody", true, "Zawada oporu RLC", "$  Z_{RLC}=√{R^2+(R_L-R_C)^2}$  "),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Napięcie na obwodzie RLC",
            "$  U_{RLC}=√{U_R^2+(U_L-U_C)^2}$  "
        ),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Zależność napięcia od czasu dla obwodu RLC",
            "$  U(t)=U_0sin(ωt+φ_0)$  "
        ),
        FlashCard(
            "Prąd przemienny, obwody",
            true,
            "Zależność natężenia od czasu dla obwodu RLC",
            "$  I(t)=I_0sint(ωt+φ_0)$  "
        ),
        FlashCard("Prąd przemienny, obwody", true, "Okres drgania obwodu drgajacego LC", "$  T=2π√{LC}$  "),
        FlashCard("Prąd przemienny, obwody", true, "Ładunek od czasu obwodu LC", "$  Q(t)=Q_0cos(ωt)$  "),


        FlashCard("Optyka", false, "Równanie zwierciadła/soczewki", "$  1/x+1/y=1/f$ "),
        FlashCard("Optyka", true, "Powiększenie", "$  p=∣{y/x}∣=∣{h_y/h_x}∣$ "),
        FlashCard("Optyka", true, "Zdolność skupiająca", "$  Z=1/f$ "),
        FlashCard(
            "Optyka",
            false,
            "Rówanie soczewki z wykorzystaniem przenikalności ośrodków",
            "$  1/f=(n_{sc}/n_{os}-1)(1/r_1+1/r_2)$ "
        ),
        FlashCard(
            "Optyka",
            true,
            "Współczynnik załamania światła ośrodka drugiego względem pierwszego",
            "$  n_{1,2}={sinα}/{sinβ}=v_1/v_2=λ_1/λ_2$ "
        ),
        FlashCard("Optyka", false, "Kąt graniczny", "$  {sinα}=n_2/n_1$ "),
        FlashCard("Optyka", false, "Tangens kąta padania w polaryzacji przez odbicie", "$  {tgα}=n_2/n_1$ "),
        FlashCard("Optyka", true, "Natężenie światla niespolaryzowanego padającego na płytkę", "$  I=I_0/2$ "),
        FlashCard(
            "Optyka",
            true,
            "Natężenie światła spolaryzowanego padającego na kolejną płytkę",
            "$  I=I_0{cos^2θ}$ "
        ),
        FlashCard("Optyka", true, "Zależność siatki dyfrakcyjnej", "$  nλ=d{sin}α$ "),

        FlashCard("Fizyka współczesna", false, "Zjawisko fotoelektryczne zewnętrzne", "$  E_f=W_0+E_k_{max}$ "),
        FlashCard(
            "Fizyka współczesna",
            false,
            "Energia fotonu wyrażona długością fali, lub natężeniem",
            "$  E_f=hν={hc}/λ$ "
        ),
        FlashCard(
            "Fizyka współczesna",
            true,
            "Praca wyjścia wyrażona długością fali, natężeniem",
            "$  W_0=hν_{gra.}={hc}/λ_{gra.}$ "
        ),
        FlashCard("Fizyka współczesna", true, "Energia kinetyczna maksymalna", "$  E_k_{max}={mv^2}/2=eU_h$ "),
        FlashCard("Fizyka współczesna", true, "Rówannie orbity atomu modelu Bohra", "$  mV_nr_n=n{h}/{2π}$ "),
        FlashCard(
            "Fizyka współczesna",
            true,
            "Stosunek prędkości elektronów na orbitach modelu Bohra",
            "$  v_1:v_2:{v_3}...{v_n}=1:1/2:{1/3}....{1/n}$ "
        ),
        FlashCard(
            "Fizyka współczesna",
            true,
            "Stosunek energii elektronów na orbitach modelu Bohra",
            "$  E_1:{E_2}.....E_n=1:{1/2^2}....{1/n^2}$ "
        ),
        FlashCard("Fizyka współczesna", false, "Energia na orbicie dozwolonej", "$  E_n={-13,6}/n^2$ [eV]"),
        FlashCard("Fizyka współczesna", true, "Energia jonizacji", "$  E_j=E_∞-E_1=13,6[eV]$ "),
        FlashCard("Fizyka współczesna", true, "Częstotliwość widma", "$  ν=cR(1/n^2-1/k^2)$ "),
        FlashCard("Fizyka współczesna", true, "Deficity masy", "$  Δm=m_{sk}-m_{j}=Zm_p+(A-Z)m_n-m_j$ "),
        FlashCard("Fizyka współczesna", true, "Trwałośc wiązania", "$  {ΔE}/A $ "),
        FlashCard("Fizyka współczesna", true, "Promieniowanie alfa", "$  ^A_ZX->_{Z+1}^{A}Y+_{-1}^0β^{-}$ "),
        FlashCard("Fizyka współczesna", true, "Promieniowanie beta-minus", "$  ^A_ZX->_{Z+1}^{A}Y+_{-1}^0β^{-}$ "),
        FlashCard("Fizyka współczesna", true, "Promieniowanie beta-plus", "$  ^A_ZX->_{Z+1}^{A}Y+_{1}^0β^{+}$ "),
        FlashCard(
            "Fizyka współczesna",
            true,
            "Zależność masy początkowej od czasu",
            "$  N(t)=N_0-(1/2)^{t/T_{1/2}}$ "
        ),
        FlashCard("Fizyka współczesna", true, "Zasada nieznaczoności (pęd)", "$  ΔxΔp≥h/{4π}$ "),
        FlashCard("Fizyka współczesna", true, "Zasada nieoznaczoności (Energia)", "$  ΔEΔt≥h/{4π}$ ")
    )

}