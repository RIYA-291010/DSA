//LINEAR SEARCH WITHIN AN ARRAY
public class arr_i_4 {
    //function to perform linear search within the arrays

    public static int LinearSearch(String menu[],String keys){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==keys){
                return i;
            }
        }
        return -1;    //-1 is return for the cases in which element is not present in the array
    }

    //main function
    public static void main(String args[]){
        //int numbers[]={1,2,3,4,5,6,7,8,9,10,45,36,67};
        String menu[]={"DOSA","SAMOSA","BURGER","CHIPS","SOFTDRINKS"};
        //int key=45;
        String keys="BURGER";
        int index=LinearSearch(menu,keys);   //call function to perform linear search
        //print index
        if(index==-1){
            System.out.println("NOT FOUND!");
        }else{
            System.out.println("THE GIVEN KEY WITHIN THE ARRAY IS AT INDEX: "+index);
        }
    }
    
}
