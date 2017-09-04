/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopa.de.letras;

/**
 *
 * @author toshiba
 */
public class SOPADELETRAS {

    public int longitudElemento;

    /**
     *
     */
    int contador[], cont;

    String elemento;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "COMAREIS,PERU,EPIS";
        String palabras[] = palabra.split(",");

        String cadenas[] = {"EPISNQRPCG",
            "PLUCRUYOCR",
            "IXMIOGMKSF",
            "SICOMAREIS",
            "RLLIRHRBEE",
            "DSTEHLZERO",
            "COMAREISAX",
            "JSCWBIFQMS",
            "TSZZVKSIOP",
            "PERUMOZSCU"};

        SOPADELETRAS LS = new SOPADELETRAS();
//        
        String cade = "davif";

//            System.out.println(""+cade.substring(4,5));
//   LS.imprimir(cadenas);
////        System.out.println((cadenas.length-1)); 
////        
////        LS.ComprobarFilasColumnas(cadenas);
//  LS.extraer(cadenas);
//            LS.ev();
//            MetodoTrim();
//            BusquedaHorizontal(cadenas, palabras);
//       LS.almacenarColumnas(cadenas, palabras);
//             LS.BusquedaHorizontalDerecha(cadenas, palabras);
//             LS.BusquedaHorizontalIzquierda(cadenas, palabras);
//             LS.BusquedaVerticalArriba(cadenas, palabras);
//             LS.BusquedaVerticalAbajo(cadenas, palabras);
//            LS.SacarDiagonal(cadenas);
//   LS.Correr(cadenas, palabras);
//            LS.invertirElemento();
//    LS.invertirColumnas(cadenas,palabras);
// 
//        LS.SacarCantidad(cadenas, palabras);
//  
        LS.sacarResultados(cadenas[0],palabras[0]);
    }

    public void sacarResultados(String matriz, String palabraBuscar) {
        String david = "FFFFFFFFFFFFFFFSCOMAREIS";

        String  pal = "", pal2 = "hh", buscar="COMAREIS";
    
       

//            for (int k = 0; k < palabraBuscar.length; k++) {
//
//                for (int jj = 0; jj <matriz.length; jj++) {
                    for (int i = 0; i < palabraBuscar.length(); i++) {

                        for (int j = 0; j < matriz.length(); j++) {

                            if (matriz.substring(j, (j + 1)).equals(palabraBuscar.substring(i, i + 1))) {

                                pal = pal + palabraBuscar.substring(i, (i + 1));
                            break;
                               
                            }
   
                        }
                     
                    }
                  
                 
                
            
//                      if (pal.equals(palabraBuscar[k])) {
                         
                            System.out.println(""+pal);
             
                    
                
                
               
                }
             
            
            
        


       

      public void Buscar() {
        String texto = "realmadriddedavid";
        String palabra = "madrid";
        String auxiliar = "";

        for (int i = 0; i < palabra.length(); i++) {

            for (int j = 0; j < texto.length(); j++) {
                if (texto.substring(j, (j + 1)).equals(palabra.substring(i, i + 1))) {

                    auxiliar = auxiliar + palabra.substring(i, i + 1);
                    if (j > 0) {

                        if (texto.substring(j, (j + 1)).equals(palabra.substring(i, i + 1))) {

                        }

                    }

                }
            }

        }

    }
    public String buscarVAlor(String Matris[], String palabras[]) {
        boolean elemento;
        int ct;
        String buscado = "";
        contador = new int[palabras.length];

        for (int k = 0; k < palabras.length; k++) {
            cont = 0;

            for (int i = 0; i < Matris.length; i++) {

                elemento = Matris[i].contains(palabras[k]);

                if (elemento) {
                    contador[k]++;
                    buscado = palabras[k];

                }

            }

//        System.out.println(""+contadr+"-"+palabras[k]);
        }
        return buscado;
    }

    public void SacarCantidad(String matriz[], String palabras[]) {

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i] == (buscarVAlor(matriz, palabras))) {
                System.out.println(contador[i] + "" + buscarVAlor(matriz, palabras));
            }

        }

    }

    public void imprimir(String a[]) {

        for (String a1 : a) {
            System.out.print("\n" + a1);
        }
    }

    public int AnalizarFila(String matriz[]) {
        int estado = 0;

        int i;
        for (i = 0; i < matriz.length; i++) {

            longitudElemento = matriz[i].length();

            if (longitudElemento == matriz.length) {
                estado++;
            }
        }
        return estado;

    }

    public void ComprobarFilasColumnas(String matriz[]) {

        if (AnalizarFila(matriz) != matriz.length) {

            System.out.println(" \n ERROR- filas imcompletas");

        } else {

            System.out.println("");
        }

    }

    ////////////PROCESO DE PARSEO
    public void BusquedaHorizontalDerecha(String Matris[], String palabras[]) {
        boolean elemento;

        for (int k = 0; k < palabras.length; k++) {
            int contadr = 0;
            for (int i = 0; i < Matris.length; i++) {

                elemento = Matris[i].contains(palabras[k]);

                if (elemento) {
                    contadr++;
                }
            }
            System.out.println("" + contadr + "-" + palabras[k]);
        }

    }

    public void BusquedaHorizontalIzquierda(String matriz[], String Palabras[]) {
        invertirColumnas(matriz, Palabras);
        BusquedaHorizontalDerecha(matriz, Palabras);

    }

    public void invertirColumnas(String matriz[], String[] palabras) {

        String Invertido;
        String elementoInvertido[] = new String[matriz.length];

        for (int j = 0; j < matriz.length; j++) {
            Invertido = "";
            for (int i = matriz[j].length(); i > 0; i--) {
//            elementoInvertido[i]=elementoInvertido[i]+matriz.substring(i-1,i);
                Invertido = Invertido + matriz[j].substring(i - 1, i);
            }
            elementoInvertido[j] = Invertido;
//           System.out.println(""+elementoInvertido[j]);
        }
        matriz = elementoInvertido;

        BusquedaHorizontalDerecha(matriz, palabras);
    }

    public void BusquedaVerticalArriba(String matriz[], String palabras[]) {

        String nuevaMatriz[] = new String[matriz.length];

        for (int j = 0; j < matriz.length; j++) {
            elemento = "";
            for (int i = 0; i < matriz.length; i++) {

                elemento = elemento + matriz[i].substring(j, j + 1);
                nuevaMatriz[j] = elemento;
            }
        }
        matriz = nuevaMatriz;

        invertirColumnas(matriz, palabras);

    }

    public void BusquedaVerticalAbajo(String matriz[], String palabras[]) {
        String nuevaMatriz[] = new String[matriz.length];
        for (int j = 0; j < matriz.length; j++) {
            elemento = "";
            for (int i = 0; i < matriz.length; i++) {

                elemento = elemento + matriz[i].substring(j, j + 1);
                nuevaMatriz[j] = elemento;
            }
        }
        matriz = nuevaMatriz;
        BusquedaHorizontalDerecha(matriz, palabras);
//
    }

    public void SacarDiagonal(String matriz[]) {
        String diagonalElemento = "";
        String extraer;

        extraer = matriz[0].substring(7, 8);
        extraer = matriz[0].substring(7, 8) + matriz[1].substring(8, 9);
        extraer = matriz[0].substring(7, 8) + matriz[1].substring(8, 9) + matriz[2].substring(9, 10);

        int n = matriz.length;

        int j = 1;

        for (int i = 0; i < matriz.length; i++) {

            diagonalElemento = diagonalElemento + matriz[0].substring(9, 10);

//        diagonalElemento=                                                                                                         
            j++;
        }

        System.out.println("" + diagonalElemento);
    }

}

// }
////  public boolean buscarPalabra(String Texto, String palabra){
////      
////      boolean comprobar=Texto.contains(palabra);
////      
////     if(comprobar){
////     
////     
////     }
////  
////   
////  
////  return true ;
////  }
//// 
////  
////  public static void extraer(String matriz[]){
////      
////      int n=matriz.length;
////      
////      
////      
//// 
////      for(int i=n;i>0;i--){
////     
////      String a ="";
////      
////      a=matriz[0].substring(i-1,i);
////      
////          
////         System.out.println(a); 
////      
////          
////      }
////  
////  }
//////  public void bucarHORIZONTAL(String matriz[], String b[]){
//////  int funcionExtraer;
//////for(int i=b.length;i>-1;i--){
//////    extraer(matriz);
//////   
//////    
//////    
//////    }
//////
//////
//////
//////
//////}
////  
////  
////  public void ev (){
////  String maString="dorgedavidfz";
////  
////  String matrizb="david";
////  
////  String palabra="klll";
////  
////  
//// 
////  for(int i=maString.length();i>0;i--){
////  
////      
////      if(maString.substring(i-1, i)==(matrizb.substring(4, 5))){
////         if(maString.substring(i-1,i)==(matrizb.substring(i-1, i))) {
////          
////
////  
////      palabra=palabra+ maString.substring(i-1,i);
////      System.out.println(palabra); 
////       
////  }
//// 
//// 
////      
////  }
////      else{
////      
////      
////      break;}
//// 
////  }
////  
////  }
////  
////  public static void MetodoTrim(){
////  String palabra ="   daviddelgamelandoaachata  ", cadena="melani";
////  
////  
////  boolean comprobar=palabra.contains(cadena);
////  
////      if (comprobar) {
////          System.out.println("perfect "+cadena);
////      }
////      else{
////          System.out.println("no existe la palabra");
////      
////      }
////      
////  
////  }
////  
//  void Imprimir(String matriz[]){
//  
//  for(int i=0;i<matriz.length;)
//      
//  {
//
//  }
//  
//  }

