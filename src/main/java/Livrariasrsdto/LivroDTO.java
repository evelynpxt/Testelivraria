package Livrariasrsdto;

public class LivroDTO {

    private Long id;
    private String titilo;
    private Long autorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitilo() {
        return titilo;
    }

    public void setTitilo(String titilo) {
        this.titilo = titilo;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }
}
