public class WebDevFact extends AbstractEmployeeFact {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
