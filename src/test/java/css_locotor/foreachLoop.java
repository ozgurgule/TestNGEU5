package css_locotor;

public class foreachLoop {

    public static void main(String[] args) {
        String [] str = {"Hello", "Welcome", "Bienvenido", "Hola"};

        for (String items : str) {
            System.out.println("String items are :" +items);


        }for(int i =0;i< str.length;i++){

            System.out.println("String items are: "+ str[i]);
        }
        for (String item : str ) {
            if(item.contains("o")){
                System.out.println("o getting out");
                break;
            }
            System.out.println(item +" ");

        }



    }


}
