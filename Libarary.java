import java.util.Scanner;

class Library{
    String book[];
    String newBook;
    int numOfBook;
    Library(){
        System.out.println("constructor");
    }
    public void showAvailableBooks(String book[]) {
        int i = 0;
        for (String books : book) {
            i++;
            if (!(books == null))
                System.out.print(i + ":" + books + "  ");
        }
    }
        public int addBook(String newBooks ,int numOfBooks,String books[]){
            newBook = newBooks;
            books[numOfBooks++] = newBook;
            return numOfBooks;
        }
}
public class LibraryMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("**** press 0 for exit                  ***************************");
        System.out.println("**** press 1 for add Books             ***************************");
        System.out.println("**** press 2 for show Books            ***************************");
        System.out.println("**** press 3 for issue Books           ***************************");
        System.out.println("**** press 4 for return Books          ***************************");
        System.out.println("******************************************************************");
        String[] books = new String[100];
        books[0] = "R.D Agrawal Math";
        books[1]="Arihant Science";
        books[2]="Math";
        String[] issueBook = new String[100];
        issueBook[0] = "R.D Sharma";
        issueBook[1] = "S.k Signha ";
        int numOfBooks = 3;
        int numOfIssueBook = 2;
        Library library = new Library();
        while (true) {
            System.out.println();
            System.out.print("Enter Operation : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice==0){
                break;
            } else if (choice==1) {
                System.out.print("Input new book : ");
                String newBooks = scanner.nextLine();
                int numOfBook = library.addBook(newBooks,numOfBooks,books);
                numOfBooks=numOfBook;
            } else if(choice==2){
                library.showAvailableBooks(books);
            }
            else if (choice == 3) {
                library.showAvailableBooks(books);
                System.out.println();
                System.out.print("issue new book : ");
                String newIssueBooks = scanner.nextLine();
                System.out.println("number of books : "+numOfBooks);
                    for (int j =0;j<numOfBooks;j++){
                        System.out.print(j+" "+books[j]);
                        if(newIssueBooks.equalsIgnoreCase(books[j])){
                            System.out.println("....searching!");
                            int numOfIssueBooks = library.addBook(newIssueBooks,numOfIssueBook,issueBook);
                            numOfIssueBook =numOfIssueBooks;
                            System.out.println("isuee book : ");
                            library.showAvailableBooks(issueBook);
                            books[j]=books[j+1];
                            numOfBooks--;
                        }
//                        else{
//                            System.out.println("\nbook not found!");
//                        }
                    }
            } else if (choice==4) {
                System.out.print("retuning book : ");
                String returnBook = scanner.nextLine();
                System.out.println("number of books : "+numOfBooks);
                library.showAvailableBooks(books);
                    int numOfIssueBooks = library.addBook(returnBook, numOfBooks, books);
                System.out.println("\nafter adding number of books : "+numOfIssueBooks);
                library.showAvailableBooks(books);
            }
            else {
                System.out.println("Please Enter either 1 & 2 & 3 & 4! ");
            }
        }
        }
    }

