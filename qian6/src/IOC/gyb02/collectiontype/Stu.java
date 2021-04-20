package IOC.gyb02.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] course;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void Test(){
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(map);
        System.out.println(sets);
    }
}
