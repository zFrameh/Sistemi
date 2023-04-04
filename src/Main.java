import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int contatore1 = 0;
        int contatore2 = 0;
        int contatore3 = 0;
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        System.out.println(" ");
        System.out.println("Benvenuto nel \"Sapientino interattivo di sistemi\", digita il numero della domanda per cui vuoi avere una risposta");
        while (a != 4)
        {
            System.out.println(" ");
            System.out.println("1. Cos’é la RAM.");
            System.out.println("2. Come funziona il BIOS.");
            System.out.println("3. Quante memorie esistono.");
            System.out.println("4. Concludi il programma.");
            System.out.println(" ");
            System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
            System.out.println(" ");
            try {
                a = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Hai inserito una lettera che non corrisponde ad alcuna domanda, riprova inserendo un numero!");
                scan.next();
                continue;
            }

            switch (a) {
                case 1:
                    if (contatore1 == 0)
                    {
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                        System.out.println(" ");
                        System.out.println("La RAM (o Random Access Memory) é una memoria volatile di sola lettura e ad accesso casuale, ciò significa che allo spegnimento del pc il contenuto di quest'ultima svanisce");
                        System.out.println("Abbiamo due tipi di RAM, la SRAM (Static Random Access Memory) e la DRAM (Dynamic Random Access Memory). Nella SRAM, per contenere i dati, le celle sono costantemente ");
                        System.out.println("alimentate, ciò comporta consumi e costi elettrici maggiorati ma presenta prestazioni superiori dato che abbiamo tempi di risposta (latency time) minori");
                        System.out.println("Nella DRAM troviamo il memory refresh, un circuito che ricarica periodicamente le celle prima che perdano il loro contenuto, ciò consente di realizzare");
                        System.out.println("memorie con capacità di archiviazione maggiori in schede dalle dimensioni estremamente ridotte.");
                        System.out.println(" ");
                        System.out.println("Ora che conosci la RAM! Digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiara, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");

                    }
                    else
                    {
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                        System.out.println(" ");
                        System.out.println("(+) Dovresti già conoscere la RAM, ma se non ti è chiara posso ripeterla per te in un modo semplificato.");
                        System.out.println(" ");
                        System.out.println("La RAM (o Random Access Memory) é una memoria volatile di sola lettura e ad accesso casuale, quindi quando spegniamo il pc, il suo contenuto viene perso");
                        System.out.println("Esistono due tipi di RAM, la SRAM (Static Random Access Memory) e la DRAM (Dynamic Random Access Memory). Nella SRAM, per far si che i dati non si perdano");
                        System.out.println("le celle vengono sempre alimentate, ciò fa consumare molta più corrente ma questa viene sfruttata per rendere la SRAM più veloce della DRAM");
                        System.out.println("Nella DRAM invece c'è il memory refresh, un circuito che ricarica ogni tanto le celle prima che perdano il loro contenuto, ciò aiuta a");
                        System.out.println("creare memorie più grandi in schede dalle dimensioni molto ridotte.");
                        System.out.println(" ");
                        System.out.println("Spero che tu ora abbia capito la RAM! Digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiara, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");

                    }
                    contatore1++;
                    break;
                case 2:
                    if (contatore2 == 0)
                    {
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                        System.out.println(" ");
                        System.out.println("Il BIOS (Basic Input/Output System) rende disponibili le funzioni base di un computer e dopo ogni suo avvio si assicura che le componenti principali come memoria, CPU e altre componenti dell’hardware siano funzionanti.");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Ora che conosci il BIOS, digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiaro, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");

                    }
                    else
                    {
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                        System.out.println(" ");
                        System.out.println("(+) Dovresti già conoscere il BIOS, ma se non ti è chiaro posso ripeterlo per te in un modo semplificato");
                        System.out.println("Il BIOS (Basic Input/Output System) rende disponibili le funzioni base di un computer e dopo ogni suo avvio si assicura che le componenti principali come memoria, CPU e altre componenti dell’hardware siano funzionanti.");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Ora che conosci il BIOS, digita i numeri sottostanti per imparare qualcosa di nuovo, o se non ti è chiaro, richiedimi questa domanda.");
                        System.out.println(" ");
                        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    }
                    contatore2++;
                    break;
                case 3:
                    if (contatore3 == 0)
                    {
                        System.out.println("tante");
                        System.out.println(" ");
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("Dovresti già conoscere i tipi di memorie, ma se non ti sono chiare posso ripeterle per te");
                    }
                    contatore3++;
                    break;
                case 4:
                        System.out.println("Grazie per aver utilizzato il programma, vuoi aprire la pagina di GitHub? Si/No");
                    break;

                default:
                        System.out.println("Hai inserito un numero che non corrisponde ad alcuna domanda, riprova!");
                    break;
            }
        }
    }
}