package com.Health.StlHealth_Dev.Model;
import com.Health.StlHealth_Dev.enums.UserStatus;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_user")
public class User {

    /* ----------- DECLARING USER PROPERTIES ------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    Long USER_ID;
    @Column(name="unique_id",unique = true)
    String UNIQUE_ID;
    @Column(name="email")
    String EMAIL;
    @Column(name="password")
    String PASSWORD;
    @Column(name="role_id")
    int ROLE_ID;
    @Column(name="user_status")
    UserStatus USER_STATUS;
    @Column(name="created_date")
    Date CREATED_DATE;
    @Column(name="updated_date")
    Date UPDATED_DATE;

    /*------------------- END OF PROPERTIES --------------------*/

    /*--------------------- DEFAULT CONSTRUCTOR ------------------*/

    public User() {
    }

    /*----------------------  END OF DEFAULT CONSTRUCTOR -------------*/

    /*------------------------ PARAMETERIZE CONSTRUCTOR --------------*/

    public User(Long USER_ID, String UNIQUE_ID, String EMAIL, String PASSWORD, int ROLE_ID, UserStatus USER_STATUS, Date CREATED_DATE, Date UPDATED_DATE) {
        this.USER_ID = USER_ID;
        this.UNIQUE_ID = UNIQUE_ID;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.ROLE_ID = ROLE_ID;
        this.USER_STATUS = USER_STATUS;
        this.CREATED_DATE = CREATED_DATE;
        this.UPDATED_DATE = UPDATED_DATE;
    }

    /*------------------------ END OF PARAMETERIZE CONSTRUCTOR -----------*/



    /*------------------- DECLARING GETTERS AND SETTERS --------*/
    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUNIQUE_ID() {
        return UNIQUE_ID;
    }

    public void setUNIQUE_ID(String UNIQUE_ID) {
        this.UNIQUE_ID = UNIQUE_ID;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(int ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public UserStatus getUSER_STATUS() {
        return USER_STATUS;
    }

    public void setUSER_STATUS(UserStatus USER_STATUS) {
        this.USER_STATUS = USER_STATUS;
    }

    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public Date getUPDATED_DATE() {
        return UPDATED_DATE;
    }

    public void setUPDATED_DATE(Date UPDATED_DATE) {
        this.UPDATED_DATE = UPDATED_DATE;
    }

    /*------------------ END OF GETTERS AND SETTERS----------------------*/


    /*-------------------- TO STRING METHOD FOR PRINT USER -------------*/
    @Override
    public String toString() {
        return "User{" +
                "USER_ID=" + USER_ID +
                ", UNIQUE_ID='" + UNIQUE_ID + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", ROLE_ID=" + ROLE_ID +
                ", USER_STATUS=" + USER_STATUS +
                ", CREATED_DATE=" + CREATED_DATE +
                ", UPDATED_DATE=" + UPDATED_DATE +
                '}';
    }
    /*------------------ END OF TO STRING METHOD ----------------------*/


}
