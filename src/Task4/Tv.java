package Task4;

public class Tv {
    private String model;
    private int year;
    private int price;
    private int diagonal;
    private String company;

    public Tv(String model, int year, int price, int diagonal, String company) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", diagonal='" + diagonal + '\'' +
                ", company=" + company +
                '}';
    }
}
