public class FactSubjectFunction implements IFunc<Fact,String> {
    public String apply(Fact obj) {
        return obj.getSubject();
    }
}