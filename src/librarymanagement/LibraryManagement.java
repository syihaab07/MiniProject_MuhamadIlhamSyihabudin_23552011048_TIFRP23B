package librarymanagement;
public class LibraryManagement {
    public static void main(String[] args) {
      // Array List
        Book[] books = {
            new Book("Atomic Habits", "James Clear", "Buku pengembangan diri yang berfokus pada cara membentuk kebiasaan positif dan menghentikan kebiasaan buruk.", 250000),
            new Book("The Principal: Three Keys to Maximizing Impact", "Michael Fullan", "Buku panduan kepemimpinan yang ditujukan bagi para kepala sekolah dan pemimpin pendidikan.", 300000),
            new Book("On Photography", "Susan Sontag", "Buku klasik yang menawarkan perspektif mendalam tentang filosofi dan estetika fotografi, cocok bagi pembaca yang tertarik pada aspek pemikiran dan refleksi dalam fotografi.", 350000),
            new Book("Man's Search for Meaning", "Viktor E. Frankl", "mengeksplorasi pentingnya makna hidup sebagai motivasi utama manusia, berdasarkan pengalamannya di kamp konsentrasi.", 150000),
};

        LibraryMember student1 = new Student("Alex T Arnold", 1001, "New York", "11002548055");
        LibraryMember student2 = new Student("Agus Tri Mulyana", 1002, "Bandung", "11002011168");
        LibraryMember lecture1 = new Lecture("Bapak Alfredo Fernandez, S.Kom., M.Kom.", 1004, "California", "2111949");
        LibraryMember lecture2 = new Lecture("Bapak Steven Hollands, S.Kom., M.Kom.", 1003, "New York", "1987045");

        //borrow
        student1.borrowBook(books[0]);  
        System.out.println("\n");
        lecture1.borrowBook(books[0]);  
        System.out.println("\n");
        student2.borrowBook(books[3]); 
        
        //refuse
        student1.returnBook(books[0], 3); 
        System.out.println("\n");
        lecture1.borrowBook(books[0]);  
        System.out.println("\n");
        student2.returnBook(books [3], 0); 
        System.out.println("\n");
        lecture1.returnBook(books[0], 1); 
    }
    
}
