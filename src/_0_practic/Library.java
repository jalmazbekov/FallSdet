package _0_practic;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<LibraryItem> items;

    public Library(List<LibraryItem> items) {
        this.items = items;
    }

    public void addItem(LibraryItem item){
       items.add(item);
   }
   public void  displayAllItems(){
       for(LibraryItem item:items){
           item.printInfo();
           System.out.println("----");
       }
   }
   public void borrowItem(String title, String borrower) throws AlreadyBorrowedException {
       for(LibraryItem item:items){
           if(item.getTitle().equals(title)){
             if (item.isBorrowed()){
                 throw new AlreadyBorrowedException("вещь уже занята");
             }
             item.setBorrowed(true);
               System.out.println("вещь можно взять");
           }
       }

   }
   public  void returnItem(String title) {
       for(LibraryItem item:items){
           if(item.getTitle().equals(title)){
               if (!item.isBorrowed()){
                   System.out.println("вещь и так была в библиотеке!");
                   return;
               }
               item.setBorrowed(false);
               System.out.println("вещь возвращена");

           }
       }
   }
}
//5. class Library
//Поля:
//    List<LibraryItem> items
//    Методы:
//            - addItem(LibraryItem item)
//- displayAllItems()
//- borrowItem(String title, String borrower)
//- returnItem(String title)
