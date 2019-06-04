

public class palindromos {
    public static void main(String args[]){
        evaluate("anita");
        evaluate(null);
        evaluate("");
        evaluate("cc");
        evaluate("anitalavalatina ");
        evaluate("adfafhfajdhfakdhkadfkladhalkdjhkjadshfkjadshfkajsdhfuiackjsdhfljaksdhcjasdjfbajdhfalkdjhfakjsdfhsbajdfhabskdjfuasdjksdflaksdhfaldfhadjfhadsjfakjdfiqoruycbsjhgfvzjhgfjkadjfauuyraksdjfhsk");

        evaluate("%&(aviva.");
        evaluate("soos");
    }

    public static Object evaluate(String palabra) {
        if (palabra == null) {
            //throw new IllegalArgumentException("You can't pass a null String as input.");
            System.out.println("Probando "+palabra+" - Resultado "+palabra);
            return null;
        }

        if(palabra.isEmpty()){
            System.out.println("Probando "+palabra+" - Resultado "+palabra);
            return palabra;
        }

        if(palabra.length()<3){
            System.out.println("Probando "+palabra+" - Resultado "+palabra);
            return palabra;
        }


        if(palabra.matches(".*(\\s)")){
            System.out.println("Probando "+palabra+" - Resultado  ");
            return "";
        }

        if(palabra.length()>200){
            System.out.println("Probando "+palabra+" - Resultado  ");
            return "";
        }

        if(!palabra.matches("^[a-z]+$")){
            System.out.println("Probando "+palabra+" - Resultado \"solo letras o numeros\"");
            return "solo letras o numeros";
        }


        if(palabra.length()%2==0){
            System.out.println("Probando "+palabra+" - Resultado 0");
            return  0;
        }

        boolean result = true;
        int length = palabra.length();
        for (int i = 0; i < length / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }

        System.out.println("Probando "+palabra+" - Resultado "+result);
        return result;
    }
}