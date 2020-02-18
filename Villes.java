public class Villes {

    public static void afficherTab(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int sommeUneLigne(int[][] tab,int indice) {
        int somme = 0;
        for (int i=0; i < tab[indice].length; i++) {
            somme += tab[indice][i];
        }
        return somme;
    }
    public static double moyenneUneLigne(int[][] tab,int indice){
        double somme = 0;
        double nbLigne = 0;

        for (int i=0; i < tab.length; i++) {
            somme += tab[i][indice];
            nbLigne++;
        }
        return somme/nbLigne;
    }
    public static double moyenneUneCol(int[][] tab,int indice){
        double somme = 0;
        double nbLigne = 0;

        for (int i=0; i < tab[indice].length; i++) {
            somme += tab[indice][i];
            nbLigne++;
        }
        return somme/nbLigne;
    }
    public static int maxLigne(int[][] tab, int indice){
        int max = Integer.MIN_VALUE;
        for (int i=0; i < tab[indice].length; i++) {
            if (max<tab[indice][i]){
                max = tab[indice][i];
            }
        }
        return max;
    }
    public static int maxCol(int[][] tab, int indice){
        int max = Integer.MIN_VALUE;
        for (int i=0; i < tab.length; i++) {
            if (max<tab[i][indice]){
                max = tab[i][indice];
            }
        }
        return max;
    }

}