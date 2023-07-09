package com.Health.StlHealth_Dev.Model;
import com.Health.StlHealth_Dev.enums.BloodGroup;
import com.Health.StlHealth_Dev.enums.Gender;
import com.Health.StlHealth_Dev.enums.Occupation;
import com.Health.StlHealth_Dev.enums.UserStatus;
import jakarta.persistence.*;



import java.util.Date;

@Entity
@Table(name="tbl_user_details")
public class UserDetails {
    /*---------------------- DECLARING USER DETAILS PROPERTIES --------------*/
    @Id
    @GeneratedValue
    @Column(name="user_detail_id")
    Long USER_DETAILS_ID;
    @Column(name="user_id",nullable =false)
    Long USER_ID;
    @Column(name="reg_number",nullable = false)
    String REG_NUMBER;
    @Column(name="role_id")
    Long ROLE_ID;
    @Column(name="aadhar_card_no")
    String AADHAR_CARD_NO;
    @Column(name="first_name")
    String FIRST_NAME;
    @Column(name="middle_name")
    String MIDDLE_NAME;
    @Column(name="last_name")
    String LAST_NAME;
    @Column(name="user_image")
    String USER_IMAGE;
    @Column(name="address")
    String ADDRESS;
    @Column(name="city")
    String CITY;
    @Column(name="state_id")
    Long STATE_ID;
    @Column(name="districe_id")
    Long DISTRICT_ID;
    @Column(name="taluka_id")
    Long TALUKA_ID;
    @Column(name="village_id")
    Long VILLAGE_ID;
    @Column(name="panchayat_id")
    Long PANCHAYAT_ID;
    @Column(name="pincode")
    Long PINCODE;
    @Column(name="whatsapp_no")
    String WHATSAPP_NO;
    @Column(name="date_of_birth")
    String DATE_OF_BIRTH;
    @Column(name="age")
    int AGE;
    @Column(name="gender")
    Gender GENDER;
    @Column(name="blood_group")
    BloodGroup BLOOD_GROUP;
    @Column(name="occupation")
    Occupation OCCUPATION;
    @Column(name="refer_by")
    String REFER_BY;
    @Column(name="user_status")
    UserStatus USER_STATUS;
    @Column(name="doctor_speciality")
    String DOCTOR_SPECIALITY;
    @Column(name="doctor_degree")
    String DOCTOR_DEGREE;
    @Column(name="paytm_no")
    String PAYTEM_NO;
    @Column(name="hospital_name")
    String HOSPITAL_NAME;
    @Column(name="isGPChanged")
    int ISGPCHANGED;
    @Column(name="created_date")
    Date CREATED_DATE;
    @Column(name="updated_date")
    Date UPDATED_DATE;
    /*------------------------ END OF DECLARING PROPERTIES ---------------------------*/

    /*----------------------- DEFAULT CONSTRUCTOR --------------------------*/

    public UserDetails() {
    }

    /*----------------------- END OF DEFAULT CONSTRUCTOR ---------------------*/

    /*---------------------------- PARAMETERIZE CONSTRUCTOR -------------------*/

    public UserDetails(Long USER_DETAILS_ID, Long USER_ID, String REG_NUMBER, Long ROLE_ID, String AADHAR_CARD_NO, String FIRST_NAME, String MIDDLE_NAME, String LAST_NAME, String USER_IMAGE, String ADDRESS, String CITY, Long STATE_ID, Long DISTRICT_ID, Long TALUKA_ID, Long VILLAGE_ID, Long PANCHAYAT_ID, Long PINCODE, String WHATSAPP_NO, String DATE_OF_BIRTH, int AGE, Gender GENDER, BloodGroup BLOOD_GROUP, Occupation OCCUPATION, String REFER_BY, UserStatus USER_STATUS, String DOCTOR_SPECIALITY, String DOCTOR_DEGREE, String PAYTEM_NO, String HOSPITAL_NAME, int ISGPCHANGED, Date CREATED_DATE, Date UPDATED_DATE) {
        this.USER_DETAILS_ID = USER_DETAILS_ID;
        this.USER_ID = USER_ID;
        this.REG_NUMBER = REG_NUMBER;
        this.ROLE_ID = ROLE_ID;
        this.AADHAR_CARD_NO = AADHAR_CARD_NO;
        this.FIRST_NAME = FIRST_NAME;
        this.MIDDLE_NAME = MIDDLE_NAME;
        this.LAST_NAME = LAST_NAME;
        this.USER_IMAGE = USER_IMAGE;
        this.ADDRESS = ADDRESS;
        this.CITY = CITY;
        this.STATE_ID = STATE_ID;
        this.DISTRICT_ID = DISTRICT_ID;
        this.TALUKA_ID = TALUKA_ID;
        this.VILLAGE_ID = VILLAGE_ID;
        this.PANCHAYAT_ID = PANCHAYAT_ID;
        this.PINCODE = PINCODE;
        this.WHATSAPP_NO = WHATSAPP_NO;
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
        this.AGE = AGE;
        this.GENDER = GENDER;
        this.BLOOD_GROUP = BLOOD_GROUP;
        this.OCCUPATION = OCCUPATION;
        this.REFER_BY = REFER_BY;
        this.USER_STATUS = USER_STATUS;
        this.DOCTOR_SPECIALITY = DOCTOR_SPECIALITY;
        this.DOCTOR_DEGREE = DOCTOR_DEGREE;
        this.PAYTEM_NO = PAYTEM_NO;
        this.HOSPITAL_NAME = HOSPITAL_NAME;
        this.ISGPCHANGED = ISGPCHANGED;
        this.CREATED_DATE = CREATED_DATE;
        this.UPDATED_DATE = UPDATED_DATE;
    }
    /*--------------------------- END OF PARAMETERIZE CONSTRUCTOR -----------------*/



    /*------------------------ DECLARING GETTER AND SETTER ---------------------------*/
    public Long getUSER_DETAILS_ID() {
        return USER_DETAILS_ID;
    }

    public void setUSER_DETAILS_ID(Long USER_DETAILS_ID) {
        this.USER_DETAILS_ID = USER_DETAILS_ID;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getREG_NUMBER() {
        return REG_NUMBER;
    }

    public void setREG_NUMBER(String REG_NUMBER) {
        this.REG_NUMBER = REG_NUMBER;
    }

    public Long getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(Long ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public String getAADHAR_CARD_NO() {
        return AADHAR_CARD_NO;
    }

    public void setAADHAR_CARD_NO(String AADHAR_CARD_NO) {
        this.AADHAR_CARD_NO = AADHAR_CARD_NO;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getUSER_IMAGE() {
        return USER_IMAGE;
    }

    public void setUSER_IMAGE(String USER_IMAGE) {
        this.USER_IMAGE = USER_IMAGE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public Long getSTATE_ID() {
        return STATE_ID;
    }

    public void setSTATE_ID(Long STATE_ID) {
        this.STATE_ID = STATE_ID;
    }

    public Long getDISTRICT_ID() {
        return DISTRICT_ID;
    }

    public void setDISTRICT_ID(Long DISTRICT_ID) {
        this.DISTRICT_ID = DISTRICT_ID;
    }

    public Long getTALUKA_ID() {
        return TALUKA_ID;
    }

    public void setTALUKA_ID(Long TALUKA_ID) {
        this.TALUKA_ID = TALUKA_ID;
    }

    public Long getVILLAGE_ID() {
        return VILLAGE_ID;
    }

    public void setVILLAGE_ID(Long VILLAGE_ID) {
        this.VILLAGE_ID = VILLAGE_ID;
    }

    public Long getPANCHAYAT_ID() {
        return PANCHAYAT_ID;
    }

    public void setPANCHAYAT_ID(Long PANCHAYAT_ID) {
        this.PANCHAYAT_ID = PANCHAYAT_ID;
    }

    public Long getPINCODE() {
        return PINCODE;
    }

    public void setPINCODE(Long PINCODE) {
        this.PINCODE = PINCODE;
    }

    public String getWHATSAPP_NO() {
        return WHATSAPP_NO;
    }

    public void setWHATSAPP_NO(String WHATSAPP_NO) {
        this.WHATSAPP_NO = WHATSAPP_NO;
    }

    public String getDATE_OF_BIRTH() {
        return DATE_OF_BIRTH;
    }

    public void setDATE_OF_BIRTH(String DATE_OF_BIRTH) {
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public Gender getGENDER() {
        return GENDER;
    }

    public void setGENDER(Gender GENDER) {
        this.GENDER = GENDER;
    }

    public BloodGroup getBLOOD_GROUP() {
        return BLOOD_GROUP;
    }

    public void setBLOOD_GROUP(BloodGroup BLOOD_GROUP) {
        this.BLOOD_GROUP = BLOOD_GROUP;
    }

    public Occupation getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(Occupation OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getREFER_BY() {
        return REFER_BY;
    }

    public void setREFER_BY(String REFER_BY) {
        this.REFER_BY = REFER_BY;
    }

    public UserStatus getUSER_STATUS() {
        return USER_STATUS;
    }

    public void setUSER_STATUS(UserStatus USER_STATUS) {
        this.USER_STATUS = USER_STATUS;
    }

    public String getDOCTOR_SPECIALITY() {
        return DOCTOR_SPECIALITY;
    }

    public void setDOCTOR_SPECIALITY(String DOCTOR_SPECIALITY) {
        this.DOCTOR_SPECIALITY = DOCTOR_SPECIALITY;
    }

    public String getDOCTOR_DEGREE() {
        return DOCTOR_DEGREE;
    }

    public void setDOCTOR_DEGREE(String DOCTOR_DEGREE) {
        this.DOCTOR_DEGREE = DOCTOR_DEGREE;
    }

    public String getPAYTEM_NO() {
        return PAYTEM_NO;
    }

    public void setPAYTEM_NO(String PAYTEM_NO) {
        this.PAYTEM_NO = PAYTEM_NO;
    }

    public String getHOSPITAL_NAME() {
        return HOSPITAL_NAME;
    }

    public void setHOSPITAL_NAME(String HOSPITAL_NAME) {
        this.HOSPITAL_NAME = HOSPITAL_NAME;
    }

    public int getISGPCHANGED() {
        return ISGPCHANGED;
    }

    public void setISGPCHANGED(int ISGPCHANGED) {
        this.ISGPCHANGED = ISGPCHANGED;
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

    /*------------------------------- END OF GETTERS AND SETTERS -------------------*/


    /*------------------------------- TO STRING METHOD FOR PRINT USER DETAILS ----------------*/

    @Override
    public String toString() {
        return "UserDetails{" +
                "USER_DETAILS_ID=" + USER_DETAILS_ID +
                ", USER_ID=" + USER_ID +
                ", REG_NUMBER='" + REG_NUMBER + '\'' +
                ", ROLE_ID=" + ROLE_ID +
                ", AADHAR_CARD_NO='" + AADHAR_CARD_NO + '\'' +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", MIDDLE_NAME='" + MIDDLE_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", USER_IMAGE='" + USER_IMAGE + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", CITY='" + CITY + '\'' +
                ", STATE_ID=" + STATE_ID +
                ", DISTRICT_ID=" + DISTRICT_ID +
                ", TALUKA_ID=" + TALUKA_ID +
                ", VILLAGE_ID=" + VILLAGE_ID +
                ", PANCHAYAT_ID=" + PANCHAYAT_ID +
                ", PINCODE=" + PINCODE +
                ", WHATSAPP_NO='" + WHATSAPP_NO + '\'' +
                ", DATE_OF_BIRTH='" + DATE_OF_BIRTH + '\'' +
                ", AGE=" + AGE +
                ", GENDER=" + GENDER +
                ", BLOOD_GROUP=" + BLOOD_GROUP +
                ", OCCUPATION=" + OCCUPATION +
                ", REFER_BY='" + REFER_BY + '\'' +
                ", USER_STATUS=" + USER_STATUS +
                ", DOCTOR_SPECIALITY='" + DOCTOR_SPECIALITY + '\'' +
                ", DOCTOR_DEGREE='" + DOCTOR_DEGREE + '\'' +
                ", PAYTEM_NO='" + PAYTEM_NO + '\'' +
                ", HOSPITAL_NAME='" + HOSPITAL_NAME + '\'' +
                ", ISGPCHANGED=" + ISGPCHANGED +
                ", CREATED_DATE=" + CREATED_DATE +
                ", UPDATED_DATE=" + UPDATED_DATE +
                '}';
    }
}
