class ProjectClass {
    private String name;
    private String description;

    public String elevatorPitch() {
        return this.name + " : " + this.description;
    }
    public ProjectClass(){}

    public ProjectClass(String name){
        this.name = name;
    }
    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
    }

    //getter
    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // getter
    public String getDescription() {
        return description;
    }
    // setter
    public void setDesctiption(String description) {
        this.description = description;
    }
}

