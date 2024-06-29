public class UpperCase {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].charAt(0)<='A' ||  args[i].charAt(0)>='Z'){
                return;
            }
        }
        System.out.println("All String in UpperCase");
    }
}
