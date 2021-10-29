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
    int menor = -1, segundo = 0, aux = 0, numero, penalidad;
    for (int f = 0; f < 3; f++)
    {
        menor, segundo;
        for (int c = 0; c < 5; c++)
        {
            numero = datos[f][c];
            if (numero != 0)
            {
                aux = datos[f][c + 1];
                if (c == 0)
                {
                    menor = numero;
                    segundo = aux;
                }
                else
                {
                    if (menor == -1 && numero != 0)
                    {
                        menor = numero;
                        segundo = aux;
                    }

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
        menor = 0, segundo = 0;
        for (f = 0; f < 3; f++)
        {
            numero = datos[f][ronda];
            if (numero != 0)
            {
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
        }
        if (menor == 0)
        {
            pcolumna[ronda] = 0;
        }
        else
        {
            penalidad = menor - segundo;
            pcolumna[ronda] = abs(penalidad);
        }
    }
}

int penalidadMayor(int pfila[3], int pcolumna[5], int pMayor)
{
    int contador;
    int numero = 0;
    int mayorfila, mayorcolumna;
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
        pMayor = mayorfila;
    }
    else if (mayorcolumna > mayorfila)
    {
        pMayor = mayorcolumna;
    }
    else if (mayorfila == mayorcolumna)
    {
        pMayor = mayorfila;
    }
    // cout<<"\nPMAYOR ASIGNADO: "<<pMayor<<"\n";
    return pMayor;
}

void celdaMenorCosto(int pMayor, int pfila[3], int pcolumna[5], int datos[3][5], int indiceMenor[2])
{
    bool enFila;
    bool enColumna;
    int numero, menor;
    int fila, columna;
    int f = 0, c = 0;
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
        do
        {
            numero = datos[fila][cont];
            if (cont == 0)
            {
                menor = numero;
                f = fila;
                c = cont;
            }
            else
            {
                if (menor > numero)
                {
                    menor = numero;
                    f = fila;
                    c = cont;
                }
            }
            cont++;
        } while (cont < 5);
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

void distribuir(int indiceMenor[2], int of[3], int d[5], int resultados[3][5], int datos[3][5])
{
    //si la oferta en la indiceFila es menor a la demanda en la indiceColumna
    int indiceFila, indiceColumna, fila = 0, columna = 0;
    int oferta, demanda;
    int f, c;
    indiceFila = indiceMenor[0];
    indiceColumna = indiceMenor[1];
    oferta = of[indiceFila];
    demanda = d[indiceColumna];

    if (oferta >= demanda)
    {
        cout << "\nSI SE CUBRE LA DEMANDA\n";
        cout << "Oferta= " << oferta << " Demanda= " << demanda << "\n";
        resultados[indiceFila][indiceColumna] = demanda;
        of[indiceFila] = of[indiceFila] - demanda;
        d[indiceColumna] = d[indiceColumna] - demanda;

        //bloquear columna/fila
    }
    else
    {
        cout << "\nNO SE CUBRE\n";
        cout << "Oferta= " << oferta << " Demanda= " << demanda << "\n";
        resultados[indiceFila][indiceColumna] = oferta;
        of[indiceFila] = 0;
        d[indiceColumna] = d[indiceColumna] - oferta;
    }

    if (of[indiceFila] == 0)
    {
        while (columna < 5)
        {
            datos[indiceFila][columna] = 0;
            columna++;
        }
    }

    else if (d[indiceColumna] == 0)
    {
        while (fila < 3)
        {
            datos[fila][indiceColumna] = 0;
            fila++;
        }
    }

    //Impresion de Matriz completa
    cout << "\n***Actualizacion de Datos ingresados***\n";
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

    //Impresion de Matriz Resultados
    cout << "\n***Actualizacion de Resultados***\n";
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

bool demandaSatisfecha(int d[5])
{
    bool r = false;
    int numero;
    for (int i = 0; i < 3; i++)
    {
        numero = d[i];
    }
    if (numero != 0)
    {
        r = true;
    }

    return r;
}

//*****************INICIO DEL MAIN**********************
//******************************************************
int main()
{
    int pfila[3], pcolumna[5], indiceMenor[2];
    int pMayor, fila = 0, columna = 0;
    int resultados[3][5];
    int f = 0, c = 0;
    int datos[3][5] = {{1200, 2500, 2300, 2200, 4000}, {2200, 1500, 2000, 1800, 3500}, {4000, 3500, 3200, 3400, 1000}};
    int of[3] = {300, 230, 170};
    int d[5] = {230, 100, 170, 150, 50};
    int cont = 0;
    //Inicializando matriz resultados
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            resultados[i][j] = 0;
        }
    }
    /*
    
    for (f = 0; f < 3; f++)
    {
        for (c = 0; c < 5; c++)
        {
            cout << "Ingrese dato de la fila " << f + 1 << " columna " << c + 1 << " : ";
            cin >> datos[f][c];
        }
    }

    
    for (int i = 0; i < 3; i++)
    {
        cout << "Ingrese la oferta " << i + 1 << " : ";
        cin >> of[i];
    }

    
    for (int i = 0; i < 5; i++)
    {
        cout << "Ingrese la Demanda " << i + 1 << " : ";
        cin >> d[i];
    }
    */

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

    do
    {
        pMayor = 0;
        indiceMenor[0] = 0, indiceMenor[1] = 0;
        columna = 0;
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
        pMayor = penalidadMayor(pfila, pcolumna, pMayor);
        cout << "\n"
             << pMayor;

        cout << "\n***CELDA MENOR COSTO***\n";
        celdaMenorCosto(pMayor, pfila, pcolumna, datos, indiceMenor);
        cout << "fila " << indiceMenor[0] << " columna " << indiceMenor[1];

        cout << "\n***INGRESANDO DISTRIBUCION***\n";
        distribuir(indiceMenor, of, d, resultados, datos);
        cont++;
    } while (cont < 2); //demandaSatisfecha(d));

    pMayor = 0;
    getch();
    return 0;
}