package cn.github.onlineRetailer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.github.onlineRetailer.bean.Person;

/** 
 * @Description 
 * @author disanmeng
 * @date 2018年3月23日 下午9:08:46 
 */

public class StringTest {
    
    @Test
    public void test1() {
        String s = new String("21asdsadq" + "weqw3");
        String s1 = new String("21asdsadqweqw3");
        System.out.println(s.equals(s1));
        
        String s3 = new String(s);
        System.out.println(s3 == s);
        
        try {
            String s2 = s1.substring(0, 14);
            System.out.println(s2 == s1);
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
    
    @Test
    public void test2() {
        int a = 1;
        Integer b = new Integer(a);
        //class文件  b.equals(Integer.valueOf(a))
        System.out.println(b.equals(a));
    }
    
    @Test
    public void test3() {
        Person p1 = new Person(25, "yang", "man");
        Person p2 = new Person(25, "yang", "man");
        HashSet<Person> set = new HashSet<Person>();
        set.add(p1);
        set.add(p2);
        System.out.println(p1.equals(p2));
        System.out.println(set.size());
    }
    
    @Test
    public void test4() {
//        List<Person> a1 = new ArrayList<Person>();
        Person p2 = new Person(25, "yang", "man");
//        a1.add(p2);
//        System.out.println(a1.getClass());
        
        Object[] person = new Object[] {p2};
        System.out.println(person.getClass());
        System.out.println(person.getClass() == Object[].class);
        
        Object[] person1 = new Object[10];
        try {
            System.out.println("复制前长度 = " + person1.length);
            System.out.println(person1[0]);
            System.arraycopy(person, 0, person1, 0, person.length);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("复制后长度 = " + person1.length);
            System.out.println(person1[0]);
        }
        
    }
    
    @Test
    public void test5() {
        Map<Object, Object> map = new HashMap<Object, Object>();
        System.out.println(map.put("yang", "123"));
        System.out.println(map.put("yang", "456"));
        System.out.println(map);
        System.out.println(map.remove("yang"));
        System.out.println(map.remove("yang"));
        
        HashSet<Object> set = new HashSet<Object>();
        System.out.println(set.add("yang"));
        System.out.println(set.add("yang"));
        System.out.println(set.remove("yang"));
        System.out.println(set.remove("yang"));
    }
    
    @SuppressWarnings("unlikely-arg-type")
    @Test
    public void test6() {
        Integer i = 10;
        long l = i;
        System.out.println(i.equals(l));
    }
    
    @Test
    public void testArray() {
        List<String> list = new ArrayList<String>();
        System.out.println(list.getClass());
        
        Object[] o = new Object[] {};
        System.out.println(o.getClass());
        System.out.println(o.getClass() == Object[].class);
    }

}
