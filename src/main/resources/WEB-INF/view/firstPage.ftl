

<html>
<head>

</head>
    <!-creazione variabile -->

    <#assign titolo = "Lista prodotti:">
    <#assign messaggio = "Il numero di prodotti nella lista sono ${numProdotti}">

    <#assign secondoMsg = "indirizzo sede azienda">
    <#assign indirizzo = "Via dei romani n.44">

<body>
    <h1>${titolo}</h1>
    <h3>${messaggio}</h3>
    <p>${televisione.marca} ${televisione.modello}</p>
    <p>${televisione.pollici}</p>
    <br>
    <br>
    <br>
     <p>Messaggi letti : ${messaggiLetti}</p>
     <p>Messaggi da leggere : ${messaggiDaLeggere}</p>
     <p>Messaggi totali : ${messaggiDaLeggere + messaggiLetti}</p>
     <br>
     <br>
     <br>
    <p> ${secondoMsg +" : "+indirizzo} </p>

</body>
</html>