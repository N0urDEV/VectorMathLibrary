public class Vecteur2D {
    private static int nombreVecteursCrees = 0;

    private double x;
    private double y;

    public Vecteur2D() {
        this.x = 0;
        this.y = 0;
        nombreVecteursCrees++;
    }

    public Vecteur2D(double x, double y) {
        this.x = x;
        this.y = y;
        nombreVecteursCrees++;
    }

    public Vecteur2D(Vecteur2D autre) {
        this.x = autre.x;
        this.y = autre.y;
        nombreVecteursCrees++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static int getNombreVecteursCrees() {
        return nombreVecteursCrees;
    }

    @Override
    public String toString() {
        return "X = " + x + " - Y = " + y;
    }

    public boolean equals(Vecteur2D autre) {
        return this.x == autre.x && this.y == autre.y;
    }

    public double norme() {
        return Math.sqrt(x * x + y * y);
    }
}

public class Vecteur3D extends Vecteur2D {
    private double z;

    public Vecteur3D() {
        super();
        this.z = 0;
    }

    public Vecteur3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Vecteur3D(Vecteur3D autre) {
        super(autre);
        this.z = autre.z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return super.toString() + " - Z = " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vecteur3D)) return false;
        Vecteur3D autre = (Vecteur3D) obj;
        return super.equals(autre) && this.z == autre.z;
    }

    @Override
    public double norme() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }
}

public class Main {
    public static void main(String[] args) {
        Vecteur2D v1 = new Vecteur2D(1.5, 2);
        Vecteur2D v2 = new Vecteur2D(1.5, 2);
        Vecteur2D v3 = new Vecteur2D(3, 4);

        System.out.println("Vecteur 1 : " + v1);
        System.out.println("Norme de v1 : " + v1.norme());

        System.out.println("Vecteur 2 : " + v2);
        System.out.println("Norme de v2 : " + v2.norme());

        System.out.println("Vecteur 3 : " + v3);
        System.out.println("Norme de v3 : " + v3.norme());

        System.out.println("Nombre de vecteurs créés : " + Vecteur2D.getNombreVecteursCrees());

        Vecteur3D v3D1 = new Vecteur3D(1.5, 2, 3);
        Vecteur3D v3D2 = new Vecteur3D(1.5, 2, 3);
        Vecteur3D v3D3 = new Vecteur3D(3, 4, 5);

        System.out.println("Vecteur 3D 1 : " + v3D1);
        System.out.println("Norme de v3D1 : " + v3D1.norme());

        System.out.println("Vecteur 3D 2 : " + v3D2);
        System.out.println("Norme de v3D2 : " + v3D2.norme());

        System.out.println("Vecteur 3D 3 : " + v3D3);
        System.out.println("Norme de v3D3 : " + v3D3.norme());

        System.out.println("Nombre de vecteurs créés : " + Vecteur2D.getNombreVecteursCrees());
    }
}
