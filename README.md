# Design Pattern: Observer
Caracteristicas:

- Tipo: Behavioral
- Este patron es usado cuando existe una relacion uno-a-muchos entre objtetos, de tal manera que si el objeto, llamado subject, cambia su estado automaticamente todos sus objetos dependientes van a ser notificados, usualmente haciendo un call a uno de sus metodos. "No nos llames, nosotros te llamamos" 
- Usa 3 actores: Sujeto, Observer y Cliente.

En resumen:
El subject mantiene una lista de sus objetos dependientes (observers), cuando el estado del subject cambia se invoca a un metodo notify(), el cual dentro de su body invoca a un metodo que cada instancia de observer comparte.
