class Person {
    private String personName;
    private String personLastName;

    public Person(String personName, String personLastName) {
        this.personName = personName;
        this.personLastName = personLastName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getAuthor() {
        return personName + personLastName;
    }

        public String toString(){
            return personName + " " + personLastName;
        }
    }
