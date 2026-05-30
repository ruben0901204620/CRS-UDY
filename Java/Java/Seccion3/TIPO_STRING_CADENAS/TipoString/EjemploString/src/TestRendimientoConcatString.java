public class TestRendimientoConcatString {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);

        for(int i=0;i<500;i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            //c += a + b +"\n"; // 500 => 12ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
