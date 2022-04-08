package A3;

import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        /* Diagrama que tenga al menos 5 productos a comprar. Preguntar al usuario cuántos desea comprar e ir calculando el total de acuerdo a la elección del usuario. Al final desplegar: subtotal, descuento y total (subtotal - descuento). 
        Si el subtotal es menor que $500, no hay descuento.
        Si el subtotal se encuentra entre $500 y menor que $1000, el 5%.
        Si el subtotal se encuentra entre $1000 y menor que $7000, el 11%.
        Si el subtotal se encuentra entre $7000 y menor que $15000, el 18%.
        Si el subtotal es mayor o igual a $15000, el 25%. */
        int papitas = 150, soda = 160, chocolate = 200, galletas = 120, vuala = 150, cp = 0, p = 0, st = 0, t = 0;
        double d = 0;
        System.err.println("¡Bienvenido a la Tienda de Sistemas, contamos con 5 productos a la venta, (1) papitas a $150, (2) soda a $160, (3) chocolate a $200, (4) galletas a $120 y (5) vuala a $150.");
        System.err.println("Digite el número del producto que desee:");
        Scanner pro = new Scanner(System.in);
        p = pro.nextInt();
        System.err.println("¿Cuántos productos desea comprar?");
        Scanner cpro = new Scanner(System.in);
        cp = cpro.nextInt();
        switch(p){
            case 1:
                st = cp*papitas;
                break;
            case 2:
                st = cp*soda;
                break;
            case 3:
                st = cp*chocolate;
                break;
            case 4:
                st = cp*galletas;
                break;
            case 5:
                st = cp*vuala;
                break;
            default:
                System.err.println("No existe esa opción");
        }
        if(st<500){
           d = st; 
        }
        else if(st>=500 && st<1000){
                d = st * 0.05;
        }
        else if(st>=1000 && st<7000){
                d = st * 0.11;
        }
        else if(st>= 7000 && st<15000){
                d = st * 0.18;
        }
        else if(st>=15000){
                d = st * 0.25;
        }
        System.err.println("El subtotal es: $" + st);
        System.err.println("El descuento es: $" + d);
        System.err.println("El total es: $" + (st-d));
        System.err.println("¡Gracias por su compra en la Tienda de Sistemas, vuelva pronto!");
    }
}
