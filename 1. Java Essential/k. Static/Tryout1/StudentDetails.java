class StudentDetails{  
    String name;
    static String department;  
    static int rollCount=0;  
    
    static{
        System.out.println("Inside Static Block");
        department="CS";
    }
     
    static void change(){
        rollCount++;
    }

    StudentDetails(String name){  
        change();
        this.name = name;  
    }  

    void display(){
        System.out.println(rollCount+" "+name+" "+department);
    }
    
}