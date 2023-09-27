public class aula05b {
    public static class Fatorial{
        static int fat(int n){
            int f;

            if(n == 0){
                return 1;
            }
            else{
                f = n * fat(n-1);
                return f;
            }
        }
    }
}
