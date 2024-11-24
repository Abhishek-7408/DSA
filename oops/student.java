public class student{

String name;
private int rollNumber;


public void setRoll(int rn){

    if(rn<=0){
        return;
    }
    rollNumber = rn;

}

public int getRollNo(){
    return rollNumber;
}


}