import java.util.*;
import java.awt.Desktop;
import java.net.URI;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int contatore1 = 0;
        int contatore2 = 0;
        int contatore3 = 0;
        boolean esci = false;
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println(" ");
        System.out.println("Benvenuto nel \"Sapientino interattivo di sistemi\", digita il numero della domanda per cui vuoi avere una risposta");
        while (a != 4 || !esci)
        {
            System.out.println(" ");
            System.out.println("1. Cos’é la RAM.");
            System.out.println("2. Che cos'è il BIOS e a cosa serve.");
            System.out.println("3. Quante memorie esistono.");
            System.out.println("4. Concludi il programma.");
            System.out.println(" ");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println(" ");
            try
            {
                a = scan.nextInt();
            } catch (Exception e) {
                System.out.println(" ");
                System.out.println("L'input non corrisponde ad alcuna domanda, riprova inserendo un numero!");
                System.out.println(" ");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                scan.next();
                continue;
            }

            switch (a) {
                case 1:
                    if (contatore1 == 0)
                    {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                        System.out.println("La RAM (o Random Access Memory) é una memoria volatile di sola lettura e ad accesso casuale, ciò significa che allo spegnimento del pc il contenuto di quest'ultima svanisce");
                        System.out.println("Abbiamo due tipi di RAM, la SRAM (Static Random Access Memory) e la DRAM (Dynamic Random Access Memory). Nella SRAM, per contenere i dati, le celle sono costantemente ");
                        System.out.println("alimentate, ciò comporta consumi e costi elettrici maggiorati ma presenta prestazioni superiori dato che abbiamo tempi di risposta (latency time) minori");
                        System.out.println("Nella DRAM troviamo il memory refresh, un circuito che ricarica periodicamente le celle prima che perdano il loro contenuto, ciò consente di realizzare");
                        System.out.println("memorie con capacità di archiviazione maggiori in schede dalle dimensioni estremamente ridotte.");
                        System.out.println(" ");
                        System.out.println("Ora che conosci la RAM, digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiara, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    }
                    else if (contatore1 == 1)
                    {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                        System.out.println("(+) É comprensibile che tu non abbia capito, ora te la ripeterò in un modo semplificato");
                        System.out.println(" ");
                        System.out.println("La RAM (Random Access Memory) é una memoria volatile capace solo di leggere e immagazzinare dati, l'accesso a questi avviene in modo casuale, quando spegniamo il pc");
                        System.out.println("il contenuto della RAM viene perso. Esistono due tipi di RAM, la SRAM (Static Random Access Memory) e la DRAM (Dynamic Random Access Memory). Nella SRAM, per far");
                        System.out.println("si che i dati non si perdano, le celle vengono sempre alimentate, ciò fa consumare molta più corrente ma questa viene sfruttata per rendere la SRAM più veloce");
                        System.out.println("della DRAM. Nella DRAM invece c'è il memory refresh, un circuito che ricarica ogni tanto le celle prima che perdano il loro contenuto, ciò aiuta a");
                        System.out.println("creare memorie più grandi in schede dalle dimensioni molto ridotte.");
                        System.out.println(" ");
                        System.out.println("Se ancora non hai capito, ripeti la domanda per aprire la pagina Wikipedia della RAM, altrimenti digita altri numeri per imparare altro.");
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    }
                    else if (contatore1 >= 2)
                    {
                        try
                        {
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Apertura della pagina web in corso e ritorno al menù iniziale...");
                            TimeUnit.SECONDS.sleep(2);
                            Desktop.getDesktop().browse(new URI("https://it.wikipedia.org/wiki/RAM"));
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Bentornato! Seleziona una domanda nel menù sottostante.");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    contatore1++;
                    break;
                case 2:
                    if (contatore2 == 0)
                    {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                        System.out.println("Il BIOS (Basic Input/Output System) è l'interfaccia di Input/Output del sistema, esso, all'avvio del computer si occupa di avviare delle istanze che verificano lo stato dell'hardware");
                        System.out.println("e delle periferiche e caricano i programmi dal disco rigido alla memoria centrale. Il BIOS risiede nella ROM (Vedi domanda 3) montata sulla motherboard e può esser caricato");
                        System.out.println("istantaneamente all’accensione della macchina. A differenza del sistema operativo, il BIOS ha funzionalità limitate e offre molti parametri di configurazione. Un parametro");
                        System.out.println("non corretto influirà sulle prestazioni e sulla stabilità del sistema, infatti la modifica di questi parametri spetta solamente ad utenti esperti");
                        System.out.println(" ");
                        System.out.println("Ora che conosci il BIOS, digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiaro, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    }
                    else if (contatore2 == 1)
                    {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                        System.out.println("(+) Non hai capito il BIOS? Lascia che te lo spieghi in un modo semplificato");
                        System.out.println(" ");
                        System.out.println("il BIOS è l’intermediario tra l’hardware del computer e il sistema operativo e senza il BIOS, il sistema operativo non ha nessuna possibilità di comunicare e prendere potere");
                        System.out.println("dell'hardware della macchina che si vuole avviare. Infatti esso è situato in una memoria sulla scheda madre e contiene una serie di istruzioni indispensabili per l’avvio.");
                        System.out.println(" ");
                        System.out.println("Se ancora il BIOS non ti è chiaro, ripeti la domanda per aprirne la pagina Wikipedia, altrimenti passa ad altre domande.");
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");                    }
                    else if (contatore2 >= 2)
                    {
                        try
                        {
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Apertura della pagina web in corso e ritorno al menù iniziale...");
                            TimeUnit.SECONDS.sleep(2);
                            Desktop.getDesktop().browse(new URI("https://it.wikipedia.org/wiki/BIOS"));
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Bentornato! Seleziona una domanda nel menù sottostante.");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    contatore2++;
                    break;
                case 3:
                    if (contatore3 == 0)
                    {
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                        System.out.println("Oltre alla RAM, esistono molti altri tipi di memorie, le quali di cui non abbiamo giò parlato vi sono elencate qui sotto");
                        System.out.println(" ");
                        System.out.println("• CACHE");
                        System.out.println("La Cache è una memoria temporanea, volatile di scrittura e lettura, situata nel processore e viene utilizzata per registrare dati da recuperare velocemente durante l'elaborazione.");
                        System.out.println("Lo scambio di dati con il processore è molto più rapidp rispetto alla memoria RAM e alle memorie di massa e, quindi si riduce notevolmente il tempo di esecuzione dei programmi.");
                        System.out.println(" ");
                        System.out.println("• ROM");
                        System.out.println("La ROM (o Read Only Memory) è una memoria di sola lettura. Essa è molto veloce ma è un tipo di memoria permanente, dato che può solamente leggere e non scrivere");
                        System.out.println(" ");
                        System.out.println("• Memorie di massa");
                        System.out.println("É un tipo di memoria che immagazzina grandi quantità di dati in modo permanente (non volatile), quindi allo spegnimento della macchina, i dati al loro interno restano.");
                        System.out.println(" ");
                        System.out.println("• Cloud");
                        System.out.println("Il cloud è lo spazio di archiviazione che viene messo a disposizione degli utenti su internet. Questa memoria non si trova sul dispositivo dell'utente, ma sui server. ");
                        System.out.println(" ");
                        System.out.println("Per aprire la pagina Wikipedia sulle memorie, ripeti la domanda, altrimenti passa alla domanda successiva");
                        System.out.println(" ");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    }
                    else if (contatore3 >= 1)
                    {
                        try
                        {
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Apertura della pagina web in corso e ritorno al menù iniziale...");
                            TimeUnit.SECONDS.sleep(2);
                            Desktop.getDesktop().browse(new URI("https://it.wikipedia.org/wiki/Memoria_(informatica)"));
                            System.out.println(" ");
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Bentornato! Seleziona una domanda nel menù sottostante.");

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    contatore3++;
                    break;
                case 4:
                        System.out.println(" ");
                        System.out.println("Sei sicuro di voler usscire? Rispondi \"si\" per procedere.");
                        System.out.println(" ");
                        String risposta = scan.nextLine();
                            risposta = scan.nextLine();
                            System.out.println(" ");
                            if (risposta.equalsIgnoreCase("si")) {
                            esci = true;
                            System.out.println("Chiusura in corso...");
                        }
                        else if (risposta.equalsIgnoreCase("no"))
                        {
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Bentornato! Seleziona una domanda nel menù sottostante.");
                        }
                        else
                        {
                            System.out.println("Risposta non valida. Ritorno al menù iniziale...");
                            System.out.println(" ");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                            System.out.println(" ");
                            System.out.println("Bentornato! Seleziona una domanda nel menù sottostante.");
                        }
                    break;
                default:
                    System.out.println(" ");
                        System.out.println("Hai inserito un numero che non corrisponde ad alcuna domanda, riprova!");
                    break;
            }
        }
    }
}