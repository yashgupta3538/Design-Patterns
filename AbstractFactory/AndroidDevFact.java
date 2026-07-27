public class AndroidDevFact extends AbstractEmployeeFact {

    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
    
}
