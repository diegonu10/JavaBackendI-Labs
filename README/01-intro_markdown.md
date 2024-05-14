00-intro_markdown.md

# Lenguaje Markdown

El lenguaje markdown es un lenguaje de marcado como el HTML

## Sintaxis basica

### Encabezados

se utilizan los simbolos de '#'. La cantidad de signos indica el nivel

# Encabezado 1
## Encabezado 2
### Encabezado 3 
#### Encabezado 4

### parrafos 

Se escriben como texto plano

### Enfasis 

Esto es cursiva

*Esto tambien es cursiva*

__Esto tambien es negrita__

Esto tambien es negrita

### Listas

Se pueden crear utilizando el '*' , '-' , o '+'
- Elemento 1
- Elemento 2 

#### Listas ordenadas

1. Primer elemento
2. Segundo 

### Enlaces

[Google](https://www.google.com)

### Imagenes

! [Texto alternativo](logo-mark.png)

### Codigo en linea

`codigo en linea`

### Bloque de codigo

```java
import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa la hora");
        int hora = scanner.nextInt();


            if (hora >= 5 && hora <= 12) {
                System.out.println("Buenos dias");}
            else if (hora >= 13 && hora <= 19){
            System.out.println("Buenas tardes");}
            else if (hora >=20 && hora <=24){
                System.out.println("Buenas noches");}
            }
        }

```