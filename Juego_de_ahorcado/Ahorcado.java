public class Ahorcado {
    private final String[] palabras = {"MONO","RATA","TIERRA","POLITECNICO","OSESNO","´PINO","WEB","POO","VIDA","UVAS","PIÑA","ALEBRIJE"};
    private static int partidasGanadas;
    private static int partidasPerdidas;
    private static int intentosMedia;

    /**
     * Número de intentos máximo para adivinar la palabra
     */
   public final byte NUM_INTENTOS = 10;
   private byte numIntentos = 1;

   /**
    * Cadena con el formato RESUELVO: para intentar adivinar la palabra
    */
   public static final String CAD_RESOLVER = "RESUELVO:";
   /**
    * Cadena para comenzar un nuevo juego
    */
   public static final String CAD_ME_RINDO = "ME RINDO";

   private boolean adivinada = false;
   private boolean finPartida = false;  // Necesaria ya que podemos acabar la partida porque la adivina o porque falla o alcanza el nº maximo de intentos
   
   private String palabraAdivinar = "";
   private StringBuffer palabraMostrar = new StringBuffer();

   
   public Ahorcado(){
       setPalabraAdivinar();
   }

   public String getPalabraMostrar() {
        return palabraMostrar.toString();
   }
   private void setPalabraAdivinar() {
       int indice = (int)(Math.random()*(palabras.length-1));
       
       this.palabraAdivinar = palabras[indice];
       setPalabraMostrar();
   }
   private void setPalabraMostrar(){
       palabraMostrar.append(palabraAdivinar.replaceAll("[a-zA-Z]","*"));
   }
   
   private void actualizarIntentos(){
       if (adivinada){
           partidasGanadas++;
           intentosMedia = (intentosMedia==0) ? numIntentos  : (intentosMedia+numIntentos)/2;
       }
       else{
           partidasPerdidas++;
       }
   }
   
   /**
    * Intenta adivinar una letra de la palabra
    * @param letra: letra a adivinar
    * @return true: si el palabra fue adivinada
    *         false: Si ya llegamos al máximo de intentos o la palabra no fue adivinada
    */
   public boolean intentar(char letra){
       letra = String.valueOf(letra).toUpperCase().charAt(0);
       if (adivinada) return adivinada; // Si ya adivinamos la palabra no permmite jugar
       if (numIntentos>NUM_INTENTOS) {
           finPartida = true;
           actualizarIntentos();
           return false;
       }

       for (int cont=0;cont < palabraMostrar.length();cont++){
           if (palabraAdivinar.charAt(cont)==letra){
               palabraMostrar.setCharAt(cont, letra);
           }
           
       }
       numIntentos++;

       if (palabraMostrar.indexOf("*")==-1){
           adivinada = true;
           finPartida = true;
           actualizarIntentos();
       }
       
       return adivinada;
   }
   /**
    * Intenta adivinar la palabra con el formato: @link CAD_RESOLVER
    * @param cadena: palabra a adivinar
    * @return true: si el palabra fue adivinada
    *         false: en caso de no adivinar la palabra o si ya llegamos al máximo de intentos
    */
   public boolean intentar(String cadena){
       cadena = cadena.toUpperCase();
       String palabra="";
       palabraMostrar = new StringBuffer(palabraAdivinar);  // Queremos mostrar la palabra 

       if (cadena.contains(CAD_ME_RINDO)){
           numIntentos = NUM_INTENTOS+1;    // No creamos una condición específica para ME RINDO
           finPartida = true;
       }

       if (adivinada) return adivinada; // Si ya adivinamos la palabra no permmite jugar
       if (numIntentos>NUM_INTENTOS) return false;

       numIntentos++;
       if (cadena.contains(CAD_RESOLVER)){
           palabra = cadena.substring(CAD_RESOLVER.length());
           if (palabra.equals(palabraAdivinar)){
               adivinada = true;
           }
           finPartida = true;
           actualizarIntentos();
       }
       
       return adivinada;
   }

    public boolean getFinPartida() {
        return finPartida;
    }

    public byte getNumIntentos() {
        return numIntentos;
    }
    public static int getPartidasGanadas() {
        return partidasGanadas;
    }

    public static int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public static int getIntentosMedia() {
        return intentosMedia;
    }

   
}