package ch13_inheritance.products.books;

public class EBook extends Book {

    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);

        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {

        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 :  " + fileSize + "Mb" + "\n파일 포멧 " + format);
    }
}
