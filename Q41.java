class Person {

    String getName(){
        return "Programmer";
    }
}

class Programmer extends Person{
    String getCodingLanguage(){
        return "Java";
    }
}

class Program extends  Programmer{
    int getLineOfCode(){
        return 20;
    }
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println(" I am "+program.getName()+" and I code in "+ program.getCodingLanguage()+
                " . This program has "+program.getLineOfCode()+" lines");
    }
}