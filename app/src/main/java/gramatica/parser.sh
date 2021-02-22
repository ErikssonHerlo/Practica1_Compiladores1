#!/usr/bin/bash
echo "Compilando parser..."
java -jar /home/erikssonherlo/Descargas/java-cup-bin-11b-20160615/java-cup-11b.jar Sintax.cup
echo "Parser compilado!"
echo "Copiando parser.java"
cp -i parser.java /home/erikssonherlo/NetBeansProjects/AnalizadorLexico/src/main/java/gramatica/
echo "parser.java copiado!!!"
echo "Copiando sym.java"
cp -i sym.java /home/erikssonherlo/NetBeansProjects/AnalizadorLexico/src/main/java/gramatica/
echo "sym.java copiado!!!"
