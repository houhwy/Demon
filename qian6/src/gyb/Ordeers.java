package gyb;

public class Ordeers {
    private String oname;
    private String adress;

    public Ordeers(String oname, String adress) {
        this.oname = oname;
        this.adress = adress;
    }

    public void OrderTest(){
        System.out.println(oname+adress);
    }
}
