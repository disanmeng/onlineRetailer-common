package cn.github.onlineRetailer.bean;

/** 
 * @Description 
 * @author disanmeng
 * @date 2018年3月25日 下午12:48:18 
 */

/** 
 * @Description 
 * @author disanmeng
 * @date 2018年3月25日 下午12:50:15 
 */ 
  	
public class Person {

    private Integer age;
    String sex;
    String name;
    
    public Person(int age, String sex, String name) {
        super();
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {
            return this.name.equals(((Person) obj).name) && this.sex.equals(((Person) obj).sex) && this.age.equals(((Person) obj).age);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + "-" + sex;
    }

}
