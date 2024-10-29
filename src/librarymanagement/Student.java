package librarymanagement;
public class Student  extends LibraryMember{
    private String nim;

    public Student(String name, int memberId, String address, String nim) {
        super(name, memberId, address);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
        book.setAvailable(false);
        System.out.println(getName() + " (Student) Telah Meminjam Buku: " + book.getTitle());
        System.out.println("Penulis : " + book.getAuthor());
        System.out.println("Deskripsi : " + book.getDescription());
        System.out.println("Harga     : Rp. " + book.getPrice());
        System.out.println("Alamat    : " + getAddress());
        System.out.println("NIM       : " + getNim());
        System.out.println("ID Member : " + getMemberId());
        } else {
            System.out.println("Mohon Maaf, buku " + book.getTitle() + " tidak tersedia untuk saat ini.");
        }
    }

    public void returnBook(Book book, int daysLate) {
        book.setAvailable(true);
        if (daysLate > 0) {
            int denda = daysLate * 10000;
            System.out.println(getName() + " Telat Mengembalikan Buku. Denda 10000/day: Rp. " + denda);
        } else {
            System.out.println("Atas Nama : "+getName() + " Telah Melakukan Pengembalian Tepat Waktu.");
        }
    }
}
