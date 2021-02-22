public class Numbers {


    public static void main(String[] args) {
        Numbers arr=new Numbers();
        System.out.println(arr.Method(6,12));
    }
    int Method(int number1,int number2){
        int min = 0;
        int result=0;
        int k=0;
        if (number1 < number2) {
            int []numbers1=new int[number2-number1+1];
            for (int i = number1; i <=number2; i++) {
                numbers1[k]=i;
                k++;
            }
            boolean check=true;
            do{
                number2++;
                int j=0;


                do {
                    if(numbers1[j]==0){
                        j++;
                        continue;
                    }
                    j++;
                    if(j==numbers1.length){
                        break;
                    }
                    if(numbers1[j]==0){
                        j++;
                    }
                }while (number2%numbers1[j]==0);
                if(j==numbers1.length){
                    check=false;
                    result=number2;
                }

            }while (check==true);
            return result;
        } else {
            int []numbers1=new int[number1-number2+1];
            for (int i = number2; i <=number1; i++) {
                numbers1[k]=i;
                k++;
            }
            boolean check=true;
            do{
                number1++;
                int j=0;



                do {
                    if(numbers1[j]==0){
                        j++;
                        continue;
                    }
                    j++;
                    if(j==numbers1.length){
                        break;
                    }
                    if(numbers1[j]==0){
                        j++;
                    }
                }while (number1%numbers1[j]==0);
                if(j==numbers1.length){
                    check=false;
                    result=number1;
                }

            }while (check==true);
            return result;
        }

    }

}
