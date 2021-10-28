#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <iostream>
#include <conio.h>
#include <cmath>
#include <stdbool.h>

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
        }
        penalidad = menor - segundo;
        pfila[f] = abs(penalidad);
    }
}

void penalidadColumna(int datos[3][5], int pcolumna[5])
{
    int menor = 0, segundo = 0, aux = 0, numero, penalidad, f;
    for (int ronda = 0; ronda < 5; ronda++)
    {
        for (f = 0; f < 3; f++)
        {
            numero = datos[f][ronda];
            aux = datos[f + 1][ronda];
            if (f == 0)
            {
                menor = numero;
                segundo = aux;
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
        }
        penalidad = menor - segundo;
        pcolumna[ronda] = abs(penalidad);
    }
}

int penalidadMayor(int pfila[3], int pcolumna[5])
{
    int contador;
    int numero;
    int mayorfila, mayorcolumna, mayorp;
    while (contador <= 3)
    {
        numero = pfila[contador];
        contador += 1;
        if (numero > mayorfila)
        {
            mayorfila = numero;
        }
    }

    contador = 0;
    while (contador <= 5)
    {
        numero = pcolumna[contador];
        contador += 1;
        if (numero > mayorcolumna)
        {
            mayorcolumna = numero;
        }
    }

    if (mayorfila > mayorcolumna)
    {
        mayorp = mayorfila;
    }
    else if (mayorcolumna > mayorfila)
    {
        mayorp = mayorcolumna;
    }
    return mayorp;
}

void celdaMenorCosto(int pMayor, int pfila[3], int pcolumna[5], int datos[3][5], int indiceMenor[2])
{
    bool enFila;
    bool enColumna;
    int numero, menor;
    int fila, columna;
    int f, c;
    int cont = 0;
    //Recorrido pFila
    for (int i = 0; i < 3; i++)
    {
        if (pfila[i] == pMayor)
        {
            fila = i;
            enFila = true;
            cout << "encontrado en fila " << fila << "\n";
        }
    }

    //Recorrido pColumna
    for (int i = 0; i < 5; i++)
    {
        if (pcolumna[i] == pMayor)
        {
            columna = i;
            enColumna = true;
            //   cout << "encontrado en columna " << columna << "\n";
        }
    }

    // cout<<"\n"<<enFila;
    // cout<<"\n"<<enColumna;
    if (enFila)
    {
        cout << "\nBuscar en fila " << fila << "\n";
    }
    else if (enColumna)
    {
        do
        {
            numero = datos[cont][columna];
            if (cont == 0)
            {
                menor = numero;
                f = cont;
                c = columna;
            }
            else
            {
                if (menor > numero)
                {
                    menor = numero;
                    f = cont;
                    c = columna;
                }
            }
            cont++;
        } while (cont < 3);
        // cout << f << " " << c << "\n";
        indiceMenor[0] = f;
        indiceMenor[1] = c;
    }
}

void distribuir(int indiceMenor[2], int of[3], int d[5], int resultados[3][5])
{
    //si la oferta en la indiceFila es menor a la demanda en la indiceColumna
    int indiceFila, indiceColumna;
    int oferta, demanda;
    int f, c;
    indiceFila = indiceMenor[0];
    indiceColumna = indiceMenor[1];
    oferta = of[indiceFila];
    demanda = d[indiceColumna];

    if (oferta >= demanda)
    {
        cout << "\nSI SE CUBRE LA DEMANDA\n";
        cout << oferta << " " << demanda;
        resultados[indiceFila][indiceColumna] = demanda;
        of[indiceFila] = of[indiceFila] - demanda;
        d[indiceColumna] = d[indiceColumna] - demanda;
    }

    //Impresion de Matriz Resultados
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
                cout << resultados[f][c] << "\t";
            }
        }
        cout << "\n";
    }
    //Imprime la ultima fila(Demanda)
    for (int i = 0; i < 5; i++)
    {
        cout << d[i] << "\t";
    }
    cout << "\n";
}

//*****************INICIO DEL MAIN**********************
//******************************************************
int main()
{
    int pfila[3], pcolumna[5], indiceMenor[2];
    int pMayor = 0, fila = 0, columna = 0;
    int datos[3][5], resultados[3][5];
    int f = 0, c = 0, of[3], d[5];

    //Inicializando matriz resultados
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            resultados[i][j] = 0;
        }
    }

    //Ingreso de costos
    for (f = 0; f < 3; f++)
    {
        for (c = 0; c < 5; c++)
        {
            cout << "Ingrese dato de la fila " << f + 1 << " columna " << c + 1 << " : ";
            cin >> datos[f][c];
        }
    }

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
    cout << "\n";

    cout << "\n***Penalidades Fila***\n";
    penalidadFila(datos, pfila);
    for (int i = 0; i < 3; i++)
    {
        cout << "Penalidad " << i + 1 << " : " << pfila[i] << "\n";
    }

    cout << "\n***Penalidades Columna***\n";
    penalidadColumna(datos, pcolumna);
    for (int i = 0; i < 5; i++)
    {
        cout << "Penalidad " << i + 1 << " : " << pcolumna[i] << "\t";
    }
    cout << "\n***PENALIDAD MAYOR***\n";
    //cout << penalidadMayor(pfila, pcolumna);
    pMayor = penalidadMayor(pfila, pcolumna);
    cout << "\n"
         << pMayor;

    cout << "\n***CELDA MENOR COSTO***\n";
    celdaMenorCosto(pMayor, pfila, pcolumna, datos, indiceMenor);
    cout << "fila " << indiceMenor[0] + 1 << " columna " << indiceMenor[1] + 1;

    cout << "\n***INGRESANDO DISTRIBUCION***\n";
    distribuir(indiceMenor, of, d, resultados);

    getch();
    return 0;
}