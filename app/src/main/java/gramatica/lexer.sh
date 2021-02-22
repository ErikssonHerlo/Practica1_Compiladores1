#!/usr/bin/bash
echo "Compilando lexer..."
jflex Lexer.jflex
echo "Lexer compilado!"
echo "Copiando AnalizadorLexico.java"
cp -i AnalizadorLexico.java /home/erikssonherlo/NetBeansProjects/AnalizadorLexico/src/main/java/gramatica/
echo "AnalizadorLexico.java copiado!!!"
