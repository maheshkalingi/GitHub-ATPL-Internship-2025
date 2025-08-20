import java.util.*;

public class EmployeeSkillTracker {
    
    private static Map<String, Set<String>> employeeSkills = new HashMap<>();
    public static void addEmployeeSkills(String employee, Set<String> skills) {
        employeeSkills.put(employee, skills);
    }

    public static List<String> findEmployeesWithSkill(String skill) {
        List<String> employeesWithSkill = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : employeeSkills.entrySet()) {
            if (entry.getValue().contains(skill)) {
                employeesWithSkill.add(entry.getKey());
            }
        }
        return employeesWithSkill;
    }
    public static Set<String> findCommonSkills(String employee1, String employee2) {
        Set<String> commonSkills = new HashSet<>();
        Set<String> skills1 = employeeSkills.get(employee1);
        Set<String> skills2 = employeeSkills.get(employee2);

        if (skills1 != null && skills2 != null) {
            commonSkills.addAll(skills1);
            commonSkills.retainAll(skills2);
        }
        return commonSkills;
    }

    public static void main(String[] args) {

        Set<String> skillsMahesh = new HashSet<>(Arrays.asList("Java", "SQL", "Python"));
        Set<String> skillsDileep = new HashSet<>(Arrays.asList("Java", "JavaScript", "SQL"));
        Set<String> skillsNaveen = new HashSet<>(Arrays.asList("Python", "JavaScript", "HTML"));
        addEmployeeSkills("Mahesh", skillsMahesh);
        addEmployeeSkills("Dileep", skillsDileep);
        addEmployeeSkills("Naveen", skillsNaveen);
        String skillToFind = "Java";
        List<String> employeesWithJava = findEmployeesWithSkill(skillToFind);
        System.out.println("Employees with skill " + skillToFind + ": " + employeesWithJava);

        Set<String> commonSkills = findCommonSkills("Mahesh", "Naveen");
        System.out.println("Common skills between Mahesh and Naveen: " + commonSkills);
    }
}