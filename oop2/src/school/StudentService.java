/**
 * 
 */
package school;

/**
 * @date  : 2016. 6. 17.
 * @author: 배근홍
 * @file  : StudentService.java
 * @story :
 */
public interface StudentService {
	public void registStudent(String id, String pw, String name, String ssn);
	public String showStudent();
	public void updateStudent(String pw);
	public String deleteStudent();
}
