public class CWalk implements Walk , DuckWalk {

    @Override
    public void woke() {
        System.err.println("ORVERIDING");
    }

    public static void main(String[] args) {
        CWalk cWalk = new CWalk();
        cWalk.woke();

    }
}
