public class President {
    String name;
    String vp;
    String party;
    String startDate;

    public President(String name, String vp, String party, String startDate) {
        this.name = name;
        this.vp = vp;
        this.party = party;
        this.startDate = startDate;
    }

    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", vp='" + this.vp + "'" +
            ", party='" + this.party + "'" +
            ", startDate='" + this.startDate + "'" +
            "}";
    }

}