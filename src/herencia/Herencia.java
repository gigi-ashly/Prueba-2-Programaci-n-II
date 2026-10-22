/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author gigiw
 */

public class Herencia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n===== FINANZAS DEL VALLE =====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferir");
            System.out.println("5. Aplicar intereses");
            System.out.println("6. Reporte de cuentas");
            System.out.println("7. Ver historial");
            System.out.println("8. Girar cheque");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.println("\n--- CREAR CUENTA ---");

                        System.out.print("Numero de cuenta: ");
                        int numero = Integer.parseInt(leer.nextLine());

                        System.out.print("Nombre del cliente: ");
                        String cliente = leer.nextLine();

                        System.out.print("Moneda: ");
                        String moneda = leer.nextLine();

                        System.out.println("1. Ahorro");
                        System.out.println("2. Cheques");
                        System.out.println("3. Plazo fijo");
                        System.out.print("Tipo de cuenta: ");
                        int tipo = Integer.parseInt(leer.nextLine());

                        CuentaBancaria nueva = null;

                        if (tipo == 1) {
                            nueva = new CuentaAhorro(numero, cliente, moneda);

                        } else if (tipo == 2) {
                            System.out.print("Limite de sobregiro: ");
                            double limite = Double.parseDouble(leer.nextLine());

                            nueva = new CuentaCheques(numero, cliente, moneda, limite);

                        } else if (tipo == 3) {

                            System.out.print("Year de vencimiento: ");
                            int anio = Integer.parseInt(leer.nextLine());

                            System.out.print("Mes de vencimiento: ");
                            int mes = Integer.parseInt(leer.nextLine());

                            System.out.print("Dia de vencimiento: ");
                            int dia = Integer.parseInt(leer.nextLine());

                            
                        } else {
                            System.out.println("Tipo de cuenta invalido");
                            break;
                        }                
                        System.out.println("Cuenta creada correctamente");
                        break;

                    case 2:
                        System.out.println("\n--- DEPOSITAR ---");

                        System.out.print("Numero de cuenta: ");
                        int numDeposito = Integer.parseInt(leer.nextLine());


                        System.out.print("Monto a depositar: ");
                        double deposito = Double.parseDouble(leer.nextLine());


                        System.out.println("Deposito realizado");
                        break;

                    case 3:
                        System.out.println("\n--- RETIRAR ---");

                        System.out.print("Numero de cuenta: ");
                        int numRetiro = Integer.parseInt(leer.nextLine());


                        System.out.print("Monto a retirar: ");
                        double retiro = Double.parseDouble(leer.nextLine());

                        break;

                    case 4:
                        System.out.println("\n--- TRANSFERIR ---");

                        System.out.print("Cuenta origen: ");
                        int origen = Integer.parseInt(leer.nextLine());

                        System.out.print("Cuenta destino: ");
                        int destino = Integer.parseInt(leer.nextLine());

                        System.out.print("Monto: ");
                        double monto = Double.parseDouble(leer.nextLine());

                      

                        System.out.println("Transferencia realizada");
                        break;

                    case 5:
                        System.out.println("\n--- APLICAR INTERESES ---");


                        System.out.println("Proceso de intereses terminado");
                        break;

                    case 6:
                        System.out.println("\n--- REPORTE DE CUENTAS ---");
                        break;

                    case 7:
                        System.out.println("\n--- HISTORIAL ---");

                        System.out.print("Numero de cuenta: ");
                        int numHistorial = Integer.parseInt(leer.nextLine());
                        break;

                    case 8:
                        System.out.println("\n--- GIRAR CHEQUE ---");

                        System.out.print("Numero de cuenta: ");
                        int numCheque = Integer.parseInt(leer.nextLine());
                        break;
                    case 9:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 9);
    }
}