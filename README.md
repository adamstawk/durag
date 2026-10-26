# Durag – mod do Minecraft (Fabric 1.21.1)

Dodaje przedmiot **Durag** – czarną satynową chustę na głowę.

- Zakładasz go prawym kliknięciem albo wkładasz w slot hełmu.
- Receptura: 3x czarna wełna (góra) + 2x nić (dół, po bokach).
- Jest w kreatywnej zakładce "Walka".
- Czysto kosmetyczny (0 pancerza).

## Budowanie
Potrzebujesz JDK 21.
1. Skopiuj folder `gradle/` oraz pliki `gradlew`, `gradlew.bat` z https://github.com/FabricMC/fabric-example-mod
   (albo uruchom `gradle wrapper`, jeśli masz zainstalowanego Gradle).
2. `./gradlew build`
3. Gotowy mod: `build/libs/durag-1.0.0.jar` -> wrzuć do `.minecraft/mods` razem z Fabric API.

Do testów: `./gradlew runClient`

## Najprościej: zbuduj .jar na GitHubie (bez instalowania czegokolwiek)
1. Utwórz nowe repozytorium na github.com i wrzuć do niego zawartość tego folderu (razem z `.github`).
2. Wejdź w zakładkę **Actions** -> workflow **build** -> poczekaj ~2-3 min.
3. W podsumowaniu przebiegu pobierz artefakt **durag-jar** (w środku `durag-1.0.0.jar`).
