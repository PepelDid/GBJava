public class HW2_PicturesAddWork {
    public static void main(String[] args) {
        System.out.println("Picture1");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if  (j == 0 || j == 5 || i == 5 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Picture2");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if  (i == j || j == 0 || j == 5 || i == 5 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Picture3");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if  (i == j || j == 0 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Picture4");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if  (j >1 && j < 4 && i > 1 && i < 4) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("Picture5");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if  (i <= 1 && j >=4) {
                    System.out.print("  ");
                } else if (i >= 4 && j <= 1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
