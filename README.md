# anthechalleneges

In questo repository vi è la presenza dello svolgimento dei seguenti esercizi:
- STRINGS
- SALES 

è possibile trovare le consegne al seguente repository: https://github.com/gruppoanthea-it/challenges


# STARTUP ESERCIZIO STRINGS

STRINGS è un semplice progetto Java per cui è possibile avviarlo con qualsiasi IDE in che supporta JAVA come IntelliJ,Eclispe,SpringToolSuite.
Per rispettare la consegna e validarla sono stati implementati alcuni JUNIT Test che verificano il corretto funzionamento di ogni step elencato nella consegna dell'esercizio.
In generale è possibile eseguire la classe "MainApplication" per inizializzare il progetto e verificarne il funzionamento.

# STARTUP ESERCIZIO SALES
.
L'esercizio SALES si è svolto in due parti:

 -Implementazione della logina in Java con supporto di SpringBoot per ottenere una struttura REST, dunque ove vi è stato possibile fornire delle WEB-API che potessero comunicare con il Front-end statico.
 Per avviare questa parte di progetto, consiglio l'utilizzo di SpringToolSuite , un ide sviluppato ad hoc per chi sviluppa con il framework utilizzato per la costruzione della logica di SALES. 

-Implementazione del front-end statico utilizzando Angular versione 8. Per avviare il front-end in locale, dopo aver scaricato il progetto dalla repository e seguito tutte le istruzioni per ottenere l'ambiente di sviluppo, presente nel sito ufficiale di Angular https://angular.io/, bisogna muoversi nella cartella dove vi è il progetto e lanciare il comando "ng serve --open" e sarà possibile visualizzare il contenuto sul browser preferito a "localhost:4200".


# DEPLOY , UTILIZZO SERVIZI AWS PER L'ESERCIZIO SALES

L'Esercizio sales è stato reso disponibile online mediante l'utilizzo dei seguenti servizi AWS:

-S3: dove vi è hostato il frontend-statico.
-EC2: un istanza EC2 Ubuntu , dove vi è installato Apache Tomcat versione 8.5 che è un WebContainer che si occupa di mettere a disposizioni i servizi REST che sono stati implementati tramite Java(SpringBoot) 
-RDS : un istanza RDS è stata utilizzata per avere a disposizione il database che utilizza come DBMS MySql versione 5.7

Lo schema generale di comunicazioni tra questi servizi è:

S3-->HttpCall-->EC2(Tomcat)-->RDS(MySql)




