public class Book
{
	private String authorFirstName;
	private String authorLastName;
	private String title;
	private int isbnCode;
	private int uniqueCode;
	private Boolean availability;

	public Book(String authorFirstName, String authorLastName, String title, int isbnCode, int uniqueCode, Boolean availability) {
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.isbnCode = isbnCode;
		this.uniqueCode = uniqueCode;
		this.availability = availability;
	}

	public String toString() {
		String status;
		
		if(availability == true)
			status = "Available";
		else
			status = "Not Available";
		return "[Title = " + title + ", Author = " + authorFirstName + " " + authorLastName + ", ISBN = " + isbnCode + ", Unique Code = " + uniqueCode + ", Status = " + status + "]";
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(int isbnCode) {
		this.isbnCode = isbnCode;
	}

	public int getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(int uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public static void main(String[] args) {
		Book test = new Book("John", "Smith", "The Book", 97831614, 12, true);
		System.out.println(test.toString());
	}
}
