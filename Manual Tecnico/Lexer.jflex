package gramatica;
import java_cup.runtime.Symbol;

%%
%public 
%class AnalizadorLexico
%cup
%cupdebug
%line
%full
%column

/*Identificadores*/

Numero = [0-9]
Letra = [a-zA-Z]
Tab = \t | "    "
Enter = \n
Salto = \r
Espacio1 = [ \f]
Espacio = {Salto} | {Espacio1}


%{

    private Symbol symbol(int tipo){
        return new Symbol(tipo, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int tipo, Object value){
        return new Symbol(tipo, yyline+1, yycolumn+1, value);
    }   

%}
%%

<YYINITIAL>{
/* Simbolo Reservado de Separacion de Parametros */
    "," 	                                	        {return symbol(sym.coma, new String(yytext()));}
/* Simbolos de Operacion */
    "+"                                             	        {return symbol(sym.mas, new String(yytext()));}
    "-"                                             	        {return symbol(sym.menos, new String(yytext()));}
    "*"                                             	        {return symbol(sym.por, new String(yytext()));}
    "/"                                             	        {return symbol(sym.div, new String(yytext()));}
    	
    "("                                             	        {return symbol(sym.parentesis_a, new String(yytext()));}
    ")"     		                            	        {return symbol(sym.parentesis_b, new String(yytext()));}
/* Palabras Reservadas de Color*/	
    "azul"                                          	        {return symbol(sym.color, new String(yytext()));}
    "rojo"                                          	        {return symbol(sym.color, new String(yytext()));}
    "verde"                                         	        {return symbol(sym.color, new String(yytext()));}
    "amarillo"                                      	        {return symbol(sym.color, new String(yytext()));}
    "naranja"                                       	        {return symbol(sym.color, new String(yytext()));}
    "morado"                                        	        {return symbol(sym.color, new String(yytext()));}
    "cafe"                                          	        {return symbol(sym.color, new String(yytext()));}
    "negro"      						{return symbol(sym.color, new String(yytext()));}

/* Palabras Reservadas de Animaciones*/ 
    "linea"                                         		{return symbol(sym.linea, new String(yytext()));}
    "curva"   					   		{return symbol(sym.curva, new String(yytext()));}

/* Palabras Reservadas de Acciones*/
    "graficar"                                                  {return symbol(sym.graficar, new String(yytext()));}
    "animar"                                                    {return symbol(sym.animar, new String(yytext()));}
    "objeto"                                   	                {return symbol(sym.objeto, new String(yytext()));}
    "anterior"                                                  {return symbol(sym.anterior, new String(yytext()));}
 
/* Palabras Reservadas de Formas*/
    "circulo"                                                   {return symbol(sym.circulo, new String(yytext()));}
    "cuadrado"                                                 	{return symbol(sym.cuadrado, new String(yytext()));}
    "rectangulo"                                                {return symbol(sym.rectangulo, new String(yytext()));}
    "poligono"                                                  {return symbol(sym.poligono, new String(yytext()));}

/* Saltos de Linea */
    {Tab}                                                   	{} 
    {Enter}                                                 	{}
    {Espacio}+                                            	{}
    
/* Numeros */
    {Numero}+                                               	{return symbol(sym.numero, new Integer(yytext()));}
    
}   
    [^]                                                     	{return symbol(sym.residuo, new String(yytext()));}




