package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

public class $2_User {
    private int id;
    private String userName;
    private String passWord;
    
    public $2_User() {
    }
    
    public $2_User(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassWord() {
        return passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
