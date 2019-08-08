class ProjectClassTest {
    public static void main(String[] args) {
        ProjectClass p1 = new ProjectClass();
        ProjectClass p2 = new ProjectClass("project 2");
        ProjectClass p3 = new ProjectClass("project 3", "some description");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p3.getDescription());
        
        p2.setDesctiption("2 description");
        System.out.println(p2.getDescription());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());
    }
}