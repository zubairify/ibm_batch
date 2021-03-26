import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book bk = new Book(1234, "The Alchemist");
		Member mbr = new Member(99, "Polo");
		Member m2 = new Member(11, "Lili");
		
		bk.status();
		mbr.status();
		
//		bk.returnBook(mbr);
//		
		bk.issueBook(mbr);
//		bk.issueBook(mbr);
		
		bk.returnBook(m2);
//		
//		bk.status();
//		mbr.status();
//		
//		bk.returnBook(mbr);
//		
//		bk.status();
//		mbr.status();
	}
}
