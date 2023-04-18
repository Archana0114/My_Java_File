public class suregon {
    
}public Surgeon(String name, int number, String specialty, boolean operating) {
    super(name, number, specialty);
    this.operating = operating;
}

public boolean isOperating() {
    return operating;
}

public void setOperating(boolean operating) {
    this.operating = operating;
}

@Override
public void work() {
    super.work();
    if (operating) {
        System.out.println(getName() + " is operating now.");
    }
}

@Override
public String toString() {
    return super.toString() + " Operating: " + operating;
}

