#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <iostream>
#include <conio.h>
#include <cmath>
using namespace std;

void penalidadFila(int datos[3][5], int pfila[3])
{
    int menor = 0, segundo = 0, aux = 0, numero, penalidad;
    for (int f = 0; f < 3; f++)
    {
        for (int c = 0; c < 5; c++)
        {
            numero = datos[f][c];
            aux = datos[f][c + 1];
            if (c == 0)
            {
                menor = numero;
                segundo = aux;
                cout << "\nasignacion de segundo " << segundo;
            }
            else
            {
                if (numero < menor)
                {
                    segundo = menor;
                    menor = numero;
                }
                else if (numero < segundo)
                {
                    segundo = numero;
                }
            }
            cout << "\nvuelta " << c << " " << segundo;
        }
        penalidad = menor - segundo;
        cout << "\n"
             << "menor " << menor << " segundo " << segundo << "\n";
        pfila[f] = abs(penalidad);
    }
}

int main()
{
    int pfila[3], pcolumna[5];
    int datos[3][5];
    int f, c, of[3], d[5];

    //Ingreso de costos
    for (f = 0; f < 3; f++)
    {
        for (c = 0; c < 5; c++)
        {
            cout << "Ingrese dato de la fila " << f + 1 << " columna " << c + 1 << " : ";
            cin >> datos[f][c];
        }
    }
    /*
    //Ingreso de ofertas
    for (int i = 0; i < 3; i++)
    {
        cout << "Ingrese la oferta " << i + 1 << " : ";
        cin >> of[i];
    }

    //Ingreso de Demandas
    for (int i = 0; i < 5; i++)
    {
        cout << "Ingrese la Demanda " << i + 1 << " : ";
        cin >> d[i];
    }

    //Impresion de Matriz completa
    cout << "\n***Datos ingresados***\n";
    for (f = 0; f < 3; f++)
    {
        for (c = 0; c < 6; c++)
        {
            //Validacion para imprimir la ultima columna(Oferta)
            if (c > 4)
            {
                cout << of[f];
            }
            else
            {
                cout << datos[f][c] << "\t";
            }
        }
        cout << "\n";
    }
    //Imprime la ultima fila(Demanda)
    for (int i = 0; i < 5; i++)
    {
        cout << d[i] << "\t";
    }
*/

    cout << "\n***Penalidades***\n";
    penalidadFila(datos, pfila);
    for (int i = 0; i < 3; i++)
    {
        cout << "Penalidad " << i + 1 << " : " << pfila[i] << "\n";
    }
    getch();
    return 0;
}