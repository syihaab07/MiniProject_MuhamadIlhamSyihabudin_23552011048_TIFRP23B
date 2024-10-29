package librarymanagement;
public class Lecture extends LibraryMember{
private String lecturerCode;

    public Lecture(String name, int memberId, String address, String lecturerCode) {
        super(name, memberId, address);
        this.lecturerCode = lecturerCode;
    }

    public String getLecturerCode() {
        return lecturerCode;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
        book.setAvailable(false);
        System.out.println(getName() + " (Lecture) Telah Meminjam Buku: " + book.getTitle());
        System.out.println("Pengarang : " + book.getAuthor());
        System.out.println("Deskripsi : " + book.getDescription());
        System.out.println("Harga     : Rp. " + book.getPrice());
        System.out.println("Alamat    : " + getAddress());
        System.out.println("ID Member : " + getMemberId());
        System.out.println("Kode Dosen: " + getLecturerCode());
        } else {
            System.out.println("Maaf, buku " + book.getTitle() + " tidak tersedia untuk saat ini.");
        }
    }

    @Override
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
