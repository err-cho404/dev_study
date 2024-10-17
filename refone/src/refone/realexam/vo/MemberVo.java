package refone.realexam.vo;

import java.util.Objects;

public class MemberVo {
   private String memId;
   private String password;
   private String iName;
   private String address;
   private String phone;
   public MemberVo() {
      super();
      // TODO Auto-generated constructor stub
   }
   public MemberVo(String memId, String password, String iName) {
      super();
      this.memId = memId;
      this.password = password;
      this.iName = iName;
   }
   public MemberVo(String memId, String password, String iName, String address, String phone) {
      super();
      this.memId = memId;
      this.password = password;
      this.iName = iName;
      this.address = address;
      this.phone = phone;
   }
   public String getMemId() {
      return memId;
   }
   public void setMemId(String memId) {
      this.memId = memId;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getiName() {
      return iName;
   }
   public void setiName(String iName) {
      this.iName = iName;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   @Override
   public String toString() {
      return "MemberVo [memId=" + memId + ", password=" + password + ", iName=" + iName + ", address=" + address
            + ", phone=" + phone + "]";
   }
   @Override
   public int hashCode() {
      return Objects.hash(address, iName, memId, password, phone);
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      MemberVo other = (MemberVo) obj;
      return Objects.equals(address, other.address) && Objects.equals(iName, other.iName)
            && Objects.equals(memId, other.memId) && Objects.equals(password, other.password)
            && Objects.equals(phone, other.phone);
   }
   
}