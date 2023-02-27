

<html>
<head>

</head>
    <!-creazione variabile -->

    <#assign valA = 5>
    <#assign valB = 10>


<body>

    <!-Nelle condizioni possono essere utilizzati gli operatori logici '&&' '||' e '!'  -->

    <h1> Primo 'if - elseif'</h1>
    <#if valA==3>
        valA = 3
    <#elseif valA==4>
        valA = 4
    <#else>
        valA è diverso da 3 e da 4
    </#if>

    <-! per la condizione '>' è '>=' si usano rispettivamente la sintassi 'gt' e 'gte' -->
    <h1> secondo 'if - elseif'</h1>
    <#if valA==valB>
        valA è uguale a valB
    <#elseif valA gt valB>
        valA è maggiore di valB
    <#elseif valB gt valA>
        valB è maggiore di valA
    <#else>
        valA è diverso da valB
    </#if>

     <h1> terzo 'if - elseif'</h1>
      <#if x<10 >
             x è minore di 10
      </#if>

     <h1> terzo 'if - elseif'</h1>
         <#if clienteRegistrato==true >
                L'utente ${datiCliente} è registrato nel sito!
     </#if>

     <h1>ciclare una lista</h1>
     <h3>lista di auto</h3>
     <#list myList as auto>
        <p>- ${auto}</p>
     </#list>
    <br>
    <br>
    <br>

    <!- l'elemento 'include' include un'altra pagina ftl a questa pagina-->
    <#include "littlePart.ftl">
</body>
</html>