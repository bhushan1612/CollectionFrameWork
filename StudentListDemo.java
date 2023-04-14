import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListDemo {

public List<Student> convertObjectValueToList(Student student){
System.out.println("****convertObjectValueToList*****");
List<Student> studentList = new ArrayList<Student>();
studentList.add(student);

Iterator<Student> studentIterator = studentList.iterator() ;
/*lambda expression
studentList.forEach(s -> System.out.println(" Java 8 lambda expression"+student));*/

/*method reference
System.out.println("method reference");
studentList.forEach(System.out::println);*/

while(studentIterator.hasNext()) {

System.out.println(studentIterator.next());
}

return studentList;
}

public List<Student> retriveStudentData(List<Student> studentList){
System.out.println("****retriveStudentData*****");

/*method reference
System.out.println("method reference inside retriveStudentData()");
studentList.forEach(System.outprintln);*/

System.out.println("**********");

Iterator<Student> studentIterator = studentList.iterator() ;
while(studentIterator.hasNext()) {

System.out.println(studentIterator.next());
}
System.out.println("****Printing id****");

Iterator<Student> studentIterator1 = studentList.iterator() ;

while(studentIterator1.hasNext()) {

Student student = studentIterator1.next();

System.out.println("Student Id = " +student.getStudentId());
}
return studentList;

}

public static void main(String[] args) {
/*Creating student list*/
Student student = new Student();
student.setStudentId(100);
student.setStudentName("Anvika");
student.setStudentEmail("anvika9999@gmail.com");

StudentListDemo demo = new StudentListDemo();

/*Creating student2 object to add the data*/
Student student2 = new Student();
student2.setStudentId(101);
student2.setStudentName("Ravi");
student2.setStudentEmail("ravikumar123456@gmail.com");

List<Student> studentLis2 = new ArrayList<Student>();
studentLis2.add(student2);
studentLis2.add(student);

Student student3 = new Student();
student3=null;


try {
demo.convertObjectValueToList(student3);
}catch (NullPointerException e) {
System.out.println("Exception occure :: "+e);
}
demo.retriveStudentData(studentLis2);


}

} 