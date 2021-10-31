#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <iostream>
#include <conio.h>
#include <cmath>
#include <stdbool.h>
#include <string>

using namespace std;
#define STRING(num) #num

void penalidadFila(int datos[3][5], int pfila[3])
{
    int menor = 0, segundo = 0, aux = 0, numero = 0, penalidad = 0;
    for (int f = 0; f < 3; f++)
    {
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
                    if (menor == 0)
                    {
                        if (datos[f][c] < datos[f][c + 1])
                        {
                            menor = datos[f][c];
                            segundo = datos[f][c + 1];
                        }
                        else
                        {
                            menor = datos[f][c + 1];
                            segundo = datos[f][c];
                        }
                    }
                    else if (numero != menor)
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
        }
        penalidad = menor - segundo;
        pfila[f] = abs(penalidad);
        menor = 0;
        segundo = 0, aux = 0, numero = 0, penalidad = 0;
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
                if (aux == 0)
                {
                    aux = datos[f + 2][ronda];
                }
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
        menor = 0, segundo = 0, aux = 0, numero = 0, penalidad = 0, f = 0;
    }
}

int penalidadMayor(int pfila[3], int pcolumna[5], int pMayor)
{
    int contador = 0;
    int numero = 0;
    int mayorfila = 0, mayorcolumna = 0;
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
    return pMayor;
}

void celdaMenorCosto(int pMayor, int pfila[3], int pcolumna[5], int datos[3][5], int indiceMenor[2])
{
    bool enFila;
    bool enColumna;
    int numero = 0, menor = 0;
    int fila = 0, columna = 0;
    int f = 0, c = 0;
    int cont = 0;
    //Recorrido pFila
    for (int i = 0; i < 3; i++)
    {
        if (pfila[i] == pMayor)
        {
            fila = i;
            enFila = true;
            //cout << "encontrado en fila " << fila << "\n";
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

    if (enFila)
    {
        //cout << "\nBuscar en fila " << fila << "\n";
        do
        {
            numero = datos[fila][cont];
            if (numero != 0)
            {
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
                    else if (menor == 0)
                    {
                        menor = numero;
                        f = fila;
                        c = cont;
                    }
                }
            }
            cont++;
        } while (cont < 5);
        indiceMenor[0] = f;
        indiceMenor[1] = c;
    }
    else if (enColumna)
    {
        do
        {
            numero = datos[cont][columna];
            if (numero != 0)
            {
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
                    else if (menor == 0)
                    {
                        menor = numero;
                        f = fila;
                        c = cont;
                    }
                }
            }
            cont++;
        } while (cont < 3);
        indiceMenor[0] = f;
        indiceMenor[1] = c;
    }
}

void distribuir(int indiceMenor[2], int of[3], int d[5], int resultados[3][5], int datos[3][5])
{
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
    //Impresion de Matriz Resultados
    cout << "\n***Actualizando Tablero de Resultados***\n";
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
    bool r = 0;
    int valor = 0;
    for (int i = 0; i < 5; i++)
    {
        valor += d[i];
        if (valor == 0)
        {
            r = 1;
        }
        else if (valor != 0)
        {
            r = 0;
        }
    }

    return r;
}

void Multip(int resultados[3][5], int auxdatos[3][5])
{
    int product[3][5] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    int total = 0;
    string cadena;
    string por = "*";
    string cadena2;

    for (int row = 0; row < 3; row++)
    {
        for (int col = 0; col < 5; col++)
        {
            product[row][col] = auxdatos[row][col] * resultados[row][col];
            cout << product[row][col] << "\t";
            total = total + product[row][col];
        }
        cout << "\n";
    }
    cout << "\n**********COSTO TOTAL DE TRANSPORTE**********"
         << "\n\n";
    cout << "Z = " << total;
}

//*****************INICIO DEL MAIN**********************
//******************************************************
int main()
{
    int pfila[3], pcolumna[5], indiceMenor[2];
    int pMayor, fila = 0, columna = 0;
    int resultados[3][5];
    int f = 0, c = 0, cp = 1;
    /*EN LA MATRIZ DATOS SE DEFINEN LOS COSTOS DE TRANSPORTE, MATRIZ AUXILIAR ES UNA COPIA DE DATOS PARA USARLOS AL FINAL CON EL
    TABLERO DE ASIGNACIONES, MATRIZ OF DEFINE LAS OFERTAS, MATRIZ D DEFINE LAS DEMANDAS.*/
    int datos[3][5] = {{1200, 2500, 2300, 2200, 4000}, {2200, 1500, 2000, 1800, 3500}, {4000, 3500, 3200, 3400, 1000}};
    int auxdatos[3][5] = {{1200, 2500, 2300, 2200, 4000}, {2200, 1500, 2000, 1800, 3500}, {4000, 3500, 3200, 3400, 1000}};
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

    //CICLO REPETITIVO, CALCULA LAS PENALIDADES, CELDA MENOR COSTO, ASIGNACIONES AL TABLERO OPTIMO
    do
    {
        pMayor = 0;
        indiceMenor[0] = 0, indiceMenor[1] = 0;
        columna = 0;

        penalidadFila(datos, pfila);
        penalidadColumna(datos, pcolumna);
        //Impresion de Matriz completa
        cout << "\n***Matriz de datos***\n";
        cout << "BOD\t"
             << "ES\t"
             << "RE\t"
             << "SU\t"
             << "SA\t"
             << "PE\t"
             << "OF\t"
             << "P" << cp << "\n";
        for (f = 0; f < 3; f++)
        {
            cout << "SU" << f + 1 << "\t";
            for (c = 0; c < 6; c++)
            {
                //Validacion para imprimir la ultima columna(Oferta)
                if (c > 4)
                {
                    cout << of[f];
                    cout << "\t" << pfila[f];
                }
                else
                {

                    cout << datos[f][c] << "\t";
                }
            }
            cout << "\n";
        }
        //Imprime la ultima fila(Demanda)
        cout << "D\t";
        for (int i = 0; i < 5; i++)
        {
            cout << d[i] << "\t";
        }
        cout << "\n";
        //Imprimer las penalidades columna
        cout << "P" << cp << "\t";
        for (int i = 0; i < 5; i++)
        {
            cout << pcolumna[i] << "\t";
        }
        cout << "\n";
        cout << "\n***PENALIDAD MAYOR***\n";
        pMayor = penalidadMayor(pfila, pcolumna, pMayor);
        cout << pMayor << "\n";

        cout << "\n***CELDA MENOR COSTO***\n";
        celdaMenorCosto(pMayor, pfila, pcolumna, datos, indiceMenor);
        cout << "fila " << indiceMenor[0] + 1 << " columna " << indiceMenor[1] + 1 << "\n";

        cout << "\n***INGRESANDO DISTRIBUCION***\n";
        distribuir(indiceMenor, of, d, resultados, datos);
        cont++;
        cp++;
        demandaSatisfecha(d);
    } while (demandaSatisfecha(d) == 0); 

    cout << "\n\n**********MATRIZ DE COSTOS**********\n\n";
    Multip(resultados, auxdatos);

    //pMayor = 0;
    getch();
    return 0;
}