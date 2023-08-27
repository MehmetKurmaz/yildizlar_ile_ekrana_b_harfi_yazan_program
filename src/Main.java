public class Main {
    public static void main(String[] args) {

                int size = 7; // Matris boyutunu belirleyin

                char[][] bMatrix = new char[size][size];

                // Matrisi boşluklarla doldur
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        bMatrix[i][j] = ' ';
                    }
                }

                // B harfinin sol dikey çizgisi
                for (int i = 0; i < size; i++) {
                    bMatrix[i][0] = '*';
                }

                // Üst yatay çizgi
                for (int j = 1; j < size - 1; j++) {
                    bMatrix[0][j] = '*';
                }

                // Orta yatay çizgi
                for (int j = 1; j < size - 1; j++) {
                    bMatrix[size / 2][j] = '*';
                }

                // Alt yatay çizgi
                for (int j = 1; j < size - 1; j++) {
                    bMatrix[size - 1][j] = '*';
                }

                // Sağ dikey çizgi
                for (int i = 1; i < size; i++) {
                    bMatrix[i][size - 1] = '*';
                }


                // Matrisi ekrana yazdır
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(bMatrix[i][j]);
                    }
                    System.out.println();
                }




    }
}