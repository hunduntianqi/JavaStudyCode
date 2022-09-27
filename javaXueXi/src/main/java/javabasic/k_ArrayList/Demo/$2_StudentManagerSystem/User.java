package javabasic.k_ArrayList.Demo.$2_StudentManagerSystem;

public class User {
    private String userName;
    private String passWord;
    private String idCard;
    private String phoneNumber;
    
    public User () {}
    
    public User(String userName, String passWord, String idCard, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
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
    
    public String getIdCard() {
        return idCard;
    }
    
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
