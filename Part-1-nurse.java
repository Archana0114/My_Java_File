public class nurse {
    
}
public Nurse(String name, int number, int numOfPatients) {
    super(name, number);
    this.numOfPatients = numOfPatients;
}

public int getNumOfPatients() {
    return numOfPatients;
}

public void setNumOfPatients(int numOfPatients) {
    this.numOfPatients = numOfPatients;
}

@Override
public void work() {
    super.work();
    System.out.println(getName() + " is a nurse with " + numOfPatients + " patients.");
}

@Override
public String toString() {
    return super.toString() + " has " + numOfPatients + " patients.";
}
