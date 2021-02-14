public class Less2 {
    public static void main(String[] args) {
        String[][] ClientF = new String[][]{
                {"Jone","m"},
                {"Mike","m"},
                {"Kate","f"},
                {"Den","m"},
                {"Eve","f"},
                {"Stive","m"},
                {"Mila","f"},
                {"Barbara","f"},
                {"Dan","m"},
                {"Piter","m"}
        };
        int[] ClientAge = new int[]{42,18,25,51,33,28,66,44,52,23};

    ClientSort(ClientAge,ClientF);

        for (int i = 0; i < ClientF.length; i++) {
            if (ClientF[i][1].equals("m")) {
                System.out.println("--------------------------");
                System.out.println("Client");
                System.out.println(ClientAge[i]);
                for (int j = 0; j < ClientF[0].length; j++) {
                    System.out.println(ClientF[i][j]);
                }
            }
        }
    }

    public static void ClientSort(int[] arr,String[][] arr2){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmpA = arr[j];
                String tmpF = arr2[j][0];
                String tmpS = arr2[j][1];
                arr[j] = arr[j+1];
                arr2[j][0] = arr2[j+1][0];
                arr2[j][1] = arr2[j+1][1];
                arr[j+1] = tmpA;
                arr2[j+1][0] = tmpF;
                arr2[j+1][1] = tmpS;
            }
        }
    }
}
}