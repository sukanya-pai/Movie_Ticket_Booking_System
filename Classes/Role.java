public enum Role {
    GUEST  ('Guest'),  //calls constructor with value 'Guest'
    ADMIN('Admin'),  //calls constructor with value 'Admin'
    CUSTOMER   ('Customer')   //calls constructor with value 'Customer'
    ; 
    
    private final int role;

    Role(String role) {
        this.role = role;
    }
    
    public int getRole() {
        return this.role;
    }
    
}
