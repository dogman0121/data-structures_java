package lab2.Task4;

import lab2.Task4.Exceptions.CantDeleteException;
import lab2.Utils;

public class Shop {
    private String[] computers = new String[4];
    private int last = 0;

    public void addComputer(String computerName) {
        if (this.last == this.computers.length - 1)
            this.computers = Utils.resizeArray(this.computers, this.computers.length * 2);
        this.computers[this.last] = computerName;
        this.last++;
    }

    public void removeComputer(String computerName) {
        int computerIndex = findComputer(computerName);
        if (computerIndex == -1) {
            throw new CantDeleteException("Компьютер \"" + computerName + "\" не был найден.");
        }else{
            for (int i=computerIndex; i < computers.length-1; i++){
                this.computers[i] = this.computers[i+1];
            }
            this.computers[this.computers.length-1] = null;
            this.last--;
        }
    }

    public int findComputer(String computerName) {
        for (int i = 0; i < this.last; i++)
            if (this.computers[i].equals(computerName))
                return i;
        return -1;
    }

    public void showComputers() {
        Utils.printArray(this.computers, this.last);
    }
}