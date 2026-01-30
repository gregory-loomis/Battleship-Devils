

public class Model 
{
    public int horzRandomShipPlacement(int h) {
        h = (int)(Math.random() * 11);
        
        return h;
    }

    public int vertRandomShipPlacement(int v) {
        v = (int)(Math.random() * 11);
        /*
        A = 1
        B = 2 
        C = 3 
        D = 4 
        E = 5 
        F = 6 
        G = 7 
        H = 8 
        I = 9
        J = 10
        */
        return v;
    }
}

