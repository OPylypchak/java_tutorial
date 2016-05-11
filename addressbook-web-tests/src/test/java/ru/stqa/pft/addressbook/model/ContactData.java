package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private String group;
  private final String nickname;
  private final String mobile;
  private final String email;
  private final String company;

  public ContactData(String firstname, String lastname, String group, String nickname, String mobile, String email, String company) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.group = group;
    this.nickname = nickname;
    this.mobile = mobile;
    this.email = email;
    this.company = company;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getCompany() {
    return company;
  }

  public String getGroup() {
    return group;
  }
}
