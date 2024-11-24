public class student{

String name;
private int rollNumber;

public student(String n,int rn){

name = n;
rollNumber = rn;


}


public void setRoll(int rn){

    if(rn<=0){
        return;
    }
    rollNumber = rn;

}

public int getRollNo(){
    return rollNumber;
}

public void print(){
    System.out.println(name+ " : "+rollNumber);

}


}