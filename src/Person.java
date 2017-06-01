
public class Person {
//composition has-a relationship
private Education education;
private Job job;
public Person(){
    this.education=new Education();
    this.job=new Job();
    
}
public String getEducation() {
    return education.getSchools();
}

public void setSalary(long x){
	
	job.setSalary(x);
}


public String toString(){
	
	return (job.toString() +"\n"+ education.toString());
}

}