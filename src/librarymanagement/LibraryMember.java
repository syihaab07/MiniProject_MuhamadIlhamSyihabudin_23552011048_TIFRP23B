package librarymanagement;
public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String address;

    public LibraryMember(String name, int memberId, String address) {
        this.name = name;
        this.memberId = memberId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getAddress() {
        return address;
    }

    public abstract void borrowBook(Book book);

    public abstract void returnBook(Book book, int daysLate);
}
