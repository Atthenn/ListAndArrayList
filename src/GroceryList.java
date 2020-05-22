import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addgeroceryItem(String Item){
        groceryList.add(Item);
    }
    public void printGroceryList(){
        System.out.println("size"+ groceryList.size());
        for (int i = 0; i <groceryList.size(); i++) {
            System.out.println(i+1+"."+ groceryList.get(i));
        }
    }
    public void modifyGroceryItem( String currentItem,String newItem){

        int position = findItem(currentItem);
        if(position>0) {
            groceryList.set(position, newItem);
            System.out.println("Grocery Item" + position + 1 + "has changed");
        }
    }
    public void removeGroceryItem(String removeItem){
        int position = findItem(removeItem);
        if(position > 0) {
            groceryList.remove(position);
        }
    }

    private int findItem(String SearchedItem){
       //boolean exist = groceryList.contains(SearchedItem);
      return  groceryList.indexOf(SearchedItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>0){
            return true;
        }
        return false;

    }
}
