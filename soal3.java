public class soal3 {
    public  static  void  main(String[] args){
        String camelCaseString = " savechangesInTheEditor";
        int count = 1;
        for(int i = 0; i<camelCaseString.length();i++){
            if(Character.isUpperCase(camelCaseString.charAt(i))){
                count++;
            }
        }
        System.out.println("Jumlah kata dalam camelCase:"+count);
    }
}
