public class Escseq {
    public static void main(String[] args) throws Exception {
        int count = 5;
        for (int i=1; i <= count; i++)
        {
            int multiple = i * 7;
            if (i % 2 != 0)
            {
                System.out.println(multiple);
            }
            else 
            {
                System.out.println("\t" + multiple);
            }
        }
    }
}
